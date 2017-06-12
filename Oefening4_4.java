public class Oefening4_4 {
    public static void main(String[] args) {
        int startValue = 100;
        int monthlyGain;
        int monthsYear = 12;
        int interestPercentage = 5;
        int interest = interestPercentage / monthsYear;

        for (int i = 1; i <= monthsYear; i++) {
           monthlyGain = startValue + (interest + 1);
        }
    }
}