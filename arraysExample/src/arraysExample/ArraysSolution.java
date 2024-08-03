package arraysExample;

public class ArraysSolution {

    public static void main(String[] args) {
    	
    	// 1D Array Implementation
    	
    	//1 dimensional array with size of 6
    	// new object that creates new memory for array
    	int size = 10;
    	int[] array= new int[size];
    	
    	int count=1;
    	// for loop to iterate over array
    	System.out.print("This is a 1D array: ");
    	for(int i=0;i<array.length;i++) {
    		
    		array[i]=count;
    		count++;
    		if (array.length == size) {
    		System.out.print(array[i]+" ");
    		}
    	}
    	System.out.print("\n");
    	System.out.print("\n");
    	// 2D Array Implementation
    	// 5 rows - 10 columns
    	// new object that creates new memory for array
    	int [][] array2 = new int [5][10];
    	// counter for loop to increment elements in array
    	int count2=1;
    	// insert elements into array
    	// iterate over rows
    	for(int i=0; i<array2.length;i++) {
    		// iterate of columns
    		// to iterate over column this
    		// starts at 0 and creates a column
    		// for the length of each row
    		for(int j=0;j<array2[i].length;j++) {
    			array2[i][j]=count2;
    			count2++;
    		}
    	}
    	System.out.println("This is a 2D array:\n");
    	for(int i=0; i<array2.length;i++) {
    		// iterate of column
    		for(int j=0;j<array2[i].length;j++) {
    			System.out.print(array2[i][j]+" ");
    		}
    		
    		System.out.println();
    	}
    	

    }
}