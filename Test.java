import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Bus bus1 = new Bus(3);
        //System.out.println("bus1.Number = " + bus1.Number);
        //System.out.println("bus1.Number_List = " + bus1.Number_List);
        
        Bus bus2 = new Bus(3);
        //System.out.println("bus2.Number = " + bus2.Number);
        //System.out.println("bus2.Number_List = " + bus2.Number_List);
        
        Taxi taxi1 = new Taxi(3);
        //System.out.println("taxi1.Number_List = " + taxi1.Number_List);
        Taxi taxi2 = new Taxi(3);


        System.out.println("버스 기능 테스트 ================");
        //버스 속도 조절
        bus1.changeSpeed(10);
        // 승객 추가
        bus1.addpassenger(2);
        // 가스 소모
        bus1.GasUse(-50);
        // 버스 상태 변경
        bus1.ChangeState();
        // 가스 주유
        bus1.GasPlus(10);
        //버스 상태 변경
        bus1.ChangeState();
        //버스 승객 과도하게 추가
        bus1.addpassenger(45);
        //버스 승객 추가
        bus1.addpassenger(5);
        //가스 사용
        bus1.GasUse(-55);

        System.out.println("택시 기능 테스트 ================");
        taxi1.Start(2, "서울역", 2);
        taxi1.GasUse(-80);
        taxi1.result();
        taxi1.Start(5);
        taxi1.Start(3, "구로디지털단지역", 12);
        taxi1.GasUse(-20);
        taxi1.result();






    }
}
