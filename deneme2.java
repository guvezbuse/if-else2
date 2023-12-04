package deneme2;

import java.util.Scanner;

public class deneme2 {

	public static void main(String[] args) {
		// klavyeden girilen 2 sayının toplamı çift ise büyük tek ise küçük olan sayıyı yazdıran java kodu
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("iki tamsayi giriniz");
		 int sayi1;
		 int sayi2;
		 int toplam;
		 int sonuc;
		 
		 sayi1 = input.nextInt();
		 sayi2 = input.nextInt();
		 toplam = sayi1 + sayi2;
		 sonuc = toplam%2;
		 
		 if(sonuc==0) {
			 if(sayi1>sayi2)
				 System.out.println(sayi1);
			 else
				 System.out.println(sayi2);
		 }
		 else {
			 if(sayi1>sayi2)
			System.out.println(sayi2);
			 else
				 System.out.println(sayi1);
		 }
		
	
		
		 
	}

}