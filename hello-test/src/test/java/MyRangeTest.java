import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyRangeTest {
    @Test
    @DisplayName("ข้อมูล [1,5] result: true")
    public void startWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isStartWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5] result: false")
    public void startWithExclude() {
        MyRange myRange = new MyRange("(1,5]");
        boolean result = myRange.isStartWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] result: true")
    public void endWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isEndWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5) result: false")
    public void endWithExclude() {
        MyRange myRange = new MyRange("(1,5)");
        boolean result = myRange.isEndWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] result: 1")
    public void startNumberWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getStartNumber();
        assertEquals(1, result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] result: 5")
    public void endNumberWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getEndNumber();
        assertEquals(5, result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5] result: 2")
    public void startNumberWithExclude() {
        MyRange myRange = new MyRange("(1,5]");
        int result = myRange.getStartNumber();
        assertEquals(2, result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5) result: 4")
    public void endNumberWithExclude() {
        MyRange myRange = new MyRange("[1,5)");
        int result = myRange.getEndNumber();
        assertEquals(4, result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] result: 1,2,3,4,5")
    public void generateNumberStartWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        String result = myRange.generateNumber();
        assertEquals("1,2,3,4,5", result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5] result: 2,3,4,5")
    public void generateNumberStartWithExclude() {
        MyRange myRange = new MyRange("(1,5]");
        String result = myRange.generateNumber();
        assertEquals("2,3,4,5", result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5) result: 2,3,4")
    public void generateNumberStartWithExcludeAndEndWithExclude() {
        MyRange myRange = new MyRange("(1,5)");
        String result = myRange.generateNumber();
        assertEquals("2,3,4", result);
    }

}
