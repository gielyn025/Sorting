
/**
 *Bubble Sorting
 * @author GielynBaloloy
 */


import java.util.Scanner;


	public class bubbleSort {
    

	   public static void main(String args[]){
        
	   int size = 5;
        
	   int[] number = new int[size];
        
	   Scanner gscan = new Scanner(System.in);
        
        

	   System.out.println( "INPUT 5 NUMBERS: " );
       

	for(int a = 0; a<=4; a++){ 
        
	System.out.print("num"+ (a+1) + ": ");
        
	number[a] = gscan.nextInt();
        
	}
        
        

//BUBBLE SORT ASCENDING
        

	int tmp;
        

	for(int b=0; b<number[size-1]; b++){
            
		for( int h =0; h<5-1; h++){
                
			if(number[h] > number[h+1]){
                    
	tmp = number[h];
                    
	number[h] = number[h+1];
                    
	number[h+1] = tmp;
        
             
	}
        
		}
    
			}
        
        
	System.out.println("\n  ASCENDING");
        

	for(int x=0; x<5; x++){
            
	System.out.print(number[x] +", ");
        
	}
              
        

//BUBBLE SORT DESCENDING
        
	
	int tmp1;
        

	for(int i=0; i<number[size-1]; i++){
            
		for( int j =0; j<5-1; j++){
                
			if(number[j] < number[j+1]){
                    
	tmp1 = number[j];
                    
	number[j] = number[j+1];
                    
	number[j+1] = tmp1;
        
             
	}
        
		}
    
			}
        
        
	System.out.println("\  nDESCENDING");
        

`	for(int x=0; x<5; x++){
            
	System.out.print(number[x] +", ");
    
	}

     }

}
