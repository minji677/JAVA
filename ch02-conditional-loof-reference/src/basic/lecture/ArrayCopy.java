package basic.lecture;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class ArrayCopy {
    public static void main(String[] args) {
        /*
         * 깊은 복사
         * -객체(또는 배열)을 복사할 때 내부에 포함된 배열까지 모두 새로운 메모리 공간에 복사
         *
         * 얕은 복사
         * -주소값을 복사해 원본과 동일한 메모리 구조를 가르키게 됨(공유함)
         * */

        String[] original = {"Apple", "Banana", "Cherry"};

        //얕은복사
        String[] shallowCopy = original;

        //깉은복사
        String[] deepCopy = new String[original.length];
        for (int i = 0; i < original.length; i++) {
            deepCopy[i] = original[i];
        }

        System.out.println("original = " + original);
        System.out.println("shallowCopy = " + shallowCopy);
        System.out.println("shallowCopy = " + deepCopy);



        //얕은 복사 대상의 0번째 인덱스 값을 Grape로 변경
        shallowCopy[0] = "Grape";

        //전체출력
        for(String str : shallowCopy) {
            System.out.println(str);
        }
        System.out.println("--------------------");
        for(String str : original){
            System.out.println(str);
        }
        System.out.println("--------------------");
        for(String str : deepCopy){
            System.out.println(str);
        }

    }
}
