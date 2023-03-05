package day11.task2;

public abstract class Hero implements PhysAttack {
    final int MIN_HEALTH = 0;
    final int HEALTH_MAX = 100;
    double health;
    double physDef;
    double magicDef;
    double physAtt;

    public Hero() {
        this.health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attack = physAtt - physAtt * hero.physDef;
        if (hero.health - attack < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else
            hero.health -= attack;
    }
}

