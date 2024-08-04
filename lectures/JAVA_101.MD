# Guía Detallada de Sintaxis Básica en Java

## Introducción

Java es un lenguaje de programación versátil y poderoso, conocido por su filosofía "write once, run anywhere" (escribe una vez, ejecuta en cualquier lugar). Esta guía cubrirá en detalle los conceptos básicos de la sintaxis de Java, proporcionando ejemplos extensos y explicaciones detalladas.

## Índice
1. [Estructura Básica de un Programa](#1-estructura-básica-de-un-programa)
2. [Variables y Tipos de Datos](#2-variables-y-tipos-de-datos)
3. [Operadores](#3-operadores)
4. [Estructuras de Control](#4-estructuras-de-control)
5. [Arreglos](#5-arreglos)
6. [Métodos](#6-métodos)
7. [Manejo de Excepciones](#7-manejo-de-excepciones)
8. [Entrada y Salida Básica](#8-entrada-y-salida-básica)
9. [Programación Orientada a Objetos Básica](#9-programación-orientada-a-objetos-básica)
10. [Paquetes e Importaciones](#10-paquetes-e-importaciones)

## 1. Estructura Básica de un Programa

Cada programa Java debe tener al menos una clase y un método `main`. Este método es el punto de entrada del programa.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Desglose del código:
- `public`: Es un modificador de acceso que hace que la clase sea accesible desde cualquier parte.
- `class`: Palabra clave para definir una clase en Java.
- `HelloWorld`: Nombre de la clase. Por convención, se usa PascalCase para los nombres de las clases.
- `public static void main(String[] args)`: Declaración del método main.
  - `public`: El método es accesible desde fuera de la clase.
  - `static`: El método pertenece a la clase, no a una instancia específica.
  - `void`: El método no devuelve ningún valor.
  - `main`: Nombre del método. Es el punto de entrada del programa.
  - `String[] args`: Array de argumentos pasados al programa desde la línea de comandos.

## 2. Variables y Tipos de Datos

Java es un lenguaje de tipado estático, lo que significa que todas las variables deben ser declaradas antes de su uso, especificando su tipo.

### Tipos de datos primitivos:

```java
// Integers
byte smallNumber = 127;        // 8-bit signed two's complement integer
short shortNumber = 32767;     // 16-bit signed two's complement integer
int number = 2147483647;       // 32-bit signed two's complement integer
long bigNumber = 9223372036854775807L; // 64-bit signed two's complement integer

// Floating point
float decimalNumber = 3.14f;   // 32-bit IEEE 754 floating point
double preciseNumber = 3.14159265359; // 64-bit IEEE 754 floating point

// Boolean
boolean isTrue = true;         // true or false

// Character
char letter = 'A';             // 16-bit Unicode character
```

### Tipos de datos de referencia:

```java
// String (cadena de caracteres)
String text = "Hello, Java!";

// Arrays
int[] numbers = {1, 2, 3, 4, 5};

// Clase propia
class Person {
    String name;
    int age;
}
Person person = new Person();
```

### Declaración de constantes:

```java
final double PI = 3.14159;
final int DAYS_IN_WEEK = 7;
```

Las constantes en Java se declaran usando la palabra clave `final`. Por convención, se nombran en mayúsculas con guiones bajos separando palabras.

## 3. Operadores

Java ofrece una variedad de operadores para realizar diferentes tipos de operaciones.

### Operadores Aritméticos:
```java
int a = 10, b = 3;
System.out.println("a + b = " + (a + b));  // Suma: 13
System.out.println("a - b = " + (a - b));  // Resta: 7
System.out.println("a * b = " + (a * b));  // Multiplicación: 30
System.out.println("a / b = " + (a / b));  // División entera: 3
System.out.println("a % b = " + (a % b));  // Módulo (resto): 1

// Incremento y decremento
int c = 5;
System.out.println("c++ = " + (c++)); // Imprime 5, luego incrementa
System.out.println("c = " + c);       // Ahora c es 6
System.out.println("++c = " + (++c)); // Incrementa primero, luego imprime 7
```

### Operadores de Comparación:
```java
int x = 5, y = 8;
System.out.println("x > y: " + (x > y));   // false
System.out.println("x < y: " + (x < y));   // true
System.out.println("x >= y: " + (x >= y)); // false
System.out.println("x <= y: " + (x <= y)); // true
System.out.println("x == y: " + (x == y)); // false
System.out.println("x != y: " + (x != y)); // true
```

### Operadores Lógicos:
```java
boolean p = true, q = false;
System.out.println("p && q: " + (p && q)); // AND lógico: false
System.out.println("p || q: " + (p || q)); // OR lógico: true
System.out.println("!p: " + (!p));         // NOT lógico: false
```

### Operadores de Asignación:
```java
int n = 10;
n += 5;  // Equivalente a: n = n + 5
System.out.println("n += 5: " + n);  // 15

n -= 3;  // Equivalente a: n = n - 3
System.out.println("n -= 3: " + n);  // 12

n *= 2;  // Equivalente a: n = n * 2
System.out.println("n *= 2: " + n);  // 24

n /= 4;  // Equivalente a: n = n / 4
System.out.println("n /= 4: " + n);  // 6

n %= 4;  // Equivalente a: n = n % 4
System.out.println("n %= 4: " + n);  // 2
```

## 4. Estructuras de Control

Las estructuras de control permiten alterar el flujo de ejecución de un programa.

### If-Else:
```java
int age = 18;

if (age < 13) {
    System.out.println("Child");
} else if (age >= 13 && age < 18) {
    System.out.println("Teenager");
} else {
    System.out.println("Adult");
}

// Operador ternario
String status = (age >= 18) ? "Adult" : "Minor";
System.out.println(status);
```

### Switch:
```java
int dayOfWeek = 3;
String dayName;

switch (dayOfWeek) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
        break;
    case 4:
        dayName = "Thursday";
        break;
    case 5:
        dayName = "Friday";
        break;
    case 6:
        dayName = "Saturday";
        break;
    case 7:
        dayName = "Sunday";
        break;
    default:
        dayName = "Invalid day";
}

System.out.println("Day: " + dayName);
```

### Bucle For:
```java
// Bucle for básico
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration " + i);
}

// For-each loop (para iterar sobre colecciones)
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println("Number: " + num);
}
```

### Bucle While:
```java
int count = 0;
while (count < 5) {
    System.out.println("Count: " + count);
    count++;
}
```

### Bucle Do-While:
```java
int x = 0;
do {
    System.out.println("x: " + x);
    x++;
} while (x < 5);
```

## 5. Arreglos

Los arreglos en Java son objetos que contienen elementos del mismo tipo.

```java
// Declaración e inicialización de un arreglo
int[] numbers = {1, 2, 3, 4, 5};

// Acceso a elementos
System.out.println("First element: " + numbers[0]);  // Imprime 1

// Modificación de elementos
numbers[2] = 10;
System.out.println("Modified third element: " + numbers[2]);  // Imprime 10

// Longitud del arreglo
System.out.println("Array length: " + numbers.length);

// Arreglo bidimensional
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
System.out.println("Element at matrix[1][2]: " + matrix[1][2]);  // Imprime 6

// Iterando sobre un arreglo bidimensional
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

## 6. Métodos

Los métodos en Java son bloques de código que realizan una tarea específica.

```java
public class Calculator {
    // Método simple que suma dos números
    public static int add(int a, int b) {
        return a + b;
    }

    // Método con parámetros variables
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // Método principal
    public static void main(String[] args) {
        System.out.println("5 + 3 = " + add(5, 3));
        System.out.println("Sum of 1, 2, 3, 4 = " + sum(1, 2, 3, 4));
    }
}
```

## 7. Manejo de Excepciones

Java utiliza try-catch para manejar excepciones, permitiendo al programa responder a errores de manera controlada.

```java
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This block always executes");
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
```

## 8. Entrada y Salida Básica

Java proporciona varias formas de manejar la entrada y salida. Aquí hay ejemplos básicos usando `System.out` para salida y `Scanner` para entrada.

```java
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Salida básica
        System.out.println("Hello, World!");

        // Entrada básica
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close();  // Siempre cierra el Scanner cuando termines
    }
}
```

## 9. Programación Orientada a Objetos Básica

Java es un lenguaje orientado a objetos. Aquí hay una introducción básica a las clases y objetos.

```java
public class Person {
    // Atributos
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Métodos
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        person1.introduce();

        Person person2 = new Person("Bob", 25);
        person2.introduce();
    }
}
```

## 10. Paquetes e Importaciones

Los paquetes en Java se utilizan para organizar las clases relacionadas. Las importaciones permiten usar clases de otros paquetes.

```java
// Declaración del paquete
package com.example.myapp;

// Importaciones
import java.util.ArrayList;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // ...
    }
}
```

Para usar una clase de otro paquete, debes importarla o usar su nombre completo:

```java
// Usando el nombre completo sin importar
java.util.Date today = new java.util.Date();

// O importar la clase y usarla directamente
import java.util.Date;
// ...
Date today = new Date();
```

## Conclusión

Esta guía cubre los conceptos básicos de la sintaxis de Java. A medida que te familiarices con estos fundamentos, podrás construir programas más complejos y explorar características más avanzadas del lenguaje, como programación orientada a objetos, colecciones, y concurrencia.