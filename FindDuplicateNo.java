package fln.api;

public class FindDuplicateNo {

	public static void main(String[] args) {
		FindDuplicateNo findDuplicateNo = new FindDuplicateNo();
//		int[] inputArray = { 1,3,4,2,2 };
		int[] inputArray = { 3,1,3,4,2 };
		System.out.println(findDuplicateNo.getDuplicateNo(inputArray));

	}
	
	
	public int getDuplicateNo(int[] inputArray) {
		int output = 0;
		for(int i=0; i<inputArray.length; i++) {
			for(int j=0; j<inputArray.length; j++){
				if(i!=j && inputArray[i] == inputArray[j]) {
						output = inputArray[i];
						return output;
				}
			}
		}
		return output;
	}

}
