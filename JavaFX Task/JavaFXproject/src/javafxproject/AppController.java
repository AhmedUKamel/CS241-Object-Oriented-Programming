package javafxproject;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.ArrayList;
/*
 * @author Ahmed Hatem Mohammed
 */
public class AppController implements Initializable {
    
    // Users Container
    private ArrayList<User>storeUsers = new ArrayList<User>();
    
    // Labels
    @FXML
    private Label label;
    @FXML
    private Label label2;
    
    // Buttons
    @FXML
    private TextField username_txt;
    @FXML
    private TextField mail_txt;
    @FXML
    private TextField pass1_txt;
    @FXML
    private TextField pass2_txt;
    @FXML
    private TextField usrlog_txt;
    @FXML
    private TextField paslog_txt;
    
    // Functions
    @FXML
    private void confirmButton(){

        // Get inputs
        String username = username_txt.getText();
        String mail = mail_txt.getText();
        String pass1 = pass1_txt.getText();
        String pass2 = pass2_txt.getText();
        
        // Flags
        boolean flag1 = true, flag2 = false, flag3 = true, flag4 = true;
        
        // Check TextFields
        if(username.length()==0 || mail.length()==0 || pass1.length()==0 || pass2.length()==0)
            flag1 = false;
        
        // Check Passwords
        if(pass1.equals(pass2)) flag2 = true;
        
        // Check Username
        for(int i = 0; i < storeUsers.size(); i++){
            if(storeUsers.get(i).getUserName().equals(username))
                flag3 = false; break;
        }
        
        // Check E-Mails
        for(int i = 0; i < storeUsers.size(); i++){
            if(storeUsers.get(i).getMail().equals(mail))
                flag4 = false; break;
        }
        
        if(!flag1) label.setText("Empty Field");
        else if (!flag2) label.setText("Password doesn't match");
        else if (!flag3) label.setText("Username " + username + " is already exist"); 
        else if (!flag4) label.setText("E-Mail " + mail + " is already exist");
        else {
            storeUsers.add(new User(username, mail, pass1));
            label.setText("User registered successfully");
        }
    }
    
    @FXML
    private void resetButton(){
        username_txt.setText("");
        mail_txt.setText("");
        pass1_txt.setText("");
        pass2_txt.setText("");
    }
    
    @FXML
    private void loginButton(){
        String username = usrlog_txt.getText();
        String password = paslog_txt.getText();
        
        for(int i = 0; i < storeUsers.size(); i++){
            if(storeUsers.get(i).getUserName().equals(username)){
                if(storeUsers.get(i).getPassword().equals(password))
                    label2.setText("User Logged in successfully");
                else
                    label2.setText("Icorrect Password for " + username);
            } else {
                label2.setText(username + " no found");
            }
                
        }
    }
    
    @FXML
    private void forgetButton(){
        String username = usrlog_txt.getText();
        String password = paslog_txt.getText();
        
        for(int i = 0; i < storeUsers.size(); i++){
            if(storeUsers.get(i).getUserName().equals(username)){
                label2.setText("Enter yout E-Mail in Password Field");
                if(storeUsers.get(i).getMail().equals(password)){
                    label2.setText("Authentication successful");
                    paslog_txt.setText(storeUsers.get(i).getPassword());
                }
                else
                    label2.setText("Icorrect E-Mail");
            } else {
                label2.setText(username + " no found");
            }
                
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}