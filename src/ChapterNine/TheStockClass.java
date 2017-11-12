package ChapterNine;

/*
* A string data field named symbol for the stock's symbol.
* A string data field named name for the stock's name.
* A double data field named previousClosingPrice that stores the stock price for the previous day
* A double data field named currentPrice that stores the stock price for the current time.
* A constructor that creates a stock with the specified symbol and name.
* A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.*/

public class TheStockClass {

    private String symbol;
    private String name;

    private double previousClosingPrice;
    private double currentPrice;

    public TheStockClass(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol){
        this.symbol = symbol;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentPrice(){
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice){
        this.previousClosingPrice = this.currentPrice;
        this.currentPrice = currentPrice;
    }

    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }


}