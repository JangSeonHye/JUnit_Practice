package GradeManagerTest;

import GradeManager.GradeManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeManagerTest {

    private GradeManager manager;

    @BeforeEach
    public void setup() {
        manager = new GradeManager();
    }

    @Test
    public void testAddGrade_ValidInput_Successful() {
        // Given
        String studentName = "Alice";
        int grade = 85;

        // When
        manager.addGrade(studentName, grade);

        // Then
        Assertions.assertEquals(1, manager.getGrades().size());
        Assertions.assertTrue(manager.getGrades().containsKey(studentName));
        Assertions.assertEquals(grade, manager.getGrades().get(studentName));
    }

    @Test
    public void testAddGrade_InvalidInput_AssertionErrorThrown() {
        // Given an invalid input with a blank student name and an out-of-range grade

        // When trying to add the invalid input

        // Then an AssertionError should be thrown

        Assertions.assertThrows(AssertionError.class, () -> manager.addGrade("", -10));
        Assertions.assertThrows(AssertionError.class, () -> manager.addGrade("Bob", 150));
    }

}
