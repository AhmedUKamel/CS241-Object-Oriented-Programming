package javafxproject;
public class User {
    private String username;
    private String mail;
    private String password;
    
    // Constructors
    public User(String u, String m, String p){
        this.username = u;
        this.mail = m;
        this.password = p;
    }
    
    // Getters
    public String getUserName(){
        return this.username;
    }
    
    public String getMail(){
        return this.mail;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    // toString
    public String toString(){
        return  "Username : " + this.username +
                "\nPassword : " + this.password +
                "\nE-Mail : " + this.mail;
    }
}