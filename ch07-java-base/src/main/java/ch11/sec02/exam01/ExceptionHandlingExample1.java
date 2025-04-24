package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            // 예외 메시지 출력
            System.out.println("예외 메시지: " + e.getMessage());

            // 스택 추적 전체 출력
            e.printStackTrace();
        } finally {
            System.out.println("[마무리 실행]");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");

        printLength("ThisIsJava");
        printLength(null);  // 예외 발생 지점

        System.out.println("\n[프로그램 종료]");
    }
}

