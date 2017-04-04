package Clases;

public class Data {

    //Define the max users in the system
    private int maxUsers = 50;
    private int maxProducts = 100;
    //We set the private object data to work with 50 users only
    private Users myUsers[] = new Users[maxUsers];
    private Product myProducts[] = new Product [maxProducts];
    //The first count of the users is 0
    private int userCount = 0;
    private int productCount = 0;

    //Crate a local user in the class
    public Data() {

        Users myUser;

        myUser = new Users("jalfons", "Juan Diego", "Alfonso Ocampo", "123", 1);
        myUsers[userCount] = myUser;
        userCount++;

        myUser = new Users("pepe", "Pedro", "Infante", "123", 1);
        myUsers[userCount] = myUser;
        userCount++;

        myUser = new Users("maria", "Maria", "Conchita", "123", 2);
        myUsers[userCount] = myUser;
        userCount++;

        Product myProduct;

        myProduct = new Product("1", "Coca-Cola", 1200, 0, "");
        myProducts[productCount] = myProduct;
        productCount++;

        myProduct = new Product("2", "Pepsi", 1200, 1, "Coca-Cola Competence");
        myProducts[productCount] = myProduct;
        productCount++;

        myProduct = new Product("3", "Cheetos", 1500, 0, "Delicious snacks of corn");
        myProducts[productCount] = myProduct;
        productCount++;
    }

    public int numUsers() {
        return userCount;
    }

    public int numProducts() {
        return productCount;
    }

    //Can use to obtain the data of users in another forms
    public Users[] getUsers() {
        return myUsers;
    }
       public Product[] getProducts() {
        return myProducts;
    }

    public boolean validateUser(String user, String pass) {
        boolean aux = false;
        for (int i = 0; i < userCount; i++) {
            if (myUsers[i].getIdUser().equals(user) && myUsers[i].getPassword().equals(pass)) {

                return true;

            }
        }

        return false;
    }
    
    //------------------------------------------------------------------------

    //Validatethe position of the user
    public int userPosition(String user) {
        for (int i = 0; i < userCount; i++) {
            if (myUsers[i].getIdUser().equals(user)) {
                return i;
            }
        }
        return -1;
    }
    
     //Validatethe position of the Product
    public int productPosition(String Product) {
        for (int i = 0; i < productCount; i++) {
            if (myProducts[i].getIdProduct().equals(Product)) {
                return i;
            }
        }
        return -1;
    }

    //------------------------------------------------------------------------
    
    //Method to add a user
    public String addUser(Users myUser) {
        if (userCount == maxUsers) {
            return "The maximum number of users has been reached";
        }
        myUsers[userCount] = myUser;
        userCount++;
        return "The Product is added successfully";

    }

    //Method to add a product
    public String addProduct(Product myProduct) {
        if (productCount == maxProducts) {
            return "The maximum number of users has been reached";
        }
        myProducts[productCount] = myProduct;
        productCount++;
        return "The Product is added successfully";

    }

    
    //------------------------------------------------------------------------
    //Method to modify a user
    public String modUser(Users myUser, int pos) {
        myUsers[pos].setName(myUser.getName());
        myUsers[pos].setLastName(myUser.getLastName());
        myUsers[pos].setPassword(myUser.getPassword());
        myUsers[pos].setProfile(myUser.getProfile());
        return "User modify correctly";
    }
    
    //Method to modify a product
    public String modProduct(Product myProduct, int pos) {
        myProducts[pos].setProductDescription(myProduct.getProductDescription());
        myProducts[pos].setProductPrice(myProduct.getProductPrice());
        myProducts[pos].setIva(myProduct.getIva());
        myProducts[pos].setNote(myProduct.getNote());

        return "Product modify correctly";
    }
    
    
    //------------------------------------------------------------------------
    
    //Method to delete the user
    public String deleteUser(int pos) {
        for (int i = pos; i > userCount - 1; i++) {
            myUsers[i] = myUsers[i + 1];
        }
        userCount--;
        return "User delete correctly";
    }
    
     //Method to delete the Product
    public String deleteProduct(int pos) {
        for (int i = pos; i > productCount - 1; i++) {
            myProducts[i] = myProducts[i + 1];
        }
        productCount--;
        return "Product delete correctly";
    }
}
