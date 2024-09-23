package lab2_3;

import java.util.Scanner;
public class Bit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte POW = 0b1; // 끝 자리가 1
        final byte DOOR = 0b10; // 끝에서 앞 자리가 1
        final byte LAMP = 0b100;
        final byte TEMP = 0b1000;
        //상수로 만들면 코드가 쉬워짐

        System.out.print("냉장고 상태>>");
        String str = scanner.next();
        byte status = Byte.parseByte(str,2); //byte는 기본 타입 Byte는 타입을 클래스로 만듦
        //문자열을 2진수로 만들어 바이트 타입의 정수 status에 저장

        if( (status & POW) != 0 ) System.out.print("전원 켜짐");
        else System.out.print("전원 꺼짐");

        if( (status & DOOR) != 0 ) System.out.print("문 닫힘");
        else System.out.print("문 열림");

        if( (status & LAMP) != 0 ) System.out.print("전구 정상");
        else System.out.print("전구 비정상");

        if( (status & TEMP) != 0 ) System.out.print("3도 미만");
        else System.out.print("3도 이상");
    }
}
