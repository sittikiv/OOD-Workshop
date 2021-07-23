import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    @Test
    @DisplayName("Call name")
    public void case01() {
        Hello hello = new Hello();
        String name = "Test";
        String result = hello.callName(name);
        assertEquals("Hello Test", result);
    }
}