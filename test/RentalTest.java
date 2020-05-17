import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentalTest {

    private Rental rental;
    private Movie movie;

    @BeforeEach
    void setUp() {
        movie = new Movie("lol123", 0);
        rental = new Rental(movie, 10);
    }

    @Test
    void getDaysRented() {
        assertEquals(10, rental.getDaysRented());
    }

    @Test
    void getMovie() {
        assertEquals(movie, rental.getMovie());
    }

    @Test
    void getFrequentRenterPoints(){
        assertEquals(1, rental.getFrequentRenterPoints());
    }

    @Test
    void getCharge()
    {
        assertEquals(14.0, rental.getCharge(), 0);
    }
}