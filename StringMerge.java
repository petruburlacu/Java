import java.util.ArrayList;

public class StringMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Complete the function below.
		 */
		int[] a = {2,4,5,9,9};
		int[] b = {0,1,2,3,4};
		
		int countA = 0;
		int countB = 0;
		int[] merged = new int[a.length + b.length];
		int countMerged = 0;
		
		while (countA < a.length && countB < b.length) {
			if(a[countA] < b[countB]) {
				merged[countMerged++] = a[countA++];
			}
			else {
				merged[countMerged++] = b[countB++];
			}
		}
		if(countA < a.length) {
			for(int i = countA; i < a.length; i++) {
				merged[countMerged++] = a[i];
			}
		}
		else if (countB < b.length) {
			for(int i = countB; i < b.length; i++) {
				merged[countMerged++] = b[i];
			}
		}
		for(int i : merged) {
			System.out.print(i + ",");
		}
	}

}
