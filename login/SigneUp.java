
package login;
import java.awt.Color;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class SigneUp extends javax.swing.JFrame {

    /**
     * Creates new form SigneUp
     */
    public SigneUp() {
		
        this.getContentPane().setBackground(new Color(0x5ABA9E));
        initComponents();
    
	}

    public boolean userIsValid(String user){
        
        
        String notAllowedInTheBeginning = "0123456789._";
        
        boolean a = (notAllowedInTheBeginning.indexOf(user.charAt(0))== -1 );
        
        String notAllowed ="@#$%^&*()-+=|/,`?•<>";
        
        boolean b = true;
        
        parentFor:{
            for(int i=0;i<notAllowed.length();i++){
                for(int j=0;j<user.length();j++){
                    if(user.charAt(j) == notAllowed.charAt(i)){
                        b = false;
                        break parentFor;
                    }
                }
            }
        };
        
        return a && b;
    }
    public boolean emailIsValid(String email){
        
        char first = email.charAt(0);
        
        String notAllowed = "0123456789!@#$%^&*()_-+=|/,`?•.";
        
        boolean a = (notAllowed.indexOf(first)== -1 );
        
        
        

        
        boolean b = existOnly('@',email,false);
        
        boolean c;
        
        if(existOnly('.',email,true)){ 
            
            
            int lastpoint=0;
                int beforeLastpoint=0;
                
                for(int i=0;i<email.length();i++){
                    if(email.charAt(i)=='.'){
                        
                        beforeLastpoint=lastpoint;
                        lastpoint=i;
                    }
                }
                int at= email.indexOf('@');
                
                
                c = ( beforeLastpoint < at ) && (at <lastpoint);
                
            
        }
        else{
                c = ( (emailField.getText().indexOf('.') > email.indexOf('@')) && (email.indexOf('@') > -1));
                 
        }
        
        return a && b && c;
    }
    
    
    
    public boolean phoneIsValid(String phone){
        boolean a = phone.length() == 10;
        boolean b = phone.charAt(0)== '0';
        
        
        for(int i=0;i<phone.length();i++){
            if(! ( (phone.charAt(i) >= '0') && (phone.charAt(i)<= '9' ) ) ){
                return false;
            }
        }
        
        return a && b ;
    }
    public boolean pwdIsPowerful(String pwd){
        boolean a=false;//uppercase
        boolean b=false;//lowercase
        boolean c=false;//digit
        
        for(int i=0;i<pwd.length();i++){
            if(pwd.charAt(i)>='0' && pwd.charAt(i)<='9'){
                c=true;
                continue;
            }
            if(pwd.charAt(i)>='A' && pwd.charAt(i)<='Z'){
                a=true;
                continue;
            }
            if(pwd.charAt(i)>='a' && pwd.charAt(i)<='z'){
                b=true;
                
            }
            
            if(a&&b&&c){
                return true;
            }
            
        }
        return a && b && c;
        
    }
    
    public boolean existOnly(char c,String e,boolean indice){
        
        int cpt=0;
        
        for(int i=0;i<e.length();i++){
            if(e.charAt(i)==c){
                cpt++;
            }
        }
        
        return indice? cpt>1 : cpt==1 ;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        PwdField = new javax.swing.JPasswordField();
        seeBox = new javax.swing.JCheckBox();
        pwdPower = new javax.swing.JLabel();
        EMAIL_IS_VALID = new javax.swing.JLabel(" ");
        PHONE_IS_VALID = new javax.swing.JLabel(" ");
        USER_IS_VALID = new javax.swing.JLabel(" ");
        submitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/icons8-login-100.png"))); // NOI18N
        jLabel1.setText("SigneUp");

        jPanel1.setBackground(new java.awt.Color(255, 254, 244));

        jLabel2.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(90, 186, 158));
        jLabel2.setText("Username");

        userField.setBackground(new java.awt.Color(255, 255, 255));
        userField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        userField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(90, 186, 158), 2, true));
        userField.setPreferredSize(new java.awt.Dimension(70, 30));
        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(90, 186, 158));
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(90, 186, 158));
        jLabel4.setText("Phone");

        jLabel5.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(90, 186, 158));
        jLabel5.setText("Password");

        emailField.setBackground(new java.awt.Color(255, 255, 255));
        emailField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        emailField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(90, 186, 158), 2, true));
        emailField.setPreferredSize(new java.awt.Dimension(70, 30));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        phoneField.setBackground(new java.awt.Color(255, 255, 255));
        phoneField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        phoneField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(90, 186, 158), 2, true));
        phoneField.setPreferredSize(new java.awt.Dimension(70, 30));
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });

        PwdField.setBackground(new java.awt.Color(255, 255, 255));
        PwdField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        PwdField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(90, 186, 158), 2, true));
        PwdField.setPreferredSize(new java.awt.Dimension(64, 30));
        PwdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PwdFieldActionPerformed(evt);
            }
        });

        seeBox.setBackground(new java.awt.Color(90, 186, 158));
        seeBox.setFont(new java.awt.Font("Ink Free", 3, 14)); // NOI18N
        seeBox.setForeground(new java.awt.Color(255, 254, 244));
        seeBox.setText("see");
        seeBox.setBorder(null);
        seeBox.setBorderPainted(true);
        seeBox.setBorderPaintedFlat(true);
        seeBox.setFocusable(false);
        seeBox.setPreferredSize(new java.awt.Dimension(44, 22));
        seeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeBoxActionPerformed(evt);
            }
        });

        pwdPower.setText("ex : 'Qw7MkLOx' > 8");

//        USER_IS_VALID.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
//        EMAIL_IS_VALID.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
//        PHONE_IS_VALID.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
       


        submitBtn.setBackground(new java.awt.Color(204, 255, 240));
        submitBtn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(0, 0, 0));
        submitBtn.setText("Submit");
        submitBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(90, 186, 158), 2, true));
        submitBtn.setFocusable(false);
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(USER_IS_VALID)
                                    .addComponent(EMAIL_IS_VALID)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(userField, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                        .addComponent(phoneField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PwdField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(seeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(pwdPower)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(PHONE_IS_VALID))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(USER_IS_VALID)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EMAIL_IS_VALID)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PHONE_IS_VALID, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdPower))
                .addGap(27, 27, 27)
                .addComponent(submitBtn)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeBoxActionPerformed
        PwdField.setEchoChar(seeBox.isSelected()? '\0' :'•');
    }//GEN-LAST:event_seeBoxActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFieldActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
    String user = userField.getText();
    String email = emailField.getText();
    String phone = phoneField.getText();
    String pwd = String.valueOf(PwdField.getPassword());
    boolean a,b,c,d;
    
    
    if(!user.equals("")){
        a = userIsValid(user);
        
        if(a){
            USER_IS_VALID.setText("Username is valid :)");
            USER_IS_VALID.setForeground(new Color(0x00FF7F));
        }
        else{
            USER_IS_VALID.setText("Username is not valid :/");
            USER_IS_VALID.setForeground(Color.red);
        }
    }    
    else{
        
        USER_IS_VALID.setText("user is empty  -_- ");
        USER_IS_VALID.setForeground(new Color(255,127,80));
        a=false;
    }
    
    if(!email.equals("")){
        c = emailIsValid(email);
        
        if(c){
            EMAIL_IS_VALID.setText("email is valid :)");
            EMAIL_IS_VALID.setForeground(new Color(0x00FF7F));
        }
        else{
            EMAIL_IS_VALID.setText("email is not valid :/");
            EMAIL_IS_VALID.setForeground(Color.red);
        }
    } 
    else{
        
        EMAIL_IS_VALID.setText("email is empty  -_- ");
        EMAIL_IS_VALID.setForeground(new Color(255,127,80));
        c=false;
    }
    
    if(!phone.equals("")){
         b= phoneIsValid(phone);
        if(b){
            PHONE_IS_VALID.setText("phone is valid :)");
            PHONE_IS_VALID.setForeground(new Color(0x00FF7F));
        }
        else{
            PHONE_IS_VALID.setText("password is not valid :/");
            PHONE_IS_VALID.setForeground(Color.red);   
            
        }
    } 
    else{
        
        PHONE_IS_VALID.setText("phone is empty  -_- ");
        PHONE_IS_VALID.setForeground(new Color(255,127,80));
        b=false;
    }
    
    if(!pwd.equals("")){
        if(pwd.length()< 8){
            pwdPower.setText("password must be 8 caracters at least !");
            pwdPower.setForeground(new Color(255,127,80));
            d=false;
        }
        else{
            d = pwdIsPowerful(pwd);
            if(d){
                pwdPower.setText("password is powerful");
                pwdPower.setForeground(new Color(0x00FF7F));
            }
            else{
                pwdPower.setText("Password Is Weak !");
                pwdPower.setForeground(Color.red);
                    try{
                    Thread.sleep(1000);
                    }catch(Exception e){    
                    }finally{
                        pwdPower.setText("ex : 'Qw7MkLOx' > 8");
                        pwdPower.setForeground(Color.black);
                    }
            }
        }
    }
    else{
        pwdPower.setText("phone is empty  -_- ");
        pwdPower.setForeground(new Color(255,127,80));
        d=false;
    }
    
        
        
        
        if(a && b && c && d){
            email = email.toLowerCase();
            new MyLoginDb().save( user,phone,email,pwd);
            JOptionPane.showMessageDialog(this,"Congratulations "+user+"\nYou are one of our family","User Saved Succefully !",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }

       
        
 
        
    }

    private void PwdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PwdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PwdFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EMAIL_IS_VALID;
    private javax.swing.JLabel PHONE_IS_VALID;
    private javax.swing.JPasswordField PwdField;
    private javax.swing.JLabel USER_IS_VALID;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel pwdPower;
    private javax.swing.JCheckBox seeBox;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}

//NOTEPAD++