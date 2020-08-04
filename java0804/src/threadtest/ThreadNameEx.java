package threadtest;

public class ThreadNameEx extends Thread {
    public static void main(String[] args) {
        //메인 스레드의 참조를 얻어 스레드 이름을 콘솔에 출력하고, 새로 생성한 스레드의 이름을
        //getName() 메소드로 설정한 후, getName()으로 읽어오기

        //현재 스레드 참조
        Thread mainThread = Thread.currentThread();
        //스레드 이름 얻기
        System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());

        ThreadA threadA = new ThreadA();
        System.out.println("작업 스레드 이름: " + threadA.getName());
        threadA.start();

        ThreadB threadB = new ThreadB();
        System.out.println("작업 스레드 이름: " + threadB.getName());
        threadB.start();
    }
}
