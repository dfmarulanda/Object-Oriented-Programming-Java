public class BattleRound {
    private int roundNumber;
    private int attackerDamage;
    private int defenderDamage;
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

    // Getters
    public int getRoundNumber() {
        return roundNumber;
    }

    public int getAttackerDamage() {
        return attackerDamage;
    }

    public int getDefenderDamage() {
        return defenderDamage;
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