package pkt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Buenos días ceinmark, Soy Miguel Veléz");
		System.out.println("Introduce un numero para averiguar si es primo o no");
		int num = sc.nextInt();
		
		String primo  = "";
		String divisores = "";
		
		if (num == 0 || num == 1) {
			System.out.println("El numero no es primo y no tienen divisores");
		}else {
		
			for (int i = 2; i < num; i++) {
				
				if (num % i == 0) {
					primo = "El numero no es primo";
					divisores += i + "/";
				}else {
					primo = "El numero es primo";
				}
			}
			
			System.out.println(primo);
			System.out.println("Sus divisores son: " + divisores);
		}
	}

}
