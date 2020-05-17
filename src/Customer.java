import java.lang.String;
import java.util.*;

class Customer {
    private final String Name;
    private final Vector<Rental> rentals = new Vector<>();
    public Customer (String name)
    {
        Name = name;
    }

    public void addRental(Rental arg)
    {
        rentals.addElement(arg);
    }

    public String getName ()
    {
        return Name;
    }

    public String statement()
    {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        var enum_rentals = rentals.elements();

        StringBuilder result = new StringBuilder("Rental Record for " + this.getName() + "\n");
        result.append("\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n");

        while (enum_rentals.hasMoreElements()) {
            Rental rental = (Rental)enum_rentals.nextElement();

            // add frequent renter points
            frequentRenterPoints ++;
            // add bonus for a two day new release rental
            if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1)
                frequentRenterPoints ++;
            //show figures for this rental
            result.append("\t").append(rental.getMovie().getTitle()).append("\t").append("\t").append(rental.getDaysRented()).append("\t").append(rental.getCharge()).append("\n");
            totalAmount += rental.getCharge();
        }
        //add footer lines
        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");
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
}
    