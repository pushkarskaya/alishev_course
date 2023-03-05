package day11.task2;

public class Paladin extends Hero implements Healer {
    private final int HEAL_HIM_SELF = 25;
    private final int HEAL_TEAMMATE = 10;

    public Paladin() {
        this.physAtt = 15;
        this.physDef = 0.5;
        this.magicDef = 0.2;
    }


    @Override
    public void healHimself() {
        if ((health + HEAL_HIM_SELF) >= HEALTH_MAX) {
            health = HEALTH_MAX;
        } else health += HEAL_HIM_SELF;
    }

    @Override
    public void healTeammate(Hero hero) {
        if ((hero.health + HEAL_TEAMMATE) >= HEALTH_MAX) {
            hero.health = HEALTH_MAX;
        } else hero.health += HEAL_TEAMMATE;
    }


    public String toString() {
        return "Paladin{health=" + health + "}";
    }
}
