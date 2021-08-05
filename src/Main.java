import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
       
        String userName, password;
        Scanner sc= new Scanner(System.in);

        System.out.println("Kullanıcı Adınız : ");
        userName= sc.nextLine();

        System.out.println("Şifreniz : ");
        password= sc.nextLine();

        if(userName.equals("patika")&&(password.equals("java123"))){
            System.out.println("Giriş Yaptınız.");
        } else if(userName.equals("patika")&&!password.equals("java123")) {
            System.out.println("Şifreyi yanlış girdiniz");
            System.out.println("Şifreyi sıfırlamak isterseniz 1\'i seçiniz. İstemezseniz herhangi bir sayı giriniz.");
            int secenek= sc.nextInt();
            sc.nextLine();
            if(secenek==1){
                System.out.println("Yeni passwordu giriniz");
                String newPassword= sc.nextLine();
                if(newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz.");
                } else{
                    System.out.println("Şifre Oluşturuldu");
                }
            }else {
                System.out.println("Giriş yapılamadı.");
            }
        } else {
            System.out.println("Giriş yapılamadı.");
        }
    }
}
