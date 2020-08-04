package threadtest;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        //beepTask 객체 생성
        Runnable beepTask = new BeepTask();
        //작업 스레드 생성
        Thread thread = new Thread(beepTask);
        thread.start();

        for(int i = 0; i <5; i++){
            System.out.println("빕");
        }
        try {
            Thread.sleep(500);
        }catch (Exception e){}
    }
}
