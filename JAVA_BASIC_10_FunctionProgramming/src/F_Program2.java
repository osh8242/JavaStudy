import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/*
    Java는 객체지향 언어이기 때문에 기본적으로 함수형 프로그래밍이 불가능하다

    JDK8 Stream API를 제공했다 ... 람다식을 사용

    함수형 인터페이스 등을 지원 ... java 이용해서 javascript에서 사용했던 함수형을 API를 통해서 제공한다
    그 대표가 Stream API는 데이터를 추상화하고 처리하는데 사용하는 함수를 정의해두었다
    ex) select * from emp where sal > 2000 and ename = '길동' and ...
    위에서 쓰는 방식을 자바에서도 추상화된 함수를 구현할 수 있다 >> Stream API 구현을 람다식으로 ...
    표준화, 재사용성을 높일 수 있다.

 */
public class F_Program2 {
    public static void main(String[] args) {
        String[] nameArr = {"Hulk", "Captain", "Ironman"};
        List<String> nameList = Arrays.asList(nameArr);

//            아래코드는 좋은 코드입니다
//            만약엔 더 간결하게 가독성 높게... 원본데이터를 보존한채 정렬하는 방법은..?
//            => JAVA Stream API

       /*
       Arrays.sort(nameArr);
        Collections.sort(nameList);

        for (String s : nameList) {
            System.out.println("s = " + s);
        }

        for (String s : nameArr) {
            System.out.println("s = " + s);
        }
        */

//               Java Stream API 사용해서 refactoring을 해보자

        //1. 원본 데이터가 아닌 별도의 데이터 집합을 생성
        //Stream은 Collection을 보조하는 녀석 ....

        Stream<String> arrayStream = Arrays.stream(nameArr);
        Stream<String> nameStream = nameList.stream();

        //복사된 데이터를 정렬해서 출력
        arrayStream.sorted().forEach(System.out :: println);
        nameStream.sorted().forEach(System.out :: println);




    }
}
