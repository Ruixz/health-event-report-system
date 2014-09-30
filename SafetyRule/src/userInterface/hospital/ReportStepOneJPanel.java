/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.hospital;

import business.HealthSystem;
import business.enterprise.Enterprise;
import business.enterprise.Hospital;
import business.organization.Organization;
import business.report.BasicInfo;
import business.report.PatientInfo;
import business.report.Product;
import business.report.ProductInfo;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author skipper
 */
public class ReportStepOneJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReportStepOneJPanel
     */
    private JPanel container;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private HealthSystem system;
    
    private BasicInfo basic;
    private PatientInfo patient;
    private ProductInfo products;
    
    public ReportStepOneJPanel(JPanel container,UserAccount userAccount,
            Organization organization,Enterprise enterprise,HealthSystem system) {
        initComponents();
        this.container = container;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        
        popComboBox();
//        popTableData();
        
        basic = new BasicInfo();
        patient = new PatientInfo();
        products = new ProductInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void popComboBox(){
        preventabilityJComboBox.removeAllItems();
        genderJComboBox.removeAllItems();
        harmDegreeJComboBox.removeAllItems();
        productTypeJComboBox.removeAllItems();
        
        preventabilityJComboBox.addItem(BasicInfo.ALMOST);
        preventabilityJComboBox.addItem(BasicInfo.SOME);
        preventabilityJComboBox.addItem(BasicInfo.NOT);
        
        genderJComboBox.addItem(PatientInfo.MALE);
        genderJComboBox.addItem(PatientInfo.FEMALE);
        
        harmDegreeJComboBox.addItem(PatientInfo.HarmDegree.SEVERE);
        harmDegreeJComboBox.addItem(PatientInfo.HarmDegree.MILD);
        harmDegreeJComboBox.addItem(PatientInfo.HarmDegree.NO);
        harmDegreeJComboBox.addItem(PatientInfo.HarmDegree.NOTKNOW);
        
        productTypeJComboBox.addItem(Product.ProductType.EQUIPMENT);
        productTypeJComboBox.addItem(Product.ProductType.FACILITY);
        productTypeJComboBox.addItem(Product.ProductType.MEDCINE);
        productTypeJComboBox.addItem(Product.ProductType.BLOOD);
        
    }
    
    private void popTableData(){
        int rowCount = productsJTable.getRowCount();
        for(int i=rowCount-1; i>=0; i--){
            ((DefaultTableModel)productsJTable.getModel()).removeRow(i);
        }
        for(Product p : products.getProductList()){
            Object row[] = new Object[2];
            row[0] = p;
            row[1] = p.getProductType();
            
            ((DefaultTableModel)productsJTable.getModel()).addRow(row);  
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        nextJButton = new javax.swing.JButton();
        resetJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MaskFormatter mf = null;
        try {
            mf = new MaskFormatter("####-##-##");
        } catch (ParseException p) {
            p.printStackTrace();
        }
        discoverDateJFormattedTextField = new javax.swing.JFormattedTextField(mf);
        placeJTextField = new javax.swing.JTextField();
        involvedNoJRadioButton = new javax.swing.JRadioButton();
        involvedYesJRadioButton = new javax.swing.JRadioButton();
        reportDateJFormattedTextField = new javax.swing.JFormattedTextField(mf);
        jLabel8 = new javax.swing.JLabel();
        deviceJCheckBox = new javax.swing.JCheckBox();
        humanJCheckBox = new javax.swing.JCheckBox();
        medicationJCheckBox = new javax.swing.JCheckBox();
        otherJCheckBox = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        preventabilityJComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionJTextArea = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        mrnJTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        genderJComboBox = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        raceJTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        dobJFormattedTextField = new javax.swing.JFormattedTextField(mf);
        jLabel16 = new javax.swing.JLabel();
        diagnosisJTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        primaryDoctorJTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        harmDegreeJComboBox = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        productNameJTextField = new javax.swing.JTextField();
        productTypeJComboBox = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        productsJTable = new javax.swing.JTable();
        addProductJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Report: Step 1: Fill in the information");

        nextJButton.setText("Next");
        nextJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextJButtonActionPerformed(evt);
            }
        });

        resetJButton.setText("Reset");
        resetJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("宋体", 1, 12)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("Basic Info");

        jLabel2.setText("Discover Date");

        jLabel3.setText("Report Date");

        jLabel4.setText("Involved");

        jLabel5.setText("Occured place");

        buttonGroup1.add(involvedNoJRadioButton);
        involvedNoJRadioButton.setText("No");

        buttonGroup1.add(involvedYesJRadioButton);
        involvedYesJRadioButton.setSelected(true);
        involvedYesJRadioButton.setText("Yes");

        jLabel8.setText("Event categories");

        deviceJCheckBox.setText("Device");

        humanJCheckBox.setText("Human Error");

        medicationJCheckBox.setText("Medication");

        otherJCheckBox.setText("Other");

        jLabel7.setText("Preventability");

        preventabilityJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Description");

        descriptionJTextArea.setColumns(20);
        descriptionJTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionJTextArea);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Patient Info");

        jLabel11.setText("M R N");

        jLabel12.setText("Name");

        jLabel13.setText("Gender");

        genderJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setText("Race");

        jLabel15.setText("DOB");

        jLabel16.setText("Diagnosis");

        jLabel17.setText("Primary Doctor");

        jLabel18.setText("Harm Degree");

        harmDegreeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel19.setText("Product Info");

        jLabel20.setText("Product Name");

        jLabel21.setText("Product Type");

        productTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        productsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(productsJTable);

        addProductJButton.setText("Add");
        addProductJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductJButtonActionPerformed(evt);
            }
        });

        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(refreshJButton))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reportDateJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(discoverDateJFormattedTextField)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(involvedYesJRadioButton)
                                                .addGap(44, 44, 44)
                                                .addComponent(involvedNoJRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(placeJTextField))
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(preventabilityJComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(deviceJCheckBox)
                                            .addComponent(medicationJCheckBox))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(otherJCheckBox)
                                            .addComponent(humanJCheckBox)))
                                    .addComponent(jScrollPane1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(genderJComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mrnJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(raceJTextField))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dobJFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                        .addComponent(diagnosisJTextField))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(harmDegreeJComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 192, Short.MAX_VALUE)
                                        .addComponent(primaryDoctorJTextField, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(productTypeJComboBox, 0, 146, Short.MAX_VALUE)
                                    .addComponent(productNameJTextField)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(addProductJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteJButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))))
                    .addComponent(jLabel19)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discoverDateJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(deviceJCheckBox)
                    .addComponent(humanJCheckBox))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(reportDateJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicationJCheckBox)
                    .addComponent(otherJCheckBox))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(involvedNoJRadioButton)
                        .addComponent(involvedYesJRadioButton))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(preventabilityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(placeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(mrnJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(dobJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(diagnosisJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(genderJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(primaryDoctorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(raceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(harmDegreeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(productTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteJButton)
                            .addComponent(refreshJButton)
                            .addComponent(addProductJButton)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetJButton)
                        .addGap(18, 18, 18)
                        .addComponent(nextJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(nextJButton)
                    .addComponent(resetJButton))
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addProductJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductJButtonActionPerformed
        // TODO add your handling code here:
        String productName = productNameJTextField.getText();
        Product.ProductType type = (Product.ProductType) productTypeJComboBox.getSelectedItem();
        products.createProduct(productName, type);
        productNameJTextField.setText("");
        popTableData();
    }//GEN-LAST:event_addProductJButtonActionPerformed

    private void nextJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextJButtonActionPerformed
        if(deviceJCheckBox.isSelected()==true){
            basic.getEventCategories().add(BasicInfo.DEVICE);
        }
        if(humanJCheckBox.isSelected()==true){
            basic.getEventCategories().add(BasicInfo.HUMAN);
        }
        if(medicationJCheckBox.isSelected()==true){
            basic.getEventCategories().add(BasicInfo.MEDICATION);
        }
        if(otherJCheckBox.isSelected()==true){
            basic.getEventCategories().add(BasicInfo.OTHER);
        }
        
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        Calendar date = Calendar.getInstance();
        try {
            date.setTime(df.parse((String)discoverDateJFormattedTextField.getValue()));
            basic.setDiscoverDate(date);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please input some key information");
            return;
        }
        try {
            date.setTime(df.parse((String)reportDateJFormattedTextField.getValue()));
            basic.setReportDate(date);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please input some key information");
            return;
        }
        
        patient.setName(nameJTextField.getText());
        if(basic.getEventCategories().isEmpty()||basic.getDiscoverDate() == null||
                basic.getReportDate() ==null||patient.getName()==null||patient.getName().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input some key information");
            return;
        }
        
        if(involvedYesJRadioButton.isSelected()==true){
            basic.setInvolved(BasicInfo.YES);
        }
        if(involvedNoJRadioButton.isSelected()==true){
            basic.setInvolved(BasicInfo.NO);
        }
        basic.setPlace(placeJTextField.getText());
        basic.setPreventability((String)preventabilityJComboBox.getSelectedItem());
        basic.setDescription(descriptionJTextArea.getText());
        basic.setHospital((Hospital) enterprise);
        
        try{
            patient.setMrn(Integer.parseInt(mrnJTextField.getText()));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Medical record number must be number!");
            return;
        } 
        patient.setGender((String)genderJComboBox.getSelectedItem());
        patient.setRace(raceJTextField.getText());
        try {
            date.setTime(df.parse((String)dobJFormattedTextField.getValue()));
            patient.setDob(date);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please input DOB of patient");
            return;
        }
        
        patient.setDiagnosis(diagnosisJTextField.getText());
        patient.setPrimaryPgysician(primaryDoctorJTextField.getText());
        patient.setHarmDegree((PatientInfo.HarmDegree)harmDegreeJComboBox.getSelectedItem());
        
        ReportStepTwoJPanel rstjp = new ReportStepTwoJPanel(container,userAccount,organization,
                enterprise,system,basic,patient,products);
        container.add("ReportStepTwoJPanel", rstjp);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_nextJButtonActionPerformed

    private void resetJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetJButtonActionPerformed
        // TODO add your handling code here:
        placeJTextField.setText("");
        deviceJCheckBox.setSelected(false);
        humanJCheckBox.setSelected(false);
        medicationJCheckBox.setSelected(false);
        otherJCheckBox.setSelected(false);
        descriptionJTextArea.setText("");
        mrnJTextField.setText("");
        nameJTextField.setText("");
        raceJTextField.setText("");
        
        diagnosisJTextField.setText("");
        primaryDoctorJTextField.setText("");
        
        products.getProductList().removeAll(products.getProductList());
        popTableData();
    }//GEN-LAST:event_resetJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        int selectedRow = productsJTable.getSelectedRow();
        if(selectedRow>=0){
            Product p = (Product)productsJTable.getValueAt(selectedRow, 0);
            products.getProductList().remove(p);
        }else{
            JOptionPane.showMessageDialog(null, "Select table row");
            return;
        }
        popTableData();
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        popTableData();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JTextArea descriptionJTextArea;
    private javax.swing.JCheckBox deviceJCheckBox;
    private javax.swing.JTextField diagnosisJTextField;
    private javax.swing.JFormattedTextField discoverDateJFormattedTextField;
    private javax.swing.JFormattedTextField dobJFormattedTextField;
    private javax.swing.JComboBox genderJComboBox;
    private javax.swing.JComboBox harmDegreeJComboBox;
    private javax.swing.JCheckBox humanJCheckBox;
    private javax.swing.JRadioButton involvedNoJRadioButton;
    private javax.swing.JRadioButton involvedYesJRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JCheckBox medicationJCheckBox;
    private javax.swing.JTextField mrnJTextField;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JButton nextJButton;
    private javax.swing.JCheckBox otherJCheckBox;
    private javax.swing.JTextField placeJTextField;
    private javax.swing.JComboBox preventabilityJComboBox;
    private javax.swing.JTextField primaryDoctorJTextField;
    private javax.swing.JTextField productNameJTextField;
    private javax.swing.JComboBox productTypeJComboBox;
    private javax.swing.JTable productsJTable;
    private javax.swing.JTextField raceJTextField;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JFormattedTextField reportDateJFormattedTextField;
    private javax.swing.JButton resetJButton;
    // End of variables declaration//GEN-END:variables

}