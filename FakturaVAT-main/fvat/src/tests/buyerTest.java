package tests;
import classes.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class buyerTest {

    private Buyer buyer;
    List<Product> productList = new ArrayList<>();



    @Before
    public void setUpAll() {
        buyer = new Buyer(1, "PolFis", "5832791440", "Błażej", "Szczesny", "bszczesny59@gmail.com");
        Seller seller = new Seller("X-KOM", "5577995544", "90 1160 2202 0000 0000 3154 4651", 1);
        Address address1 = new Address("Kartuzy", "Długa", "83-300", "3");
        Address address2 = new Address("Kiełpino", "Starowiejska", "83-307", "59");
        buyer.setAdressCompany(address1);
        seller.setAddress(address2);

        Product p = new Product("aa", 150.0, seller, 5, 1, 23.0);
        productList.add(p);
        p = new Product("bb", 100.00, seller, 3, 2, 23.0);
        productList.add(p);
        p = new Product("cc", 200.0, seller, 7, 1, 8.0);
        productList.add(p);
    }

    @Test
    public void addToBasketCorrect() {
        //is basket empty
        assertEquals(0, buyer.getBasket().size());

        buyer.addToBasket(productList.get(0), 1);
        assertEquals(1, buyer.getBasket().size());
        Integer element = buyer.getBasket().get(productList.get(0));
        Assert.assertNotNull(element);
        assertEquals(Integer.valueOf(1), element);

        buyer.addToBasket(productList.get(0), 1);
        Integer element2 = buyer.getBasket().get(productList.get(0));
        assertEquals(1, buyer.getBasket().size());
        Assert.assertNotNull(element2);
        assertEquals(Integer.valueOf(2), element2);

        buyer.addToBasket(productList.get(1), 1);
        Integer element3 = buyer.getBasket().get(productList.get(0));
        assertEquals(2, buyer.getBasket().size());
        Assert.assertNotNull(element3);
        assertEquals(Integer.valueOf(2), element3);


    }

    @Test
    public void deleteFromBasketCorrect() {
        assertEquals(0, buyer.getBasket().size());
        buyer.addToBasket(productList.get(0), 1);
        assertEquals(1, buyer.getBasket().size());
        buyer.deteleFromBasket(productList.get(0), 1);
        assertEquals(0, buyer.getBasket().size());

    }

    @Test
    public void cofirmTransactionTest() {
        Invoice invoice = buyer.cofirmTransaction();
        buyer.addToBasket(productList.get(0), 1);
        buyer.addToBasket(productList.get(1), 1);
        assertNotNull(invoice);

    }

    @Test
    public void getTotalTest(){
        buyer.addToBasket(productList.get(0), 1);
        buyer.addToBasket(productList.get(1),1);
        Invoice invoice = buyer.cofirmTransaction();
        Double ile=invoice.getTotal();
        assertEquals(new Double(307.50), ile);
    }

    @Test
    public  void  getTotalNet(){
        buyer.addToBasket(productList.get(0), 1);
        buyer.addToBasket(productList.get(1),1);
        Invoice invoice = buyer.cofirmTransaction();
        Double ile=invoice.getTotalNet();
        assertEquals(new Double(250.00), ile);
    }

    @Test
    public  void  GrossNet(){
        buyer.addToBasket(productList.get(0), 1);
        buyer.addToBasket(productList.get(1),1);
        Invoice invoice = buyer.cofirmTransaction();
        Double ile2=invoice.getTotal();
        Double ile=invoice.getTotalNet();
        Double result=ile2-ile;
        assertEquals(new Double(57.50), result);
    }

    @Test
    public void getInvoiceReleaseDateTest() {
        Invoice invoice=new Invoice();
        LocalDate date = LocalDate.now();
        invoice.setReleaseDate(date);
        LocalDate invoice1=invoice.getReleaseDate();
        assertEquals(date,invoice1);
    }

    @Test
    public void getInvoiceDueDateTest() {
        Invoice invoice=new Invoice();
        LocalDate date = LocalDate.now();
        invoice.setReleaseDate(date.plusDays(7));
        LocalDate invoice1=invoice.getReleaseDate();
        assertEquals(date.plusDays(7),invoice1);
    }

    @Test
    public void postCodeIsCorrect(){
        Address address = new Address("Kartuzy", "Długa", "83-300", "3");
        String add=address.getPostcode();
        assertEquals(6,add.length());
    }

    @Test
    public void unitsOfProductTest(){
        Product product=new Product();
        product.setAvailableUnits(7);
        Integer how= product.getAvailableUnits();
        assertEquals(new Integer(7), how);
    }
    @Test
    public void bankAccountNumberTest(){
        Seller seller = new Seller("X-KOM", "5577995544", "90 1160 2202 0000 0000 3154 4651", 1);
        String add= seller.getBankAccountNumber();
        String addd = add.replaceAll("\\s","");
        assertEquals(26,addd.length());
    }
    @Test
    public void taxNumberTest(){
        Seller seller = new Seller("X-KOM", "5577995544", "90 1160 2202 0000 0000 3154 4651", 1);
        String add= seller.getTaxNumber();
        String addd = add.replaceAll("\\s","");
        assertEquals(10,addd.length());
    }

}
