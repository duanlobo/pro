package com.dlb.test100;

/**
 * +++0
 * ++000
 * +00000
 * 0000000
 *
 */
public class Triangle {
	public static void main(String[] args) {
		print(4);
	}

	public static void print(int rows) {
		for (int i = rows; i > 0; i--) {
			for (int j = i - 1; j > 0; j--) {
				System.out.print("#");
			}

			for (int k = 0; k<=2*(rows-i); k++) {
				System.out.print("0");
			}
			System.out.print("\n");
		}

	}

}
