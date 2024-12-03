import java.util.List;

class Property {
    private String name;
    private double rentAmount;
    private String ownerName;
    private String location;

    public Property(String name, double rentAmount, String ownerName, String location) {
        this.name = name;
        this.rentAmount = rentAmount;
        this.ownerName = ownerName;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLocation() {
        return location;
    }

    public boolean isPremium() {
        return rentAmount > 2000;
    }

    public double calculateYearlyRent() {
        return rentAmount * 12;
    }

    public void printDetails() {
        System.out.println("Property: " + name);
        System.out.println("Rent Amount: $" + rentAmount);
        System.out.println("Owner: " + ownerName);
        System.out.println("Location: " + location);
        System.out.println("This is a " + (isPremium() ? "premium" : "standard") + " property.");
        System.out.println("Yearly Rent: $" + calculateYearlyRent());
        System.out.println("--------------------");
    }
}

class FinancialReport {
    private String reportTitle;
    private List<Property> properties;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = properties;
    }

    public void generateReport() {
        double totalRent = calculateTotalRent();
        printHeader();
        properties.forEach(Property::printDetails);
        printFooter(totalRent);
    }

    private void printHeader() {
        System.out.println("Financial Report: " + reportTitle);
        System.out.println("----------------------------");
    }

    private double calculateTotalRent() {
        return properties.stream().mapToDouble(Property::getRentAmount).sum();
    }

    private void printFooter(double totalRent) {
        System.out.println("Total Rent Amount: $" + totalRent);
    }
}

public class ReportGenerator {
    public static void main(String[] args) {
        List<Property> properties = List.of(
                new Property("Apartment A", 1500.0, "John Doe", "City Center"),
                new Property("House B", 2000.0, "Jane Smith", "Suburb"),
                new Property("Condo C", 1800.0, "Bob Johnson", "Downtown")
        );

        FinancialReport financialReport = new FinancialReport("Monthly Rent Summary", properties);
        financialReport.generateReport();
    }
}
