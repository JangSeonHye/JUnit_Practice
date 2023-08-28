package CalculatorTest;

import Calculator.Calculator;
import Calculator.MathService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    // MathService 인터페이스를 구현한 모의 객체 생성(클래스의 메서드 동작 확인 목적)
    private MathService mathService;
    private Calculator calculator;

    // 각 테스트 실행 전 초기화
    @BeforeEach
    public void setup() {
        // 테스트 목적 모의 객체 생성
        mathService = mock(MathService.class);
        // 객체 생성시 모의 객체 주입
        calculator = new Calculator(mathService);
    }

    // 각 테스트 실행 후 호출
    @AfterEach
    public void afterEach() {
        System.out.println("After each test");
    }

    // 모든 테스트 실행 후 호출
    @AfterAll
    public static void afterAll() {
        System.out.println("After all tests");
    }

    @Test
    public void testAdd() {
        when(mathService.add(2, 3)).thenReturn(5);

        int result = calculator.add(2, 3);

        assertEquals(5, result);
        assertNotEquals(10, result);

        verify(mathService).add(eq(2), eq(3));
    }

    @Test
    public void testSubtract() {
        when(mathService.subtract(5, 2)).thenReturn(3);

        int result = calculator.subtract(5, 2);

        assertEquals(3, result);
        assertNotEquals(10, result);

        verify(mathService).subtract(eq(5), eq(2));
    }

}
