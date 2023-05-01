public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

        public void compareStudents(Slytherin other) {
            int sum1 = getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getLustForPower();
            int sum2 = other.getCunning() + other.getDetermination() + other.getAmbition() + other.getResourcefulness() + other.getLustForPower();
        if (sum1 > sum2) {
            System.out.println(getName() + " лучший Слизеринец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Слизеринец, чем " + getName());
        }
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "Имя ученика: " + getName() +
                ", мощность магии - " + getMagicPower() +
                ", расстояние трансгрессирования - " + getTransgressionDistance() +
                ", хитрость - " + getCunning() +
                ", решительность - " + getDetermination() +
                ", амбициозность - " + getAmbition() +
                ", находчивость - " + getResourcefulness() +
                ", жажда власти - " + getLustForPower() +
                '}';
    }
}
