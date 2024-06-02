import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        int[] allSalaries = {40000, 55000, 73000, 33500, 16000};

        int sum = 0;
        for (int index = 0; index < allSalaries.length; index++) {
            sum += allSalaries[index];
        }
        System.out.printf("Сумма трат за месяц составила %s рубелй\n", sum);

        System.out.println("Task 2");
        int minSalary = allSalaries[0]/4;
        int maxSalary = allSalaries[0]/4;

        for (int index = 0; index < allSalaries.length; index++) {
            if (allSalaries[index]/4 < minSalary) {
                minSalary = allSalaries[index]/4;
            }
            if (allSalaries[index]/4 > maxSalary) {
                maxSalary = allSalaries[index]/4;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSalary + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxSalary + " рублей");

        System.out.println("Task 3");

        int sumWeek = 0;
        for (int index = 0; index < allSalaries.length; index++) {
            sumWeek += allSalaries[index];
        }
        double average = (double) sumWeek / allSalaries.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей ", average);

        System.out.println("Task 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length - 1; index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }

    }
}