public class Main {
    @SuppressWarnings("ConstantValue")
    public static void main(String[] args) {

        // Задача 1
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача 2
        int temp = 10;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        // Задача 3
        int speed = 62;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        // Задача 4
        age = 26;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }

        // Задача 5
        age = 10;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        // Задача 6
        int passengers = 51;
        int totalSeat = 102;
        int seatingSeat = 60;
        int standingSeat = totalSeat - seatingSeat;
        if (passengers < 60) {
            System.out.println("Свобоных сидячих мест - " + (seatingSeat-passengers) + ", стоячих - " + standingSeat);
        } else if (passengers < 102) {
            System.out.println("Свободных стоячих мест - " + (totalSeat - passengers));
        }

        // Задача 7
        int one = 7;
        int two = 14;
        int three = 9;
        if (one > two && one > three) {
            System.out.println(one + " - самое большое число");
        } else if (two > three) {
            System.out.println(two + " - самое большое число");
        } else {
            System.out.println(three + " - самое большое число");
        }
    }
            
}