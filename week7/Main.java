import java.util.*;

public class Main {


	public static void main(String args[]) {
		int[] arr = {3,6,1,7,8,9,2};
		sort(arr);
	}

	public static int[] sort(int[] arr){
		for(int i = 0; i < arr.length - 1;i++) {
			for(int k = 1 + i; k < arr.length; k++) {
				int temp = arr[i];
				int temp2 = arr[k];
				if(arr[i] > arr[k]) {
					arr[i] = temp2;
					arr[k] = temp;
				}
			}
		}
		for(int i : arr) {
			System.out.println(i);
		}
		return arr;
	}
}