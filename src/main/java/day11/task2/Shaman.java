package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private double magicDef;
    private double magicAtt;

    public Shaman() {
        this.setPhysAtt(10);
        this.setMagicAtt(15);
        this.setPhysDef(0.2);
        this.setMagicDef(0.2);
    }

    public double getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(double magicAtt) {
        this.magicAtt = magicAtt;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 50);
        if (getHealth() > 100) {
            setHealth(100);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
        if (hero.getHealth() > 100) {
            hero.setHealth(100);
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (this.getMagicAtt() - this.getMagicAtt() * hero.getPhysDef()));
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (this.getPhysAtt() - this.getPhysAtt() * hero.getPhysDef()));
        if (hero.getHealth() <= 0) {
            hero.setHealth(0);
        }
    }

    public String toString() {
        return "Shaman{health=" + getHealth() + "}";
    }
}
