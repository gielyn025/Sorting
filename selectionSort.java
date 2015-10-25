

/**
 *
 ** @author GielynBaloloy
 */



	public class selectionSort {
    

	public static void main(String args[]){
         
	final int[] arr = { 14, 54, 23,12, 21, 8, 0, 57 };
         

//Ascending
         
	
	System.out.println("ASCENDING");
    
	int mine;
    

	for (int j = 0; j < arr.length; j++) {

        
	mine = j;
        
		for (int i = j + 1; i < arr.length; i++) {
            
			if (arr[i] < arr[mine]) {
                
			mine = i;
            
	}
        
		}
        
	if (mine != j) {
            
	final int temp = arr[j];
            
	arr[j] = arr[mine];
            
	arr[mine] = temp;
        
}
        
        

System.out.println(arr[j]);    
}
      

//DESCENDING
         

	System.out.println("DESCENDING");
    
	int mine2;
    
		for (int j = 0; j < arr.length; j++) {

        
		mine2 = j;
        
			for (int i = j + 1; i < arr.length; i++) {
            
				if (arr[i] > arr[mine2]) {
                
				mine2 = i;
            
	}
        
}
        
	if (mine2 != j) {
            
	final int temp = arr[j];
            
	arr[j] = arr[mine2];
            
	arr[mine2] = temp;
        
	}
        
        

System.out.println(arr[j]);

    
		}
    
    
	}
   

}
