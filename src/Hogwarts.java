public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public void studentDescription() {
        System.out.println(toString());
    }

    public void compareStudentsHogwarts(Hogwarts other) {
        int sum1 = getMagicPower() + getTransgressionDistance();
        int sum2 = other.getMagicPower() + other.getTransgressionDistance();
        if (sum1 > sum2) {
            System.out.println(getName() + " лучший ученик, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший ученик, чем " + getName());
        }
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
}
