package stock;

public class StockCalculation {
    public static int getMaxProfit(int[] stockPrices) {
        // to start with, initialise minimum price as first entry and maximum profit as zero
        int maxProfit = 0;
        int minPrice = stockPrices[0];

        // iterate through stock prices to find the minimum price and maximum profit
        // minimum price is updated to find the maximum profit with the hope of finding larger number later
        for(int i=0; i<stockPrices.length; i++){
           // check if current element is the minimum value, if yes, update
           if (stockPrices[i] < minPrice)
               minPrice = stockPrices[i];
           // check if the difference is greater than current maximum profit, is yes, update
           if ((stockPrices[i]-minPrice) > maxProfit)
               maxProfit = stockPrices[i]-minPrice;
        }
        
        return maxProfit;
    }
}
