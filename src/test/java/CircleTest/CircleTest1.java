import CircleCollection.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class CircleTest1
{
    @Test
    void assertTrueTest() throws Exception
    {
        Circle circleA = new Circle(0,0,10);
        Circle circleB = new Circle(10,0,10);
        assertTrue(circleA.reach(circleB));
    }

    @Test
    void assertFalseTest() throws Exception
    {
        Circle circleA = new Circle(0,0,10);
        Circle circleB = new Circle(30,0,10);
        assertFalse(circleA.reach(circleB));
    }
}
