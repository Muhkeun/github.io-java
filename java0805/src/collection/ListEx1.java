package collection;

import java.util.ArrayList;

public class ListEx1 {
    public ListEx1() {
    }

    public static void main(String[] args) {
        //Collection Framework
        //객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 제공되는 컬렉션 라이브러리

        //컬렉션 - 사전적 의미로 요소(객체)를 수집해 저장하는 것
        //배열 - 객체 수가 배열을 생성할 때 결정, 객체 삭제 => 인덱스가 비게 됨

        //List - 배열처럼 값만 저장, 중복 허용 o, 순서 o , 'ArrayList'이 대표
        //Set - 배열처럼 값만 저장, 중복 허용 x , 순서 x , 'HashSet'이 대표
        //Map - key, value 형태로 저장, 키의 중복 허용 x, 순서 x, 'HashMap'이 대표

        ArrayList arrayList = new ArrayList();

        //ArrayList는 타입에 상관 없이 다 집어 넣을 수 있다.
        arrayList.add("hello");
        arrayList.add(77);
        //중복 값을 허용
        arrayList.add(77);
        arrayList.add(77);
        arrayList.add(77);

        //add(index, element) - 인덱스 위치에 값을 집어넣기
        // => 값을 중간에 끼워 넣기도 가능함.
        arrayList.add(0, "Java");
        //set(index, element) - 인데스 위치의 값을 바꾸기
        arrayList.set(5, "Ruby");
        //remove(index) - 인덱스 위치의 값을 삭제
        arrayList.remove(2);

        System.out.println(arrayList);







    }
}
