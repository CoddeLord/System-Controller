import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Data> arrayList = new ArrayList<>();
        String name, surName, userName, password, checkedUserName, checkedPassword;
        int age;

        System.out.println("Hoşgeldiniz! Sisteme giriş yapmak için önce kayıt olmanız gerekiyor");

        System.out.println("Adınız: ");
        name = scanner.next();

        System.out.println("Soyadınız: ");
        surName = scanner.next();

        System.out.println("Kullanıcı Adınız: ");
        userName = scanner.next();

        System.out.println("Şifreniz: ");
        password = scanner.next();

        System.out.println("Yaşınız: ");
        age = scanner.nextInt();

        if (age >= 18) {
            Data data = new Data(name, surName, userName, password, age);
            arrayList.add(data);
            System.out.println("Kayıt Başarılı! Sisteme Hoşgeldin " + name);

            boolean isLoggedIn = false;
            while (!isLoggedIn) {
                System.out.println("Sisteme Giriş yapmak İçin Bilgileri Tekrar Girin\nKullanıcı Adınız: ");
                checkedUserName = scanner.next();
                System.out.println("Şifrenizi Girin: ");
                checkedPassword = scanner.next();

                if (checkedUserName.equals(userName) && checkedPassword.equals(password)) {
                    System.out.println("Giriş Başarılı");
                    isLoggedIn = true; // Exit the loop when login is successful
                } else if (!checkedUserName.equals(userName)) {
                    System.out.println("Kullanıcı Adınız Yanlış");
                } else if (!checkedPassword.equals(password)) {
                    System.out.println("Şifreniz yanlış");
                }
            }
        } else {
            System.out.println("Kayıt Başarısız! Yaşınız Tutmuyor");
        }
    }
}
