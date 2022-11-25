import java.util.ArrayList;

public class Vehicle {
    int Number;
    int Gas = 100;
    int Speed = 0;
    int SpeedChange;
    int MaxPassenger;

    public static ArrayList<Integer> Number_List = new ArrayList<>();
    //static 어떤 클래스든 접근이 가능해진다.
    //static 찾아보기. 어떤 객체든 접근이 가능해진다.

    boolean setNumber(int Number) {
        //System.out.println("Number_List = " + Number_List);
        if(Number_List.size() == 0){
            Number_List.add(Number);
            System.out.println("사용가능한 번호입니다.");
            return true;
        }
        for(int i = 0; i < Number_List.size(); i++){
            if(Number == Number_List.get(i)){
                System.out.println("같은 번호는 사용불가!");
                return false;
            }
        }
        System.out.println("사용가능한 번호로 변경되었습니다.");
        Number_List.add(Number);
        return true;
    }
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

