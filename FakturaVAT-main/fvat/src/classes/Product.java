package classes;

public class Product {

    private String nameOfProduct;
    private Double priceOfProduct;
    private Seller owner;
    private Integer availableUnits;
    private Integer idProduct;
    private Double vat;

    public Product() { }

    public Product(String nameOfProduct, Double priceOfProduct, Seller owner, Integer availableUnits, Integer idProduct, Double vat) {
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
        this.owner = owner;
        this.availableUnits = availableUnits;
        this.idProduct = idProduct;
        this.vat = vat;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Seller getOwner() {
        return owner;
    }

    public void setOwner(Seller owner) {
        this.owner = owner;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public Double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(Double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public Integer getAvailableUnits() {
        return availableUnits;
    }

    public void setAvailableUnits(Integer availableUnits) {
        this.availableUnits = availableUnits;
    }
}
