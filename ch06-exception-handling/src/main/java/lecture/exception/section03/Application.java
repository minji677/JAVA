package main.lecture.exception.section03;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        try{
            in = new BufferReader(new FileReader(fileName "hello.txt"));

            String s;

            while((s = in.readLine()) != null) {
                System.out.println(s);
            }
            //catch블럭을 여러개 작성할 때
            //상위 타입이 하단에 오고 후손 타입이 상단에 온다.
        }catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException 발생!");
        }catch (IOException e) {
            System.out.println("IOException 발생!");

        }
    }
}
