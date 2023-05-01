public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public void compareStudents(Ravenclaw other) {
        int sum1 = getMind() + getWisdom() + getWit() + getCreation();
        int sum2 = other.getMind() + other.getWisdom() + other.getWit() + other.getCreation();
        if (sum1 > sum2) {
            System.out.println(getName() + " лучший Когтевранец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + getName());
        }
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "Имя ученика: " + getName() +
                ", мощность магии - " + getMagicPower() +
                ", расстояние трансгрессирования - " + getTransgressionDistance() +
                ", ум - " + getMind() +
                ", мудрость - " + getWisdom() +
                ", остроумие - " + getWit() +
                ", творчество - " + getCreation() +
                '}';
    }
}
