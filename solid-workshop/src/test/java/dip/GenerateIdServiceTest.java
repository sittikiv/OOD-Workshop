package dip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MockRandom extends Random {
    private int number;
    MockRandom(int number) {
        this.number = number;
    }

    @Override
    public int nextInt(int bound) {
        return this.number;
    }
}

class SpyRandom extends Random {
    private boolean called = false;
    private int counter = 0;

    @Override
    public int nextInt(int bound) {
        this.counter++;
        this.called = true;
        return 100;
    }
    public boolean isCalled() {
        return called;
    }

    public int vertify() {
        return  this.counter;
    }
}

class GenerateIdServiceTest {

    @Test
    public void called_nextInt_of_Random() {
        GenerateIdService service = new GenerateIdService();
        SpyRandom spy = new SpyRandom();
        service.setRandom(spy);
        service.getId();
        assertTrue(spy.isCalled());
        assertEquals(1, spy.vertify());
    }

    @Test
    @DisplayName("generateId")
    public void case01() {
        // Dependency Injection (Di)
        GenerateIdService service = new GenerateIdService();
        // GenerateIdService service = new GenerateIdService(new Random()); // 1. Constructor Injection
        // String result = service.getId(new Random()); // 2. Method Injection
        service.setRandom(new MockRandom(1)); // 3. Setter/Property/field Injection
        String result = service.getId();
        assertEquals("XXX1", result);
    }

}