package gitdeneme;

import java.util.Scanner;

public class Question {static void Soru1() {
	System.out.println("Şıklar için 1-4 arası rakam giriniz :) \n\n");
	System.out.println("Küresel Isınma zararlı mıdır?");
	System.out.println("1- Evet");
	System.out.println("2- Hayır");
	System.out.println("3- Değişebilir ");
	System.out.println("4- Bilmiyorum");
}
static void Soru2() {
	
}
static void Soru3() {
	
}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int sayac = 0;
	int[] dizi = new int [5];
	Soru1();
	dizi[0] = sc.nextInt();
	if (dizi[0] == 1) {
		sayac++;
		System.out.println("Doğru :)");
	}
	else {
		System.out.println("Yanlış :(");
	}
	
	
	System.out.println("Küresel Isınma Kutuplara zarar verir mi?");
	System.out.println("1- Hayır");
	System.out.println("2- Evet");
	System.out.println("3- Değişebilir ");
	System.out.println("4- Bilmiyorum");
	dizi[1]=sc.nextInt();
	
	
	if(dizi[1] == 2) {
		sayac++;
		System.out.println("Doğru :)");
	}
	else {
		System.out.println("Yanlış :)");
	}
	System.out.println();
	
	
	System.out.println("Küresel Isınma engellenebilir mi?");
	System.out.println("1- Değişebilir");
	System.out.println("2- Hayır");
	System.out.println("3- Evet");
	System.out.println("4- Bilmiyorum");
	dizi[2]=sc.nextInt();
	
	
	if(dizi[2] == 3) {
		sayac++;
		System.out.println("Doğru :)");
	}
	else {
		System.out.println("Yanlış :)");
	}
	System.out.println();
	
	
	System.out.println("Küresel Isınma Dünyayı Isıtır mı?");
	System.out.println("1- Bilmiyorum");
	System.out.println("2- Hayır");
	System.out.println("3- Değişebilir ");
	System.out.println("4- Evet");
	dizi[3]=sc.nextInt();
	
	
	if(dizi[3] == 4) {
		sayac++;
		System.out.println("Doğru :)");
	}
	else {
		System.out.println("Yanlış :)");
	}
	System.out.println();
	
	
	System.out.println("Küresel Isınma Nedir?");
	System.out.println("1- Dünyada meydana gelen ısı artışı");
	System.out.println("2- Dünyada meydana gelen ısı azalışı");
	System.out.println("3- Değişebilir ");
	System.out.println("4- Bilmiyorum");
	dizi[4]=sc.nextInt();
	
	
	if(dizi[4] == 1) {
		sayac++;
		System.out.println("Doğru :)");
	}
	else {
		System.out.println("Yanlış :)");
	}
	System.out.println();
	
	if(sayac == 5) {
		System.out.println("Mükemmel");
	}
	else if(sayac == 4) {
		System.out.println("Çok iyi");
	}
	else {
		System.out.println("Küresel Isınma konusunda tekrar yapsan iyi olur");
	}
}

}
