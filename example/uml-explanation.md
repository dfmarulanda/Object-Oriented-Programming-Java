# Explicación de las Relaciones del Diagrama UML de Rise of Kingdoms

1. Kingdom "1" o-- "*" Governor : contains
   - Tipo: Agregación (diamante vacío)
   - Explicación: Un Kingdom (reino) contiene múltiples Governors (gobernadores). La agregación indica que los Governors pueden existir independientemente del Kingdom. En el juego, esto representa que un reino puede tener varios jugadores (gobernadores), pero los jugadores podrían existir incluso si el reino se disuelve.

2. Kingdom -- "1" CivilizationType : is of type
   - Tipo: Asociación simple
   - Explicación: Cada Kingdom está asociado con exactamente un CivilizationType. Esto representa que cada reino en el juego pertenece a una civilización específica (por ejemplo, China, Roma, etc.), lo cual determina sus bonificaciones y características únicas.

3. Governor "1" o-- "*" Commander : owns
   - Tipo: Agregación
   - Explicación: Un Governor posee múltiples Commanders (comandantes). La agregación sugiere que los comandantes podrían existir conceptualmente fuera del contexto de un gobernador específico. En el juego, esto refleja que un jugador puede tener varios comandantes bajo su control.

4. Governor "1" o-- "*" Building : controls
   - Tipo: Agregación
   - Explicación: Un Governor controla múltiples Buildings (edificios). Esto representa la capacidad del jugador para construir y gestionar varios edificios en su ciudad.

5. Governor "1" *-- "1" Resources : manages
   - Tipo: Composición (diamante lleno)
   - Explicación: Cada Governor tiene exactamente un conjunto de Resources (recursos) que gestiona. La composición indica que estos recursos no tienen sentido fuera del contexto del gobernador y son una parte integral de su gestión en el juego.

6. Governor "1" *-- "1" TechnologyTree : develops
   - Tipo: Composición
   - Explicación: Cada Governor tiene su propio TechnologyTree (árbol tecnológico). La composición indica que el árbol tecnológico es una parte fundamental e inseparable del progreso del gobernador en el juego.

7. Commander "1" o-- "*" Skill : has
   - Tipo: Agregación
   - Explicación: Un Commander posee múltiples Skills (habilidades). La agregación sugiere que las habilidades podrían existir conceptualmente de forma independiente, pero en el juego están asociadas a comandantes específicos.

8. Commander "1" o-- "*" Troop : leads
   - Tipo: Agregación
   - Explicación: Un Commander lidera múltiples Troops (tropas). Esto representa la capacidad de cada comandante para liderar un ejército compuesto por diferentes unidades.

9. TechnologyTree "1" o-- "*" Technology : includes
   - Tipo: Agregación
   - Explicación: Un TechnologyTree incluye múltiples Technology (tecnologías). Esto representa las diversas tecnologías que un jugador puede investigar y desarrollar a lo largo del juego.

10. Building <|-- ResourceBuilding
    - Tipo: Herencia
    - Explicación: ResourceBuilding es un tipo especializado de Building. Esto representa que los edificios de recursos (como granjas, aserraderos, etc.) son un tipo específico de edificio en el juego.

11. Building <|-- MilitaryBuilding
    - Tipo: Herencia
    - Explicación: MilitaryBuilding es otro tipo especializado de Building. Esto representa edificios militares (como cuarteles, campos de tiro, etc.) como un tipo específico de edificio en el juego.

12. Battle "1" -- "1" Commander : attacker
    - Tipo: Asociación simple
    - Explicación: Una Battle (batalla) está asociada con exactamente un Commander como atacante. Esto representa que en cada batalla, hay un comandante que toma el rol de atacante.

13. Battle "1" -- "1" Commander : defender
    - Tipo: Asociación simple
    - Explicación: Una Battle también está asociada con exactamente un Commander como defensor. Esto representa al comandante que defiende en la batalla.

14. Battle "1" *-- "*" BattleRound : consists of
    - Tipo: Composición
    - Explicación: Una Battle se compone de múltiples BattleRounds (rondas de batalla). La composición indica que estas rondas son parte integral de la batalla y no tienen sentido fuera de su contexto.