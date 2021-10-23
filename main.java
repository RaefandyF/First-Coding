import java.util.Scanner;
public class main {

	public main() {
		
	}

	public static void main(String[] args) {
		
	System.out.println("Selamat Datang di Aplikasi Generate Username!");
		
	Scanner sc = new Scanner (System.in);
	String nama;
	
	System.out.print("Masukan nama anda : ");
	nama = sc.nextLine();
	String nama1 = nama.substring(0,1).toUpperCase();
	System.out.println("Salam kenal, " + nama.toUpperCase());

	if (-1 == nama.indexOf(" ")) {
	System.out.println("Username anda : " + nama1 + nama1 + nama.length());
	}
	else {
	int nama2 = nama.lastIndexOf(" ");
	String nama3 = (nama.substring(nama2));
	System.out.println("Username anda : " + nama1 + nama3.substring(1,2).toUpperCase() + nama.length());
	}
	
	}

}