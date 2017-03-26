
package Clases;

public class Data {
    
    //We set the private object data to work with 50 users only
    private Users myUsers[]= new Users[50];
    //The first count of the users is 0
    private int userCount = 0;
    
    //Crate a local user in the class
    public Data(){
           Users myUser = new Users("jalfons", "Juan Diego", "Alfonso Ocampo", "123", 1);
           myUsers[userCount] = myUser; 
           userCount++;
    }
    
    //Can use to obtain the data of users in another forms
    public Users[] getUsers (){
        return myUsers;
    }
       
    public boolean validateUser (String user, String pass){
       boolean aux  = false;
        for (int i = 0; i < userCount; i++) {
           if (myUsers[i].getIdUser().equals(user) && myUsers[i].getPassword().equals(pass)){
               
               return true;
            
                 }      
           }       
              
                return false;
    }
 }

