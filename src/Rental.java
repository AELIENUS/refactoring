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

    private double getCharge()
    {
        double totalCharge = 0;
        switch (this.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                totalCharge += 2;
                if (this.getDaysRented() > 2)
                    totalCharge += (this.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                totalCharge += this.getDaysRented() * 3;
                break;
            case Movie.CHILDREN:
                totalCharge += 1.5;
                if (this.getDaysRented() > 3)
                    totalCharge += (this.getDaysRented() - 3) * 1.5;
                break;
        }
        return totalCharge;
    }
}