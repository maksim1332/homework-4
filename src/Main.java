public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//                                              tesk 1
        int age = 27;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }
//                                              tesk 2
        int temperature = 14;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов  можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов  нужно надеть шапку");
        }
//                                               tesk 3
        int speedKmH = 90;
        if (speedKmH > 60) {
            System.out.println("Если скорость " + speedKmH + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedKmH + "можно ездить спокойно");
        }
//                                               tesk 4
        int age1 = 19;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " лет,то ему нужно ходить в детский сад.");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + " лет,то ему нужно ходить в школу.");
        }
        if (age1 >= 18 && age1 < 24) {
            System.out.println("Если возраст человека равен " + age1 + " лет, его место в университете.");
        }
        if (age1 > 24) {
            System.out.println("если человеку больше " + age1 + " лет ему пора ходить на работу.");
        }
//                                               tesk 5
        int age2 = 13;
        int accompanyingAdult = 1;
        if (age2 <= 5) {
            System.out.println("Если возраст ребенка равен " + age2 + " то ему нельзя кататься на аттракционе.");
        }
        if (age2 > 5 && age2 <= 14 && accompanyingAdult < 1) {
            System.out.println("Если возраст ребенка равен " + age2 + " Если взрослого нет, то кататься нельзя.");
        }
        if (age2 > 5 && age2 <= 14 && accompanyingAdult >= 1) {
            System.out.println("Если возраст ребенка равен " + age2 + " то он может кататься только в сопровождении взрослого.");
        }
        if (age2 > 14) {
            System.out.println("Если возраст ребенка больше " + age2 + " то он может кататься без сопровождения взрослого.");
        }
//                                                tesk 6
        int vanCapacity = 102;
        int sedentaryPlaces = 61;
        if (sedentaryPlaces < 60 && vanCapacity < 102) {
            System.out.println("В вагоне есть сидячие места");}
        if (sedentaryPlaces > 60 && vanCapacity < 102) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне мест нет");}
//                                                 tesk 7
        int One = 1;
        int Two = 2;
        int Three = 3;
        if (One > Two && One > Three) {
            System.out.println("One MAX");
        } else if (Two < Three) {
            System.out.println("Two MAX");
        }else{
            System.out.println("Three MAX");}
    }
}