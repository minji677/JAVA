package ch07.sec08.exam1;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        // Tire 타입의 tire 속성이 정의 되지 않음
//        Tire tire = new Tire();
        Tire tire = new TeslaTire(); // 다형성 - 업캐스팅
//        Tire tire = new KumhoTire(); // 다형성 - 업캐스팅
//        Tire tire = new HankookTire(); // 다형성 - 업캐스팅

        myCar.tire = tire;

        myCar.run();
    }
}