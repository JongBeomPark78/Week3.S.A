public class Bus{
    int fee = 1000;
    int MaxPassenger = 30;
    int currentPassenger = 0;
    String State ="운행중";
    int Number;
    int Gas = 100;
    int Speed = 0;

    static int count = 0;


    //버스 객체 생성.
    Bus(int Number){
        this.Number = Number;
    }
    //버스 스피드 변경.
    void SpeedChange(int change){
        if(State.equals("운행중")){
            Speed = Speed + change;
            if(Speed < 0){
                Speed = 0;
                System.out.println("현재 스피드 : " + Speed);

            }
            System.out.println("현재 스피드 : " + Speed);
        }

    }
    //승객 태우기.
    void plusPassenger(int pluspassenger){
        int Max = MaxPassenger;
        int Curr = currentPassenger;
        if(State.equals("운행중")){
            if(Max >= Curr + pluspassenger){
                Curr = Curr + pluspassenger;
                System.out.println("탑승 승객 수 = " + pluspassenger);
                System.out.println("잔여 승객 수 = " + (Max - Curr));
                System.out.println("요금 확인 = " + (fee * pluspassenger));
                this.currentPassenger = Curr;

            } else{
                System.out.println("최대 승객 수 초과");

            }
        } else{
            System.out.println("운행중이 아닙니다.");

        }

    }
    //가스 사용하기.
    void GasUse(int Use){
        Gas = Gas - Use;
        if(Gas < 10){
            if(Gas < 0){
                Gas = 0;
                State = "차고지행";
                System.out.println("주유량 = " + Gas);
                System.out.println("상태 = " + State);
                System.out.println("주유가 필요합니다.");

            }
            State = "차고지행";
            System.out.println("주유량 = " + Gas);
            System.out.println("상태 = " + State);
            System.out.println("주유가 필요합니다.");

        }

        System.out.println("주유량 = " + Gas);

    }
    //가스 주유
    void GasPlus(int Plus){
        Gas = Gas + Plus;
        System.out.println("상테 = " + State);
        System.out.println("주유량 = " + Gas);

    }
    //상태 바꿈.
    void ChangeState(){
        if(State.equals("운행중")){

            State = "차고지행";
            MaxPassenger = 30;
            currentPassenger = 0;
            System.out.println("상태 = " + State);
        } else {
            if(Gas < 10){
                System.out.println("기름이 부족합니다.운행할 수 없습니다.");
                System.out.println("상테 = " + State);
            } else {
                State = "운행중";
                System.out.println("상태 = " + State);
            }

        }

    }




}
