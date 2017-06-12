public class Oefening2_1 {
    public static void main(String[] args) {
        int price = 35;
        int quantity = 5;
        double tax = 0.21;

        double total = (price + (tax*price)) * quantity;

        System.out.println("The total price is " + total);
    }
}