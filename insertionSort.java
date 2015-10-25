

/**
 *INSERTION SORT
 * @author Gielyn25
 */


import java.util.Scanner;

	
	public class insertionSort {
    

          public static void main(String args[]){
            
            Scanner gscan = new Scanner(System.in);
            
            
	
	int size = 5;
            
	int[] array = new int[size];
            

	System.out.print("Enter 5 Numbers \n");
            

	for(int g=0; g<5; g++){
                

	System.out.print("num"+(g+1)+": ");
                
	array[g] = gscan.nextInt();
            
}
            
//ASCENDING SORT
            
            

	for(int d=1; d<array.length; d++){
                
	int tmp = array[d];
                
	int c = d;
                

	while((c>0) && (array[c-1] > tmp)){
                    
	array[c]=array[c-1];
                    
	c--;
                
	}
               
 	array[c]=tmp;              
	}
            
            

	System.out.println("\n Ascending");
            

	for(int y = 0; y<5; y++){
                
	System.out.print(array[y]+ ", ");
            
	}
   
            
             
//DESCENDING SORT
            
            

	for(int d=1; d<array.length; d++){
                
	int tmp = array[d];
                
	int c = d;
                

	while((c>0) && (array[c-1] < tmp)){
                    
	array[c]=array[c-1]; 
                    
	c--;
                
	}
                
	array[c]=tmp;
            
	}
            
            

	System.out.println("\n Descending");
            

	for(int y = 0; y<5; y++){
                
	System.out.print(array[y]+ ", ");
            
	}              
    
     }

}
