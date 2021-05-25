import java.lang.Math.*;   
import java.io.*;   
import java.text.*;
//Zero idexing is not used in this program
//import node.*;

public class binarySearch{

public static int array[];
public static void main(String args[]){

DecimalFormat twoD = new DecimalFormat("0.00");
DecimalFormat fourD = new DecimalFormat("0.0000");
DecimalFormat fiveD = new DecimalFormat("0.00000");


int N_binary = 1000000;
array=new int[N_binary+1]; 
long start, finish;
double runTime = 0, runTime2 = 0, time;
double totalTime = 0.0;
int repetition, repetitions = 30;


	runTime = 0;
	for(repetition = 0; repetition < repetitions; repetition++) {
		start = System.currentTimeMillis();
		
	   // call the procedure to time here:
		binarySearch (N_binary);
		
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
   System.out.println("N_binary     =             " + N_binary);
   System.out.println("Average time / run =       " + fiveD.format(aveRuntime/N_binary*1000) + '\u00B5' + "s. "); 

   System.out.println("Repetitions  =             " + repetitions);
   System.out.println("________________________________________________");
   System.out.println();
   System.out.println();
	
   }

//==============================================================
public static void binarySearch(int N_binary){
  setupBinary(N_binary);
  int lookUp = (int)(Math.random()*N_binary)+1;

  int start = 1;
  int end = N_binary;
  int middle = (start+end)/2;

  while(start<end){
    
      
    if(array[middle]==lookUp)
      break;

    if(lookUp < array[middle])
      start = middle -1;
    else
      end = middle +1;
    }
  }

public static void setupBinary(int N_binary){
  int object = 1;
  for (int i=1; i<=N_binary; i++){
     array[i] =object;
    object += (int)(1 + Math.random()*3.0);
    
    }
  }
//==============================================================
} 
