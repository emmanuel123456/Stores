
package mapp;
import java.sql.ResultSet;
import javax.swing.*;

public class jplUsers extends JPanel {

    final int pWidth = 600;
    final int pHeight = 420;
    
    /**
     * Creates new form jplRegistration
     * @param jplMain
     */
    public jplUsers(JPanel jplMain) {
        initComponents();
        this.setSize(pWidth,pHeight);
        int x = (jplMain.getWidth()-pWidth)/2;
        int y = (jplMain.getHeight()-pHeight)/2;
        this.setLocation(x,y);
        this.setVisible(true);
        initialization();
    }

    private void initialization(){
        bnAddNew.setEnabled(true);
        bnSave.setEnabled(false);
        bnSearch.setEnabled(true);
        bnSearch.setText("Search");
        bnDelete.setEnabled(false);
        tfUserCode.setEditable(true);
        tfName.setEditable(false);
        cbLevel.setEnabled(false);
        pfPassword.setEditable(false);
        pfConfirmPass.setEditable(false);
        utility.Utility.universalCode=0; 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfUserCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbLevel = new javax.swing.JComboBox();
        pfPassword = new javax.swing.JPasswordField();
        pfConfirmPass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bnSearch = new javax.swing.JButton();
        bnDelete = new javax.swing.JButton();
        bnAddNew = new javax.swing.JButton();
        bnSave = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        bnClose = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("User Code:");

        tfUserCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUserCodeFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Name:");
        jLabel3.setToolTipText("");

        tfName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNameFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password:");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Level:");
        jLabel5.setToolTipText("");

        cbLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "User Level", "1", "2", "3" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Confirm Password:");
        jLabel6.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        bnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnSearch.setText("Search");
        bnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSearchActionPerformed(evt);
            }
        });

        bnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnDelete.setText("Delete");
        bnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnDeleteActionPerformed(evt);
            }
        });

        bnAddNew.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnAddNew.setText("Add New");
        bnAddNew.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAddNewActionPerformed(evt);
            }
        });

        bnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnSave.setText("Save");
        bnSave.setActionCommand("Save");
        bnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSaveActionPerformed(evt);
            }
        });

        bnClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bnClose.setText("Close");
        bnClose.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfUserCode)
                                .addComponent(tfName)
                                .addComponent(cbLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(bnSearch)
                                .addGap(31, 31, 31)
                                .addComponent(bnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bnAddNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bnDelete)
                                .addGap(35, 35, 35)
                                .addComponent(bnClose))
                            .addComponent(pfConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfUserCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pfConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnSearch)
                            .addComponent(bnAddNew)
                            .addComponent(bnClose)
                            .addComponent(bnSave)
                            .addComponent(bnDelete)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean validation(){
        if (tfUserCode.getText().isEmpty() || tfName.getText().isEmpty() ||
                cbLevel.getSelectedIndex()==0 || pfPassword.getText().isEmpty() ||
                pfConfirmPass.getText().isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    private void tfUserCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUserCodeFocusLost
        tfUserCode.setText(tfUserCode.getText().toUpperCase());
    }//GEN-LAST:event_tfUserCodeFocusLost

    private void tfNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNameFocusLost
        tfName.setText(tfName.getText().toUpperCase());
    }//GEN-LAST:event_tfNameFocusLost

    private void bnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAddNewActionPerformed
        bnAddNew.setEnabled(false);
        bnSave.setEnabled(true);
        bnSearch.setEnabled(false);
        bnDelete.setEnabled(false);
        tfUserCode.setEditable(true);
        tfName.setEditable(true);
        cbLevel.setEnabled(true);
        pfPassword.setEditable(true);
        pfConfirmPass.setEditable(true);
        utility.Utility.universalCode=1;
    }//GEN-LAST:event_bnAddNewActionPerformed

    private void bnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCloseActionPerformed
        if (utility.Utility.universalCode == 1){
            int res=JOptionPane.showConfirmDialog(null, "Do you want to save your work?","Warning",JOptionPane.YES_NO_OPTION);
            if (res==JOptionPane.YES_OPTION){
                if (bnSearch.getText().equals("Update")){
                    bnSearch.doClick();
                }else{
                    bnSave.doClick();
                }
            }else{
                this.setVisible(false);
            }
        }else{
            this.setVisible(false);
        }
    }//GEN-LAST:event_bnCloseActionPerformed

    private void bnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSaveActionPerformed
        if (!validation()){
            JOptionPane.showMessageDialog(null,"Complete all fields");
            return;
        }
        if (!(pfPassword.getText().equals(pfConfirmPass.getText()))){
            JOptionPane.showMessageDialog(null, "Passwords should match");
            pfPassword.setText("");
            pfConfirmPass.setText("");
            return;
        }
        String s="insert into account values ('"+tfUserCode.getText()+"','"+tfName.getText()+"','"+cbLevel.getSelectedItem()+"','"+pfPassword.getText()+"')";
        try{
           if(utility.DBconnection.getStatement().executeUpdate(s)>0){
               JOptionPane.showMessageDialog(null, "Save is Successful");
               tfUserCode.setText("");
               tfName.setText("");
               cbLevel.setSelectedIndex(0);
               pfPassword.setText("");
               pfConfirmPass.setText("");
               initialization();
           }else{
               JOptionPane.showMessageDialog(null, "Could not save data");
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }//GEN-LAST:event_bnSaveActionPerformed

    private void bnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSearchActionPerformed
        if (bnSearch.getText().equals("Search")){
            if (tfUserCode.getText().isEmpty()){
               JOptionPane.showMessageDialog(null,"Enter User Code");
               return;
            }
            
            String usercode = tfUserCode.getText().trim();
            String s = "select User_name, level from account where User_code='"+usercode+"'";
            try{
                ResultSet rs = utility.DBconnection.getStatement().executeQuery(s);
                while(rs.next()){
                    tfUserCode.setText(usercode);
                    tfName.setText(rs.getString("User_name"));
                    cbLevel.setSelectedItem(rs.getString("level"));
                }
                tfUserCode.setEditable(false);
                tfName.setEditable(false);
                cbLevel.setEnabled(false);
                pfPassword.setEditable(false);
                pfConfirmPass.setEditable(false);
                bnSave.setEnabled(false);
                bnDelete.setEnabled(true);
                bnAddNew.setEnabled(false);
                bnSearch.setText("Edit");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
                tfUserCode.setText("");
            }
        }else if (bnSearch.getText().equals("Edit")){
            tfName.setEditable(true);
            cbLevel.setEnabled(true);
            bnSearch.setText("Update");
            utility.Utility.universalCode=1;
        }else if (bnSearch.getText().equals("Update")){
            String s= "update account set User_name='"+tfName.getText()+"', level='"+cbLevel.getSelectedItem()+"' where User_code='"+tfUserCode.getText()+"'";
            try{
                if(utility.DBconnection.getStatement().executeUpdate(s)>0){
                    JOptionPane.showMessageDialog(null, "Update is Successful");
                    tfUserCode.setText("");
                    tfName.setText("");
                    cbLevel.setSelectedIndex(0);
                    pfPassword.setText("");
                    pfConfirmPass.setText("");
                    initialization();
                }else{
                    JOptionPane.showMessageDialog(null, "Could not update data");
                }
             }catch(Exception e){
                 JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
             }
        }
    }//GEN-LAST:event_bnSearchActionPerformed

    private void bnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnDeleteActionPerformed
        String s= "delete from account where User_code='"+tfUserCode.getText().trim()+"'";
            try{
                if(utility.DBconnection.getStatement().executeUpdate(s)>0){
                    JOptionPane.showMessageDialog(null, "Delete is Successful");
                    tfUserCode.setText("");
                    tfName.setText("");
                    cbLevel.setSelectedIndex(0);
                    pfPassword.setText("");
                    pfConfirmPass.setText("");
                    initialization();
                }else{
                    JOptionPane.showMessageDialog(null, "Could not delete data");
                }
             }catch(Exception e){
                 JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
             }
    }//GEN-LAST:event_bnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnAddNew;
    private javax.swing.JButton bnClose;
    private javax.swing.JButton bnDelete;
    private javax.swing.JButton bnSave;
    private javax.swing.JButton bnSearch;
    private javax.swing.JComboBox cbLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField pfConfirmPass;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfUserCode;
    // End of variables declaration//GEN-END:variables
}
