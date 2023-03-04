package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    public Warrior() {
        this.setPhysAtt(30);
        this.setPhysDef(0.8);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (this.getPhysAtt() - this.getPhysAtt() * hero.getPhysDef()));
        if (hero.getHealth() < 0) {
            hero.setHealth(0);
        }

    }

    public String toString() {
        return "Warrior{health=" + getHealth() + "}";
    }
}
