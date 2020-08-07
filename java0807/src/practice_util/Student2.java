package practice_util;

public class Student2 implements Comparable {
    final static int LEFT = 0;
    final static int CENTER = 1;
    final static int RIGHT = 2;

    String name = "";
    int studentNum = 0;
    int KorScore = 0;
    int MatScore = 0;
    int EngScore = 0;
    int Total = 0;

    Student2(String name, int studentNum, int koreanScore, int mathScore, int englishScore) {
        this.name = name;
        this.studentNum = studentNum;
        this.KorScore = koreanScore;
        this.MatScore = mathScore;
        this.EngScore = englishScore;
        Total = koreanScore + mathScore + englishScore;
    }

    public String toString() {
        return format(name, 4, LEFT)
                + format(Integer.toString(studentNum), 4, RIGHT)
                + format(""+KorScore,6, RIGHT)
                + format(""+MatScore,6, RIGHT)
                + format(""+EngScore, 6, RIGHT)
                + format(""+Total,8, RIGHT);
    }

    static String format(String str, int length, int alignment) {
        int diff = length - str.length();
        if(diff < 0) return str.substring(0, length);

        char[] source = str.toCharArray();
        char[] result = new char[length];

        // 배열 result를 공백으로 채운다.
        for(int i=0; i < result.length; i++)
            result[i] = ' ';

        switch(alignment) {
            case CENTER :
                System.arraycopy(source, 0, result, diff/2, source.length);
                break;
            case RIGHT :
                System.arraycopy(source, 0, result, diff, source.length);
                break;
            case LEFT :
            default :
                System.arraycopy(source, 0, result, 0, source.length);
        }
        return new String(result);
    } // static String format(String str, int length, int alignment) {

    public int compareTo(Object obj) {
        int result = -1;
        if(obj instanceof Student2) {
            Student2 tmp = (Student2)obj;
            result = (this.name).compareTo(tmp.name);
        }
        return result;
    }
}
