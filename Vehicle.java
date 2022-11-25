public class Vehicle {
    int Number;
    int Gas = 100;
    int Speed = 0;
    int SpeedChange;
    int MaxPassenger;


    //속도 변경
    void changeSpeed(int change){
        Speed = Speed + change;
        if(Speed < 0){
            Speed = 0;
            System.out.println("현재 스피드 : " + Speed);
        }else {
            System.out.println("현재 스피드 : " + Speed);
        }
    }

    //승객 탑승
    void addpassenger(int passenger, int MaxPeople){
        int Max = MaxPeople;
        if(Max < passenger){
            System.out.println("초과입니다.");
        }

    }

    //기름 주유
    void GasPlus(int Plus){
        Gas = Gas + Plus;
        System.out.println("주유량 = " + Gas);
    }

}

