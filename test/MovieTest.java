import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    private Movie movie;

    @BeforeEach
    void setUp() {
        movie = new Movie("lol123", 0);
    }

    @Test
    void getPriceCode() {
        assertEquals(0, movie.getPriceCode());
    }

    @Test
    void getTitle() {
        assertEquals("lol123", movie.getTitle());
    }

    @Test
    public void getCharge()
    {
        assertEquals(14.0, movie.getCharge(10), 0);
    }

}