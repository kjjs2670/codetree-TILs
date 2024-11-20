import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char aCold = sc.next().charAt(0);
        int aTemp = sc.nextInt();
        char bCold = sc.next().charAt(0);
        int bTemp = sc.nextInt();
        char cCold = sc.next().charAt(0);
        int cTemp = sc.nextInt();
        int patient = 0;

        if (aCold == 'Y' && aTemp >= 37){
            patient += 1;
        }
        if (bCold == 'Y' && bTemp >= 37){
            patient += 1;
        }
        if (cCold == 'Y' && cTemp >= 37){
            patient += 1;
        }

        if (patient >= 2) {
            System.out.println("E");
        } 
        else{
            System.out.println("N");
        }
    }
}