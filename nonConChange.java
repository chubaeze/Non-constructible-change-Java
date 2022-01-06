package ncChange;

import java.util.Arrays;

public class nonConChange {

	//[5, 7, 1, 1, 2, 3, 22]
	//[1, 1, 2, 3, 5, 7, 22]
	//20
	
	public int returnMin(int[] array) {
		
		int[] sortedArray = array;
		Arrays.sort(sortedArray);
		int sum = 0;
		
//		for (int i = 0; i < sortedArray.length; i++) {
//			 
//			if(sortedArray[i] <= sum + 1) {
//				
//				sum += sortedArray[i];
//			}
//		}
		
		for(int value:sortedArray) {
if(value <= sum + 1) {
				
				sum += value;
			}
		}
			return sum + 1;
	}
}
