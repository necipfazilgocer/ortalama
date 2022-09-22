
package java101;
import java.util.Scanner;
public class baslangic {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int mat,fizik,kimya,muzik,tarih,turkce;
		System.out.println("Matematik notunu giriniz");
		mat=scanner.nextInt();
		System.out.println("Fizik notunu giriniz");
		fizik=scanner.nextInt();
		System.out.println("Kimya notunu giriniz");
		kimya=scanner.nextInt();
		System.out.println("Muzik notunu giriniz");
		muzik=scanner.nextInt();
		System.out.println("Tarih notunu giriniz");
		tarih=scanner.nextInt();		
		System.out.println("Turkce notunu giriniz");
		turkce=scanner.nextInt();
		double toplam=(mat+fizik+kimya+muzik+tarih+turkce);
		double sonuc=toplam/6;
		System.out.println(sonuc>=60 ? "Sınıfı Geçti.": "Sınıfta Kaldı.");
	}

}
