import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {
    TaskManager taskManager = new TaskManager();

    @Test
    @Timeout(5)
    void testLongRunningTaskTimeout() {
        assertEquals("Task Completed", taskManager.longRunningTask());
    }
}
