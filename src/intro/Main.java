package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't Repeat Yourself-- Kendini tekrar etme!!!
		String internetSubeButonu = "İnternet Şubesi";
		double dolarDun=8.30;
		double dolarBugun=8.30;
		int vade=36;
		boolean dustuMu= false;
		//System.out.println(vade);
		
		if(dolarBugun<dolarDun) {
              
			System.out.println("Dolar düştü");
			
		}else if(dolarBugun>dolarDun) {
			 
			System.out.println("dolar yükseldi");
		}		
		
		else {
			System.out.println("dolar eşittir");
		}
		
		String kredi1= "Hızlı Kredi";
		String kredi2="Mutlu Emekli Kredisi";
		String kredi3="Konut kredisi";
		String kredi4="Çiftçi Kredisi";
		String kredi5="Msb Kredisi";
		
		
		//System.out.println(kredi1);
		//System.out.println(kredi2);
		//System.out.println(kredi3);
		//System.out.println(kredi4);
		//System.out.println(kredi5);
		
		String[]  krediler = {"Hızlı Kredi", 
				              "Mutlu Emekli Kredisi",
				              "Konut Kredisi",
				              "Çiftçi Kredisi",
				              "Meb Kredisi",
				              "Kültür Bakanlığı"};
	   //foreach döngüsü
		
	  for(String kredi :krediler) {		   
		  System.out.println(kredi);   
		  }
	  
	   //for döngüsü
	   for (int i=0; i<krediler.length;i++) {
		   System.out.println(krediler[i]);
	   }
	   
	   
	   //Değer ve Referans Tipler
	   
	   int sayi1=10;
	   int sayi2=20;
	   sayi1=sayi2;
	   sayi2=100;
	   System.out.println(sayi1);
	   
	   int[] sayilar1 = {1,2,3,4,5};
	   int[] sayilar2= {10,20,30,40,50};	 
	   
	   sayilar1= sayilar2;
	   sayilar2[0]=100;
	   System.out.println(sayilar1[0]);
	   
	   
	   String sehir1= "Ankara";
	   String sehir2="İstanbul";
	   sehir1=sehir2;
	   sehir2="İzmir";
	   System.out.println(sehir1);
	   
	   for (int i =0; i<krediler.length;i++) {
		   System.out.println(krediler[3]);
		   
	   }
	   
	   System.out.println("Fuck Them All");
		
		
		
 }

}
