package practice_util;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreEvaluation {
    static ArrayList score = new ArrayList();
    static Scanner scanner = new Scanner(System.in);
    static int squence = 1;

    public static void main(String[] args) {
        while (true) {
            switch (index()) {
                case 1:
                    inputScore();
                    break;
                case 2:
                    delScore();
                    break;
                case 3:
                    outputScore();
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    System.exit(0);
            }
        }
    }

    //메인화면 메서드
    static int index() {
        System.out.println("     성적관리프로그램     ");
        System.out.println("      ver 1.0.1       ");
        System.out.println();
        System.out.println("해당 작업의 숫자를 입력해주세요");
        System.out.println("1. 학생 성적 입력         ");
        System.out.println();
        System.out.println("2. 학생 성적 삭제         ");
        System.out.println();
        System.out.println("3. 학생 성적 보기         ");
        System.out.println();
        System.out.println("4. 프로그램 종료          ");
        System.out.println();
        System.out.println("입력 대기중... : ");

        int menu = 0;
        do {
            try {
                menu = scanner.nextInt();
                scanner.nextLine();

                if (menu >= 1 && menu <= 4) {
                    break;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {

            }
        } while (true);

        return menu;
    }

    static void inputScore() {

        System.out.println("1. 학생 성적 입력         ");
        System.out.println("'이름, 국어성적, 영어성적, 수학성적' 의 순서로 공백 없이 입력하세요.");
        System.out.println("입력을 마치려면 q를 입력하세요. 메인 화면으로 돌아갑니다.");
        System.out.println();
        System.out.println("입력 대기중... : ");

        while (true) {
            System.out.println(">>");

            do {
                try {
                    String input = scanner.nextLine().trim();

                    if (!input.equalsIgnoreCase("q")) {
                        Scanner scanner2 = new Scanner(input).useDelimiter(",");
                        ScoreEvaluation se = new ScoreEvaluation();


                        score.add(new Student2(scanner2.next(),ScoreEvaluation.squence,
                                scanner2.nextInt(), scanner2.nextInt(), scanner2.nextInt()));
                        StdNum();
                        System.out.println("입력 완료");
                        break;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    System.out.println("입력 양식이 틀렸습니다...");
                    System.out.println("'이름, 국어성적, 영어성적, 수학성적");
                }
            }while (true);
        }
    }

    static void delScore(){
        while(true){
            displayRecord();
            System.out.println("삭제 할 데이터의 학번을 입력하세요.");
            System.out.println("입력을 마치려면 q를 입력하세요. 메인 화면으로 돌아갑니다.");
            System.out.println();
            System.out.println("입력 대기중... : ");
            System.out.println(">>");
        do{
            try{
                String input = scanner.nextLine().trim();

                if(!input.equalsIgnoreCase("q")){
                    int length = score.size();
                    boolean found = false;

                    for(int i = 0; i <length; i++){
                        Student2 student = (Student2)score.get(i);
                        if(Integer.parseInt(input) == student.studentNum){
                            found = true;
                            score.remove(i);
                            break;
                        }
                    }
                if(found){
                    System.out.println("삭제 완료");
                }else{
                    System.out.println("해당하는 자료를 찾을 수 없습니다.");
                }
                break;

                }else{
                    return;
                }
            }catch (Exception e){
                System.out.println("입력 오류, 다시 입력해주세요");
            }

        }while (true);
        }
    }
    static void outputScore(){
        while (true) {
            displayRecord();
            System.out.println("메인화면으로 돌아가시려면 q를 입력해주세요.");
            String input = scanner.nextLine().trim();
            if(input.equals('q')){
                break;
            }
            break;
        }
    }
    static void displayRecord(){
        int KorTotal = 0;
        int EngTotal = 0;
        int MatTotal = 0;
        int Total = 0;

        System.out.println();
        System.out.println("이름    번호    국어    영어    수학    총점");
        System.out.println("=======================");

        int length = score.size();

        if(length > 0){
            for(int i = 0; i<length; i++){
                Student2 student = (Student2)score.get(i);
                System.out.println(student);
                KorTotal += student.KorScore;
                EngTotal += student.EngScore;
                MatTotal += student.MatScore;
                Total += student.Total;
            }
        }else{
            System.out.println("데이터가 없습니다.");
            System.out.println("학생정보를 입력해주세요");
            System.out.println();
        }

        System.out.println("====================");
        System.out.println("총점 ");

    }
    static int StdNum(){
        int sequence = ScoreEvaluation.squence++;
        return sequence;
    }
}