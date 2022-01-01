public class PrintInfo {
    public void printInfo (Client client, double price){
        System.out.println("Witaj " + client.getFirstName() + " " + client.getLastName());
        System.out.println("Kwota przed rabatem: " + price + " zł");
        DiscountService discountService = new DiscountService();
        double priceDiscount = discountService.calculateDiscountPrice(client, price);
        System.out.println("Do zapłaty (po rabacie): " + priceDiscount + " zł");
    }
}
