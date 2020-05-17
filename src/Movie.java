public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private final String Title;
    private Price Price;

    public Movie(String title, int priceCode) {
        Title = title;
        setPriceCode(priceCode);
    }
    public int getPriceCode() {
        return Price.getPriceCode();
    }
    public void setPriceCode(int priceCode) {
        switch(priceCode)
        {
            case REGULAR:
                Price = new RegularPrice();
                break;
            case CHILDREN:
                Price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                Price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("PriceCode not in existence!");

        }
    }
    public String getTitle (){
        return Title;
    }

    public double getCharge(int daysRented) {
        return Price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented)
    {
        return Price.getFrequentRenterPoints(daysRented);
    }
}