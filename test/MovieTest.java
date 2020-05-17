import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    private Movie movie;

    @BeforeEach
    void setUp() {
        movie = new Movie("lol123", 123);
    }

    @Test
    void getPriceCode() {
        assertEquals(123, movie.getPriceCode());
    }

    @Test
    void getTitle() {
        assertEquals("lol123", movie.getTitle());
    }
}