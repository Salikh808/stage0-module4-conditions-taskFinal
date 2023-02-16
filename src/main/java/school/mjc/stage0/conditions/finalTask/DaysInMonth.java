package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        switch (month) {
            case 1, 3, 7, 8, 10, 12 -> System.out.println(31);
            case 11, 9, 6, 4 -> System.out.println(30);
            default -> System.out.println("invalid date");
        }

        if (year == 366) {
            if (month == 2) {
                System.out.println(29);
            }
        } else if (year == 365) {
            if (month == 2) {
                System.out.println(28);
            }
        } else {
            System.out.println("invalid date");
        }
    }
}
