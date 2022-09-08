/*Name: |Evans, Amber 	CMIS 141/7380 	Date: (05/10/2022)
   This program will create a class for the Customer*/

public class Customer { // three attributes for the customer
    private String name;
    private int id;
    private int totalSales;

    // constructor
    public Customer(String name, int id, int totalSales) {
        this.name = name;
        this.id = id;
        this.totalSales = totalSales;
    }

    // methods to return the attributes we are looking for
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getTotalSales() {
        return totalSales;
    }

    // override the toString() method to the string of Customer information
    public String toString() {
        return "Customer Name: "+name+" Id: "+id+", Total Sales: "+totalSales;
    }
}
