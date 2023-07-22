package NACodingQuestions;

public class SmallestLargestNumber {

	public static void main(String[] args) {
		
		int arr[] = {12,9,12,45,67,89,4,1};
		
		int min= arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("The minimum element in the given array is : "+ min);
		
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("The maximum element in the given array is " + max);
		
		

	}

}
