package CircleTest;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

/*
    assertTimeoutPreemptively
        - assertTimeout과 유사
        - executable이 timeout 내에 수행을 마치지 못한 경우 즉시 테스트 종료

    void assertTimeoutPreemptively(Duration timeout, Executable executable)
 */

public class CircleTest8
{
    @Test
    void assertTimeoutPreemptivelyTest()
    {
        assertTimeoutPreemptively(Duration.ofMillis(1000), () -> {
            Thread.sleep(360000000);
            System.out.println("정말 긴 작업 실행");
        });
    }
}
