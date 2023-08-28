package CircleTest;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

/*
    assertTimeout
        executable이 timeout 내에 수행을 완료하는지 확인
        - 인자로 주어진 timeout이 지났는데도 실행이 끝나지 않으면
         모듈의 실행이 끝날 때까지 기다린 뒤에 실행 시간이 얼마나 걸렸는지 알려준다.
        - 모듈의 수행 시간을 알아야 하는 경우에 사용.
        - timeout 내에 실행을 마쳤는가 확인하기 위해서는
            "assertTimeoutPreemptively()"를 사용할 것.

    void assertTimeout(Duration timeout, Executable executable)
 */

public class CircleTest7
{
    @Test
    void asserTimeoutSuccessTest()
    {
        assertTimeout(Duration.ofMillis(1000), () -> {
            System.out.println("executable 실행");
        });
    }

    @Test
    void assertTimeoutFailureTest()
    {
        assertTimeout(Duration.ofMillis(1000), () -> {
            Thread.sleep(1500);
            System.out.println("executable 실행");
        });
    }
}
