# Estructura Básica de un Programa en Java

Todo programa en Java debe tener al menos una clase y un método `main`. Aquí está un ejemplo simple:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hola, Mundo!");
    }
}
```


# Encapsulamiento, Herencia, Polimorfismo, Construcción de Clases y Objetos

### Encapsulamiento
El encapsulamiento es un concepto fundamental en la Programación Orientada a Objetos (POO). Se refiere a la agrupación de datos (atributos) y métodos (funciones) que operan sobre esos datos dentro de una clase, controlando el acceso a estos datos para protegerlos de modificaciones no autorizadas.

La encapsulación permite ocultar la implementación interna de una clase y sólo exponer lo necesario a través de métodos públicos. Esto ayuda a mantener la integridad de los datos y facilita el mantenimiento del código.

Vamos a crear una clase `Persona` que utiliza encapsulamiento.

```java
public class Persona {
    // Atributos privados, accesibles solo dentro de esta clase.
    private String nombre;
    private int edad;

    // Método público para obtener el nombre.
    public String getNombre() {
        return nombre;
    }

    // Método público para establecer el nombre.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método público para obtener la edad.
    public int getEdad() {
        return edad;
    }

    // Método público para establecer la edad.
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
```

Vamos a crear una clase `CuentaBancaria` que utiliza encapsulamiento.

```java
public class CuentaBancaria {
    // Atributos privados, accesibles solo dentro de esta clase.
    private String titular;
    private double saldo;

    // Constructor para inicializar los atributos de la cuenta.
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("El saldo inicial no puede ser negativo. Se establece en 0.");
        }
    }

    // Método público para obtener el titular.
    public String getTitular() {
        return titular;
    }

    // Método público para establecer el titular.
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Método público para obtener el saldo.
    public double getSaldo() {
        return saldo;
    }

    // Método público para depositar dinero en la cuenta.
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    // Método público para retirar dinero de la cuenta.
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("La cantidad a retirar es inválida o excede el saldo disponible.");
        }
    }
}

```

**Métodos Públicos:**

1. Se utilizan para definir la interfaz pública de la clase.
2. Permiten a los objetos de otras clases interactuar con el objeto actual.

**Métodos Privados:**

1. Se utilizan para encapsular la lógica interna de la clase.
2. No pueden ser accedidos directamente desde fuera de la clase.

**Uso de Getters y Setters:**

1. Protege la integridad de los datos al permitir el control sobre cómo se acceden y modifican los atributos.
2. Permite agregar lógica adicional al acceder o modificar atributos (como validaciones).
3. Mejora el encapsulamiento, ocultando la implementación interna de la clase.

```java
public class CuentaBancaria {
    private double saldo;

    // Método para obtener el saldo.
    public double getSaldo() {
        return saldo;
    }

    // Método para establecer el saldo.
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }
}
```

### Herencia
La herencia es un mecanismo en la POO que permite que una clase (subclase o clase derivada) herede atributos y métodos de otra clase (superclase o clase base). Esto promueve la reutilización del código y establece una relación jerárquica entre clases.

La clase derivada puede añadir nuevos atributos y métodos, así como sobrescribir métodos de la clase base para proporcionar una implementación específica.

Vamos a crear una clase `Estudiante` que hereda de `Persona`.

```java
public class Estudiante extends Persona {
    // Atributo adicional para la clase Estudiante.
    private String matricula;

    // Método para obtener la matrícula.
    public String getMatricula() {
        return matricula;
    }

    // Método para establecer la matrícula.
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

```

```java
public class CuentaAhorros extends CuentaBancaria {
    // Atributo adicional para la tasa de interés.
    private double tasaInteres;

    // Constructor que inicializa la cuenta de ahorros.
    public CuentaAhorros(String titular, double saldoInicial, double tasaInteres) {
        super(titular, saldoInicial);  // Llama al constructor de la clase base.
        if (tasaInteres > 0) {
            this.tasaInteres = tasaInteres;
        } else {
            this.tasaInteres = 0;
            System.out.println("La tasa de interés debe ser positiva. Se establece en 0.");
        }
    }

    // Método para calcular el interés ganado. PRIVADO!
    private void calcularInteres() {
        double interes = getSaldo() * tasaInteres / 100;
        depositar(interes);
    }
}

```

**Usar Herencia:**

1. Cuando existe una relación "es-un" (is-a) entre las clases.
2. Para reutilizar código común en una superclase.
3. Para permitir la extensión y personalización de comportamiento en subclases.

```java
public class Animal {
    public void comer() {
        System.out.println("El animal está comiendo.");
    }
}

public class Perro extends Animal {
    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }
}
```

### Polimorfismo
El polimorfismo es la capacidad de una variable, función u objeto para tomar múltiples formas. En el contexto de la POO, el polimorfismo permite que un objeto de una clase derivada sea tratado como un objeto de su clase base, y que los métodos de la clase derivada sean llamados a través de una referencia de la clase base.

Existen dos tipos principales de polimorfismo:
1. **Polimorfismo en tiempo de compilación (Sobrecarga de métodos):** Permite definir múltiples métodos con el mismo nombre pero diferentes parámetros dentro de la misma clase.
2. **Polimorfismo en tiempo de ejecución (Sobrescritura de métodos):** Permite a una subclase proporcionar una implementación específica de un método que ya está definido en su clase base.

Vamos a ver un ejemplo de sobrescritura de métodos.

```java
// Clase base Persona con un método saludar.
public class Persona {
    public void saludar() {
        System.out.println("Hola!");
    }
}

// Clase derivada Estudiante que sobrescribe el método saludar.
public class Estudiante extends Persona {
    @Override
    public void saludar() {
        System.out.println("Hola, soy un estudiante!");
    }
}

// Clase principal para probar el polimorfismo.
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase base.
        Persona p = new Persona();
        p.saludar();  // Llama al método saludar de Persona.

        // Creamos un objeto de la clase derivada.
        Estudiante e = new Estudiante();
        e.saludar();  // Llama al método sobrescrito saludar de Estudiante.
    }
}

```

```java
// Clase base CuentaBancaria con un método mostrarInformación.
public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}

// Clase derivada CuentaAhorros que sobrescribe el método mostrarInformacion.
public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(String titular, double saldoInicial, double tasaInteres) {
        super(titular, saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Llama al método de la clase base.
        System.out.println("Tasa de interés: " + tasaInteres);
    }
}

// Clase principal para probar el polimorfismo.
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase base.
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan", 1000);
        cuenta1.mostrarInformacion();

        // Creamos un objeto de la clase derivada.
        CuentaAhorros cuenta2 = new CuentaAhorros("Maria", 2000, 5);
        cuenta2.mostrarInformacion();

        // Usamos el polimorfismo para tratar un objeto de la clase derivada como si fuera de la clase base.
        CuentaBancaria cuenta3 = new CuentaAhorros("Carlos", 3000, 4);
        cuenta3.mostrarInformacion();
    }
}
```

**Usar Polimorfismo:**

1. Para permitir que un objeto de una subclase sea tratado como un objeto de la superclase.
2. Para escribir código más genérico y flexible.
3. Para sobrescribir métodos en una subclase y proporcionar una implementación específica.

### Construcción de Clases y Objetos
En la POO, una clase es una plantilla para crear objetos (instancias). Una clase define atributos y métodos que los objetos creados a partir de la clase pueden utilizar.

Vamos a crear y modificar una clase `Coche` con atributos y métodos, y a instanciar objetos de esta clase.

Aquí está el código para la clase `Coche`.

```java
public class Coche {
    // Atributos privados de la clase Coche.
    private String marca;
    private String modelo;
    private int año;

    // Constructor para inicializar los atributos del coche.
    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Método para acelerar el coche.
    public void acelerar() {
        System.out.println("El coche está acelerando");
    }

    // Método para frenar el coche.
    public void frenar() {
        System.out.println("El coche está frenando");
    }

    // Método para obtener la marca del coche.
    public String getMarca() {
        return marca;
    }

    // Método para obtener el modelo del coche.
    public String getModelo() {
        return modelo;
    }

    // Método para obtener el año del coche.
    public int getAño() {
        return año;
    }
}
```

Ahora vamos a crear una clase `Main` para instanciar y utilizar objetos de la clase `Coche`.
```java
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Coche.
        Coche coche = new Coche("Toyota", "Corolla", 2020);

        // Llamamos a los métodos del objeto coche.
        coche.acelerar();  // Imprime: El coche está acelerando.
        coche.frenar();    // Imprime: El coche está frenando.

        // Imprimimos los atributos del coche.
        System.out.println("Marca: " + coche.getMarca());   // Imprime: Marca: Toyota.
        System.out.println("Modelo: " + coche.getModelo()); // Imprime: Modelo: Corolla.
        System.out.println("Año: " + coche.getAño());       // Imprime: Año: 2020.
    }
}

```

### Discusión y Retroalimentación

- ¿Cómo podríamos mejorar la encapsulación en la clase `Coche`?
- ¿Qué otros métodos podríamos añadir a la clase `Persona` o `Estudiante`?
- ¿Cómo podemos utilizar la herencia y el polimorfismo para crear un sistema más complejo?

### Resumen y Preguntas Finales

Hoy hemos aprendido sobre los siguientes conceptos:
- **Encapsulamiento:** Agrupación de datos y métodos dentro de una clase y control del acceso a esos datos.
- **Herencia:** Mecanismo que permite que una clase herede atributos y métodos de otra clase.
- **Polimorfismo:** Capacidad de una variable, función u objeto para tomar múltiples formas, incluyendo la sobrecarga y sobrescritura de métodos.
- **Construcción de Clases y Objetos:** Cómo definir clases y crear instancias de esas clases.

¿Tienen alguna pregunta o necesitan alguna aclaración adicional?

