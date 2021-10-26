package HotelReservation_04;

public class PriceCalculator {
    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private Discount discountType;

    public PriceCalculator(double pricePerDay, int numberOfDays, Season season, Discount discountType) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discountType = discountType;
    }

    public double calculatePrice(double pricePerDay, int numberOfDays, Season season, Discount discountType) {
        int multiplier = season.getValue();
        double pricePerDayBeforeDiscount = pricePerDay * multiplier;
        double totalPrice = pricePerDayBeforeDiscount * numberOfDays;

        double discount = discountType.getDiscountPercent() * 0.01;
        totalPrice = totalPrice - (totalPrice * discount);

        return totalPrice;
    }

}
