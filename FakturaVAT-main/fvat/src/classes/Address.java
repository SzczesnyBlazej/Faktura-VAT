package classes;

public class Address {
    private String town;
    private String street;
    private String postcode;

    public Address(String town, String street, String postcode, String homeNumber) {
        this.town = town;
        this.street = street;
        this.postcode = postcode;
        this.homeNumber = homeNumber;
    }

    private String homeNumber;

    public Address() {

    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }
}
