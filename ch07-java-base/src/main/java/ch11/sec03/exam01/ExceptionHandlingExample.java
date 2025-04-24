package ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "loo"};

        for (int i = 0; i <= array.length; i++) { // i <= 이라서 오류 유발
            try {
                int value = Integer.parseInt(array[i]); // "loo"에서 예외 발생
                System.out.println("array[" + i + "]: " + value);
            } catch (NumberFormatException e) {
                System.out.println("⚠ 숫자 변환 오류: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("⚠ 인덱스 초과 오류: " + e.getMessage());
            }
        }
    }
}
