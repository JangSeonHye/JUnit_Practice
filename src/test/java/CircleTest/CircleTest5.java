package CircleTest;

import CircleCollection.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    assertAll
        인자로 들어온 모든 executable들이 예외를 발생시키지 않는가 확인
        - 인자의 executables는 각 테스트를 의미한다.
        - 예외를 발생시킨다 : 테스트가 실패했음을 의미한다.
        "인자로 넣은 모든 테스트들의 성공/실패 결과를 알려준다."

    void assertAll(Executable... executables)
        여러 개의 assertSomething() 메소드를 한 번에 검증할 때 이용.

    *executable
        : JUnit에 정의되어 있는 함수형 인터페이스
            Runnable이 예외를 던질 수 있도록 재정의한 클래스라고 생각할 수 있음.
 */

public class CircleTest5
{
    @Test
    void assertAllTest() throws Exception
    {
        Circle circleA = new Circle(-10, 0, 10);
        Circle circleB = new Circle(10,0,10);
        assertAll(
                () -> assertNotNull(circleA),
                () -> assertNotNull(circleB),
                () -> assertNotEquals(circleA, circleB),
                () -> assertTrue(circleA.reach(circleB))
        );
    }
}
