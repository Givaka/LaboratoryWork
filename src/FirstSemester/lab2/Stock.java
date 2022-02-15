package _2_lab3;

public class Stock {
    String  symbol,                 //Value Stock
            name;                   //Name Stock
    double  previousClosingPrice,   //closing cost stock
            currentPrice;           //current cost

    public String getChangePercent() {
        double value = ((currentPrice - previousClosingPrice) / previousClosingPrice)*100;
        String result = String.format("%.2f", value);
        return result+"%";
    }
}

