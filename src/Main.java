import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 80, 90, 50, 60, 90),
                new Gryffindor("Гермиона Грейнджер", 90, 100, 40, 60, 50),
                new Gryffindor("Рон Уизли", 70, 60, 70, 50, 65),
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 80, 90, 80, 50, 70, 30, 65),
                new Slytherin("Грэхэм Монтегю", 50, 45, 50, 40, 35, 15, 40),
                new Slytherin("Грегори Гойл", 45, 40, 45, 45, 30, 10, 40),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 70, 70, 80, 70, 75),
                new Hufflepuff("Седрик Диггори", 55, 65, 50, 65, 70),
                new Hufflepuff("Джастин Финч-Флетчли", 60, 60, 45, 65, 70),
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 75, 60, 80, 65, 60, 50),
                new Ravenclaw("Падма Патил", 65, 50, 70, 50, 55, 75),
                new Ravenclaw("Маркус Белби", 70, 75, 75, 70, 50, 70),
        };

        Hogwarts.studentDescription("Чжоу Чанг", gryffindors, slytherins, hufflepuffs, ravenclaws);
        System.out.println();
        Hogwarts.CompareStudents("Гарри Поттер", "Рон Уизли", gryffindors);
        System.out.println();
        Hogwarts.CompareStudents("Драко Малфой", "Грэхэм Монтегю", slytherins);
        System.out.println();
        Hogwarts.CompareStudents("Захария Смит", "Седрик Диггори", hufflepuffs);
        System.out.println();
        Hogwarts.CompareStudents("Чжоу Чанг", "Маркус Белби", ravenclaws);
        System.out.println();
        Hogwarts.CompareStudentsHogwarts("Гарри Поттер", "Драко Малфой", gryffindors, slytherins, hufflepuffs, ravenclaws);
    }
}