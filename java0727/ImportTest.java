


//패키지의 클래스를 임포트 하면 생성시 경로를 적지 않아도된다.
import java.util.Date;
import java.io.FileInputStream;
// *을 사용해 패키지의 모든 클래스를 import 할 수 있다.
import java.util.*;

//java.lang 패키지 클래스는 자유롭게 사용가능
class ImportTest {
	public static void main(String[] args){
		
		//사용할 때 클래스 모든 경로를 다 적어줘야 한다. => 길다.
		java.util.Date day = new java.util.Date();
		
		
	}
}
