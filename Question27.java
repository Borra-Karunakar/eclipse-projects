package assignment;

/*
Question 27:
Create an enum with 6 paper currencies.
Loop through all values and use switch to describe each.


*/

enum Currency {
    RUPEE, DOLLAR, EURO, POUND, YEN, DINAR
}

public class Question27 {
    public static void main(String[] args) {
        for (Currency c : Currency.values()) {
            System.out.print(c + " - ");
            switch (c) {
                case RUPEE:
                    System.out.println("Indian currency");
                    break;
                case DOLLAR:
                    System.out.println("US currency");
                    break;
                case EURO:
                    System.out.println("European currency");
                    break;
                case POUND:
                    System.out.println("UK currency");
                    break;
                case YEN:
                    System.out.println("Japanese currency");
                    break;
                case DINAR:
                    System.out.println("Middle Eastern currency");
                    break;
                default:
                    System.out.println("Unknown currency");
            }
        }
    }
}

/*
Output:
RUPEE - Indian currency
DOLLAR - US currency
EURO - European currency
POUND - UK currency
YEN - Japanese currency
DINAR - Middle Eastern currency
*/
