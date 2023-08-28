import CircleCollection.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CircleTest2
{
    @Test
    void assertEqualsTest() throws Exception
    {
        Circle circleA = new Circle(0,0,10);
        Circle circleB = new Circle(0,0,10);
        assertEquals(circleA, circleB);
    }

    @Test
    void assertNotEqualsTest() throws Exception
    {
        Circle circleA = new Circle(0,0,10);
        Circle circleB = new Circle(10,0,10);
        assertNotEquals(circleA, circleB);
    }
}