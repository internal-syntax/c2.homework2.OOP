public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void compareStudents(Hufflepuff other) {
        int sum1 = getIndustriousness() + getLoyalty() + getHonesty();
        int sum2 = other.getIndustriousness() + other.getLoyalty() + other.getHonesty();
        if (sum1 > sum2) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Пуффендуец, чем " + getName());
        }
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "Имя ученика: " + getName() +
                ", мощность магии - " + getMagicPower() +
                ", расстояние трансгрессирования - " + getTransgressionDistance() +
                ", трудолюбие - " + getIndustriousness() +
                ", верность - " + getLoyalty() +
                ", четность - " + getHonesty() +
                '}';
    }
}
