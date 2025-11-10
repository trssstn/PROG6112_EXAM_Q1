

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class test {
    
    private ProductSales productSales;
    
   
    @BeforeAll
    public void setUpClass() {
        //Initialise productSales object before each test
        productSales = new ProductSales();
    }
    
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        //Arrange - set up data
        int[][] Sales = {
            {300, 150, 700},
            {250, 200, 600}
        };
        
        int expectedTotal = 2200;
        
        //Act - calling the method that is being tested
        int actualTotal = productSales.TotalSales(Sales);
        
        //Assert - verify if the results match
        assertEquals(expectedTotal, actualTotal, "Should return 2200");
    }
    
    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        //Arrange - set up data
        int[][] Sales = {
            {300, 150, 700},
            {250, 200, 600}
        };
        
        double expectedAverage = 367;
        
        //Act - calling the method that is being tested
        double actualAverage = productSales.AverageSales(Sales);
        
        //Assert - verify if the results match
        assertEquals(expectedAverage, actualAverage, "Should return 367");
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   
}
