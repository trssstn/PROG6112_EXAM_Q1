

public class ProductSales implements IProductSales {
    
    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;
        
        //loop through each quarter and year's sales and add to total
        for (int year = 0; year < 2; year++){
            for (int quarter = 0; quarter < 3; quarter++){
                total += productSales[year][quarter];
            }
        }
        
        return total;
    }
    
    @Override
    public double AverageSales(int[][] productSales) {
        int total = 0;
        
        for (int year = 0; year < 2; year++){
            for (int quarter = 0; quarter < 3; quarter++){
                total += productSales[year][quarter];
            }
        }
        
        return total/9;
    }
   
    @Override
    public int MaxSale(int[][] productSales){
        //Assume first sale is top sale initially
        int maxSale = productSales[0][0];
        
        for (int year = 0; year < 2; year++){
            for (int quarter = 0; quarter < 3; quarter++){
                if (productSales[year][quarter] > maxSale) {
                    maxSale = productSales[year][quarter];
                }
            }
        }
        
        return maxSale;
    }
    
    @Override
    public int MinSale(int[][] productSales){
        //Assume first sale is lowest sale initially
        int minSale = productSales[0][0];
        
        for (int year = 0; year < 2; year++){
            for (int quarter = 0; quarter < 3; quarter++){
                if (productSales[year][quarter] < minSale) {
                    minSale = productSales[year][quarter];
                }
            }
        }
        
        return minSale;
    }
}
