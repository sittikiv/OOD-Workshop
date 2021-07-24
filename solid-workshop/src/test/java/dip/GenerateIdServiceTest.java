package dip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateIdServiceTest {
    @Test
    @DisplayName("generateId")
    public void case01() {
        String result = new GenerateIdService().getId();
        assertEquals("XXX1", result);
    }

}