import java.util.InputMismatchException;
import java.util.Scanner;
public class Multiply {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("곱하고자 하는 두 수 입력>>");
            int n, m;
            try {
                n = sc.nextInt();
                m = sc.nextInt();
                System.out.println(n + "x" + m + "=" + n * m);
                break;
            } catch (InputMismatchException e) {
                System.out.println("정수값만 입력하세요");
                sc.nextLine(); //버퍼를 비워주는 역할
                //남아있는 버퍼의 수를 가져오게 될 수도 있기 때문에 비워주는 과정이 필요함
            }
        }
    }

}
