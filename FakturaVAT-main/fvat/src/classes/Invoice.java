package classes;

import java.time.LocalDate;
import java.util.List;

public class Invoice {

    private LocalDate releaseDate;
    private LocalDate sellDate;
    private LocalDate dueDate;
    private String numberOfTheInvoice;
    private List<InvoiceRow>rows;


    public List<InvoiceRow> getRows() {
        return rows;
    }


    public void setRows(List<InvoiceRow> rows) {
        this.rows = rows;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public LocalDate getSellDate() {
        return sellDate;
    }

    public void setSellDate(LocalDate sellDate) {
        this.sellDate = sellDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getNumberOfTheInvoice() {
        return numberOfTheInvoice;
    }

    public void setNumberOfTheInvoice(String numberOfTheInvoice) {
        this.numberOfTheInvoice = numberOfTheInvoice;
    }

    public Double getTotal(){
        double sum=0;
        for (InvoiceRow var : rows)
        {
            sum+=var.getPriceGross();
        }
        return sum;

    }
    public Double getTotalNet(){
        double sum2=0;
        for (InvoiceRow var : rows)
        {
            sum2+=var.getUnitPriceNet();
        }
        return sum2;

    }
}







