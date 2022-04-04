/**
*Java1.HomeWork3.
*
*@author Alena Chabrova
*@version 03.04.2022
*/
import java.util.Arrays;

class HomeWork3 {
	public static void main(String[] args) {
		int[] arr1 = {1,1,0,0,1,0,1,1,0,1};
		int[] arr3 = {1,5,3,2,11,4,5,2,4,8,9,1};
		System.out.println("task1");
		task1(arr1);
		System.out.println("task2");
		task2(100);
		System.out.println("task3");
		task3(arr3);
		System.out.println("task4");
		task4();
		System.out.println("task5");
		task5();
	}
	public static void task1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr [i] == 0){
				arr[i] = 1;
			} else {
				arr[i] = 0;
			}
			}
		System.out.print(arr[i] + " ");
		System.out.println(Arrays.toString(arr));
	}
	public static void task2(int[] size) {
			int [] arr = new int[size];
			for (int i = 0; i < arr.length; i++){
				arr[i] = i + 1;
				System.out.print(arr[i] + " ");
				System.out.println(Arrays.toString(arr));
			}
		}
		
	public static void task3(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr [i] < 6);
			arr[i] = arr[i] * 2;
		}
			System.out.print(arr[i] + " ");
			System.out.println(Arrays.toString(arr));
		}
	public static void task4() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int b = 0; b < 3; b++) {
                if (i == b) {
                    arr[i][b] = 1;
                }
                System.out.print(arr[i][b] + " ");
            }
            System.out.println();
        }
    }
	public static void task5(int len, int initialValue){
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.print("[" + i + "]" + arr[i] + " ");
            }
			}
        }