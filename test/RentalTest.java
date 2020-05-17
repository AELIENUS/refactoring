import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentalTest {

    private Rental rental;
    private Movie movie;

    @BeforeEach
    void setUp() {
        movie = new Movie("lol123", 0);
        rental = new Rental(movie, 69);
    }

    @Test
    void getDaysRented() {
        assertEquals(69, rental.getDaysRented());
    }

    @Test
    void getMovie() {
        assertEquals(movie, rental.getMovie());
    }
}