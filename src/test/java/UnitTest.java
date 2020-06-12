import stock.StockCalculation;
import org.junit.Assert;

public class UnitTest {
    public static void main(String args[]) {
        //Scenario 1: Random array
        int stockPrices[] = {3,6,2,12,45,89,23,56,94,28,8,5,3};
        Assert.assertEquals(92,StockCalculation.getMaxProfit(stockPrices));
        //Scenario 2: Minimum price is the last entry
        stockPrices = new int[]{3,6,12,45,89,23,56,94,28,8,5,3,2};
        Assert.assertEquals(91,StockCalculation.getMaxProfit(stockPrices));
        //Scenario 3: Minimum price is the last entry and maximum price is the first entry
        stockPrices = new int[]{94,3,6,12,45,89,23,56,28,8,5,3,2};
        Assert.assertEquals(86,StockCalculation.getMaxProfit(stockPrices));
        //Scenario 4: Minimum price is the first entry and maximum price is the last entry
        stockPrices = new int[]{2,6,12,45,89,23,56,91,28,8,5,3,96};
        Assert.assertEquals(94,StockCalculation.getMaxProfit(stockPrices));
        //Scenario 5: Minimum price is not involved in calculating maximum profit
        stockPrices = new int[]{9,6,12,45,89,23,56,91,2,8,51,3,68};
        Assert.assertEquals(85,StockCalculation.getMaxProfit(stockPrices));
    }
}
