package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void beforeAll() {

    }

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Alaa"));
    }

    @AfterEach
    void tearDown() {

    }

    @AfterAll
    static void afterAll() {

    }
}