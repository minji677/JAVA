package basic.ch05.sec05;

public class ChaarAtExample {
    public static void main(String[] args) {
        //charAt(index)
        //문자열의 지정한 인덱스에 해당하는 문자 하나를 반환
        //char타입으로 반환

        String ssn = "95062430123";

        char gender = ssn.charAt(6);

        System.out.println(gender);
    }
}
