package collection;

import java.util.*;
class ArrayListEx1{
    public static void main(String[] args) {

        //list1 을 생성하고 10개의 초기 공간을 만듬.
        ArrayList list1 = new ArrayList(10);
        //list1의 각 공간에 Integer 클래스 생성
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        //list1.subList(fromIndex, toIndex) - 시작인덱스(포함) 부터 끝인덱스(포함x)까지 추출
        //list1 번의 1번 인덱스에서 4번 인덱스(포함x)까지 list2에 대입 => [4, 2, 0]
        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        //Collections.sort(list) - 리스트의 내용을 오름차순으로 정렬
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);
        //containsAll(list) - 리스트 전체의 포함 여부 확인 후 논리값 출력
        System.out.println(list1.containsAll(list2));
        //add(element) - 리스트에 element 추가
        list2.add("B");
        list2.add("C");

        //add(index, element) - 리스트의 인덱스에 해당하는 위치에 element 추가
        list2.add(3, "A");
        print(list1, list2);
        //set(index, element) - 해당 인덱스 위치의 값을 element 값으로 바꿈
        list2.set(3, "AA");
        print(list1, list2);

        //중복되는 내용만 남기고 나머지 (교집합) 삭제
        System.out.println(list1.retainAll(list2));
        print(list1, list2);
        //size() - 길이
        System.out.println(list1.size());
        System.out.println(list2.size());

        //같은 내용 삭제
        for(int i= 5; i >= 0; i--) {
            //list2의 5번 index 부터 차례대로 줄여나가면서 list1과 같은 부분을 삭제
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    }
    //print 메서드를 만들었다.
    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
}