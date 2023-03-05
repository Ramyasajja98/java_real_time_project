package java8;
public class MyFibonnaci {
	
    public static void main(String[] args){
        
	//Creating an int array named febCount
        int febCount = 20;
        int[] feb = new int[febCount];
       
		//Intialising 
		feb[0] = 0;
		feb[1] = 1;        
		
	// Using for loop for printing the fibonacci series
        for(int i=1;i<feb.length;i++){
        	 System.out.print(feb[0]+" ");
      
        	int sumOfPrevTwo = feb[0] + feb[1];
            feb[0] = feb[1];
            feb[1] = sumOfPrevTwo;
        }
   }

}