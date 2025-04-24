package lecture.wrapper;

public class Application2 {

    /*박싱과 언박싱
    *박싱 : 기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것
    * 언박싱 : 래퍼클래스의  인스턴스를 기본타입으로 바꾸는 것
     */
    /*
     *  기본타입         래퍼클래스
     *  byte          Byte
     *  short         Short
     *  int           Integer
     *  long          Long
     *  float         Float
     *  double        Double
     *  char          Character
     *  boolean       Boolean
     * */
    int intValue= 10;
    //박싱
    //Integer boxingNumber1 = new Integer(intValue);
    String b = Byte.valueOf((byte) 1).toString();
    String s = Short.valueOf((short) 2).toString();
    String i = Integer.valueOf(4).toString();
    String l = Long.valueOf(8L).toString();
    String f = Float.valueOf(4.0f).toString();
    String d = Double.valueOf(8.0).toString();
    String bl = Boolean.valueOf(true).toString();
    String c = Character.valueOf('a').toString();






}
