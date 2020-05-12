import java.sql.Driver;

public class car {
    Integer id;
    String license;
    Account driver;
    Integer passegenger;

    //Contructor
    public car(String license, Account driver){
        this.driver = driver;
        this.license = license;
    }
    void displayData(){
        System.out.println("Driver: " + driver.name + "\tLicense: " + license );
    }

}