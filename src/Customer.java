import java.lang.String;
import java.util.*;

class Customer {
    private final String Name;
    private final List<Rental> rentals = new ArrayList<>();
    public Customer (String name)
    {
        Name = name;
    }

    public void addRental(Rental rental)
    {
        rentals.add(rental);
    }

    public String getName ()
    {
        return Name;
    }

    public String statement()
    {
        StringBuilder result = new StringBuilder("Rental Record for " + this.getName() + "\n");
        result.append("\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n");

        for(Rental rental:rentals)
        {
            result.append("\t" + rental.getMovie().getTitle()+ "\t" + "\t" + rental.getDaysRented() + "\t" + String.valueOf(rental.getCharge()) + "\n");
        }

        //add footer lines
        result.append("Amount owed is ").append(this.getTotalCharge()).append("\n");
        result.append("You earned ").append(this.getTotalFrequentRenterPoints()).append(" frequent renter points");
        return result.toString();
    }

    private double getTotalCharge()
    {
        double totalCharge = 0;
        for(Rental rental: rentals)
        {
            totalCharge = totalCharge + rental.getCharge();
        }
        return totalCharge;
    }

    private int getTotalFrequentRenterPoints()
    {
        int points = 0;
        for(Rental rental : rentals)
        {
            points += rental.getFrequentRenterPoints();
        }
        return points;
    }
}
    