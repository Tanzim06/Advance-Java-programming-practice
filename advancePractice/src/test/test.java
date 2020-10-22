package test;

import java.util.Scanner;

public class test {



	public static void main(String[] args) {
			// TODO Auto-generated method stub
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println(" ");
			}

			System.out.println(" ");

			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print((char) (j + 64));
				}
				System.out.println(" ");
			}

			System.out.println(" ");

			for (int i = 4; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println(" ");
			}

			System.out.println(" ");

			for (int i = 4; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print((char) (i + 64));
				}
				System.out.println(" ");
			}

			System.out.println(" ");
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println(" ");
			}
			for (int i = 4 - 1; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println(" ");
			}

			System.out.println(" ");

			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println(" ");
			}

			System.out.println(" ");

			for (int i = 4; i >= 1; i--) {
				for (int j = 1; j <= 4 - i; j++) {
					System.out.print(" ");
				}

				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}

				System.out.println(" ");
			}

			System.out.println(" ");

			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4 - i; j++) {
					System.out.print(" ");
				}

				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println(" ");
			}
			for (int i = 4 - 1; i >= 1; i--) {
				for (int j = 1; j <= 4 - i; j++) {
					System.out.print(" ");
				}

				for (int j = 1; j <= i; j++) {
					System.out.print(j);

				}
				System.out.println(" ");
			}

			System.out.println(" ");

			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= 5; j++) {
					System.out.print(j);
				}
				System.out.println(" ");
			}

			System.out.println(" ");
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(" " + i * j);
				}
				System.out.println(" ");
			}

			System.out.println(" ");
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4 - i; j++) {
					System.out.print("  ");
				}
				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print(" *");

				}
				System.out.println();
			}

			System.out.println(" ");
			for (int i = 4; i >= 1; i--) {
				for (int j = 1; j <= 4 - i; j++) {
					System.out.print("  ");
				}

				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print(" *");
				}
				System.out.println(" ");
			}

			System.out.println(" Diamomd Pattern\n");

			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4 - i; j++) {
					System.out.print("  ");
				}

				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print(" *");
				}
				System.out.println(" ");
			}

			for (int i = 4 - 1; i >= 1; i--) {
				for (int j = 1; j <= 4 - i; j++) {
					System.out.print("  ");
				}

				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print(" *");
				}
				System.out.println(" ");
			}

			System.out.println(" ");

			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9 - i; j++) {
					System.out.print(" ");
				}

				for (int j = 1; j <= i; j++) {
					System.out.print(" " + i);
				}
				System.out.println(" ");
			}

			System.out.println(" ");
			for (int i = 9; i >= 1; i--) {
				for (int j = 1; j <= 9 - i; j++) {
					System.out.print(" ");
				}

				for (int j = 1; j <= i; j++) {
					System.out.print(" " + j);
				}
				System.out.println(" ");
			}

			System.out.println(" ");

			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9 - i; j++) {
					System.out.print(" ");
				}

				for (int j = 1; j <= i; j++) {
					System.out.print(" " + j);
				}
				System.out.println();
			}

			for (int i = 9 - 1; i >= 1; i--) {
				for (int j = 1; j <= 9 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(" " + j);
				}

				System.out.println(" ");
			}

			System.out.println(" ");

			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= 5; j++) {
					if (i == 1 || i == 5 || j == 1 || j == 5) {

						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println(" ");

			}

			System.out.println(" ");
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= 5; j++) {
					if (j == 1 || i == 5 || i == j) {
						System.out.print(j);
					} else {
						System.out.print(" ");

					}

				}
				System.out.println(" ");
			}

			System.out.println(" ");

			for (int i = 1; i <= 7; i++) {
				for (int j = 1; j <= 7; j++) {
					if (i == j || i + j == 7 + 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println(" ");
			}

			System.out.println(" ");

			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4 - i; j++) {
					System.out.print(" ");
				}

				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}

				for (int j = i - 1; j >= 1; j--) {
					System.out.print(j);
				}
				System.out.println(" ");
			}
		}
}
