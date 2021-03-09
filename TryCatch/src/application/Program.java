package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
	public static void main(String args[]) {
		
		method1();
		
		System.out.println("End of program");
	
}

public static void method1() {
	System.out.println("Method1 start");
	method2();
	System.out.println("Method1 end");
}

public static void method2() {
	
	System.out.println("Method2 start");
		
Scanner sc = new Scanner(System.in);
		
		try {
		String [] vect = sc.nextLine().split(" ");
	int position = sc.nextInt();
	System.out.println(vect[position]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid Position (number)!");
		/*
		e.printStackTrace(); //imprime o rastreamneto do stack(sequencia de chamadas da exceção**
		sc.next();
		*/
	}
	catch(InputMismatchException e) {
		System.out.println("Input error (letra)!");
	}
	System.out.println("End of program");
	
	sc.close();
	
	System.out.println("Method2 end");
		
	}

}
