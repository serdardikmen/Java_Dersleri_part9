package javadersleri.ders9;


import java.util.Scanner;        

public class Main {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("�al��anlar Program�na Ho�geldiniz...");
        
        String islemler = "��lemler...\n"
                          + "1. Yaz�l�mc� ��lemleri\n"
                          + "2. Y�netici ��lemleri\n"
                          + "��k�� ��in q'ya bas�n";
        System.out.println("**********************************");
        System.out.println(islemler);
        System.out.println("**********************************");
        
        while (true) {
            System.out.print("��lemi Se�iniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                System.out.println("Programdan ��k�l�yor...");
                break;
                
            }
            else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Mustafa Murat","Co�kun", 567,"Python,C,Java");
                String yazilimci_islem = "1. Format At\n"
                                         +"2. Bilgileri G�ster\n"
                                         + "��k�� ��in q'ya Bas�n";
                System.out.println(yazilimci_islem);
                
                while (true) {
                    System.out.print("��lem Se�iniz : ");
                    String y_islem = scanner.nextLine();
                    
                    if (y_islem.equals("q")) {
                        System.out.println("Yaz�l�mc� ��lemlerinden ��k�l�yor...");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        
                        System.out.print("��letim Sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                        
                    }
                    else if (y_islem.equals("2")){
                        
                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Ge�ersiz Yaz�l�mc� ��lemi...");
                    }
                    
                }
                
            }
            else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Serhat","Say", 123, 10);
                
                String yonetici_islem = "Y�netici ��lemleri\n"
                                        + "1. Zam Yap\n"
                                        + "2. Bilgileri G�ster\n"
                                        + "��k�� ��in  q'ya bas�n";
                System.out.println(yonetici_islem);
                
                while (true) {
                    System.out.println("��lem Se�iniz: ");
                    String y_islem = scanner.nextLine();
                    
                    if (y_islem.equals("q")){
                        System.out.println("Yaz�l�mc� ��lemlerinden ��k�l�yor...");
                        break;
                        
                    }
                    else if (y_islem.equals("1")) {
                        System.out.print("Y�neticinin Ne Kadar Zam Yapmas�n� istiyorsunuz : ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                        
                    }
                    else if (y_islem.equals("2")){
                        yonetici.bilgileriGoster();
                        
                    }
                    else {
                        System.out.println("Ge�ersiz Yaz�l�mc� ��lemi....");
                    }
                    
                    
                }
                
            }
            else {
                System.out.println("Ge�ersiz ��lem....");
            }
            
            
        }
        
        
   }
}
