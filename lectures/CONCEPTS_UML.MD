# Sesión 2: Objetos, Clases y Modelado UML (Detallado)

## Unidad y Tema
- 1.3 Objetos y clases
- 1.6 Identificación y modelado de objetos

## Objetivos de Aprendizaje
Al finalizar esta sesión, el estudiante será capaz de:
1. Comprender en profundidad la relación entre objetos y clases en POO.
2. Identificar y analizar objetos y clases en problemas complejos del mundo real.
3. Utilizar diagramas UML para modelar sistemas orientados a objetos de manera efectiva.
4. Crear diagramas de clases UML detallados, incluyendo relaciones entre clases.
5. Aplicar principios de abstracción y encapsulamiento en el diseño de clases.

## Contenido Detallado

### 1. Profundización en Objetos y Clases 

#### 1.1 Definición detallada de objeto y clase
- Objeto: Instancia concreta de una clase con estado y comportamiento.
  - Ejemplo: Un coche específico (Toyota Corolla rojo de 2022 con matrícula XYZ123)
- Clase: Plantilla o blueprint para crear objetos.
  - Ejemplo: La clase "Coche" que define las características generales de todos los coches

#### 1.2 Relación entre objetos y clases
- La clase como molde, los objetos como productos del molde
- Múltiples objetos de una misma clase: similitudes y diferencias
  - Ejemplo: Varios objetos de la clase "Estudiante" con diferentes nombres y calificaciones

#### 1.3 Atributos y métodos
- Atributos: Características o propiedades de un objeto (variables de instancia)
  - Ejemplo para la clase "Coche": color, marca, modelo, año, velocidad_actual
- Métodos: Comportamientos o acciones que un objeto puede realizar
  - Ejemplo para la clase "Coche": acelerar(), frenar(), cambiarMarcha()

#### 1.4 Ejercicio rápido
- En grupos pequeños, identificar atributos y métodos para una clase "Smartphone"

### 2. Identificación de Objetos y Clases 

#### 2.1 Técnicas para identificar objetos y clases en un problema
- Análisis de sustantivos (para objetos) y verbos (para métodos) en la descripción del problema
- Identificación de entidades físicas y conceptuales relevantes
- Agrupación de objetos similares en clases

#### 2.2 Abstracción y encapsulamiento en la definición de clases
- Abstracción: Simplificación de la realidad, enfocándose en los aspectos relevantes
  - Ejemplo: Al modelar un "Libro", podemos omitir detalles como el tipo de papel o la tipografía
- Encapsulamiento: Ocultamiento de los detalles internos de una clase
  - Ejemplo: La clase "CuentaBancaria" encapsula el saldo y proporciona métodos para depositar y retirar

#### 2.3 Ejercicio práctico
- Analizar un sistema de gestión de biblioteca:
  1. Identificar posibles clases (Libro, Usuario, Préstamo, etc.)
  2. Para cada clase, listar atributos y métodos potenciales
  3. Discutir qué detalles se pueden abstraer y encapsular

### 3. Introducción al UML (Unified Modeling Language) (30 minutos)

#### 3.1 ¿Qué es UML y por qué es importante?
- Lenguaje de modelado estandarizado para visualizar el diseño de sistemas
- Facilita la comunicación entre desarrolladores, clientes y otros stakeholders
- Ayuda a planificar y estructurar proyectos antes de la implementación

#### 3.2 Tipos de diagramas UML
- Diagramas estructurales: Clases, Objetos, Componentes, Despliegue
- Diagramas de comportamiento: Casos de Uso, Actividad, Secuencia
- Enfoque en diagramas de clases para esta sesión

### 4. Diagramas de Clases UML 

#### 4.1 Elementos de un diagrama de clases
- Clases: Representadas por rectángulos divididos en tres secciones
  - Nombre de la clase
  - Atributos
  - Métodos
- Atributos: nombre : tipo [multiplicidad] = valor_predeterminado
  - Ejemplo: edad : int = 0
- Métodos: nombre(parámetros) : tipo_retorno
  - Ejemplo: calcularPromedio() : float

#### 4.2 Visibilidad en UML
- `+` Public
- `-` Private
- `#` Protected
- `~` Package

#### 4.3 Relaciones entre clases
- Asociación: Línea sólida
  - Ejemplo: Un Estudiante está asociado con múltiples Cursos
- Agregación: Línea con diamante vacío
  - Ejemplo: Un Departamento tiene varios Profesores
- Composición: Línea con diamante lleno
  - Ejemplo: Un Coche está compuesto por un Motor
- Herencia: Flecha con triángulo vacío
  - Ejemplo: Un Gato hereda de Animal
- Implementación: Flecha punteada con triángulo vacío
  - Ejemplo: Una clase implementa una Interfaz



#### 4.1 Ejemplo Universidad:

![ejemplo](https://www.dpcg-sistemas.com.ar/images/Diagrama_de_clases.png)

##### Explicación Detallada del Diagrama de Clases del Sistema Universitario

Este diagrama de clases UML representa la estructura de un sistema universitario. Vamos a analizar cada clase y sus relaciones en detalle.

##### 1. Clases y sus Características

###### 1.1 Persona
- **Atributos**:
  - `Nombre`: Identifica a la persona.
  - `C.I`: Cédula de Identidad, un identificador único.
- **Rol**: Clase base que representa a cualquier individuo en el sistema universitario.

###### 1.2 Universidad
- **Atributos**:
  - `Nombre`: Denominación de la institución.
  - `Ciudad`: Ubicación geográfica.
- **Rol**: Entidad central que agrupa a todas las demás entidades del sistema.

###### 1.3 Trabajador
- **Hereda de**: Persona
- **Atributos adicionales**:
  - `Fecha Inicio`: Fecha de comienzo de la relación laboral.
- **Rol**: Representa a cualquier empleado de la universidad.

###### 1.4 Estudiante
- **Hereda de**: Persona
- **Rol**: Representa a cualquier individuo matriculado para estudiar en la universidad.

###### 1.5 Departamento
- **Atributos**:
  - `Nombre`: Denominación del departamento académico.
- **Rol**: Unidad organizativa dentro de la universidad que agrupa áreas de conocimiento.

###### 1.6 PAS (Personal de Administración y Servicios)
- **Hereda de**: Trabajador
- **Atributos adicionales**:
  - `Puesto`: Posición específica dentro de la administración.
- **Métodos**:
  - `administrar()`: Representa las funciones administrativas.
- **Rol**: Personal encargado de tareas no docentes ni investigadoras.

###### 1.7 PDI (Personal Docente e Investigador)
- **Hereda de**: Trabajador
- **Atributos adicionales**:
  - `Categoria`: Nivel académico o investigador.
- **Métodos**:
  - `investigar()`: Representa la actividad investigadora.
  - `enseñar()`: Representa la actividad docente.
- **Rol**: Personal dedicado a la docencia y/o investigación.

###### 1.8 Est. Grado
- **Hereda de**: Estudiante
- **Atributos adicionales**:
  - `Titulación`: Carrera específica que cursa.
- **Métodos**:
  - `colaborar()`: Posibles actividades de colaboración en la universidad.
- **Rol**: Estudiante de nivel universitario básico.

###### 1.9 Est. Doctorado
- **Hereda de**: Estudiante
- **Atributos adicionales**:
  - `Programa`: Programa doctoral específico.
- **Métodos**:
  - `Realizar Tesis()`: Representa el proceso de investigación doctoral.
- **Rol**: Estudiante de nivel avanzado, realizando investigación doctoral.

###### 1.10 Doctor
- **Rol**: Representa a un individuo que ha completado un doctorado.

##### 2. Relaciones entre Clases

###### 2.1 Herencia
Representada por flechas con triángulo vacío (───▷).
- Persona ───▷ Trabajador y Estudiante: Indica que Trabajador y Estudiante son tipos específicos de Persona.
- Trabajador ───▷ PAS y PDI: PAS y PDI son tipos específicos de Trabajador.
- Estudiante ───▷ Est. Grado y Est. Doctorado: Especifica tipos de Estudiantes.

###### 2.2 Asociación
Representada por líneas simples (───).
- Universidad ─── Trabajador (1 a *): Una Universidad tiene muchos Trabajadores.
- Universidad ─── Estudiante (1 a *): Una Universidad tiene muchos Estudiantes.
- PDI ─── Departamento: Los PDI están asociados a Departamentos.

###### 2.3 Composición
Representada por un diamante lleno (♦).
- Universidad ♦───── Departamento: Los Departamentos son parte integral de la Universidad y no existen independientemente.

###### 2.4 Agregación
Representada por un diamante vacío (◇).
- Departamento ◇───── Doctor (0..1): Los Doctores están asociados a Departamentos, pero pueden existir independientemente.

###### 2.5 Dependencia
Representada por una flecha punteada (- - ->).
- Est. Doctorado - - -> Doctor: Indica que un Est. Doctorado puede convertirse en Doctor.

##### 3. Análisis de las Relaciones

1. La herencia permite una jerarquía clara de roles universitarios, con Persona como base común.
2. La asociación entre Universidad y Trabajador/Estudiante muestra la relación fundamental en el sistema universitario.
3. La composición Universidad-Departamento refleja la estructura organizativa esencial.
4. La agregación Departamento-Doctor muestra una relación menos rígida, permitiendo flexibilidad.
5. La dependencia entre Est. Doctorado y Doctor representa una progresión académica potencial.

##### 4. Implicaciones del Diseño

1. **Extensibilidad**: La estructura jerárquica permite añadir fácilmente nuevos tipos de Trabajadores o Estudiantes.
2. **Organización**: Refleja claramente la estructura administrativa y académica de una universidad.
3. **Roles y Responsabilidades**: Define claramente los diferentes roles dentro del sistema universitario.
4. **Relaciones Complejas**: Captura relaciones sofisticadas como la progresión de estudiante a doctor.

Este diagrama proporciona una visión completa y estructurada del sistema universitario, facilitando la comprensión de su organización y las interrelaciones entre sus diferentes componentes.


### 5. Actividad Práctica

#### 5.1 Crear un diagrama de clases UML para un sistema de gestión de un gimnasio
- Trabajar en grupos de 3-4 estudiantes
- Identificar al menos 5 clases relevantes
- Incluir atributos y métodos para cada clase
- Representar al menos 3 tipos diferentes de relaciones entre clases

#### 5.2 Presentación y discusión
- Cada grupo presenta brevemente su diagrama
- Discusión sobre diferentes enfoques y decisiones de diseño

### 6. Cierre y Reflexión

- Recapitulación de los conceptos clave aprendidos
- Discusión sobre cómo estos conceptos se aplican en el desarrollo de software real
- Introducción a la tarea para la próxima sesión


## Recursos Adicionales

### Lecturas recomendadas
1. Capítulo 3: "UML Basics" del libro "UML Distilled" por Martin Fowler
2. Artículo: "Best Practices for Creating UML Diagrams" en [developer.com](https://www.developer.com/design/best-practices-for-creating-oop-diagrams-using-uml/)

### Videos tutoriales
1. [UML Class Diagram Tutorial](https://www.youtube.com/watch?v=UI6lqHOVHic) (10 minutos)
2. [Object Oriented Design](https://www.coursera.org/learn/object-oriented-design) - Curso en Coursera (recomendado para estudio posterior)

### Herramientas de software
1. [draw.io](https://app.diagrams.net/) - Herramienta gratuita de diagramación en línea
2. [Visual Paradigm Online](https://online.visual-paradigm.com/) - Herramienta UML en línea con funciones avanzadas
3. [IntelliJ IDEA](https://www.jetbrains.com/idea/) - IDE con soporte para diagramas UML (versión de pago)

