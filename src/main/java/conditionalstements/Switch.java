package conditionalstements;

public class Switch {
    public static void main(String[] args) {
        String brand;
        int productPrice;
        productPrice = 3000;
        int discount;
        int discountPercentage = 0; // Initialize discountPercentage
        char membership;
        membership = 'D';
        brand = "no";

        switch (brand) {
            case "Samsung":
                if (membership == 'D') {
                    discountPercentage = 20;
                } else if (membership == 'G') {
                    discountPercentage = 15;
                } else if (membership == 'S') {
                    discountPercentage = 10;
                } else {
                    discountPercentage = 5;
                }
                break;
            case "iphone":
                if (membership == 'D') {
                    discountPercentage = 15;
                } else if (membership == 'S') {
                    discountPercentage = 10;
                } else {
                    discountPercentage = 5;
                }
                break;
            default:
                discountPercentage = 5;
                break;
        }

        discount = productPrice * discountPercentage / 100;
        int finalPrice = productPrice - discount; // Calculate final price

        System.out.println(brand + " cost " + productPrice + ", now you get a discount of " + discount + ", final price is " + finalPrice);
    }
}
