public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "Имя ученика: " + getName() +
                ", мощность магии - " + getMagicPower() +
                ", расстояние трансгрессирования - " + getTransgressionDistance() +
                ", благородство - " + getNobility() +
                ", честь - " + getHonor() +
                ", храбрость - " + getBravery() +
                '}';
    }
}
