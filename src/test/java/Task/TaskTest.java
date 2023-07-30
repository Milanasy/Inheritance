package Task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {


    @Test
    public void equalsObjectTest() {
        int id = 1;
        Task task = new Task(id);
        boolean result = task.equals(task);

        Assertions.assertTrue(result);
    }

    @Test
    public void notEqualsObjectTest() {
        int id = 1;
        Task task = new Task(id);
        Task task2 = new Task(id);

        boolean result = task.equals(task2);

        Assertions.assertTrue(result);
    }

    @Test
    public void idIsNotEqualsTest() {
        int id = 1;
        int id2 = 2;
        Task task = new Task(id);
        Task task2 = new Task(id2);

        boolean result = task.equals(task2);

        Assertions.assertFalse(result);
    }

    @Test
    public void idIsEqualsTest() {
        int id = 1;
        int id2 = 1;
        Task task = new Task(id);
        Task task2 = new Task(id2);

        boolean result = task.equals(task2);

        Assertions.assertTrue(result);
    }

    @Test
    public void getIdTest() {
        int id = 1;
        Task task = new Task(id);
        int result = task.getId();

        Assertions.assertEquals(1, result);
    }

    @Test
    public void nullObjectTest() {
        int id = 1;
        Task task = new Task(id);
        boolean result = task.equals(null);

        Assertions.assertFalse(result);

    }

    @Test
    public void sameIdShouldHaveSameHashCodeTest() {
        Task task1 = new Task(1);
        Task task2 = new Task(1);
        Assertions.assertEquals(task1.hashCode(), task2.hashCode());
    }

    @Test
    public void testMatchesTest() {
        Task task = new Task(1);

        boolean result = task.matches("some query");

        Assertions.assertFalse(result);
    }

}