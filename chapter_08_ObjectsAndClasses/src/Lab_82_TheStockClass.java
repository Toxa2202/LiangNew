public class Lab_82_TheStockClass {
    public static void main(String[] args) {
        Stock userInput = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        System.out.println("Price change percentage is: " + userInput.getChangePercent());
    }
}

class Stock {
    String symbol = "";
    String name = "";
    double previousClosingPrice;
    double currentPrice;

    // Default constructor
    public Stock (){

    }

    // Constructor with args
    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(){
        if (currentPrice <= previousClosingPrice) {
            return 100 - currentPrice * 100 / previousClosingPrice;
        } else {
            return -(100 - currentPrice * 100 / previousClosingPrice);
        }
    }
}
