package Task;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class EpicTest {


    @Test
    public void epicMatchesPositiveTest() {
        String[] subtasks = {"Позвонить родителям"};
        Epic epic = new Epic(1, subtasks);

        boolean result = epic.matches("Позвонить");

        Assertions.assertTrue(result);
    }

    @Test
    public void epicMatchesNegativeTest() {
        String[] subtasks = {"Позвонить родителям"};
        Epic epic = new Epic(2, subtasks);

        boolean result = epic.matches("Написать");

        Assertions.assertFalse(result);
    }
    @Test
    public void getSubtasksShouldReturnCorrectSubtasks() {
        String[] subtasks = {"Подзадача 1", "Подзадача 2", "Подзадача 3"};
        Epic epic = new Epic(1, subtasks);

        String[] result = epic.getSubtasks();
        Assertions.assertArrayEquals(subtasks, result);
    }

}
