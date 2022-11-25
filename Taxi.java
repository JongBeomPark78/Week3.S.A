public class Taxi{
    int Number;
    int Gas = 100;
    int Speed = 0;
    String Destination;
    int basicDistance = 1;
    int destinationDistance;
    int basicFee = 3000;
    int extraFee = 1000;
    int currentPassenger = 0;
    int MaxPassenger = 4;
    String State = "일반";

    int finalCharge = 0;

    //생성자
    Taxi(int Number){
        this.Number = Number;
    }

    //운행 시작 - 주유상태 체크하고 주유량이 10 이상이여야지 운행 가능
    void Start(int passenger){
        if(Gas < 10){
            System.out.println("가스가 없어서 운행이 불가능합니다.");
        } else {
            if(passenger > MaxPassenger){
                System.out.println("최대 승객 수 초과");
            }

        }
    }

    void Start(int passenger, String Destination, int destinationDistance){
        if(Gas < 10){
            System.out.println("가스가 없어서 운행이 불가능합니다.");
        } else {
            if(passenger > MaxPassenger){
                System.out.println("최대 승객 수 초과");
            }

            this.Destination = Destination;
            this.destinationDistance = destinationDistance;

            int finalFee = basicFee + extraFee * (destinationDistance - basicDistance);
            finalCharge += finalFee;
            State = "운행중";
            System.out.println("탑승 승객 수 = " + passenger);
            System.out.println("현재 승객 수 = " + (MaxPassenger - passenger));
            System.out.println("기본 요금 확인 = " + basicFee);
            System.out.println("목적지 = " + Destination);
            System.out.println("목적지까지 거리 = " + destinationDistance+"KM");
            System.out.println("지불할 요금 = " + finalFee);
            System.out.println("상태 = " + State);
        }
    }
    int GasUse(int Use){
        Gas = Gas + Use;
        if(Gas < 10){
            if(Gas < 0){
                Gas = 0;
                State = "운행불가";
                return Gas;
            }else {
                State = "운행불가";
                return Gas;
            }
        }

        System.out.println("주유량 = " + Gas);
        return Gas;
    }
    void result() {
        if(Gas < 10){
            State = "운행불가";
            System.out.println("주유량 = " + Gas);
            System.out.println("상태 = " + State);
            System.out.println("누적 요금 = " + finalCharge);
        } else{
            System.out.println("주유량 = " + Gas);
            System.out.println("누적 요금 = " + finalCharge);

        }

    }

    //승객 탑승 - 택시 상태가 '일반'일 때만 가능하다. 그 외에는 탑승 불가 처리 일반에서 승객을 태우면 운행 중으로 변경
    //속도 변경 - 변경할 속도를 입력받아 현재 속도에 추가하거나 뺄 수 있어야 한다.
    //거리당 요금 추가 - 기본 거리보다 먼 곳은 추가 요금이 붙는다.
    //요금 결제 - 최종 요금을 출력하는 곳.
}
