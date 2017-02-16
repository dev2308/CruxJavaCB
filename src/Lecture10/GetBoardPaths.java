package Lecture10;

import java.util.ArrayList;
import java.util.Scanner;

public class GetBoardPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int curr = s.nextInt();
		int dest = s.nextInt();
		int[] arr = { 0, 0, 8, 0, 6, 0, 0, 9, 0, 0 };

		// System.out.println(getBoardPaths(curr, dest));
		// System.out.println(getLadderBoardPaths(curr, dest, arr));

		System.out.println(getOptionalLadderBoardPaths(curr, dest, arr));

		System.out.println(getOptionalLadderBoardPaths(curr, dest, arr).size());

	}

	public static ArrayList<String> getBoardPaths(int curr, int dest) {
		if (curr == dest) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("\n");
			return baseResult;
		}
		ArrayList<String> myResult = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {
			if (curr + dice <= dest) {
				ArrayList<String> recResult = getBoardPaths(curr + dice, dest);
				for (String recString : recResult) {
					myResult.add(recString + dice);
				}
			}

		}
		return myResult;
	}

	public static ArrayList<String> getLadderBoardPaths(int curr, int dest, int[] arr) {
		if (curr == dest) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("\n");
			return baseResult;
		}
		ArrayList<String> myResult = new ArrayList<>();

		if (arr[curr] == 0) {
			for (int dice = 1; dice <= 6; dice++) {

				if (curr + dice <= dest) {
					ArrayList<String> recResult = getLadderBoardPaths(curr + dice, dest, arr);
					for (String recString : recResult) {
						myResult.add(recString + dice);
					}
				}
			}
		} else {

			ArrayList<String> recResult = getLadderBoardPaths(arr[curr], dest, arr);

			for (String recString : recResult) {
				myResult.add("L" + recString);
			}

		}

		return myResult;
	}

	public static ArrayList<String> getOptionalLadderBoardPaths(int curr, int dest, int[] arr) {
		if (curr == dest) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("\n");
			return baseResult;
		}
		ArrayList<String> myResult = new ArrayList<>();

		if (arr[curr] == 0) {
			for (int dice = 1; dice <= 6; dice++) {

				if (curr + dice <= dest) {
					ArrayList<String> recResult = getOptionalLadderBoardPaths(curr + dice, dest, arr);
					for (String recString : recResult) {
						myResult.add(recString + dice);
					}
				}
			}
		} 

			ArrayList<String> recResult = getOptionalLadderBoardPaths(arr[curr], dest, arr);

			for (String recString : recResult) {
				myResult.add("L" + recString);
			}

		

		return myResult;
	}
}
