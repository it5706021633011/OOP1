package oop;
import java.util.Scanner;
import java.lang.*;

public class Trik {
	public static void main(String[] args) {
		String st;
		int A = 1;
		int B = 0;
		int C = 0;
		int temp=0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Enter character (A,B or C) : ");
			st = scan.nextLine();
			if(st.length() > 50){
				System.out.println("Invalid input. Please enter again!!!");
			}
		} while (st.length() > 50000);
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == 'A' || st.charAt(i) == 'a') {
				temp = A;
				A = B;
				B = temp;
			} else if (st.charAt(i) == 'B' || st.charAt(i) == 'b') {
				temp = B;
				B = C;
				C = temp;
			} else if (st.charAt(i) == 'C' || st.charAt(i) == 'c') {
				temp = A;
				A = C;
				C = temp;
			}
		}
		if (A == 1) {
			System.out.println("Ball in glass : 1");
		} else if (B == 1) {
			System.out.println("Ball in glass : 2");
		} else if (C == 1) {
			System.out.println("Ball in glass : 3");
		}
	}
}

