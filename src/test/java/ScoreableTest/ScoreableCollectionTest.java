package ScoreableTest;

import ScoreableCollection.ScoreableCollection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
//import org.junit.*;

public class ScoreableCollectionTest
{
    /*
        JUnit은 @Test 어노테이션이 붙은 test 메소드를 테스트로 실행한다.
         테스트 클래스에서 테스트 메소드가 아닌 다른 메소드도 포함될 수 있다.
         이는 JUnit이 자체적으로 제외한다.
     */

    @Test
    public void answersArithmeticMeanOfTwoNumbers()
    {
        // 준비 arrange
        ScoreableCollection collection = new ScoreableCollection();
        collection.add(() -> 5);
        // 람다 표현식을 사용하여 Scoreable 인스턴스에서 원하는 값을 반환하도록 지정. "5"
        collection.add(() -> 7);

        // 실행 act
        int actualResult = collection.arithmeticMean();

        // 단언 assert
//        assertThat(actualResult, equalTo(6));
        assertEquals(6, actualResult);
    }
}
