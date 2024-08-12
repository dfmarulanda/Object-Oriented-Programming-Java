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
- **Composición**: Se compone de PAS y PDI.

###### 1.6 PAS (Personal de Administración y Servicios)
- **Parte de**: Trabajador (Composición)
- **Atributos**:
  - `Puesto`: Posición específica dentro de la administración.
- **Métodos**:
  - `administrar()`: Representa las funciones administrativas.
- **Rol**: Personal encargado de tareas no docentes ni investigadoras.

###### 1.7 PDI (Personal Docente e Investigador)
- **Parte de**: Trabajador (Composición)
- **Atributos**:
  - `Categoria`: Nivel académico o investigador.
- **Métodos**:
  - `investigar()`: Representa la actividad investigadora.
  - `enseñar()`: Representa la actividad docente.
- **Rol**: Personal dedicado a la docencia y/o investigación.

###### 1.10 Doctor
- **Hereda de**: Trabajador
- **Rol**: Representa a un trabajador que ha completado un doctorado, probablemente parte del PDI.

##### 2. Relaciones entre Clases

###### 2.1 Herencia
Representada por flechas con triángulo vacío (───▷).
- Persona ───▷ Trabajador y Estudiante: Indica que Trabajador y Estudiante son tipos específicos de Persona.
- Trabajador ───▷ Doctor: Doctor es un tipo específico de Trabajador.
- Estudiante ───▷ Est. Grado y Est. Doctorado: Especifica tipos de Estudiantes.

###### 2.2 Composición
Representada por un diamante lleno (♦).
- Universidad ♦───── Departamento: Los Departamentos son parte integral de la Universidad y no existen independientemente.
- Trabajador ♦───── PAS y PDI: PAS y PDI son componentes mutuamente excluyentes de Trabajador.

###### 2.3 Asociación
Representada por líneas simples (───).
- Universidad ─── Trabajador (1 a *): Una Universidad tiene muchos Trabajadores.
- Universidad ─── Estudiante (1 a *): Una Universidad tiene muchos Estudiantes.
- PDI ─── Departamento: Los PDI están asociados a Departamentos.

###### 2.4 Agregación
Representada por un diamante vacío (◇).
- Departamento ◇───── Doctor (0..1): Los Doctores están asociados a Departamentos, pero pueden existir independientemente.

###### 2.5 Dependencia
Representada por una flecha punteada (- - ->).
- Est. Doctorado - - -> Doctor: Indica que un Est. Doctorado puede convertirse en Doctor.


##### 3. Análisis de las Relaciones

1. La herencia sigue permitiendo una jerarquía clara de roles universitarios, con Persona como base común.
2. La composición Trabajador-PAS/PDI indica que estos son tipos mutuamente excluyentes de Trabajador.
3. La herencia Doctor-Trabajador sugiere que los Doctores son considerados un tipo específico de Trabajador, probablemente asociado al PDI.
4. Las demás relaciones se mantienen como se describieron anteriormente.

##### 4. Implicaciones del Diseño

1. **Estructura del Personal**: La composición de Trabajador en PAS y PDI refleja una clara distinción entre roles administrativos y académicos.
2. **Rol de Doctor**: Al ser una subclase de Trabajador, se enfatiza el papel de los Doctores como parte del personal universitario, probablemente en roles académicos o de investigación.
3. **Flexibilidad en Categorización**: La estructura permite que un Doctor sea considerado un tipo específico de Trabajador, facilitando la representación de roles académicos avanzados.
4. **Integridad Estructural**: La composición asegura que los Departamentos y los tipos de Trabajadores (PAS/PDI) estén fuertemente ligados a sus contenedores (Universidad y Trabajador, respectivamente).
5. **Gestión de Ciclo de Vida**: La composición implica que la Universidad es responsable de la creación y destrucción de Departamentos, y que un Trabajador no puede existir sin ser PAS o PDI.

##### 5. Implicaciones de la Composición en el Sistema Universitario

1. **Exclusividad Mutua**: La composición entre Trabajador y PAS/PDI implica que un trabajador debe ser o bien PAS o bien PDI, pero no ambos simultáneamente. Esto refleja la realidad organizativa de muchas universidades donde los roles administrativos y académicos están claramente separados.

2. **Dependencia Existencial**: Los Departamentos, al estar en una relación de composición con la Universidad, no pueden existir fuera del contexto de la universidad. Esto modela correctamente la estructura organizativa donde los departamentos son unidades internas de la institución.

3. **Control de Ciclo de Vida**: La Universidad tiene control total sobre la creación, modificación y eliminación de Departamentos. Similarmente, la clase Trabajador controla el ciclo de vida de las instancias de PAS y PDI.

4. **Impacto en la Implementación**: En términos de programación, esto podría traducirse en que la clase Universidad tenga métodos para crear y gestionar Departamentos, y que la clase Trabajador tenga lógica para determinar si una instancia es PAS o PDI.

5. **Restricciones de Diseño**: Esta estructura impone ciertas limitaciones en cómo se pueden modificar o extender estas clases. Por ejemplo, no se podría tener un Departamento independiente o transferir un Departamento directamente de una Universidad a otra sin recrearlo.

6. **Consistencia de Datos**: La composición ayuda a mantener la integridad y consistencia de los datos del sistema. Por ejemplo, asegura que cada trabajador esté correctamente categorizado y que todos los departamentos estén asociados a una universidad.

7. **Modelado de Jerarquías Organizativas**: Este uso de la composición refleja fielmente las estructuras jerárquicas típicas en entornos universitarios, facilitando la representación de cadenas de mando y responsabilidades.

### 5. Actividad Práctica

#### 5.1 Crear un diagrama de clases UML para un sistema de gestión de un gimnasio
- Trabajar en grupos de 3-4 estudiantes
- Identificar al menos 5 clases relevantes
- Incluir atributos y métodos para cada clase
- Representar al menos 3 tipos diferentes de relaciones entre clases
- Utilizar composición donde sea apropiado, considerando las implicaciones discutidas

#### 5.2 Presentación y discusión
- Cada grupo presenta brevemente su diagrama
- Discusión sobre diferentes enfoques y decisiones de diseño
- Análisis crítico del uso de composición y otras relaciones en los diagramas presentados

### 6. Cierre y Reflexión

- Recapitulación de los conceptos clave aprendidos, especialmente la importancia y las implicaciones de la composición
- Discusión sobre cómo estos conceptos se aplican en el desarrollo de software real
- Reflexión sobre cómo el uso adecuado de relaciones como la composición puede mejorar el diseño de sistemas
- Introducción a la tarea para la próxima sesión

## Recursos Adicionales

### Lecturas recomendadas
1. Capítulo 3: "UML Basics" del libro "UML Distilled" por Martin Fowler
2. Artículo: "Best Practices for Creating UML Diagrams" en [developer.com](https://www.developer.com/design/best-practices-for-creating-oop-diagrams-using-uml/)
3. Artículo: "Composition vs Aggregation in UML" en [Visual Paradigm](https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-aggregation-vs-composition/)

### Videos tutoriales
1. [UML Class Diagram Tutorial](https://www.youtube.com/watch?v=UI6lqHOVHic) (10 minutos)
2. [Object Oriented Design](https://www.coursera.org/learn/object-oriented-design) - Curso en Coursera (recomendado para estudio posterior)
3. [UML 2.0 Tutorial](https://www.youtube.com/watch?v=OkC7HKtiZC0&list=PLGLfVvz_LVvQ5G-LdJ8RLqe-ndo7QITYc) - Serie de videos que incluye explicaciones detalladas sobre composición y agregación

### Herramientas de software
1. [draw.io](https://app.diagrams.net/) - Herramienta gratuita de diagramación en línea
2. [Visual Paradigm Online](https://online.visual-paradigm.com/) - Herramienta UML en línea con funciones avanzadas
3. [IntelliJ IDEA](https://www.jetbrains.com/idea/) - IDE con soporte para diagramas UML (versión de pago)
4. [StarUML](http://staruml.io/) - Herramienta de modelado UML multiplataforma con una versión gratuita robusta

