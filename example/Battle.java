import java.util.ArrayList;
import java.util.List;

public class Battle {
    // Relación de asociación (1 a 1) con Commander para el atacante
    private Commander attacker;
    // Relación de asociación (1 a 1) con Commander para el defensor
    private Commander defender;
    // Relación de asociación (1 a 1) con BattleResult
    private BattleResult result;
    // Relación de composición (1 a muchos) con BattleRound
    private List<BattleRound> rounds;

    public Battle(Commander attacker, Commander defender) {
        this.attacker = attacker;
        this.defender = defender;
        this.rounds = new ArrayList<>();
    }

    public void simulateBattle() {
        while (!isBattleOver()) {
            // Creación de nuevos BattleRound (implementando la relación de composición)
            BattleRound round = new BattleRound(attacker, defender, rounds.size() + 1);
            round.fight();
            rounds.add(round);
        }
        determineResult();
    }

    private boolean isBattleOver() {
        // Implementar condiciones de finalización de la batalla
        return rounds.size() >= 10 || attacker.getTroops().isEmpty() || defender.getTroops().isEmpty();
    }

    private void determineResult() {
        int attackerScore = rounds.stream().mapToInt(r -> r.getAttackerDamage()).sum();
        int defenderScore = rounds.stream().mapToInt(r -> r.getDefenderDamage()).sum();

        if (attackerScore > defenderScore) {
            result = BattleResult.ATTACKER_WIN;
        } else if (defenderScore > attackerScore) {
            result = BattleResult.DEFENDER_WIN;
        } else {
            result = BattleResult.DRAW;
        }
    }

    // Getters
    public Commander getAttacker() {
        return attacker;
    }

    public Commander getDefender() {
        return defender;
    }

    public BattleResult getResult() {
        return result;
    }

    public List<BattleRound> getRounds() {
        return new ArrayList<>(rounds);
    }

    @Override
    public String toString() {
        return "Battle{" +
               "att