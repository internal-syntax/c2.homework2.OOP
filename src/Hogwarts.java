public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public static void studentDescription(String getName, Gryffindor[] gryffindors, Slytherin[] slytherins, Hufflepuff[] hufflepuffs, Ravenclaw[] ravenclaws) {
        for (Gryffindor gryffindor : gryffindors) {
            if (gryffindor.getName().equals(getName)) {
                System.out.println(gryffindor.toString());
                return;
            }
        }
        for (Slytherin slytherin : slytherins) {
            if (slytherin.getName().equals(getName)) {
                System.out.println(slytherin.toString());
                return;
            }
        }
        for (Hufflepuff hufflepuff : hufflepuffs) {
            if (hufflepuff.getName().equals(getName)) {
                System.out.println(hufflepuff.toString());
                return;
            }
        }
        for (Ravenclaw ravenclaw : ravenclaws) {
            if (ravenclaw.getName().equals(getName)) {
                System.out.println(ravenclaw.toString());
                return;
            }
        }
        System.out.println("Ученик с именем " + getName + " не найден.");
    }

    public static void CompareStudentsHogwarts(String name1, String name2, Gryffindor[] gryffindors, Slytherin[] slytherins, Hufflepuff[] hufflepuffs, Ravenclaw[] ravenclaws) {
        int sum1 = 0;
        int sum2 = 0;
        for (Gryffindor gryffindor : gryffindors) {
            if (gryffindor.getName().equals(name1)) {
                sum1 = gryffindor.getMagicPower() + gryffindor.getTransgressionDistance();
            }
            if (gryffindor.getName().equals(name2)) {
                sum1 = gryffindor.getMagicPower() + gryffindor.getTransgressionDistance();
            }
        }
        for (Slytherin slytherin : slytherins) {
            if (slytherin.getName().equals(name1)) {
                sum1 = slytherin.getMagicPower() + slytherin.getTransgressionDistance();
            }
            if (slytherin.getName().equals(name2)) {
                sum1 = slytherin.getMagicPower() + slytherin.getTransgressionDistance();
            }
        }
        for (Hufflepuff hufflepuff : hufflepuffs) {
            if (hufflepuff.getName().equals(name1)) {
                sum1 = hufflepuff.getMagicPower() + hufflepuff.getTransgressionDistance();
            }
            if (hufflepuff.getName().equals(name2)) {
                sum1 = hufflepuff.getMagicPower() + hufflepuff.getTransgressionDistance();
            }
        }
        for (Ravenclaw ravenclaw : ravenclaws) {
            if (ravenclaw.getName().equals(name1)) {
                sum1 = ravenclaw.getMagicPower() + ravenclaw.getTransgressionDistance();
            }
            if (ravenclaw.getName().equals(name2)) {
                sum1 = ravenclaw.getMagicPower() + ravenclaw.getTransgressionDistance();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " лучший ученик, чем " + name2);
        } else {
            System.out.println(name2 + " лучший ученик, чем " + name1);
        }
    }

    public static void CompareStudentsG(String name1, String name2, Gryffindor[] gryffindors) {
        int sum1 = 0;
        int sum2 = 0;
        for (Gryffindor gryffindor : gryffindors) {
            if (gryffindor.getName().equals(name1)) {
                sum1 = gryffindor.getBravery() + gryffindor.getHonor() + gryffindor.getNobility();
            }
            if (gryffindor.getName().equals(name2)) {
                sum1 = gryffindor.getBravery() + gryffindor.getHonor() + gryffindor.getNobility();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " лучший Гриффиндорец, чем " + name2);
        } else {
            System.out.println(name2 + " лучший Гриффиндорец, чем " + name1);
        }
    }

    public static void CompareStudentsS(String name1, String name2, Slytherin[] slytherins) {
        int sum1 = 0;
        int sum2 = 0;
        for (Slytherin slytherin : slytherins) {
            if (slytherin.getName().equals(name1)) {
                sum1 = slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower();
            }
            if (slytherin.getName().equals(name2)) {
                sum1 = slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " лучший Слизеринец, чем " + name2);
        } else {
            System.out.println(name2 + " лучший Слизеринец, чем " + name1);
        }
    }

    public static void CompareStudentsH(String name1, String name2, Hufflepuff[] hufflepuffs) {
        int sum1 = 0;
        int sum2 = 0;
        for (Hufflepuff hufflepuff : hufflepuffs) {
            if (hufflepuff.getName().equals(name1)) {
                sum1 = hufflepuff.getIndustriousness() + hufflepuff.getLoyalty() + hufflepuff.getHonesty();
            }
            if (hufflepuff.getName().equals(name2)) {
                sum1 = hufflepuff.getIndustriousness() + hufflepuff.getLoyalty() + hufflepuff.getHonesty();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " лучший Пуффендуец, чем " + name2);
        } else {
            System.out.println(name2 + " лучший Пуффендуец, чем " + name1);
        }
    }

    public static void CompareStudentsR(String name1, String name2, Ravenclaw[] ravenclaws) {
        int sum1 = 0;
        int sum2 = 0;
        for (Ravenclaw ravenclaw : ravenclaws) {
            if (ravenclaw.getName().equals(name1)) {
                sum1 = ravenclaw.getMind() + ravenclaw.getWisdom() + ravenclaw.getWit() + ravenclaw.getCreation();
            }
            if (ravenclaw.getName().equals(name2)) {
                sum1 = ravenclaw.getMind() + ravenclaw.getWisdom() + ravenclaw.getWit() + ravenclaw.getCreation();
            }
        }
        if (sum1 > sum2) {
            System.out.println(name1 + " лучший Когтевранец, чем " + name2);
        } else {
            System.out.println(name2 + " лучший Когтевранец, чем " + name1);
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
