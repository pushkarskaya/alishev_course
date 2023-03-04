package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private double magicDef;
    private double magicAtt;

    public Magician() {
        this.setPhysAtt(5);
        this.setMagicAtt(20);
        this.setPhysDef(0);
    }

    public double getMagicDef(Hero hero) {
        return magicDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public double getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(double magicAtt) {
        this.magicAtt = magicAtt;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (this.getMagicAtt() - this.getMagicAtt() * hero.getMagicDef()));
        if (hero.getHealth() < 0) {
            hero.setHealth(0);
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (this.getPhysAtt() - this.getPhysAtt() * hero.getPhysDef()));
        if (hero.getHealth() < 0) {
            hero.setHealth(0);
        }
    }

    public String toString() {
        return "Magician{health=" + getHealth() + "}";
    }
}
