package CircleTest;

import CircleCollection.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
    assertThrows
        executable이 expectedType 타입 예외를 발생시키는가 확인
        예외 발생시 테스트 성공.

    void assertThrows(Class<T> expectedType, Executable executable)
        || void assertDoesNotThrows(Executable executable)

        ** assertDoesNotThrows()의 경우,
         예외가 발생하지 않는다는 것을 확인하기 위해 사용되는 메소드이므로,
         예외 타입을 인자로 받아올 필요가 없어 expectedType을 인자로 받지 않는다.
 */

public class CircleTest6
{
    @Test
    void assertThrowsTest()
    {
        assertThrows(Exception.class, () -> new Circle(0,0,-10));
    } // 반지름이 0보다 작아서 예외 발생

    @Test
    void asserDoesNotThrowsTest()
    {
        assertDoesNotThrow(() -> new Circle(0,0,10));
    }

}
