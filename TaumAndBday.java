import java.util.*;
public class Result {
    
    // Method to purchase both the gift in a minimum cost
    public static long taumBday(long b, long w, long bc, long wc, long z)
    {
        
        if(b<=1000000000 && w<=1000000000 && bc<=1000000000 && wc<=1000000000 && z<=1000000000)
        {
            
        
        long blackGiftCostByApplyingConversionRate=0;
        long whiteGiftCostByApplyingConversionRate=0;
        long total1=0;
        long total2=0;
        
        //STEP 1: LET'S CALCULATE THE GIFT COST FOR BOTH BLACK AND WHITE WITHOUT 
        //   APPLYONG ANY CONVERSION
        // New idea :Let's convert with  and without conversion for both the product
        long blackGiftCost=b*bc;
        long whiteGiftCost=w*wc;
        long total=blackGiftCost+whiteGiftCost;   //42
        
        
        //STEP 2: With Conversion Rate Applied
        // a) First lets find the minimum value of gift cost
        long smartTernery=(bc<wc)?bc:wc;
        
        if(smartTernery==bc)
        {
            //Then first lets find black gift cost value
            blackGiftCostByApplyingConversionRate=b*bc;
            //Then
            whiteGiftCostByApplyingConversionRate=w*(bc+z);
            total1=blackGiftCostByApplyingConversionRate+whiteGiftCostByApplyingConversionRate;
        }
        else
        {
            // If white gift cost is less then
            whiteGiftCostByApplyingConversionRate=w*wc;
            blackGiftCostByApplyingConversionRate=b*(wc+z);
            total2=whiteGiftCostByApplyingConversionRate+blackGiftCostByApplyingConversionRate;
            
        }
        
        
        
        
        // Comparision
        if(smartTernery==bc)
        {
            
        
        if((total < total1  ) )
        {
            return total;
        }
        else
        {
            return total1;
        }
    
        }
        
        
        
        
        if(smartTernery==wc)
        {
            
        
        if((total < total2) )
        {
            return total;
        }
        else
        {
            return total2;
        }
    }
        
        }   // First If closing test case if closing
        
        return 0;
         
    }
    // Main Method
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    for(int i=0; i<n; i++)
    {
        
    long b=sc.nextLong();
    long w=sc.nextLong();
    long bc=sc.nextLong();
    long wc=sc.nextLong();
    long z=sc.nextLong();
       
        long result=taumBday(b,w,bc,wc,z);
        System.out.println(result);
    
    }
    
     
    }
}
