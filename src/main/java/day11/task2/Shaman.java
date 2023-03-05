package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    private final int HEAL_HIM_SELF = 50;
    private final int HEAL_TEAMMATE = 30;
    private int magicAtt;

    public Shaman() {
        this.physAtt = 10;
        this.magicAtt = 15;
        this.physDef = 0.2;
        this.magicDef = 0.2;
    }

    public void setMagicDef(double magicDef) {
    }

    @Override
    public void healHimself() {
        if ((health + HEAL_HIM_SELF) >= HEALTH_MAX) {
            health = HEALTH_MAX;
        } else
            health += HEAL_HIM_SELF;
    }

    @Override
    public void healTeammate(Hero hero) {
        if ((hero.health + HEAL_TEAMMATE) >= HEALTH_MAX) {
            hero.health = HEALTH_MAX;
        } else
            hero.health += HEAL_TEAMMATE;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attack = magicAtt - magicAtt * hero.magicDef;
        if ((hero.health - attack) < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attack;
        }
    }

    public String toString() {
        return "Shaman{health=" + health + "}";
    }
}
