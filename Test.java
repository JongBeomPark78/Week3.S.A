public class Test {
    public static void main(String[] args) {
        Bus bus1 = new Bus(2);



        //버스 속도 조절
        bus1.SpeedChange(10);
        // 승객 추가
        bus1.plusPassenger(2);
        // 가스 소모
        bus1.GasUse(50);
        // 버스 상태 변경
        bus1.ChangeState();
        // 가스 주유
        bus1.GasPlus(10);
        //버스 상태 변경
        bus1.ChangeState();
        //버스 승객 과도하게 추가
        bus1.plusPassenger(45);
        //버스 승객 추가
        bus1.plusPassenger(5);
        //가스 사용
        bus1.GasUse(55);

        Taxi taxi1 = new Taxi(2);
        taxi1.Start(2, "서울역", 2);
        taxi1.GasUse(-80);
        taxi1.result();
        taxi1.Start(5);
        taxi1.Start(3, "구로디지털단지역", 12);
        taxi1.GasUse(-20);
        taxi1.result();



    }
}
