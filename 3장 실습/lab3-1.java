import java.util.Scanner;
public class TriangleStar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오>>");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("0보다 커야함");
            return;
        }
        /*
        내가 한 코드
        for(int i =n; i > 0 ; i--){
            for (int j = i; j > 0 ; j--){
                System.out.print('*');
            }
            System.out.print('\n');
        }
         */
        //교수님 코드
        for(int i=n; i>0;i--){
            for(int j =0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        sc.close();
    }
}
