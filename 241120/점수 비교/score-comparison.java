import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int amath = sc.nextInt();
        int aeng = sc.nextInt();
        int bmath = sc.nextInt();
        int beng = sc.nextInt();
        if (amath>bmath && aeng>beng){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}