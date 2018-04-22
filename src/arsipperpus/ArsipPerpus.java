/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsipperpus;
import arsipperpus.intfce.BahanBaru;
import arsipperpus.intfce.login;
import java.sql.SQLException;

public class ArsipPerpus {

    
    public static void main(String[] args) throws SQLException {
//        Controller ctr = new Controller(); //uncomment ini kalo mau pake controller
        
        login lg = new login();
        lg.setVisible(true);
        
    
    
    }
}
