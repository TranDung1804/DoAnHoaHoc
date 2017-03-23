
package maindchoahoc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ConnectData.*;

/**
 *
 * @author Tran Tien Dung
 */
public class Panel1 extends javax.swing.JPanel {

    /**
     * Creates new form Panel1
     */
    public Panel1() {
        initComponents();
        input_gt = new ArrayList<>();
        input_Kl = new ArrayList<>();
        RuleList = new ArrayList<>();
        jLabel4.setText("");
        String sql = "";
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        list1 = new java.awt.List();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Chất Tham Gia (ví dụ: H2 , O2):");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setName("txtInput_Giathiet"); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Chất Sản Phẩm (ví dụ: H2O):");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Điều chế");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        list1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        list1.setForeground(java.awt.Color.red);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Điều chế Chất Hóa Học", "Tìm kiếm phương trình" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("jLabel4");

        jLabel3.setText("Thông tin:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Kết Quả:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Chế độ:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(list1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

                       
                                        

                                        
                      

    /**
     * @param args the command line arguments
     */
    ArrayList<Rule> RuleList = new ArrayList<>();

    private void XuLyFile() throws FileNotFoundException {

        try {
            RuleList = new ArrayList<>();
            FileInputStream fis = new FileInputStream("Rule.txt");
            Scanner scan = new Scanner(fis);

            while (scan.hasNextLine()) {
                ArrayList<String> gt_list = new ArrayList<>();
                ArrayList<String> kl_list = new ArrayList<>();
                String line = scan.nextLine();
                //Xu ly ten luat
                int index = line.indexOf(":");
                String name = line.substring(0, index);

                //Xu ly gia thiet 
                String Suppose;
                Suppose = line.substring(index + 1, line.indexOf("-") - 1).trim();
                while (Suppose.contains("+")) {
                    gt_list.add(Suppose.substring(0, Suppose.indexOf("+") - 1).trim());
                    Suppose = Suppose.substring(Suppose.indexOf("+") + 1).trim();

                }
                gt_list.add(Suppose);
                String conclusion = line.substring(line.indexOf(">") + 1).trim(); // gán từ ký tự > cho đến hết
                while (conclusion.contains("+")) {
                    kl_list.add(conclusion.substring(0, conclusion.indexOf("+") - 1).trim());
                    conclusion = conclusion.substring(conclusion.indexOf("+") + 1).trim();
                }
                kl_list.add(conclusion.trim());

                // Gọi constructor tạo Rule
                Rule newRule = new Rule(gt_list, kl_list, name);

                RuleList.add(newRule);
            }
        } catch (FileNotFoundException ex) {
        }

    }
//   
    ArrayList<Rule> ruleList_CB = new ArrayList<>();

    private void XuLyFile_CB() throws FileNotFoundException, IOException {

        try {
            ruleList_CB = new ArrayList<>();
            File f = new File("Rule_CB.txt");
            FileReader in = new FileReader(f);
            BufferedReader br = new BufferedReader(in);
            String line;
            while ((line = br.readLine()) != null) {
                ArrayList<String> gt_list = new ArrayList<>();
                ArrayList<String> kl_list = new ArrayList<>();
                //Xu ly ten luat
                int index = line.indexOf(":");
                String name = line.substring(0, index);

                //Xu ly gia thiet 
                String Suppose = line.substring(index + 1, line.indexOf("-") - 1).trim();
                while (Suppose.contains("+")) {
                    gt_list.add(Suppose.substring(0, Suppose.indexOf("+") - 1).trim());
                    Suppose = Suppose.substring(Suppose.indexOf("+") + 1).trim();

                }
                gt_list.add(Suppose);
                String conclusion = line.substring(line.indexOf(">") + 1).trim(); // gán từ ký tự > cho đến hết
                while (conclusion.contains("+")) {
                    kl_list.add(conclusion.substring(0, conclusion.indexOf("+") - 1).trim());
                    conclusion = conclusion.substring(conclusion.indexOf("+") + 1).trim();
                }
                kl_list.add(conclusion.trim());

                // Gọi constructor tạo Rule
                Rule newRule = new Rule(gt_list, kl_list, name);

                ruleList_CB.add(newRule);
            }
        } finally {

        }
    }

    //xu ly input gia thiet
    ArrayList<String> input_gt = new ArrayList<>();

    private void XulyInput_giathiet() {
        input_gt = new ArrayList<>();
        String input_giathiet = jTextField1.getText();
        while (input_giathiet.contains(",")) // nếu không tìm thấy dấu "," thì dừng (hàm đó k tìm thấy trả về -1 )
        {
            input_gt.add(input_giathiet.substring(0, input_giathiet.indexOf(",")).trim()); // lấy phần tử đầu -> dấu phẩy
            input_giathiet = input_giathiet.substring(input_giathiet.indexOf(",") + 1).trim();// gán từ dấu phẩy -> cuối
        }
        input_gt.add(input_giathiet);
    }

    //xu ly input ket luan
    ArrayList<String> input_Kl = new ArrayList<>();

    private void XulyInput_ketluan() {
        input_Kl = new ArrayList<>();
        String input_ketluan = jTextField2.getText().trim();
        while (input_ketluan.contains(",")) {
            input_Kl.add(input_ketluan.substring(0, input_ketluan.indexOf(",")).trim());
            input_ketluan = input_ketluan.substring(input_ketluan.indexOf(",") + 1).trim();
        }
        input_Kl.add(input_ketluan);
    }

    // hàm kiểm tra, so sánh chuỗi
    private boolean Kiemtra(ArrayList<String> base_giathiet, ArrayList<String> ketluan) {

        int count = 0;

        for (int i = 0; i < base_giathiet.size(); i++) {

            for (int j = 0; j < ketluan.size(); j++) {
                if (base_giathiet.get(i).equalsIgnoreCase(ketluan.get(j))) // kiểm tra trùng hết các ký tự
                {

                    count++;
                    break;
                }
            }

        }
        if (count == ketluan.size()) // nếu đếm đủ thì trả về true
        {
            return true;
        } else {
            return false;
        }
    }

    private boolean Kiemtra_Lui(ArrayList<String> base_giathiet, ArrayList<String> ketluan) {
        for (int i = 0; i < base_giathiet.size(); i++) {

            for (int j = 0; j < ketluan.size(); j++) {
                if ((base_giathiet.get(i)).equalsIgnoreCase(ketluan.get(j))) {

                    return true;
                }

            }

        }
        return false;
    }

    //bộ lọc các luât
    private void Filter(ArrayList<String> input, ArrayList<String> output) {
        for (int i = 0; i < output.size(); i++) {
            boolean k = true;
            for (int j = 0; j < input.size(); j++) {
                if (input.get(j).equalsIgnoreCase(output.get(i))) {
                    k = false;
                    break;
                }
            }
            if (k) {
                input.add(output.get(i));
            }
        }
    }
    ArrayList<Rule> LoiGiai = new ArrayList<>();

    private void SuyDienTien() {
        ArrayList<String> input = input_gt;
        LoiGiai = new ArrayList<>();
        ArrayList<Rule> XuLy = RuleList;
        while (!Kiemtra(input, input_Kl) && !XuLy.isEmpty()) {
            int i;
            for (i = 0; i < XuLy.size(); i++) {
                //Rule t = XuLy.get(i);
                if (Kiemtra(input, XuLy.get(i).GiaThiet())) {
                    LoiGiai.add(XuLy.get(i));
                    Filter(input, XuLy.get(i).KetLuan());
                    XuLy.remove(XuLy.get(i));
                    i = 0;
                    break;
                }
            }
            if (i == XuLy.size()) {
                break;
            }
        }

        //   JOptionPane.showMessageDialog(rootPane," Có tổng số " + dem);
    }

    ArrayList<Rule> LoiGiaiRutGon = new ArrayList<>();

    private void SuyDienLui() { // dùng để rút gọn lời giải của suy diễn tiến
        SuyDienTien();
        input_gt = new ArrayList<>();
        XulyInput_giathiet();
        ArrayList<String> dich = input_Kl;
        LoiGiaiRutGon = new ArrayList<>();
        ArrayList<Rule> XuLy_lui = LoiGiai; // gán list XuLy_Lui = list lời giải của suy diễn tiến
        while (!Kiemtra(dich, input_gt) && XuLy_lui.size() != 0) {
            int i;
            for (i = 0; i != XuLy_lui.size(); i++) {
                if (Kiemtra_Lui(XuLy_lui.get(i).KetLuan(), dich)) {
                    LoiGiaiRutGon.add(XuLy_lui.get(i));
                    Filter(dich, XuLy_lui.get(i).GiaThiet());
                    XuLy_lui.remove(XuLy_lui.get(i));
                    i = 0;
                    break;
                }
            }
            if (i == XuLy_lui.size()) {
                break;
            }
        }
    }

    private void XuatKetQua(ArrayList<Rule> kq) {

        String str;
        int dem = 0;
        // if (Kiemtra(input, input_Kl))
        // {
        for (int k = kq.size() - 1; k >= 0; k--) {
            for (int m = 0; m < ruleList_CB.size(); m++) {
                if (kq.get(k).Ten().equalsIgnoreCase(ruleList_CB.get(m).Ten())) {
                   // str = ruleList_CB.get(m).getTen() + ": ";
                    str = "       ";
                    dem += 1;
                    for (int i = 0; i < ruleList_CB.get(m).GiaThiet().size(); i++) {
                        //  if (i >= 1)
                        if (ruleList_CB.get(m).GiaThiet().size() == 1 || i == ruleList_CB.get(m).GiaThiet().size() - 1) {
                            str = str + ruleList_CB.get(m).GiaThiet().get(i);
                        } else {
                            str = str + ruleList_CB.get(m).GiaThiet().get(i) + " + ";
                        }

                    }
                    // str = str.Substring(0, str.Length);
                    str = str + " -> ";
                    for (int j = 0; j < ruleList_CB.get(m).KetLuan().size(); j++) {
                        if (j == ruleList_CB.get(m).KetLuan().size() - 1) {
                            str = str + ruleList_CB.get(m).KetLuan().get(j);
                        } else {
                            str = str + ruleList_CB.get(m).KetLuan().get(j) + " + ";
                        }
                    }

                    list1.add(str);
                    break;
                }
            }
        }
        //    }
        jLabel4.setText("Có " + dem + " phương trình");
    }

    ArrayList<Rule> listTimKiem = new ArrayList<>();

    //Hàm tìm kiếm phương trình với 1 input nhập vào
    private void Find_GT() {
        ArrayList<String> input = input_gt;
        listTimKiem = new ArrayList<>();
        ArrayList<Rule> XuLy = RuleList;
        // vòng lặp để kiểm tra và thêm lời giải
        for (int i = 0; i < XuLy.size(); i++) {
            if (Kiemtra(XuLy.get(i).GiaThiet(), input)) {
                listTimKiem.add(XuLy.get(i));

            }
        }
    }

    private void Find_KL() {
        ArrayList<String> output = input_Kl;
        listTimKiem = new ArrayList<>();
        ArrayList<Rule> XuLy = RuleList;
        // vòng lặp để kiểm tra và thêm phương trình vào lời giải
        for (int i = 0; i < XuLy.size(); i++) {
            if (Kiemtra(XuLy.get(i).KetLuan(), output)) {
                listTimKiem.add(XuLy.get(i));

            }

        }
    }

    
    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        //jTextField1.setText(jTextField1.getText().toUpperCase());
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null,jTextField1.getText());

         try {
             if(jComboBox1.getSelectedIndex() == 0)
             {
                list1.removeAll();
                XuLyFile();
                XuLyFile_CB();
                if (!"".equals(jTextField1.getText()) && !"".equals(jTextField2.getText())) {
                    XulyInput_giathiet();
                    XulyInput_ketluan();
                    SuyDienLui();
                    XuatKetQua(LoiGiaiRutGon);
                }
                else if ("".equals(jTextField1.getText()) || "".equals(jTextField2.getText()))
                    jLabel4.setText("Hãy nhập chất tham gia và chất sản phẩm để điều chế.");
            }
             else if(jComboBox1.getSelectedIndex() == 1)
             {
                list1.removeAll();
                list1.clear();
                XuLyFile();
                XuLyFile_CB();
                if(!"".equals(jTextField1.getText())){
                    XulyInput_giathiet();
                    Find_GT();
                    XuatKetQua(listTimKiem);
                }
                else if(!"".equals(jTextField2.getText())){
                    XulyInput_ketluan();
                    Find_KL();
                    XuatKetQua(listTimKiem);
                }
                else{
                    jLabel4.setText("Hãy nhập chất cần tìm");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedIndex() == 0)
            jButton1.setText("Điều chế");
        else if(jComboBox1.getSelectedIndex() == 1)
            jButton1.setText("Tìm Kiếm");
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables
}
