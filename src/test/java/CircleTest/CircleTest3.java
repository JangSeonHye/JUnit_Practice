package CircleTest;

import CircleCollection.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

/*
    assertSame || assertNotSame
        동일한 레퍼런스인지 확인

    void assertSame(Object expected, Object actual)
        || void assertNotSame(Object expected, Object actual)
 */

public class CircleTest3
{
    @Test
    void assertSameTest() throws Exception
    {
        Circle circleA = new Circle(0,0,10);
        Circle circleB = circleA;
        assertSame(circleA, circleB);
    }

    @Test
    void assertNotSameTest() throws Exception
    {
        Circle circleA = new Circle(0,0,10);
        Circle circleB = new Circle(0,0,10);
        assertNotSame(circleA, circleB);
    }
}
