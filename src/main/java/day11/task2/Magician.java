package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private double magicAtt;

    public Magician() {
        this.physAtt = 5;
        this.magicAtt = 20;
        this.physDef = 0;

    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public void setMagicAtt(double magicAtt) {
        this.magicAtt = magicAtt;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attack = magicAtt - magicAtt * hero.magicDef;
        if (hero.health - attack < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else
            hero.health -= attack;
    }

    public String toString() {
        return "Magician{health=" + health + "}";
    }
}
