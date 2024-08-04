# Principios SOLID Explicados en Detalle

SOLID es un acrónimo acuñado por Robert C. Martin que representa cinco principios fundamentales de la programación orientada a objetos y el diseño. Estos principios, cuando se combinan, facilitan a un programador desarrollar software que sea más fácil de mantener, entender y expandir con el tiempo.

## S - Principio de Responsabilidad Única (Single Responsibility Principle)

**Definición:** Una clase debe tener una, y solo una, razón para cambiar.

**Explicación:** Este principio establece que una clase debe estar enfocada en hacer una cosa bien. Si una clase tiene múltiples responsabilidades, se vuelve acoplada. Un cambio en una responsabilidad puede afectar o romper la capacidad de la clase para cumplir con las otras responsabilidades.

**Ejemplo:**

Incorrecto:
```java
class Usuario {
    public void guardarEnBaseDeDatos() { /* ... */ }
    public void generarInforme() { /* ... */ }
    public void enviarEmail() { /* ... */ }
}
```

Correcto:
```java
class Usuario {
    private String nombre;
    private String email;
    // Getters y setters
}

class GuardadoUsuario {
    public void guardarEnBaseDeDatos(Usuario usuario) { /* ... */ }
}

class GeneradorInformeUsuario {
    public void generarInforme(Usuario usuario) { /* ... */ }
}

class EnviadorEmailUsuario {
    public void enviarEmail(Usuario usuario) { /* ... */ }
}
```

## O - Principio de Abierto/Cerrado (Open/Closed Principle)

**Definición:** Las entidades de software (clases, módulos, funciones, etc.) deben estar abiertas para la extensión, pero cerradas para la modificación.

**Explicación:** Este principio sugiere que deberíamos poder añadir nueva funcionalidad a una entidad de software sin modificar su código existente. Esto se logra típicamente mediante el uso de abstracciones e interfaces.

**Ejemplo:**

Incorrecto:
```java
class CalculadoraDescuento {
    public double calcularDescuento(double precio, String tipoCliente) {
        if (tipoCliente.equals("Regular")) {
            return precio * 0.1;
        } else if (tipoCliente.equals("Premium")) {
            return precio * 0.2;
        }
        return 0;
    }
}
```

Correcto:
```java
interface EstrategiaDescuento {
    double calcularDescuento(double precio);
}

class DescuentoRegular implements EstrategiaDescuento {
    public double calcularDescuento(double precio) {
        return precio * 0.1;
    }
}

class DescuentoPremium implements EstrategiaDescuento {
    public double calcularDescuento(double precio) {
        return precio * 0.2;
    }
}

class CalculadoraDescuento {
    public double calcularDescuento(double precio, EstrategiaDescuento estrategia) {
        return estrategia.calcularDescuento(precio);
    }
}
```

## L - Principio de Sustitución de Liskov (Liskov Substitution Principle)

**Definición:** Los objetos de una superclase deben poder ser reemplazados por objetos de sus subclases sin afectar la corrección del programa.

**Explicación:** Este principio está estrechamente relacionado con la herencia. Establece que las subclases deben poder utilizarse a través de la interfaz de su clase base sin que el usuario note la diferencia.

**Ejemplo:**

Incorrecto:
```java
class Rectangulo {
    protected int ancho;
    protected int alto;

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getArea() {
        return ancho * alto;
    }
}

class Cuadrado extends Rectangulo {
    public void setAncho(int ancho) {
        this.ancho = ancho;
        this.alto = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
        this.ancho = alto;
    }
}
```

Correcto:
```java
interface Forma {
    int getArea();
}

class Rectangulo implements Forma {
    protected int ancho;
    protected int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getArea() {
        return ancho * alto;
    }
}

class Cuadrado implements Forma {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getArea() {
        return lado * lado;
    }
}
```

## I - Principio de Segregación de Interfaces (Interface Segregation Principle)

**Definición:** Muchas interfaces cliente específicas son mejores que una interfaz de propósito general.

**Explicación:** Este principio sugiere que es mejor tener muchas interfaces pequeñas y específicas en lugar de una interfaz grande y general. Las clases no deben verse obligadas a implementar métodos que no utilizan.

**Ejemplo:**

Incorrecto:
```java
interface Trabajador {
    void trabajar();
    void comer();
    void dormir();
}

class Humano implements Trabajador {
    public void trabajar() { /* ... */ }
    public void comer() { /* ... */ }
    public void dormir() { /* ... */ }
}

class Robot implements Trabajador {
    public void trabajar() { /* ... */ }
    public void comer() { /* No aplicable */ }
    public void dormir() { /* No aplicable */ }
}
```

Correcto:
```java
interface Trabajable {
    void trabajar();
}

interface Comedor {
    void comer();
}

interface Dormidor {
    void dormir();
}

class Humano implements Trabajable, Comedor, Dormidor {
    public void trabajar() { /* ... */ }
    public void comer() { /* ... */ }
    public void dormir() { /* ... */ }
}

class Robot implements Trabajable {
    public void trabajar() { /* ... */ }
}
```

## D - Principio de Inversión de Dependencias (Dependency Inversion Principle)

**Definición:** Depender de abstracciones, no de concreciones. Los módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deben depender de abstracciones.

**Explicación:** Este principio sugiere que deberíamos diseñar nuestros sistemas de manera que los componentes dependan de abstracciones (interfaces o clases abstractas) en lugar de implementaciones concretas. Esto reduce el acoplamiento entre diferentes partes del sistema.

**Ejemplo:**

Incorrecto:
```java
class ServicioNotificacion {
    private EnviadorEmail enviador = new EnviadorEmail();

    public void notificar(String mensaje) {
        enviador.enviar(mensaje);
    }
}

class EnviadorEmail {
    public void enviar(String mensaje) {
        // Lógica para enviar email
    }
}
```

Correcto:
```java
interface EnviadorMensaje {
    void enviar(String mensaje);
}

class EnviadorEmail implements EnviadorMensaje {
    public void enviar(String mensaje) {
        // Lógica para enviar email
    }
}

class EnviadorSMS implements EnviadorMensaje {
    public void enviar(String mensaje) {
        // Lógica para enviar SMS
    }
}

class ServicioNotificacion {
    private EnviadorMensaje enviador;

    public ServicioNotificacion(EnviadorMensaje enviador) {
        this.enviador = enviador;
    }

    public void notificar(String mensaje) {
        enviador.enviar(mensaje);
    }
}
```

Siguiendo estos principios, los desarrolladores pueden crear sistemas que son más mantenibles, escalables y robustos. SOLID promueve la creación de código que es más fácil de entender, modificar y extender a lo largo del tiempo.