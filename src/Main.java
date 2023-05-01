import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Gryffindor garry = new Gryffindor("Гарри Поттер", 80, 90, 50, 60, 90);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 90, 100, 40, 60, 50);
        Gryffindor ron = new Gryffindor("Рон Уизли", 70, 60, 70, 50, 65);

        Slytherin draco = new Slytherin("Драко Малфой", 80, 90, 80, 50, 70, 30, 65);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 50, 45, 50, 40, 35, 15, 40);
        Slytherin gregory = new Slytherin("Грегори Гойл", 45, 40, 45, 45, 30, 10, 40);

        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 70, 70, 80, 70, 75);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 55, 65, 50, 65, 70);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 60, 60, 45, 65, 70);

        Ravenclaw cho = new Ravenclaw("Чжоу Чанг", 75, 60, 80, 65, 60, 50);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 65, 50, 70, 50, 55, 75);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 70, 75, 75, 70, 50, 70);

        cho.studentDescription();
        System.out.println();
        hermione.compareStudents(garry);
        System.out.println();
        draco.compareStudents(graham);
        System.out.println();
        zacharias.compareStudents(cedric);
        System.out.println();
        cho.compareStudents(marcus);
        System.out.println();
        garry.compareStudentsHogwarts(draco);
    }
}