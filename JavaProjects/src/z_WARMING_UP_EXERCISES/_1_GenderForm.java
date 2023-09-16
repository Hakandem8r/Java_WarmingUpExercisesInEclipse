package z_WARMING_UP_EXERCISES;

import java.util.Scanner;

public class _1_GenderForm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cinsiyet giriniz E: Erkek K: Kadın");
		char cinsiyet = scanner.next().toUpperCase().charAt(0);
		
		System.out.println("Lütfen yasınızı giriniz: ");
		double yas = scanner.nextDouble();
		
		if (yas < 20 || yas > 80 || !(cinsiyet == 'E' || cinsiyet == 'K')) {
			System.out.println("Girilen bilgilerde hata var!!!");
		}else if (cinsiyet == 'E' && yas >= 65) {
			System.out.println("Erkek emekli olabilir");
		}else if (cinsiyet == 'E' && yas < 65) {
			System.out.println("Erkek emekli olmak icin " + (65-yas) + " yil calismalidir");
		}else if (cinsiyet == 'K' && yas >= 60) {
			System.out.println("Kadın emekli olabilir");
		}else {
			System.out.println("Kadın emekli olmak için " + (60-yas) + " yıl çalışmalıdır");
		}
		
	}
}
