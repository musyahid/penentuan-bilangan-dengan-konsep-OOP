package latihan1;

public class latihan1 {
	int bilangan;
	String ket1, ket2;

public latihan1(int bilangan) {
	this.bilangan = bilangan;
}

public String nilai1 () {
	if(bilangan<0) {
		ket1 = "negatif";
	}
	else {
		ket1 = "positif";
	}
	return ket1;
}

public String nilai2() {
	if(bilangan%2==0) {
		ket2 = "genap";
	}
	else {
		ket2 = "ganjil";
	}
	return ket2;
}
public void info() {
	System.out.print("adalah : " +ket1+" "+ ket2);
}
}
