
package Clases;

import Forms.frmLogin;


public class Class {
    

    public static void main(String[] args) {
        
        //Create the object data
        Data myData = new Data();
       
        //Call form  login to set visible
        frmLogin myLogin = new frmLogin();
        myLogin.setData(myData);
        myLogin.setLocationRelativeTo(null);
        myLogin.setVisible(true);
    }
    
}
