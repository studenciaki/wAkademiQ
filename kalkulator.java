
{
return 0;
}
result += (x * p);
p *= base;
}
 
return result;
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanelStandardowy = new javax.swing.JPanel();
        btnJeden = new javax.swing.JButton();
        btnDwa = new javax.swing.JButton();
        btnTrzy = new javax.swing.JButton();
        btnCztery = new javax.swing.JButton();
        btnPiec = new javax.swing.JButton();
        btnSzesc = new javax.swing.JButton();
        btnDziewiec = new javax.swing.JButton();
        btnOsiem = new javax.swing.JButton();
        btnSiedem = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnMnozenie = new javax.swing.JButton();
        btnPodziel = new javax.swing.JButton();

        btnKasuj = new javax.swing.JButton();
        btnPrzecinek = new javax.swing.JButton();
        btnWyczysc = new javax.swing.JButton();
        btnRownasie = new javax.swing.JButton();
        jPanelNaukowy = new javax.swing.JPanel();
        btnBin = new javax.swing.JButton();
        btnHex = new javax.swing.JButton();
        btnOct = new javax.swing.JButton();
        btnBin1 = new javax.swing.JButton();
        btnOct1 = new javax.swing.JButton();
        btnHex1 = new javax.swing.JButton();
        btnBin2 = new javax.swing.JButton();
        btnOct2 = new javax.swing.JButton();
        btnHex2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jIPPanel = new javax.swing.JPanel();
        txtone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txttwo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtthree = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfour = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmask = new javax.swing.JTextField();
        lblipbinary0 = new javax.swing.JLabel();
        lblbinary1 = new javax.swing.JLabel();
        lblmaska0 = new javax.swing.JLabel();
        lblmaska1 = new javax.swing.JLabel();
        lblbroadcastbin1 = new javax.swing.JLabel();
        lblbroadcastbin0 = new javax.swing.JLabel();
        lblbroadcast = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblsiecbin1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblsiec = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblhosty = new javax.swing.JLabel();
        btnsieci = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jOAplikacji = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator 1.0 by ...");
        setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(240, 360));
        setPreferredSize(new java.awt.Dimension(240, 360));
        setResizable(false);
        setSize(new java.awt.Dimension(240, 360));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
            public void windowDeiconified(java.awt.event.WindowEvent evt) {
                formWindowDeiconified(evt);
            }
        });

        btnJeden.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnJeden.setText("1");
        btnJeden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJedenActionPerformed(evt);
            }
        });

        btnDwa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDwa.setText("2");
        btnDwa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDwaActionPerformed(evt);
            }
        });

        btnTrzy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTrzy.setText("3");
        btnTrzy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrzyActionPerformed(evt);
            }
        });

        btnCztery.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCztery.setText("4");
        btnCztery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCzteryActionPerformed(evt);
            }
        });

        btnPiec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPiec.setText("5");
        btnPiec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiecActionPerformed(evt);
            }
        });

        btnSzesc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSzesc.setText("6");
        btnSzesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSzescActionPerformed(evt);
            }
        });

        btnDziewiec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDziewiec.setText("9");
        btnDziewiec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDziewiecActionPerformed(evt);
            }
        });

        btnOsiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOsiem.setText("8");
        btnOsiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsiemActionPerformed(evt);
            }
        });

        btnSiedem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSiedem.setText("7");
        btnSiedem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiedemActionPerformed(evt);
            }
        });

        btnZero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnPlus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPlus.setText("+");
        btnPlus.setPreferredSize(new java.awt.Dimension(43, 31));
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnMinus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnMnozenie.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMnozenie.setText("*");
        btnMnozenie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMnozenieActionPerformed(evt);
            }
        });

        btnPodziel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPodziel.setText("/");
        btnPodziel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPodzielActionPerformed(evt);
            }
        });

        btnPierwiastek.setFont(new java.awt.Font("Symbol", 1, 14)); // NOI18N
        btnPierwiastek.setText("");
        btnPierwiastek.setMaximumSize(new java.awt.Dimension(43, 31));
        btnPierwiastek.setMinimumSize(new java.awt.Dimension(43, 31));
        btnPierwiastek.setPreferredSize(new java.awt.Dimension(43, 31));
        btnPierwiastek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPierwiastekActionPerformed(evt);
            }
        });

        btnPlusMinus.setFont(new java.awt.Font("Symbol", 1, 14)); // NOI18N
        btnPlusMinus.setText("");
        btnPlusMinus.setMaximumSize(new java.awt.Dimension(43, 31));
        btnPlusMinus.setMinimumSize(new java.awt.Dimension(43, 31));
        btnPlusMinus.setPreferredSize(new java.awt.Dimension(43, 31));
        btnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinusActionPerformed(evt);
            }
        });

        txtWynik.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtWynik.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtWynik.setText("0");
        txtWynik.setName("txtWynik"); // NOI18N

        btnKasuj.setFont(new java.awt.Font("Wingdings", 1, 12)); // NOI18N
        btnKasuj.setText("");
        btnKasuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKasujActionPerformed(evt);
            }
        });

        btnPrzecinek.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrzecinek.setText(",");
        btnPrzecinek.setMaximumSize(new java.awt.Dimension(43, 31));
        btnPrzecinek.setMinimumSize(new java.awt.Dimension(43, 31));
        btnPrzecinek.setPreferredSize(new java.awt.Dimension(43, 31));
        btnPrzecinek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrzecinekActionPerformed(evt);
            }
        });

        btnWyczysc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnWyczysc.setText("C");
        btnWyczysc.setMaximumSize(new java.awt.Dimension(43, 31));
        btnWyczysc.setMinimumSize(new java.awt.Dimension(43, 31));
        btnWyczysc.setPreferredSize(new java.awt.Dimension(43, 31));
        btnWyczysc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWyczyscActionPerformed(evt);
            }
        });

        btnRownasie.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRownasie.setText("=");
        btnRownasie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRownasieActionPerformed(evt);
            }
        });

        btnBin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBin.setText("BIN");
        btnBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinActionPerformed(evt);
            }
        });

        btnHex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHex.setText("HEX");
        btnHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexActionPerformed(evt);
            }
        });

        btnOct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOct.setText("OCT");
        btnOct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOctActionPerformed(evt);
            }
        });

        btnBin1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBin1.setText(" A ");
        btnBin1.setMaximumSize(new java.awt.Dimension(67, 31));
        btnBin1.setMinimumSize(new java.awt.Dimension(67, 31));
        btnBin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBin1ActionPerformed(evt);
            }
        });

        btnOct1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOct1.setText(" B ");
        btnOct1.setMaximumSize(new java.awt.Dimension(67, 31));
        btnOct1.setMinimumSize(new java.awt.Dimension(67, 31));
        btnOct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOct1ActionPerformed(evt);
            }
        });

        btnHex1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHex1.setText(" C ");
        btnHex1.setMaximumSize(new java.awt.Dimension(67, 31));
        btnHex1.setMinimumSize(new java.awt.Dimension(67, 31));
        btnHex1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHex1ActionPerformed(evt);
            }
        });

        btnBin2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBin2.setText(" D ");
        btnBin2.setMaximumSize(new java.awt.Dimension(67, 31));
        btnBin2.setMinimumSize(new java.awt.Dimension(67, 31));
        btnBin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBin2ActionPerformed(evt);
            }
        });

        btnOct2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOct2.setText(" E ");
        btnOct2.setMaximumSize(new java.awt.Dimension(67, 31));
        btnOct2.setMinimumSize(new java.awt.Dimension(67, 31));
        btnOct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOct2ActionPerformed(evt);
            }
        });

        btnHex2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHex2.setText(" F ");
        btnHex2.setMaximumSize(new java.awt.Dimension(67, 31));
        btnHex2.setMinimumSize(new java.awt.Dimension(67, 31));
        btnHex2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHex2ActionPerformed(evt);
            }
        });

        jButton1.setText("BIN -> DEC");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("OCT -> DEC");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("HEX -> DEC");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNaukowyLayout = new javax.swing.GroupLayout(jPanelNaukowy);
        jPanelNaukowy.setLayout(jPanelNaukowyLayout);
        jPanelNaukowyLayout.setHorizontalGroup(
            jPanelNaukowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNaukowyLayout.createSequentialGroup()
                .addGroup(jPanelNaukowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNaukowyLayout.createSequentialGroup()
                        .addComponent(btnBin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOct))
                    .addGroup(jPanelNaukowyLayout.createSequentialGroup()
                        .addGroup(jPanelNaukowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBin2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelNaukowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOct1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(btnOct2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNaukowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNaukowyLayout.createSequentialGroup()
                        .addComponent(btnHex2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelNaukowyLayout.createSequentialGroup()
                        .addGroup(jPanelNaukowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHex1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHex))
                        .addGap(0, 8, Short.MAX_VALUE))))
            .addGroup(jPanelNaukowyLayout.createSequentialGroup()
                .addGroup(jPanelNaukowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelNaukowyLayout.setVerticalGroup(
            jPanelNaukowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNaukowyLayout.createSequentialGroup()
                .addGroup(jPanelNaukowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHex, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanelNaukowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBin1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOct1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHex1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelNaukowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBin2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOct2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHex2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelStandardowyLayout = new javax.swing.GroupLayout(jPanelStandardowy);
        jPanelStandardowy.setLayout(jPanelStandardowyLayout);
        jPanelStandardowyLayout.setHorizontalGroup(
            jPanelStandardowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStandardowyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStandardowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelStandardowyLayout.createSequentialGroup()
                        .addComponent(btnCztery, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPiec, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSzesc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelStandardowyLayout.createSequentialGroup()
                        .addComponent(btnJeden, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDwa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTrzy, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelStandardowyLayout.createSequentialGroup()
                        .addGroup(jPanelStandardowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSiedem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKasuj, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelStandardowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelStandardowyLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOsiem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDziewiec, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMnozenie, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelStandardowyLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnPierwiastek, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPodziel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelStandardowyLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnPrzecinek, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnWyczysc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRownasie, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtWynik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanelNaukowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelStandardowyLayout.setVerticalGroup(
            jPanelStandardowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStandardowyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStandardowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelStandardowyLayout.createSequentialGroup()
                        .addComponent(txtWynik, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelStandardowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnJeden, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDwa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTrzy, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelStandardowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCztery, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPiec, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSzesc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelStandardowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDziewiec, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOsiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSiedem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMnozenie, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelStandardowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPodziel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPierwiastek, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanelNaukowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelStandardowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKasuj, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRownasie, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrzecinek, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWyczysc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jIPPanel.setMaximumSize(new java.awt.Dimension(619, 328));
        jIPPanel.setMinimumSize(new java.awt.Dimension(619, 328));
        jIPPanel.setName(""); // NOI18N
        jIPPanel.setOpaque(false);

        txtone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtone.setMaximumSize(new java.awt.Dimension(40, 25));
        txtone.setMinimumSize(new java.awt.Dimension(40, 25));
        txtone.setPreferredSize(new java.awt.Dimension(40, 30));
        txtone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtoneKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtoneKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtoneKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(".");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setMaximumSize(new java.awt.Dimension(12, 17));
        jLabel1.setMinimumSize(new java.awt.Dimension(12, 17));
        jLabel1.setPreferredSize(new java.awt.Dimension(12, 17));
        jLabel1.setRequestFocusEnabled(false);

        txttwo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttwo.setMaximumSize(new java.awt.Dimension(40, 25));
        txttwo.setMinimumSize(new java.awt.Dimension(40, 25));
        txttwo.setPreferredSize(new java.awt.Dimension(40, 30));
        txttwo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttwoKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(".");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setMaximumSize(new java.awt.Dimension(12, 17));
        jLabel2.setMinimumSize(new java.awt.Dimension(12, 17));
        jLabel2.setPreferredSize(new java.awt.Dimension(12, 17));
        jLabel2.setRequestFocusEnabled(false);

        txtthree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtthree.setMaximumSize(new java.awt.Dimension(40, 25));
        txtthree.setMinimumSize(new java.awt.Dimension(40, 25));
        txtthree.setPreferredSize(new java.awt.Dimension(40, 30));
        txtthree.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtthreeKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(".");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setMaximumSize(new java.awt.Dimension(12, 17));
        jLabel3.setMinimumSize(new java.awt.Dimension(12, 17));
        jLabel3.setPreferredSize(new java.awt.Dimension(12, 17));
        jLabel3.setRequestFocusEnabled(false);

        txtfour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtfour.setMaximumSize(new java.awt.Dimension(40, 25));
        txtfour.setMinimumSize(new java.awt.Dimension(40, 25));
        txtfour.setPreferredSize(new java.awt.Dimension(40, 30));
        txtfour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfourKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("/");
        jLabel4.setToolTipText("");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setMaximumSize(new java.awt.Dimension(12, 17));
        jLabel4.setMinimumSize(new java.awt.Dimension(12, 17));
        jLabel4.setPreferredSize(new java.awt.Dimension(12, 17));
        jLabel4.setRequestFocusEnabled(false);

        txtmask.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmask.setMaximumSize(new java.awt.Dimension(40, 25));
        txtmask.setMinimumSize(new java.awt.Dimension(40, 25));
        txtmask.setPreferredSize(new java.awt.Dimension(40, 30));
        txtmask.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmaskKeyReleased(evt);
            }
        });

        lblipbinary0.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblipbinary0.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblipbinary0.setText("IP binarnie");
        lblipbinary0.setMaximumSize(new java.awt.Dimension(103, 23));
        lblipbinary0.setMinimumSize(new java.awt.Dimension(103, 23));
        lblipbinary0.setPreferredSize(new java.awt.Dimension(103, 23));

        lblbinary1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblbinary1.setMaximumSize(new java.awt.Dimension(380, 23));
        lblbinary1.setMinimumSize(new java.awt.Dimension(380, 23));
        lblbinary1.setPreferredSize(new java.awt.Dimension(380, 23));

        lblmaska0.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblmaska0.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblmaska0.setText("Maska binarnie");
        lblmaska0.setMaximumSize(new java.awt.Dimension(103, 23));
        lblmaska0.setMinimumSize(new java.awt.Dimension(103, 23));
        lblmaska0.setPreferredSize(new java.awt.Dimension(103, 23));

        lblmaska1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblmaska1.setMaximumSize(new java.awt.Dimension(380, 23));
        lblmaska1.setMinimumSize(new java.awt.Dimension(380, 23));
        lblmaska1.setPreferredSize(new java.awt.Dimension(380, 23));

        lblbroadcastbin1.setMaximumSize(new java.awt.Dimension(380, 23));
        lblbroadcastbin1.setMinimumSize(new java.awt.Dimension(380, 23));
        lblbroadcastbin1.setPreferredSize(new java.awt.Dimension(380, 23));

        lblbroadcastbin0.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblbroadcastbin0.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblbroadcastbin0.setText("Broadcast binarnie");
        lblbroadcastbin0.setMaximumSize(new java.awt.Dimension(103, 23));
        lblbroadcastbin0.setMinimumSize(new java.awt.Dimension(103, 23));
        lblbroadcastbin0.setPreferredSize(new java.awt.Dimension(103, 23));

        lblbroadcast.setMaximumSize(new java.awt.Dimension(380, 23));
        lblbroadcast.setMinimumSize(new java.awt.Dimension(380, 23));
        lblbroadcast.setPreferredSize(new java.awt.Dimension(380, 23));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Broadcast");
        jLabel12.setMaximumSize(new java.awt.Dimension(103, 23));
        jLabel12.setMinimumSize(new java.awt.Dimension(103, 23));
        jLabel12.setPreferredSize(new java.awt.Dimension(103, 23));

        lblsiecbin1.setMaximumSize(new java.awt.Dimension(380, 23));
        lblsiecbin1.setMinimumSize(new java.awt.Dimension(380, 23));
        lblsiecbin1.setPreferredSize(new java.awt.Dimension(380, 23));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Nr sieci binarnie");
        jLabel14.setMaximumSize(new java.awt.Dimension(103, 23));
        jLabel14.setMinimumSize(new java.awt.Dimension(103, 23));
        jLabel14.setPreferredSize(new java.awt.Dimension(103, 23));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Adres sieci");
        jLabel15.setMaximumSize(new java.awt.Dimension(103, 23));
        jLabel15.setMinimumSize(new java.awt.Dimension(103, 23));
        jLabel15.setPreferredSize(new java.awt.Dimension(103, 23));

        lblsiec.setMaximumSize(new java.awt.Dimension(380, 23));
        lblsiec.setMinimumSize(new java.awt.Dimension(380, 23));
        lblsiec.setPreferredSize(new java.awt.Dimension(380, 23));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Liczba hostów ");
        jLabel17.setMaximumSize(new java.awt.Dimension(103, 23));
        jLabel17.setMinimumSize(new java.awt.Dimension(103, 23));
        jLabel17.setPreferredSize(new java.awt.Dimension(103, 23));

        lblhosty.setMaximumSize(new java.awt.Dimension(380, 23));
        lblhosty.setMinimumSize(new java.awt.Dimension(380, 23));
        lblhosty.setPreferredSize(new java.awt.Dimension(380, 23));

        btnsieci.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnsieci.setText("Wyznacz");
        btnsieci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsieciMouseClicked(evt);
            }
        });
        btnsieci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsieciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jIPPanelLayout = new javax.swing.GroupLayout(jIPPanel);
        jIPPanel.setLayout(jIPPanelLayout);
        jIPPanelLayout.setHorizontalGroup(
            jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIPPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jIPPanelLayout.createSequentialGroup()
                        .addComponent(txtone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttwo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblipbinary0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblmaska0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblbroadcastbin0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jIPPanelLayout.createSequentialGroup()
                        .addComponent(txtthree, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfour, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtmask, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnsieci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblbinary1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmaska1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbroadcastbin1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbroadcast, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsiecbin1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsiec, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblhosty, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jIPPanelLayout.setVerticalGroup(
            jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIPPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtthree, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtmask, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsieci, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttwo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblipbinary0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblbinary1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblmaska0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblmaska1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblbroadcastbin0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblbroadcastbin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblbroadcast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblsiecbin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblsiec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblhosty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Standard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Naukowy");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("IP Kalkulator");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opis");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jOAplikacji.setText("O aplikacji");
        jOAplikacji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOAplikacjiActionPerformed(evt);
            }
        });
        jMenu2.add(jOAplikacji);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelStandardowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIPPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelStandardowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jIPPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

// Metoda /funkcja/ pomocnicza sprawdzająca czy w wyswietlaczu jest "E"
    int wynik(String dana)
    {
        int ogranicznik = dana.length();
        if (ogranicznik >= 12) { pomznak = 1; }
        else {
        
            for (int i = 0; i < ogranicznik; i++) 
            {
                char znaczek = dana.charAt(i); // pobieramy pojedynczy znak z napisu
                if (znaczek == znakE) // porównanie ze znakiem
                pomznak = 1; 
            } 
        }
        
        return pomznak;
    }
// Koniec metody pomocniczej
    
    
    private void btnJedenActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        pomznak = 0;
        
        T = txtWynik.getText();
       
       if (wynik(T)==1)
       {
           txtWynik.setText(T);
       }
       else {
           if (T.equals("0") || T.equals("-0") ||  T.equals("błąd danych")) { T="";}
       
       StringBuilder TB = new StringBuilder(T);
      
       TB.append(btnJeden.getText());
       T = TB.toString();
       txtWynik.setText(T); 
       }       
    }                                        

    private void btnDwaActionPerformed(java.awt.event.ActionEvent evt) {                                       
       
        pomznak = 0;
        
        T = txtWynik.getText();
       
       if (wynik(T)==1)
       {
           txtWynik.setText(T);
       }
       else {
        T = txtWynik.getText();
        if (T.equals("0") || T.equals("-0") ||  T.equals("błąd danych")) { T=""; }
       StringBuilder TB = new StringBuilder(T);
      
       TB.append(btnDwa.getText());
       T = TB.toString();
       txtWynik.setText(T);  
       }
    }                                      

    private void btnTrzyActionPerformed(java.awt.event.ActionEvent evt) {                                        
       
        pomznak = 0;
        
        T = txtWynik.getText();
       
       if (wynik(T)==1)
       {
           txtWynik.setText(T);
       }
       else {
        T = txtWynik.getText();
        if (T.equals("0") || T.equals("-0") ||  T.equals("błąd danych")) { T=""; }
       StringBuilder TB = new StringBuilder(T);
      
       TB.append(btnTrzy.getText());
       T = TB.toString();
       txtWynik.setText(T); 
       }
    }                                       

    private void btnPiecActionPerformed(java.awt.event.ActionEvent evt) {                                        
       
        pomznak = 0;
        
        T = txtWynik.getText();
       
       if (wynik(T)==1)
       {
           txtWynik.setText(T);
       }
       else {
        T = txtWynik.getText();
        if (T.equals("0") || T.equals("-0") ||  T.equals("błąd danych")) { T=""; }
       StringBuilder TB = new StringBuilder(T);
      
       TB.append(btnPiec.getText());
       T = TB.toString();
       txtWynik.setText(T); 
       }
    }                                       

    private void btnCzteryActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
        pomznak = 0;
        
        T = txtWynik.getText();
       
       if (wynik(T)==1)
       {
           txtWynik.setText(T);
       }
       else {
        T = txtWynik.getText();
        if (T.equals("0") || T.equals("-0") ||  T.equals("błąd danych")) { T=""; }
       StringBuilder TB = new StringBuilder(T);
      
       TB.append(btnCztery.getText());
       T = TB.toString();
       txtWynik.setText(T);  
       }
    }                                         

    private void btnSzescActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        pomznak = 0;
        
        T = txtWynik.getText();
       
       if (wynik(T)==1)
       {
           txtWynik.setText(T);
       }
       else {
        T = txtWynik.getText();
        if (T.equals("0") || T.equals("-0") ||  T.equals("błąd danych")) { T=""; }
       StringBuilder TB = new StringBuilder(T);
      
       
