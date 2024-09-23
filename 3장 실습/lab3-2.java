import java.util.Scanner;
public class ChangeMoney {
    public static void main(String[] args){

        //교수님 방법
        //int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        int[] unit = {50000, 5000, 1000, 100, 10, 1}; //정렬되어 있다고 가정
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액>>");
        int money = scanner.nextInt();
        /*
        for(int i=0; i < unit.length; i++) {//배열의 크기가 바뀔 수 있다고 가정 -> unit.legth로
            int res = money/unit[i];
            if(res>0){
                System.out.println(unit[i]+"원 짜리 : " + res + "개");
                money = money % unit[i];
            }
         */
        for(int u: unit){ //for each 사용해보기
            //for each는 읽기만 가능하고 값을 바꾸는 것은 불가능함
            int res=money/u;
            if(res>0){
                System.out.println(u+"원 짜리 : " + res + "개");
                money = money % u;
            }
        }

/*
        내 방법
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};//환산할 돈의 종류
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int money= sc.nextInt();

        if(money<0){
            System.out.print("바꿀 돈이 없습니다");
            return;
        }

        for(int i = 0; i < unit.length; i++){
            int count = 0;
            while(money - unit[i] >= 0){
                money -= unit[i];
                count++;
            }
            if(count !=0) System.out.println(unit[i]+"원 짜리 : " + count + "개");
        }
 */
    }
}
