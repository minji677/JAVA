package basic.ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
    /*
    *substring
    *원하는 범위에 인덱스 반환
    *인자가 1개일 때 - 해당 인덱스 값에서 끝까지
    *2개일 때 (시작인덱스, 끝 인덱스)
    *시작인덱스 부터 끝 인덱스를 반환(끝 인덱스에 해당하는 값은 반환x
     **/

        String ssn = "880815-1234567";
        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);
        String secondNum = ssn.substring(7);
        System.out.println(secondNum);

        /*
        * split
        * 문자열을 특정 구분자를 기준으로 잘라서 문자열 배열로 반환
        * */
        String[] tokens = ssn.split("-");
    }
}