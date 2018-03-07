package latihan1;

import java.util.Scanner;
public class main {
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan angka : ");
		int bilangan = input.nextInt();
		
		
		latihan1 nilai = new latihan1(bilangan);
		
		nilai.nilai1();
		nilai.nilai2();
		nilai.info();
	}
}
