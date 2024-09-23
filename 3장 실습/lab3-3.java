public class Add {
    public static void main(String[] args){
        //예외처리 사용

        int sum = 0;
        for(String s: args){
            try { //예외처리 안 해주면 프로그램이 죽어버림
                sum += Integer.parseInt(s);
            }
            catch(NumberFormatException e){
                System.out.println(s+"는 정수가 아님");
            }
        }
        System.out.println("합: "+ sum);
    }
}
