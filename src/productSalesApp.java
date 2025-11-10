
public class productSalesApp {

    
    public static void main(String[] args) {
        //create instance of productsales class
        ProductSales productSales = new ProductSales();
        
        //Fill 2-dimensional array with values
        int[][] Sales = {
            {300, 150, 700},
            {250, 200, 600}
        };
        
        //Display header
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("--------------------------------------------");
        System.out.println("Total sales: " + productSales.TotalSales(Sales));
        System.out.println("Average sales: " + productSales.AverageSales(Sales));
        System.out.println("Maximum sale: " + productSales.MaxSale(Sales));
        System.out.println("Minimum sale: " + productSales.MinSale(Sales));
        System.out.println("--------------------------------------------");
        }
    }
    

