public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5, b = 6, c = 7;
        // int temp1, temp2;
        int temp;

        // temp1 = b;
        // b = a;
        // temp2 = c;
        // c = temp1;
        // a = temp2;

        temp  = c;
        c = b;
        b = a;
        a = temp;





        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}