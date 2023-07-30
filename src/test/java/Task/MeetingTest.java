package Task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MeetingTest {

    @Test

    public void meetingMatchesPositiveTopicTest() {
        Meeting meeting = new Meeting(1, "Выкатка 3й версии", "Приложение НетоБанк", "Во вторник после обеда");

        boolean result = meeting.matches("Выкатка");
        Assertions.assertTrue(result);
    }

    @Test
    public void meetingMatchesPositiveProjectTest() {
        Meeting meeting = new Meeting(2, "Выкатка 3й версии", "Приложение НетоБанк", "Во вторник после обеда");

        boolean result = meeting.matches("НетоБанк");
        Assertions.assertTrue(result);
    }

    @Test
    public void meetingMatchesNegativeTest() {
        Meeting meeting = new Meeting(3, "Выкатка 3й версии", "Приложение НетоБанк", "Во вторник после обеда");


        boolean result = meeting.matches("Планироавние");
        Assertions.assertFalse(result);
    }


    @Test
    public void getTopicShouldReturnCorrectValue() {
        String topic = "Выкатка 3й версии";
        Meeting meeting = new Meeting(1, topic, "Приложение НетоБанк", "Во вторник после обеда");

        String result = meeting.getTopic();
        Assertions.assertEquals(topic, result);
    }

    @Test
    public void getProjectShouldReturnCorrectValue() {
        String project = "Приложение НетоБанк";
        Meeting meeting = new Meeting(2, "Выкатка 3й версии", project, "Во вторник после обеда");

        String result = meeting.getProject();
        Assertions.assertEquals(project, result);
    }

    @Test
    public void getStartShouldReturnCorrectValue() {
        String start = "Во вторник после обеда";
        Meeting meeting = new Meeting(3, "Выкатка 3й версии", "Приложение НетоБанк", start);

        String result = meeting.getStart();
        Assertions.assertEquals(start, result);
    }
}
