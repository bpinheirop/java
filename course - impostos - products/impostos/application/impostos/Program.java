package impostos;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		List <taxPayer> list = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + "data:");
			System.out.println("Individual or Company (i/c)");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new IndividualPerson(name, income, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new JuridicPerson(name, income, numberOfEmployees));
			}
		}

		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (taxPayer tp : list) {
			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
			
		}
	}


