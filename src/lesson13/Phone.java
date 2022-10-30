package lesson13;

public class Phone {

    double price;
    String name;


    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Phone(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getSeasonPrice(double discount, SeasonPrice func) {
        return func.calcPrice(discount, price);
    }

    public  double chooseAndGetSeasonPrice(String season) {
        switch (season) {
            case "winter":
                return getSeasonPrice(10.0,(discount, price) -> {
                    return  price - discount * 5;
                } );
            case "spring":
                return getSeasonPrice(10.0,(discount, price) -> {
                    return  price * (1 - (discount/100));
                } );
            case "summer":
                return getSeasonPrice(20.0,(discount, price) -> {
                    return  price - discount * 5;
                } );
            case "autumn":
                return getSeasonPrice(20.0,(discount, price) -> {
                    return  price * (1 - (discount/100));
                } );
            default:
                return price;
        }
    }
}
