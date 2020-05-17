public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private final String Title;
    private int PriceCode;
    public Movie(String title, int priceCode) {
        Title = title;
        PriceCode = priceCode;
    }
    public int getPriceCode() {
        return PriceCode;
    }
    public void setPriceCode(int arg) {
        PriceCode = arg;
    }
    public String getTitle (){
        return Title;
    }
}