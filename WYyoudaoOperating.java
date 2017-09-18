//网易运维--有道--JAVA编程

import java.util.Scanner;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> aryNo = new ArrayList<Integer>();
		int n = sc.nextInt();
		int nNew, sz = 0;
		if (n % 2 == 0) {// n is a even number
			nNew = (n - 2) / 2;
			aryNo.add(2);
			for (; nNew > 0;) {
				// the last time using No.1
				if (nNew % 2 == 0) {// even
					aryNo.add(2);
					nNew = (nNew - 2) / 2;
				} else {
					aryNo.add(1);
					nNew = (nNew - 1) / 2;
				}
			}
			sz = aryNo.size();
			for (int y = sz - 1; y >= 0; y--) {
				System.out.print(aryNo.get(y));
			}
		} else {// n is a odd number
			nNew = (n - 1) / 2;
			aryNo.add(1);// the last time using No.1
			for (; nNew > 0;) {
				if (nNew % 2 == 0) {// even
					aryNo.add(2);
					nNew = (nNew - 2) / 2;
				} else {
					aryNo.add(1);
					nNew = (nNew - 1) / 2;
				}
			}
			sz = aryNo.size();
			for (int y = sz - 1; y >= 0; y--) {
				System.out.print(aryNo.get(y));
			}
		}
		sc.close();
	}
}
