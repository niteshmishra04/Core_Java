
public class LargestInArrayExample {
	
 static	int arr[] = {12,15,25,78,95};
	
 static	int largest() {
		
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++)
			if(arr[i]>max)
				max = arr[i];
		return max;
	}

	public static void main(String[] args) {

		System.out.println("Largest value in the given array is:" +largest());

	}

}
