package bossmonster;

import bossmonster.IO.Input;
import bossmonster.IO.Output;

public class Application {
    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        Player player = new Player();
        BossMonster bossMonster = new BossMonster();

        input.bossHP(bossMonster);
        input.playerName(player);
        input.playerHPMP(player);
        player.magicalAttack(bossMonster);
        player.physicalAttack(bossMonster);

    }
}
