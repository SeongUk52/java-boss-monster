package bossmonster;

import bossmonster.VO.HP;
import bossmonster.VO.MP;
import bossmonster.VO.Name;

public class Player {
    private Name name;
    private HP hp;
    private MP mp;
    private Integer attackCount;
    public void createName(String input){
        this.name = new Name(input);
    }
    public void createHPMP(int hp, int mp){
        if (!(hp + mp == 200))
            throw new IllegalArgumentException("플레이어의 초기 HP와 MP 합은 200이어야 합니다.");
        this.hp = new HP(hp);
        this.mp = new MP(mp);
        this.attackCount = 0;

    }

    public void physicalAttack(BossMonster target){
        target.damaged(10);
        mp.increase(10);
        attackCount ++;
    }
    public void magicalAttack(BossMonster target){
        if(!mp.usableMagic(30))
            throw new IllegalArgumentException("MP가 30미만이라서 마법공격을 할 수 없습니다.");
        target.damaged(20);
        mp.decrease(30);
        attackCount++;

    }
}

