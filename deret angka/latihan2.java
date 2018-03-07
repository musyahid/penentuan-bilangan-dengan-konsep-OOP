package latihan2;

public class latihan2 {
	int awal, beda, batas;
	int jumlah = 0;
	
	public latihan2(int awal, int beda, int batas) {
		this.awal = awal;
		this.beda = beda;
		this.batas = batas;
	}
public void proses() {
	for(int i = 1; i<=batas; i++) {
		System.out.print(awal + " ");
		jumlah = jumlah + awal;
		awal = awal + beda;
	}
	System.out.print("jumlah : "+jumlah);
}
}
