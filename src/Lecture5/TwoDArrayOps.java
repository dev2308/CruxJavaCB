package Lecture5;

import java.util.Scanner;

public class TwoDArrayOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][] arr = takeInput();
//		         int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		int[][] arr=takeInput();
		display(arr);
		waveDisplay(arr);
		spiralDisplayAntiClk(arr);
		spiralDisplayClk(arr);
	}

	public static int[][] takeInput() {
		int[][] rv;

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		int rows = scn.nextInt();

		rv = new int[rows][];
		for (int row = 0; row < rv.length; row++) {
			System.out.println("Enter the number of columns for row = " + row);
			int cols = scn.nextInt();

			rv[row] = new int[cols];

			for (int col = 0; col < rv[row].length; col++) {
				System.out.println("Value for cell (" + row + ", " + col + ") ");
				rv[row][col] = scn.nextInt();
			}
		}

		return rv;
	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + "\t");
			}

			System.out.println();
		}
	}

	// rows = arr.length, cols = arr[0].length
	public static void waveDisplay(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + ", ");
				}
			} else {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + ", ");
				}
			}
		}

		System.out.println("END");
	}

	public static void spiralDisplayAntiClk(int[][] arr) {
		int minCol = 0, maxCol = arr[0].length - 1;
		int minRow = 0, maxRow = arr.length - 1;
		int numE = arr.length * arr[0].length;
		int counter = 1;

		while (counter <= numE) {
			// min col
			for (int row = minRow; counter <= numE && row <= maxRow; row++) {
				System.out.print(arr[row][minCol] + ", ");
				counter++;
			}
			minCol++;

			// max row
			for (int col = minCol; counter <= numE && col <= maxCol; col++) {
				System.out.print(arr[maxRow][col] + ", ");
				counter++;
			}
			maxRow--;

			// max col
			for (int row = maxRow; counter <= numE && row >= minRow; row--) {
				System.out.print(arr[row][maxCol] + ", ");
				counter++;
			}
			maxCol--;

			// min row
			for (int col = maxCol; counter <= numE && col >= minCol; col--) {
				System.out.print(arr[minRow][col] + ", ");
				counter++;
			}
			minRow++;
		}
		System.out.println("****************AntiClkWise Printed ************");

	}

	public static void spiralDisplayClk(int[][] arr) {
			int minCol = 0, maxCol = arr[0].length - 1;
			int minRow = 0, maxRow = arr.length - 1;
			int numE = arr.length * arr[0].length;
			int counter = 1;
			
			while(counter <= numE){
				
				// min row
				for(int col = minCol; counter <= numE && col <= maxCol; col++){
					System.out.print(arr[minRow][col] + ", ");
					counter++;
				}
				minRow++;
				
				// max col
				for(int row = minRow; counter <= numE && row <= maxRow; row++){
					System.out.print(arr[row][maxCol] + ", ");
					counter++;
				}
				maxCol--;
				
				// max row
				for(int col = maxCol; counter <= numE && col >= minCol; col--){
					System.out.print(arr[maxRow][col] + ", ");
					counter++;
				}
				maxRow--;
				
				// min col
				for(int row = maxRow; counter <= numE && row >= minRow; row--){
					System.out.print(arr[row][minCol] + ", ");
					counter++;
				}
				minCol++;
				
				
			}
			System.out.println("****************ClkWise Printed ************");
	}
}
