package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
    private double magicDef;

    public Paladin() {
        this.setPhysAtt(15);
        this.setPhysDef(0.5);
        this.setMagicDef(0.2);
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 25);
        if (getHealth() > 100) {
            setHealth(100);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        setHealth((hero.getHealth() + 10));
        if (hero.getHealth() > 100) {
            hero.setHealth(100);
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
        return "Paladin{health=" + getHealth() + "}";
    }
}
