package logis;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.*;
import java.awt.print.*;
import javax.swing.*;

import net.proteanit.sql.DbUtils;


public class WorkWindowForLogists extends javax.swing.JFrame {

    Connection connection = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;


    public WorkWindowForLogists() {
        initComponents();
        connection = Connector.ConnectrDb();
        actionChooseClient();
        actionChooseDriver();
        actionChooseExped();
        actionChooseCar();
        actionChooseProduct();
        currentDate();

    }

    private void initComponents() {

        jMenu7 = new javax.swing.JMenu();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cancelTeam = new javax.swing.JButton();
        nameDriver = new javax.swing.JComboBox<>();
        licenseDriver = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        numTelDriver = new javax.swing.JTextField();
        nameEx = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        numTelEx = new javax.swing.JTextField();
        nameCar = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        numCar = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        loadCar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        choiceClient = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameProduct = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addOrder = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cancelOrder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        deleteProdOrder = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        quantityUnit = new javax.swing.JTextField();
        weightUnit = new javax.swing.JTextField();
        unitProduct = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        priceUnit = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        quantityOrder = new javax.swing.JComboBox<>();
        idProduct = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        summAllOrder = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        truncateOrderTable = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        adress = new javax.swing.JTextField();
        timeWorking = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        eMail = new javax.swing.JTextField();
        cancelClient = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        routeTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        addDataToRoute = new javax.swing.JButton();
        idRoute = new javax.swing.JTextField();
        deleteRoute = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        printOrder = new javax.swing.JButton();
        printRoute = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        refer = new javax.swing.JMenu();
        referen = new javax.swing.JMenuItem();

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Logis v.1.0");
        setPreferredSize(new java.awt.Dimension(1220, 700));
        setResizable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("Экипаж");

        jLabel6.setText("Водитель:");

        jLabel7.setText("Экспедитор:");

        jLabel8.setText("Авто:");

        cancelTeam.setText("Очистить");
        cancelTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelTeamActionPerformed(evt);
            }
        });

        nameDriver.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }

            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                nameDriverPopupMenuWillBecomeInvisible(evt);
            }

            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        licenseDriver.setEditable(false);

        jLabel17.setText("Категория");

        jLabel20.setText("Телефон");

        numTelDriver.setEditable(false);

        nameEx.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }

            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                nameExPopupMenuWillBecomeInvisible(evt);
            }

            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel22.setText("Телефон");

        numTelEx.setEditable(false);

        nameCar.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }

            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                nameCarPopupMenuWillBecomeInvisible(evt);
            }

            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel23.setText("Номер");

        numCar.setEditable(false);

        jLabel24.setText("Грузоподьемность");

        loadCar.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(52, 52, 52))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                        .addComponent(jLabel7)
                                                                        .addGap(0, 117, Short.MAX_VALUE))
                                                                .addComponent(nameDriver, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(licenseDriver, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(numTelDriver, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(nameEx, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(numTelEx, javax.swing.GroupLayout.Alignment.TRAILING))
                                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                                        .addComponent(numCar, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(nameCar, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(loadCar, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(cancelTeam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(licenseDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(loadCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numTelDriver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cancelTeam))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numTelEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("Клиент");

        choiceClient.setInheritsPopupMenu(true);
        choiceClient.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }

            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                choiceClientPopupMenuWillBecomeInvisible(evt);
            }

            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(choiceClient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(choiceClient, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Заказ:");

        nameProduct.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }

            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                nameProductPopupMenuWillBecomeInvisible(evt);
            }

            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("Товар:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setText("Количество:");

        addOrder.setText("Добавить в заказ");
        addOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderActionPerformed(evt);
            }
        });

        jLabel10.setText("кг / единица:");

        cancelOrder.setText("Очистить");
        cancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderActionPerformed(evt);
            }
        });

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null},
                        {"", null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String[]{
                        "№ п.п.", "Наименование", "Единица измерения", "Количество", "Цена единицы", "Сумма по товару"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orderTable);

        deleteProdOrder.setText("Удалить позицию");
        deleteProdOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProdOrderActionPerformed(evt);
            }
        });

        jLabel15.setText("Остаток на складе:");

        quantityUnit.setEditable(false);

        weightUnit.setEditable(false);

        unitProduct.setEditable(false);

        jLabel25.setText("Единица:");

        priceUnit.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel11.setText("Цена, грн.:");

        quantityOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));

        idProduct.setEditable(false);

        jLabel12.setText("№ п.п.:");

        summAllOrder.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel13.setText("Сумма заказа:");

        truncateOrderTable.setText("Очистить заказ");
        truncateOrderTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truncateOrderTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(deleteProdOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(75, 75, 75)
                                                .addComponent(truncateOrderTable, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(99, 99, 99))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(quantityUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(43, 43, 43)
                                                                .addComponent(unitProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(138, 138, 138))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel25))
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nameProduct, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(weightUnit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(quantityOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(priceUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(summAllOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(26, 26, 26))
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cancelOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(idProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(addOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(quantityOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(summAllOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)
                                        .addComponent(cancelOrder))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(unitProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(weightUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(addOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(priceUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(quantityUnit))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(deleteProdOrder)
                                        .addComponent(truncateOrderTable))
                                .addGap(18, 18, 18))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel14.setText("Информация о клиенте");

        jLabel18.setText("Адресс");

        jLabel19.setText("Время работы");

        jLabel21.setText("Контактные данные");

        adress.setEditable(false);

        timeWorking.setEditable(false);

        phoneNumber.setEditable(false);

        eMail.setEditable(false);

        cancelClient.setText("Очистить");
        cancelClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(adress, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(timeWorking)
                                        .addComponent(eMail)
                                        .addComponent(phoneNumber)
                                        .addComponent(cancelClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel18)
                                                        .addComponent(jLabel19)
                                                        .addComponent(jLabel21)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 12, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timeWorking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(cancelClient)
                                .addContainerGap())
        );

        routeTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String[]{
                        "№ Накладной", "Клиент", "Адресс", "Сумма накладной", "Авто", "Водитель"
                }
        ));
        routeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                routeTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(routeTable);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel9.setText("Поставки:");

        addDataToRoute.setText("Добавить данные в поставки");
        addDataToRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDataToRouteActionPerformed(evt);
            }
        });

        deleteRoute.setText("Удалить накладную № :");
        deleteRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRouteActionPerformed(evt);
            }
        });

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        printOrder.setText("Распечатать накладную");
        printOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printOrderActionPerformed(evt);
            }
        });

        printRoute.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        printRoute.setText("Распечатать поставки");
        printRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printRouteActionPerformed(evt);
            }
        });

        file.setText("Файл");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Печать таблицы заказа");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        file.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Печать таблицы поставки");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        file.add(jMenuItem10);
        file.add(jSeparator2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Выйти с программы");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        file.add(jMenuItem4);

        jMenuBar1.add(file);

        refer.setText("Справка");

        referen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        referen.setText("Просмотреть справку");

        refer.add(referen);

        jMenuBar1.add(refer);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(printOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(deleteRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(idRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addDataToRoute, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                                        .addComponent(printRoute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(addDataToRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(printOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(deleteRoute)
                                                        .addComponent(idRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(60, 60, 60)
                                                .addComponent(printRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19))))
        );

        pack();
    }

    private void addOrderActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String sql = "INSERT INTO `order` (`nameProduct`,`unitProduct`,`quantityProduct`,`priceUnit`) VALUES (?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);

            String value1 = nameProduct.getSelectedItem().toString();
            preparedStatement.setString(1, value1);

            preparedStatement.setString(2, unitProduct.getText());

            String value2 = quantityOrder.getSelectedItem().toString();
            preparedStatement.setString(3, value2);

            preparedStatement.setString(4, priceUnit.getText());

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "Добавлено в таблицу заказа");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {

            String sql = "UPDATE `logistics`.`order` SET `summOrder`=`quantityProduct`*`priceUnit`";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            String sql = "SELECT `id` AS `№ п.п.`, `nameProduct` AS `Наименование товара`,`unitProduct` AS `Единица измерения`, `quantityProduct` AS `Количество`, `priceUnit` AS `Цена`, `summOrder` AS `Всего по товару` FROM `order`";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery(sql);
            orderTable.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {

            String sql = "SELECT SUM(summOrder) FROM logistics.`order`";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String add = resultSet.getString("SUM(summOrder)");
                summAllOrder.setText(add);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }

    private void deleteProdOrderActionPerformed(java.awt.event.ActionEvent evt) {
        UIManager.put("OptionPane.yesButtonText", "Да");
        UIManager.put("OptionPane.noButtonText", "Нет");
        int p = JOptionPane.showConfirmDialog(null, "Вы хотите удалить товар с заказа?", "Удаление", JOptionPane.YES_NO_OPTION);

        String sql = "DELETE FROM `order` WHERE id=?";
        if (p == 0) {
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, idProduct.getText());
                preparedStatement.execute();
                JOptionPane.showMessageDialog(null, "Товар удален");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            updateOrderTable();
        }

        try {

            String sql1 = "SELECT SUM(summOrder) FROM logistics.`order`";
            preparedStatement = connection.prepareStatement(sql1);

            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String add = resultSet.getString("SUM(summOrder)");
                summAllOrder.setText(add);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }

    private void choiceClientPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
        String temp = (String) choiceClient.getSelectedItem();
        String sql = "SELECT * FROM `clients` WHERE name=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, temp);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String addAdress = resultSet.getString("adress");
                adress.setText(addAdress);
                String addTimeWorking = resultSet.getString("timeWorking");
                timeWorking.setText(addTimeWorking);
                String addPhoneNumber = resultSet.getString("phoneNumber");
                phoneNumber.setText(addPhoneNumber);
                String addEmail = resultSet.getString("eMail");
                eMail.setText(addEmail);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void cancelClientActionPerformed(java.awt.event.ActionEvent evt) {
        adress.setText("");
        timeWorking.setText("");
        phoneNumber.setText("");
        eMail.setText("");
    }

    private void nameDriverPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
        String temp = (String) nameDriver.getSelectedItem();
        String sql = "SELECT * FROM `drivers` WHERE name=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, temp);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String addLicenseDriver = resultSet.getString("license");
                licenseDriver.setText(addLicenseDriver);
                String addNumTelDriver = resultSet.getString("num_tel");
                numTelDriver.setText(addNumTelDriver);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void nameExPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
        String temp = (String) nameEx.getSelectedItem();
        String sql = "SELECT * FROM `expeds` WHERE name=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, temp);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String addNumTelEx = resultSet.getString("numTel");
                numTelEx.setText(addNumTelEx);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void nameCarPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
        String temp = (String) nameCar.getSelectedItem();
        String sql = "SELECT * FROM `cars` WHERE name=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, temp);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String addNumCar = resultSet.getString("number");
                numCar.setText(addNumCar);
                String addLoadCar = resultSet.getString("load");
                loadCar.setText(addLoadCar);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void cancelTeamActionPerformed(java.awt.event.ActionEvent evt) {
        licenseDriver.setText("");
        numCar.setText("");
        numTelDriver.setText("");
        numTelEx.setText("");
        loadCar.setText("");
    }

    private void nameProductPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
        String temp = (String) nameProduct.getSelectedItem();
        String sql = "SELECT * FROM storage WHERE name=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, temp);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String addQuantityUnit = resultSet.getString("quantity_unit");
                quantityUnit.setText(addQuantityUnit);
                String addUnitProduct = resultSet.getString("unit_product");
                unitProduct.setText(addUnitProduct);
                String addPriceUnit = resultSet.getString("price_unit");
                priceUnit.setText(addPriceUnit);
                String addWeightUnit = resultSet.getString("weight_unit");
                weightUnit.setText(addWeightUnit);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void cancelOrderActionPerformed(java.awt.event.ActionEvent evt) {
        quantityUnit.setText("");
        unitProduct.setText("");
        priceUnit.setText("");
        weightUnit.setText("");
        idProduct.setText("");
        summAllOrder.setText("");

    }

    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {
        try {
            int row = orderTable.getSelectedRow();
            String ordetTableClick = (orderTable.getModel().getValueAt(row, 0).toString());
            String sql = "SELECT * FROM `order` WHERE id=" + ordetTableClick + "";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String add = resultSet.getString("id");
                idProduct.setText(add);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }

    private void addDataToRouteActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            String sql = "INSERT INTO `route` (`nameClient`,`adressClient`,`summOrder`,`nameCar`,`nameDriver`) VALUES (?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);

            String value1 = choiceClient.getSelectedItem().toString();
            preparedStatement.setString(1, value1);

            preparedStatement.setString(2, adress.getText());

            preparedStatement.setString(3, summAllOrder.getText());

            String value2 = nameCar.getSelectedItem().toString();
            preparedStatement.setString(4, value2);

            String value3 = nameDriver.getSelectedItem().toString();
            preparedStatement.setString(5, value3);

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "Данные добавлены в маршрут");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            String sql = "SELECT `idRoute` AS `№ накладной`, `nameClient` AS `Клиент`,`adressClient` AS `Адресс клиента`, `summOrder` AS `Сумма накладной`, `nameCar` AS `Авто`, `nameDriver` AS `Водитель` FROM `route`";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery(sql);
            routeTable.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void routeTableMouseClicked(java.awt.event.MouseEvent evt) {
        try {
            int row = routeTable.getSelectedRow();
            String routeTableClick = (routeTable.getModel().getValueAt(row, 0).toString());
            String sql = "SELECT * FROM `route` WHERE idRoute=" + routeTableClick + "";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String add = resultSet.getString("idRoute");
                idRoute.setText(add);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void deleteRouteActionPerformed(java.awt.event.ActionEvent evt) {
        UIManager.put("OptionPane.yesButtonText", "Да");
        UIManager.put("OptionPane.noButtonText", "Нет");
        int p = JOptionPane.showConfirmDialog(null, "Вы хотите удалить поставку по накладной с маршрута?", "Удаление", JOptionPane.YES_NO_OPTION);

        String sql = "DELETE FROM `route` WHERE idRoute=?";
        if (p == 0) {
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, idRoute.getText());
                preparedStatement.execute();
                JOptionPane.showMessageDialog(null, "Накладная удалена");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            updateRouteTable();
        }
    }

    private void truncateOrderTableActionPerformed(java.awt.event.ActionEvent evt) {

        String sql = "TRUNCATE TABLE `order`";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        updateOrderTable();
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void printOrderActionPerformed(java.awt.event.ActionEvent evt) {
        String value1 = idRoute.getText();
        String value2 = choiceClient.getSelectedItem().toString();
        String value3 = date.getText();
        MessageFormat header = new MessageFormat("Расходная накладная  № " + value1 + " от " + value3 + " для клиента " + value2);
        MessageFormat footer = new MessageFormat("Страница {0,number,integer}");
        try {
            orderTable.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (java.awt.print.PrinterException e) {
            System.err.format("Не возможно распечать заказ !", e.getMessage());
        }
    }

    private void printRouteActionPerformed(java.awt.event.ActionEvent evt) {
        String value1 = date.getText();
        MessageFormat header = new MessageFormat("Поставки товара по накладным от " + value1);
        MessageFormat footer = new MessageFormat("Страница {0,number,integer}");
        try {
            routeTable.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (java.awt.print.PrinterException e) {
            System.err.format("Не возможно распечать заказ !", e.getMessage());
        }
    }


    private void referenActionPerformed(java.awt.event.ActionEvent evt) {
        Refer refer = new Refer();
        refer.setVisible(true);
    }

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {
        String value1 = idRoute.getText();
        String value2 = choiceClient.getSelectedItem().toString();
        String value3 = date.getText();
        MessageFormat header = new MessageFormat("Расходная накладная  № " + value1 + " от " + value3 + " для клиента " + value2);
        MessageFormat footer = new MessageFormat("Страница {0,number,integer}");
        try {
            orderTable.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (java.awt.print.PrinterException e) {
            System.err.format("Не возможно распечать заказ !", e.getMessage());
        }
    }

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {
        String value1 = date.getText();
        MessageFormat header = new MessageFormat("Поставки товара по накладным от " + value1);
        MessageFormat footer = new MessageFormat("Страница {0,number,integer}");
        try {
            routeTable.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (java.awt.print.PrinterException e) {
            System.err.format("Не возможно распечать заказ !", e.getMessage());
        }
    }

    private void actionChooseClient() {
        try {
            String sql = "SELECT * FROM clients";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                choiceClient.addItem(name);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void actionChooseDriver() {
        try {
            String sql = "SELECT * FROM drivers";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                nameDriver.addItem(name);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void actionChooseExped() {
        try {
            String sql = "SELECT * FROM expeds";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                nameEx.addItem(name);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void actionChooseCar() {
        try {
            String sql = "SELECT * FROM cars";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                nameCar.addItem(name);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void actionChooseProduct() {
        try {
            String sql = "SELECT * FROM storage";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                nameProduct.addItem(name);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void updateOrderTable() {
        try {
            String sql = "SELECT * FROM `order`";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            orderTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void updateRouteTable() {
        try {
            String sql = "SELECT * FROM `route`";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            routeTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void currentDate() {

        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d.MM.YYYY");
        date.setText(dateTimeFormatter.format(localDate));
    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WorkWindowForLogists.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkWindowForLogists.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkWindowForLogists.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkWindowForLogists.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkWindowForLogists().setVisible(true);
            }
        });
    }


    private javax.swing.JButton addDataToRoute;
    private javax.swing.JButton addOrder;
    private javax.swing.JTextField adress;
    private javax.swing.JButton cancelClient;
    private javax.swing.JButton cancelOrder;
    private javax.swing.JButton cancelTeam;
    private javax.swing.JComboBox<String> choiceClient;
    private javax.swing.JLabel date;
    private javax.swing.JButton deleteProdOrder;
    private javax.swing.JButton deleteRoute;
    private javax.swing.JTextField eMail;
    private javax.swing.JMenu file;
    private javax.swing.JTextField idProduct;
    private javax.swing.JTextField idRoute;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextField licenseDriver;
    private javax.swing.JTextField loadCar;
    private javax.swing.JComboBox<String> nameCar;
    private javax.swing.JComboBox<String> nameDriver;
    private javax.swing.JComboBox<String> nameEx;
    private javax.swing.JComboBox<String> nameProduct;
    private javax.swing.JTextField numCar;
    private javax.swing.JTextField numTelDriver;
    private javax.swing.JTextField numTelEx;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JTextField priceUnit;
    private javax.swing.JButton printOrder;
    private javax.swing.JButton printRoute;
    private javax.swing.JComboBox<String> quantityOrder;
    private javax.swing.JTextField quantityUnit;
    private javax.swing.JMenu refer;
    private javax.swing.JMenuItem referen;
    private javax.swing.JTable routeTable;
    private javax.swing.JTextField summAllOrder;
    private javax.swing.JTextField timeWorking;
    private javax.swing.JButton truncateOrderTable;
    private javax.swing.JTextField unitProduct;
    private javax.swing.JTextField weightUnit;
}
