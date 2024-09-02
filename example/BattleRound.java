// La clase BattleRound tiene una relación de composición con Battle
// Una Battle se compone de múltiples BattleRounds
public class BattleRound {
    private int roundNumber;
    private int attackerDamage;
    private int defenderDamage;
    // Asociación con Commander para el atacante y el defensor
    private Commander attacker;
    private Commander defender;

    public BattleRound(Commander attacker, Commander defender, int roundNumber) {
        this.attacker = attacker;
        this.defender = defender;
        this.roundNumber = roundNumber;
    }

    public void fight() {
        // Implementar lógica de combate
        attackerDamage = calculateDamage(attacker);
        defenderDamage = calculateDamage(defender);
    }

    private int calculateDamage(Commander commander) {
        int totalDamage = 0;
        for (Troop troop : commander.getTroops()) {
            totalDamage += troop.calculatePower();
        }
        return totalDamage;
    }

    // Getters y setters
    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public int getAttackerDamage() {
        return attackerDamage;
    }

    public void setAttackerDamage(int attackerDamage) {
        this.attackerDamage = attackerDamage;
    }

    public int getDefenderDamage() {
        return defenderDamage;
    }

    public void setDefenderDamage(int defenderDamage) {
        this.defenderDamage = defenderDamage;
    }

    public Commander getAttacker() {
        return attacker;
    }

    public void setAttacker(Commander attacker) {
        this.attacker = attacker;
    }

    public Commander getDefender() {
        return defender;
    }

    public void setDefender(Commander defender) {
        this.defender = defender;
    }

    @Override
    public String toString() {
        return "BattleRound{" +
               "roundNumber=" + roundNumber +
               ", attackerDamage=" + attackerDamage +
               ", defenderDamage=" + defenderDamage +
               '}';
    }
}