/*This is a hanoi program
*/
import java.lang.Math.*;   
import java.io.*;   
import java.text.*;

//import node.*;

public class hanoi{
public static int N = 52*1;

public static void main(String args[]){

DecimalFormat twoD = new DecimalFormat("0.00");
DecimalFormat fourD = new DecimalFormat("0.0000");
DecimalFormat fiveD = new DecimalFormat("0.00000");

long start, finish;
double runTime = 0, runTime2 = 0, time;
double totalTime = 0.0;
int n = N;
int repetition, repetitions = 1000;

	runTime = 0;
	for(repetition = 0; repetition < repetitions; repetition++) {
		start = System.currentTimeMillis();
		
	   // call the procedure to time here:
		hanoiTower();
		
      finish = System.currentTimeMillis();
			
      time = (double)(finish - start);
      runTime += time;
      runTime2 += (time*time);
      }

   double aveRuntime = runTime/repetitions;
   double stdDeviation = 
		Math.sqrt(runTime2 - repetitions*aveRuntime*aveRuntime)/(repetitions-1);

   System.out.printf("\f\f\fStatistics\n");
   System.out.println("________________________________________________");
   System.out.println("Total time   =             " + runTime/1000 + "s.");
   System.out.println("Total time\u00b2  =             " + runTime2);
   System.out.println("Average time =             " + fiveD.format(aveRuntime/1000) + "s. " 
                       + '\u00B1' + " " + fourD.format(stdDeviation) + "ms.");
   System.out.println("Standard deviation =       " + fourD.format(stdDeviation));
   System.out.println("n            =             " + n);
   System.out.println("Average time / run =       " + fiveD.format(aveRuntime/n*1000) + '\u00B5' + "s. "); 

   System.out.println("Repetitions  =             " + repetitions);
   System.out.println("________________________________________________");
   System.out.println();
   System.out.println();
	
   }

public static void hanoiTower() {
	   System.out.println("___hanoi___icomplete__");
   }	
} 
