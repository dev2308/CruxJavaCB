package Lecture10;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int nc = s.nextInt();
		int nr = s.nextInt();
		System.out.println(getMazePaths(0, 0, nc, nr));
		System.out.println("************************");
		System.out.println(getDiagonalMazePaths(0,0,nc,nr));
		System.out.println("************************");
		System.out.println(getBishopDiagonalMazePaths(0,0,nc,nr));
		System.out.println("************************");
		PrintMazePathsDiagonalBishops(0,0,nc,nr,"");
	}

	public static ArrayList<String> getMazePaths(int cc, int cr, int nc, int nr) {

		if (cc > nc || cr > nr) {
			ArrayList<String> baseResult = new ArrayList<>();
			return baseResult;
		}
		if (cc == nc && cr == nr) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		ArrayList<String> verticalRR = getMazePaths(cc, cr + 1, nc, nr);
		ArrayList<String> horizontalRR = getMazePaths(cc + 1, cr, nc, nr);
		ArrayList<String> myResult = new ArrayList<>();

		for (int i = 0; i < verticalRR.size(); i++) {
			myResult.add("V" + verticalRR.get(i));
		}

		for (int i = 0; i < horizontalRR.size(); i++) {
			myResult.add("H" + horizontalRR.get(i));
		}
		return myResult;

	}

	 public static ArrayList<String> getDiagonalMazePaths(int cc,int cr,int nc,int nr)
	 {
		 if (cc > nc || cr > nr) {
				ArrayList<String> baseResult = new ArrayList<>();
				return baseResult;
			}
			if (cc == nc && cr == nr) {
				ArrayList<String> baseResult = new ArrayList<>();
				baseResult.add("");
				return baseResult;
			}
		 
			ArrayList<String> verticalRR = getDiagonalMazePaths(cc, cr + 1, nc, nr);
			ArrayList<String> horizontalRR = getDiagonalMazePaths(cc + 1, cr, nc, nr);
			ArrayList<String> diagonalRR = getDiagonalMazePaths(cc+1,cr+1,nc,nr);
			ArrayList<String> myResult = new ArrayList<>();

			for (int i = 0; i < verticalRR.size(); i++) {
				myResult.add("V" + verticalRR.get(i));
			}

			for (int i = 0; i < horizontalRR.size(); i++) {
				myResult.add("H" + horizontalRR.get(i));
			}
			
			for (int i = 0; i <diagonalRR.size(); i++) {
				myResult.add("D" + diagonalRR.get(i));
			}
			return myResult;

	 }
	 
	 public static ArrayList<String> getBishopDiagonalMazePaths(int cc,int cr,int nc,int nr)
	 {
		 if (cc > nc || cr > nr) {
				ArrayList<String> baseResult = new ArrayList<>();
				return baseResult;
			}
			if (cc == nc && cr == nr) {
				ArrayList<String> baseResult = new ArrayList<>();
				baseResult.add("");
				return baseResult;
			}
		 
			ArrayList<String> verticalRR = getBishopDiagonalMazePaths(cc, cr + 1, nc, nr);
			ArrayList<String> horizontalRR = getBishopDiagonalMazePaths(cc + 1, cr, nc, nr);
			ArrayList<String> diagonalRR = getBishopDiagonalMazePaths(cc+1,cr+1,nc,nr);
			ArrayList<String> myResult = new ArrayList<>();

			for (int i = 0; i < verticalRR.size(); i++) {
				myResult.add("V" + verticalRR.get(i));
			}

			for (int i = 0; i < horizontalRR.size(); i++) {
				myResult.add("H" + horizontalRR.get(i));
			}
			
			for (int i = 0; i <diagonalRR.size(); i++) {
				myResult.add("D" + diagonalRR.get(i));
			}
			return myResult;

	 }
	 
	 public static void PrintMazePathsDiagonalBishops(int cc,int cr,int nc,int nr,String ans)
	 {
		 if(cc>nc||cr>nr)
		 {
			 return;
		 }
		 if(cc==nc&&cr==nr)
		 {
			 System.out.println(ans);
			 return;
		 }
		 PrintMazePathsDiagonalBishops(cc+1, cr, nc, nr,ans+"H");
		 PrintMazePathsDiagonalBishops(cc, cr+1, nc, nr,ans+"V");
		 
		 
		 int i = 1;
		 while(cc+i<=nc&&cr+i<=nr)
			 {
			 PrintMazePathsDiagonalBishops(cc+1, cr+1, nc, nr,ans+"D"+i);
			 i++;
			 }
		 
	 }
	 
	 
	 
}