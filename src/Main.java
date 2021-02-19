
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.İşlem : Bakiye Öğrenme\n"
                       +"2.İşlem : Para Çekme\n"
                       +"3.İşlem : Para Yatırma\n"
                       +"Çıkış : q";
        System.out.println("************************************");
        System.out.println(islemler);
        System.out.println("************************************");
        
        while (true) {
         System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        String islem = scanner.nextLine();
        
            if (islem.equals("q"))
                 {
                    System.out.println("Çıkış yapılıyor...");
                    break;
                }
            
            else if(islem.equals("1"))
                
            {
                System.out.println("Bakiyeniz : " +bakiye);
            
            }
            
            else if(islem.equals("2"))
                
            {
                System.out.print("Çekmek istediğiniz tutar : ");
                int tutar=scanner.nextInt();                          /*Burda dikkat etmemiz gerek durum 
                                                                      burda bir int alıcak ama başa dönüp 
                                                                      bir string almaya çalışıcak onu önlemek 
                                                                      için dummy yapıyoruz.      */
                scanner.nextLine();
                if(bakiye-tutar < 0)
                {
                    System.out.println("Yeterli bakiye yok.Bakiyeniz : " +bakiye);
                    
                }
                else
                {
                    bakiye -=tutar;
                    System.out.println("Güncel bakiyeniz : " +bakiye);
                }
            }
            
            else if(islem.equals("3"))
                
            {
                System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                int yatpara=scanner.nextInt();
                scanner.nextLine();
                
                bakiye += yatpara;
                System.out.println("Güncel bakyieniz : " +bakiye);
            
            }
            
            else
                
            {
                System.out.println("Geçersiz işlem...");
            }
            
            
            
            
            
            
        }
        
        
        
        
        
        
    }
    
}
