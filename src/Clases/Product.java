package Clases;

public class Product {

    private String idProduct;
    private String productDescription;
    private int productPrice;
    private int iva; //0 =0 %; 1 % 10%, 2 = 16%
    private String note;

    public Product(String idProduct, String productDescription, int productPrice, int iva, String note) {
        this.idProduct = idProduct;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.iva = iva;
        this.note = note;
    }

    public Product(String text, String text0, int price, int selectedIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

 

}
