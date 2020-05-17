public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private final String Title;
    private Price Price;
    private int PriceCode;

    public Movie(String title, int priceCode) {
        Title = title;
        PriceCode = priceCode;
    }
    public int getPriceCode() {
        return PriceCode;
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
        PriceCode = priceCode;
    }
    public String getTitle (){
        return Title;
    }
}