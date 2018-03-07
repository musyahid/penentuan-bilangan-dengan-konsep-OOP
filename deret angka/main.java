package latihan2;

import java.util.Scanner;
public class main {
	public static void main(String [] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Awal : ");
	int awal = input.nextInt();
	System.out.print("Beda : ");
	int beda = input.nextInt();
	System.out.print("Batas : ");
	int batas = input.nextInt();
	
	latihan2 tes = new latihan2(awal, beda, batas);
	
	tes.proses();
	
	}
}
