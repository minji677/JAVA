package test; //;생략불가능 package 맨위

//int x = 100; //모든 변수는 클래스 안으로 들어가야함
public class VariableTest {

    public static void main(String[] args) {
        //이 부품은 독립적으로 실행할 수 있는 부품이 된다.
        //함수인데 만약에 함수가 여러 개인 경우 무조건 메인부터 호출한다.
        //타입 변수명; --> 변수가 생성됨, 선언 !
        //자바는 변수에 들어갈 타입이 선언할때 결정(정적타입핑)
        //기본형 4가지: 정수, 실수, 문자1, 논리
        //정수 : byte(1), short(2). int(4), long(8)
        byte age = 127; //변수는 소문자로 시작해주세요.
        short year = 2025;
        int hit = 210000000;
        long money = 20000000000L; //l

        //실수 : float(소수점 7자리, 4바이트), double (15자리, 8바이트)
        float w = 70.5F; // f
        double h = 170.0000000555;

        //문자1 : char
        char gender = '여'; // 홀따옴표

        //논리형 : boolean
        boolean food =  true; //false

        System.out.println("내 나이는 " + age + "세야.");
        System.out.println("내 몸무게 " + w + "kg이야.");
        System.out.println("내 성별은 " + gender + "자야.");
        System.out.println("나는 오늘 아침을 먹었을까? " + food);

        String name = "김국민";// 이중따옴표
        String plan = """
                나는
                훌륭한
                자바 개발자가 되리라 !!!
                """;
        System.out.print("출력하고 엔터치지마!");
        System.out.println("내 이름은" + name);
        System.out.println("내 계획은" + plan);//한 줄 복사 (컨트롤d)
        System.out.printf("내 이름은 %s이야!", name);
        System.out.printf("내 몸무게는 %.2f, 내 키는 %10.3f", w, h);
    }
}
