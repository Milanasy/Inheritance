package Task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTaskTest {


    @Test
    public void simpleTaskMatchesTest() {
        SimpleTask simpleTask = new SimpleTask(1, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");

        Assertions.assertTrue(actual);
    }

    @Test
    public void simpleTaskNotMatchesTest() {
        SimpleTask simpleTask = new SimpleTask(2, "Позвонить родителям");

        boolean actual = simpleTask.matches("Написать");

        Assertions.assertFalse(actual);
    }
    @Test
    public void getTitleShouldReturnCorrectTitle() {
        String title = "Позвонить родителям";
        SimpleTask simpleTask = new SimpleTask(1, title);

        String result = simpleTask.getTitle();
        Assertions.assertEquals(title, result);
    }

}


