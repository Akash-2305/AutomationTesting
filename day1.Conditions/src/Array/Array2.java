package Array;

 class Array3 {
	// creating a method which receives an array as a parameter
		static void min(int arr[]) {//int arr[]=a={ 33, 13, 4, 50,15,1 };
			int min = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (min > arr[i]) {//
					min = arr[i];
				}
			}
			System.out.println("Min number in array is: "+min);
		}
		static void max(int arr[]) {
			int max = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (max < arr[i]) {// 
					max = arr[i];
				}
			}
			System.out.println("Max number in array is: "+max);
		}
	}
	public class Array2 {
		public static void main(String args[]) {
			int a[] = { 33, 13, 4, 50,15,1 };// declaring and initializing an array
			Array3.min(a);// passing array to method
			Array3.max(a);// passing array to method
		}
}
