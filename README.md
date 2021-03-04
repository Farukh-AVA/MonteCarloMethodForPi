# MonteCarloMethodForPi
This program will estimate Pi by using Monte Carlo Method. 

 This program implement the Monte Carlo Method for the Estimation of Pi.
  By the example of the circular dart board with the radius of 1 foot, and 
  and the dartboard is attached in the square with side of 2 feet. Next,
  we throwing big number of darts to the square, to count how many darts in 
  the square and how many in dartboard we inserting the pairs of random 
  numbers with range of [-1 and 1] by using Java.util.Random class. We can 
  determine whether pairs of darts in the dartboard by using the formula 
  of (x^2+Y^2) less then 1, and if this true we count darts by using counter,
  inside the for loop for darts. Last  we using the formula to calculate Pi
             4*number of darts 
  Pi=  -----------------------------
         number that hit the dartboard.  
  As number of darts approach infinity the Pi become more precise.
  
  Next, we timed the execution time to create a table number of darts vs time.
  
