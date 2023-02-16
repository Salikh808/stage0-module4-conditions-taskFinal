package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year == 366) {
            switch (month) {
                case 1, 3, 7, 8, 10, 12 -> System.out.println(31);
                case 11, 9, 6, 4 -> System.out.println(30);
                case 2 -> System.out.println(29);
            }
        }
        if (year == 365) {
            switch (month) {
                case 1, 3, 7, 8, 10, 12 -> System.out.println(31);
                case 11, 9, 6, 4 -> System.out.println(30);
                case 2 -> System.out.println(28);
            }
        }else {
            System.out.println("invalid date");
        }
    }
}
