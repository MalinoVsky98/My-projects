import java.util.ArrayList;
import java.util.Scanner;
class Dzienniczek {
  public static void main(String[]args) {
    ArrayList<Integer> matematyka = new ArrayList<Integer>();
    ArrayList<Integer> polski = new ArrayList<Integer>();
    ArrayList<Integer> angielski = new ArrayList<Integer>();
    matematyka.add(5);
    polski.add(5);
    angielski.add(5);
    
    System.out.println("Oto tw�j ma�y dzienniczek ucznia");
    System.out.println("Wybierz przedmiot aby wy�wietli� lub doda� oceny");
    System.out.println("1.Matematyka");
    System.out.println("2.Polski");
    System.out.println("3.Angielski"); //wypisujemy nazwy przedmiot�w
    
    int zero = 0;
    Scanner tekst = new Scanner(System.in);
    int cyfra = tekst.nextInt();
    System.out.println("Wybra�e� numer" + cyfra);
    
    	if(cyfra==1){
    		int mr = matematyka.size();
    		System.out.println("1.Dodawanie ocen");
    		System.out.println("2.Wy�witlanie ocen");
    		int cyfraa = tekst.nextInt();
    			if(cyfraa==1){
    				System.out.println("Podaj ocen� kt�r� chesz doda� do dzienniczka");
    					int ocena = tekst.nextInt();
    					matematyka.add(ocena);
    						
    			}else {
    				System.out.println("Oto twoje oceny z matematyki: ");
						for(int i = 0;i==mr;i++){
					System.out.println(matematyka.get(i));
					
						}
    			}
    		}

		if(cyfra==2){
			int mr = polski.size();
			System.out.println("1.Dodawanie ocen");
			System.out.println("2.Wy�witlanie ocen");
			int cyfraa = tekst.nextInt();
				if(cyfraa==1){
					System.out.println("Podaj ocen� kt�r� chesz doda� do dzienniczka");
						int ocena = tekst.nextInt();
						polski.add(ocena);
							
				}else {
					System.out.println("Oto twoje oceny z polskiego" );
						for(int i = 0;i==mr;i++){
					System.out.println(polski.get(i));
						}
				}
		}
					if(cyfra==3){
			    		int mr = angielski.size();
			    		System.out.println("1.Dodawanie ocen");
			    		System.out.println("2.Wy�witlanie ocen");
			    		int cyfraa = tekst.nextInt();
			    			if(cyfraa==1){
			    				System.out.println("Podaj ocen� kt�r� chesz doda� do dzienniczka");
			    					int ocena = tekst.nextInt();
			    					angielski.add(ocena);
			    						
			    			}else {
			    				System.out.println("Oto twoje oceny z angielskiego: ");
									for(int i = 0;i==mr;i++){
								System.out.println(angielski.get(i));
									}							
			    			}
					}
  }
}  