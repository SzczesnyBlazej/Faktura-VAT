package classes;

import java.util.List;

public class Seller{
    private String companyName;
    private Address address;
    private String taxNumber;
    private String bankAccountNumber;
    private Integer idSeller;
    List<Product> productList;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Seller(String companyName, String taxNumber, String bankAccountNumber, Integer idSeller) {
        this.companyName = companyName;
        this.taxNumber = taxNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.idSeller = idSeller;
        this.address = new Address();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public Integer getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(Integer idSeller) {
        this.idSeller = idSeller;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
}