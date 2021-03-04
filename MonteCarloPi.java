/**
 * @author Farukh Khassan Khojayev.
 * @since 10-16-2019
 * @vesion 1.0
 * 
 */ 
package homework3;
import java.util.Scanner;//import Scanner class.
import java.util.Random;//import Random class.


public class Homework3 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        double in_circle_count = 0,  pi_estimate;
        int i,darts;
        System.out.println("Eanter the number of Darts");
        darts=sc.nextInt();
        long startTime = System.currentTimeMillis(); //Start of timeng   
          for(i=0; i <darts; i++){
              double x = rand.nextDouble()*Math.pow(-1, rand.nextInt());
              //formula to calculate range for random numbers[-1 and 1]
              double y = rand.nextDouble()*Math.pow(-1, rand.nextInt());
              //formula to calculate range for random numbers[-1 and 1]
                 if((Math.pow(x,2)+ Math.pow(y,2))<=1) { 
                 //numbers in the dartboard     
                 in_circle_count++;
                 // counting the number in the dartboard.
                    
                 }       
           }
           long endTime= System.currentTimeMillis();//end of timing
           pi_estimate= (4.0*in_circle_count)/darts;// formula for estimation
           System.out.printf("Pi Estimate: %.5f%n",pi_estimate);
           System.out.println("Total execution time: "+(endTime-startTime)/1000);
       
        }
        
        
        
   }

    

