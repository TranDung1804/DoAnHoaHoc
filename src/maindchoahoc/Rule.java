/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maindchoahoc;


import java.util.ArrayList;
import javax.management.Query;
import static javax.swing.UIManager.get;

/**
 *
 * @author Tran Tien Dung
 */
public class Rule {
        private String name;
        private ArrayList<String> giathiet;
        private ArrayList<String> ketluan;
        ArrayList<String> Giathiet;
        ArrayList<String> KetLuan;
        
        public  String Ten()
        {
            return name;
        }
        public ArrayList<String> GiaThiet()
        {
            return giathiet;
        }
        
        public ArrayList<String> KetLuan()
        {
            return ketluan;
        }
        public Rule()
        {
            giathiet = null;
            ketluan = null;
            name = null;
        }
        
        public Rule(ArrayList<String> GT, ArrayList<String> KL, String ten){
            giathiet = GT;
            ketluan = KL;
            name = ten;
        }
}
