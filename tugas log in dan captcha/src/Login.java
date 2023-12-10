import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = "admin";
        String password = "pass12";

        System.out.println("Selamat datang! Silahkan login");
   
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        String captcha = generateCaptcha();
         System.out.println("CAPTCHA : " + captcha);

        System.out.print("Masukkan CAPTCHA diatas: ");
        String inputCapctha = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password) && inputCapctha.equalsIgnoreCase(captcha)){
            System.out.println("Login berhasil! Selamat datang, " + username + "!");
        } else {
            System.out.println("Login gagal. Periksa kembali username, password, dan CAPTCHA yang dimasukkan.");
        }
        scanner.close();
    }


public static String generateCaptcha(){
    String captchaChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    StringBuilder captcha = new StringBuilder();
    int length = 6;

    for (int i = 0; i < length; i++){
        int index = (int) (captchaChars.length() * Math.random());
        captcha.append(captchaChars.charAt(index));
    }

    return captcha.toString();
}
}
