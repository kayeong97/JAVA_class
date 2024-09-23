package lab2_1;

import java.util.Scanner;
public class TravelMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("여행지>>"); // println은 줄바꿈을 넣어줌
        String place = scanner.nextLine(); //띄어쓰기까지 다 가져오기 위해 nextLine

        System.out.print("인원수>>");
        int person = scanner.nextInt();

        System.out.print("숙박일>>");
        int day = scanner.nextInt();

        System.out.print("1인당 항공료>>");
        int airplane = scanner.nextInt();

        System.out.print("1방 숙박료>>");
        int room = scanner.nextInt(); //이건 숙박료

        int numOfRoom = person/2 + person%2; //소수점 아래를 버림 그래서 몫이랑 나머지를 더해주는거임
        int cost = room*numOfRoom*day + airplane*person;

        System.out.println(person + "명의 " + place + " " + day + "박 " + (day+1) +
                "일 여행에는 방이 " + numOfRoom +"개 필요, 총액:" + cost + "원");
    }

}
