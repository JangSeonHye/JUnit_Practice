package CircleTest;

import CircleCollection.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    assertNull || assertNotNull
        actual이 null/notNull인지 확인

    void assertNull(Object actual)
        || void assertNotNull(Object actual)
 */

public class CircleTest4
{
    @Test
    void assertNullTest() throws Exception
    {
        Circle circle = null;
        assertNull(circle);
    }

    @Test
    void assertNotNullTest() throws Exception
    {
        Circle circle = new Circle(0,0,10);
        assertNotNull(circle);
    }
}
