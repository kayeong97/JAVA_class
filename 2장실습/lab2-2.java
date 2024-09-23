package lab2_2;

import java.util.Scanner;
public class SpeakMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산 입력>> ");

        double op1 = scanner.nextDouble();
        String op = scanner.next();
        double op2 = scanner.nextDouble();
        //사용자는 내가 하고 싶은대로 입력해준다 하고 숫자와 연산은 띄어서 써줌

        double result;
        if(op.equals("+"))
            result = op1 + op2;
        else if(op.equals("-"))
            result = op1 - op2;
        else if(op.equals("*"))
            result = op1 * op2;
        else if(op.equals("/")){
            if(op2 == 0){
                System.out.println("0으로 나눌 수 없음");
                return;
            }
            result = op1/op2;
        }
        else {//사칙연산에 포함되지 않은 연산
            System.out.println("사칙연산이 아님!");
            return;
        }

        // switch는 그냥 if 앞에 대면 알아서 바꿔주긴 함
        // case에 -> 이거 있는데 자바14부터 개선을 함 break 안 해줘도 됨
        // 심지어 return도 할 수 있게 해서 int result = switch 이렇게 넣을 수 있음

        System.out.println(op1 + op + op2 + "=" + result);
    }
}
