public class age {

    static void checkLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }
    }

    public static void main(String[] args) {
        checkLeapYear(2024);
        checkLeapYear(2023);
        checkLeapYear(1900);
        checkLeapYear(2000);
    }
}