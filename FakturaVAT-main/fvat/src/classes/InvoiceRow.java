package classes;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRow{
    private String nameOfProduct;
    private Integer volumeProduct;
    private Double unitPriceNet;
    private Double priceAmount;
    private Double vat;
    private Double priceGross;


    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public Integer getVolumeProduct() {
        return volumeProduct;
    }

    public void setVolumeProduct(Integer volumeProduct) {
        this.volumeProduct = volumeProduct;
    }

    public Double getUnitPriceNet() {
        return unitPriceNet;
    }

    public void setUnitPriceNet(Double unitPriceNet) {
        this.unitPriceNet = unitPriceNet;
    }

    public Double getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(Double priceAmount) {
        this.priceAmount = priceAmount;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public Double getPriceGross() {
        return priceGross;
    }

    public void setPriceGross(Double priceGross) {
        this.priceGross = priceGross;
    }
}
