class Rental {
    private final Movie Movie;
    private final int DaysRented;
    public Rental(Movie movie, int daysRented)
    {
        Movie = movie;
        DaysRented = daysRented;
    }
    public int getDaysRented()
    {
        return DaysRented;
    }
    public Movie getMovie()
    {
        return Movie;
    }
}