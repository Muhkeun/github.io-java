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

        ArrayList arrayList1 = new ArrayList();

        //ArrayList는 타입에 상관 없이 다 집어 넣을 수 있다.
        arrayList1.add("hello");
        arrayList1.add(11);
        //중복 값을 허용
        arrayList1.add(22);
        arrayList1.add(33);
        arrayList1.add(44);

        //add(index, element) - 인덱스 위치에 값을 집어넣기
        // => 값을 중간에 끼워 넣기도 가능함.
        arrayList1.add(0, "Java");
        //set(index, element) - 인데스 위치의 값을 바꾸기
        arrayList1.set(5, "Ruby");
        //remove(index) - 인덱스 위치의 값을 삭제
        arrayList1.remove(2);

        System.out.println("arrayList1: " + arrayList1);

        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(100);
        //addAll(index, element) - 해당 인덱스에 다른 리스트의 값을 모두 넣기
        arrayList2.addAll(0, arrayList1);

        System.out.println("arrayList2.addAll: " + arrayList2);
        //clear() - List 삭제
        arrayList2.clear();
        System.out.println("arrayList2.clear(): " + arrayList2);

        //clone() - 똑같은 객체를 복사, object 클래스를 오버라이딩
        ArrayList arrayList3 = (ArrayList) arrayList1.clone();
        System.out.println("arrayList1: " + arrayList1);
        System.out.println("arrayList1.clone(): "+ arrayList3);

        //contains(Obj) - 포함 여부 확인
        boolean result = arrayList1.contains("hello");
        System.out.println("arrayList1.contains(): " + result);

        ArrayList arrayList4 = new ArrayList();
        arrayList4.add("hello");
        arrayList4.add(11);
        //containsAll(List) - 리스트 전체 포함 여부 확인
        result = arrayList1.containsAll(arrayList4);
        System.out.println("arrayList1.containsAll(): " +result);

        //get(index) - 리스트의 인덱스에 해당하는 값을 꺼내올 수 있다.
        Object obj = arrayList1.get(0);
        System.out.println("arrayList1.get(0): " + obj);

        //indexOf(Object) - 해당 오브젝트의 인덱스 번호 확인
        int index = arrayList1.indexOf(22);
        System.out.println("arrayList1.indexOf(22): " + index);

        //isEmpty() - 해당 리스트가 비어 있는지 확인하여 참/거짓 리턴

        System.out.println("arrayList1.isEmpty(): " + arrayList1.isEmpty());
        System.out.println("=====================================");

        for(Object ob1: arrayList1){
            //for each 문을 이용해 배열 처럼 사용할 수 있다.
            System.out.println(ob1);

        }
    }
}
