package classes;
import java.time.LocalDate;
import java.util.*;

public class Buyer {
    private Integer idBuyer;
    private String companyName;
    private Address adressCompany;
    private String taxNumber;
    private String name;
    private String surname;
    private String email;
    Map<Product, Integer> basket;


    //mapa przechowuje pary obiektów, pierwszy to klucz, drugi to wartość
    //klucze muszą być unikalne

    public Invoice cofirmTransaction() {
        List<InvoiceRow> rows = new ArrayList<>();

        Invoice invoice=new Invoice();

        LocalDate date = LocalDate.now();

        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

        invoice.setReleaseDate(date);
        invoice.setDueDate(date.plusDays(7));

        invoice.setSellDate(date);
        invoice.setNumberOfTheInvoice(randomUUIDString);


        for (Map.Entry<Product, Integer> entry : basket.entrySet()) {

            InvoiceRow invoiceRow=new InvoiceRow();

            invoiceRow.setNameOfProduct(entry.getKey().getNameOfProduct());
            invoiceRow.setPriceAmount(entry.getKey().getPriceOfProduct());
            invoiceRow.setUnitPriceNet(entry.getKey().getPriceOfProduct());
            invoiceRow.setVat(entry.getKey().getVat()/100);

            double brutto=entry.getKey().getPriceOfProduct()+(entry.getKey().getPriceOfProduct()*(entry.getKey().getVat()/100));

            invoiceRow.setPriceGross(brutto);
            invoiceRow.setVolumeProduct(entry.getValue().intValue());

            rows.add(invoiceRow);
        }
        invoice.setRows(rows);

        return invoice;
    }

    public Buyer(Integer idBuyer, String companyName, String taxNumber, String name, String surname, String email) {
        this.idBuyer = idBuyer;
        this.companyName = companyName;
        this.taxNumber = taxNumber;
        this.name = name;
        this.surname = surname;
        this.email = email;
        basket = new HashMap();
    }

    public Address getAdressCompany() {
        return adressCompany;
    }

    public void setAdressCompany(Address adressCompany) {
        this.adressCompany = adressCompany;
    }

    public void addToBasket(Product item, Integer productsNumber) {
        Integer element = basket.get(item);
        if (element==null) {
            basket.put(item, productsNumber);
        }
        else {
            basket.replace(item, element, element+productsNumber);
        }

    }

    public void deteleFromBasket(Product item, Integer productsNumber){
        basket.remove(item, productsNumber);
    }

    public Map<Product, Integer> getBasket() {
        return basket;
    }


    public void setBasket(Map<Product, Integer> basket) {
        this.basket = basket;
    }

    public Integer getIdBuyer() {
        return idBuyer;
    }

    public void setIdBuyer(Integer idBuyer) {
        this.idBuyer = idBuyer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



}
