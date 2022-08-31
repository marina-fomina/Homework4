public class Main {
    public static void main(String[] args) {
        // Домашнее задание - 1
        System.out.println("Домашнее задание - 1");

        // Задача 1
        System.out.println("Задача №1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил - нужно немного подождать.");
        }

        // Задача 2
        System.out.println("Задача №2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребёнок ходит в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Закончил школу - можно в университет.");
        }
        if (age > 24) {
            System.out.println("Закончил университет - пора искать работу.");
        }

        // Задача 3
        System.out.println("Задача №3");
        byte totalCapacity = 102; // всего мест в вагоне
        byte sittingPlaces = 60; // сидячих мест
        int standingPlaces = totalCapacity - sittingPlaces; // стоячих мест
        int reservedSittingPlaces = 30; // занято сидячих мест
        int reservedStandingPlaces = 42; // занято стоячих мест

        if (reservedSittingPlaces < sittingPlaces) {
            System.out.println("Свободно " + (sittingPlaces - reservedSittingPlaces) + " сидячих мест.");
        }
        if (reservedStandingPlaces < standingPlaces) {
                System.out.println("Свободно " + (standingPlaces - reservedStandingPlaces) + " стоячих мест.");
        }
        if (reservedSittingPlaces == sittingPlaces) {
            System.out.println("Свободных сидячих мест нет.");
        }
        if (reservedStandingPlaces == standingPlaces) {
            System.out.println("Свободных стоячих мест нет.");
        }

        // Домашнее задание - 2
        System.out.println("Домашнее задание - 2");
        // Задача 1
        System.out.println("Задача №1");
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил - нужно немного подождать.");
        }

        // Задача 2
        System.out.println("Задача №2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребёнок ходит в школу.");
        } else if (age >= 18 && age < 24) {
            System.out.println("Закончил школу - можно в университет.");
        } else {
            System.out.println("Закончил университет - пора искать работу.");
        }
        // Задача 3
        System.out.println("Задача №3");
        if (reservedSittingPlaces < sittingPlaces) {
            System.out.println("Свободно " + (sittingPlaces - reservedSittingPlaces) + " сидячих мест.");
        } else {
            System.out.println("Свободных сидячих мест нет.");
        }
        if (reservedStandingPlaces < standingPlaces) {
            System.out.println("Свободно " + (standingPlaces - reservedStandingPlaces) + " стоячих мест.");
        } else {
            System.out.println("Свободных стоячих мест нет.");
        }

        // Домашнее задание - 3
        System.out.println("Домашнее задание - 3");
        // Задача 1
        System.out.println("Задача №1");
        int ageInYears = 5;
        if (ageInYears >= 2 && ageInYears <= 6) {
            System.out.println("Если возраст человека равен " + ageInYears + ", то ему нужно ходить в детский сад.");
        } else if (ageInYears > 7 && ageInYears <= 18) {
            System.out.println("Если возраст человека равен " + ageInYears + ", то ему нужно ходить в школу.");
        } else if (ageInYears > 18 && ageInYears <= 24) {
            System.out.println("Если возраст человека равен " + ageInYears + ", то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + ageInYears + ", то ему пора ходить на работу.");
        }

        // Задача 2
        System.out.println("Задача №2");
        int ageOfChild = 14;
        if (ageOfChild < 5) {
            System.out.println("Если ребёнку меньше 5 лет, кататься на аттракционе нельзя.");
        } else if (ageOfChild < 14) {
            System.out.println("Если ребёнку от 5 до 14 лет, он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Если ребёнок старше 14 лет, он может кататься без сопровождения взрослого.");
        }

        // Задача 3
        System.out.println("Задача №3");
        int one = -19;
        int two = -10;
        int three = -18;
        if (one > two && one >= three) {
            System.out.println("Наибольшее число - " + one + ".");
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число - " + two + ".");
        } else if (three > one && three > two){
            System.out.println("Наибольшее число - " + three + ".");
        }
        if (one == two && two == three) {
            System.out.println("Числа равны.");
        }
    }}