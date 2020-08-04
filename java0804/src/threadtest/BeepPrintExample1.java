package threadtest;

import java.awt.*;
public class BeepPrintExample1 {
    public static void main(String[] args) {
        //0.5 초 주기로 비프음을 발생 시키고 빕 출력하는 작업
        //=> main thread 는 동시에 두 가지 작업을 처리 할 수 없다.
        //따라서 두가지 작업을 동시에 하기 위해서는 다른 스레드에서 실행시켜야한다.

        //툴킷 객체 얻기.
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        //0.5초 주기로 beep sound 재생
        for(int i = 0; i < 5; i++) {
            toolkit.beep();
            try { Thread.sleep(500);
            }catch(Exception e){}
        }

        //모니터에 "빕" 출력
        for(int i = 0; i < 5; i++){
            System.out.println("빕");
            try{Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
