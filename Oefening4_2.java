public class Oefening4_2 {
    public static void main(String[]args){
        double monthValue = 0;
        int bankIncrease = 100;
        int monthCount = 12;

        float interestRate = 5 / monthCount;
        float interestIncrease = interestRate + 1;

        for (int i = 1; i < monthCount; i++) {
            monthValue = bankIncrease + interestIncrease;
            if (i = 6) {
                System.out.println("monthValue");
            }
        }
        System.out.print(monthValue);
    }
}