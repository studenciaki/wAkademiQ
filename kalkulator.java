package javaKalkulator;

/**
 *
 * @author Tomek
 */
public class MatKalkulator extends javax.swing.JFrame {

    private double wynik1 = 0.0;
    private double wynik2 = 0.0;
    private char znak;
    /**
     * Creates new form MatKalkulator
     */
    public MatKalkulator() {
        initComponents();
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
        btnZero1 = new javax.swing.JButton();
        btnZero2 = new javax.swing.JButton();
        btnZero3 = new javax.swing.JButton();
        btnZero4 = new javax.swing.JButton();
        btnPierwiastek = new javax.swing.JButton();
        txtWynik = new javax.swing.JTextField();
        jPanelNaukowy = new javax.swing.JPanel();
        btnBin = new javax.swing.JButton();
        btnHex = new javax.swing.JButton();
        btnOct = new javax.swing.JButton();
        jIPPanel = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnJedenIP = new javax.swing.JButton();
        btnDwaIP = new javax.swing.JButton();
        btnTrzyIP = new javax.swing.JButton();
        btnCzteryIP = new javax.swing.JButton();
        btnPiecIP = new javax.swing.JButton();
        btnSzescIP = new javax.swing.JButton();
        btnSiedemIP = new javax.swing.JButton();
        btnOsiemIP = new javax.swing.JButton();
        btnDziewiecIP = new javax.swing.JButton();
        btnZeroIP = new javax.swing.JButton();
        btnWyznaczIP = new javax.swing.JButton();
        btnKasujIP = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator 1.0 by ...");
        setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
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

        btnZero1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnZero1.setText("-");
        btnZero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZero1ActionPerformed(evt);
            }
        });

        btnZero2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnZero2.setText("*");
        btnZero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZero2ActionPerformed(evt);
            }
        });

        btnZero3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnZero3.setText("/");
        btnZero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZero3ActionPerformed(evt);
            }
        });

        btnZero4.setFont(new java.awt.Font("Symbol", 1, 14)); // NOI18N
        btnZero4.setText("");
        btnZero4.setMaximumSize(new java.awt.Dimension(43, 31));
        btnZero4.setMinimumSize(new java.awt.Dimension(43, 31));
        btnZero4.setPreferredSize(new java.awt.Dimension(43, 31));
        btnZero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZero4ActionPerformed(evt);
            }
        });

        btnPierwiastek.setFont(new java.awt.Font("Symbol", 1, 14)); // NOI18N
        btnPierwiastek.setText("");
        btnPierwiastek.setMaximumSize(new java.awt.Dimension(43, 31));
        btnPierwiastek.setMinimumSize(new java.awt.Dimension(43, 31));
        btnPierwiastek.setPreferredSize(new java.awt.Dimension(43, 31));
        btnPierwiastek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPierwiastekActionPerformed(evt);
            }
        });

        txtWynik.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtWynik.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtWynik.setName("txtWynik"); // NOI18N

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
                        .addComponent(btnZero1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(btnSiedem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelStandardowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelStandardowyLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOsiem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDziewiec, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnZero2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelStandardowyLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnZero4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPierwiastek, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnZero3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtWynik))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelStandardowyLayout.setVerticalGroup(
            jPanelStandardowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStandardowyLayout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(btnZero1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelStandardowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDziewiec, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOsiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiedem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZero2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelStandardowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZero3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZero4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPierwiastek, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

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

        javax.swing.GroupLayout jPanelNaukowyLayout = new javax.swing.GroupLayout(jPanelNaukowy);
        jPanelNaukowy.setLayout(jPanelNaukowyLayout);
        jPanelNaukowyLayout.setHorizontalGroup(
            jPanelNaukowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNaukowyLayout.createSequentialGroup()
                .addComponent(btnBin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHex))
        );
        jPanelNaukowyLayout.setVerticalGroup(
            jPanelNaukowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNaukowyLayout.createSequentialGroup()
                .addGroup(jPanelNaukowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHex, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField6.setMaximumSize(new java.awt.Dimension(40, 30));
        jTextField6.setMinimumSize(new java.awt.Dimension(40, 30));
        jTextField6.setPreferredSize(new java.awt.Dimension(40, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(".");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setMaximumSize(new java.awt.Dimension(12, 17));
        jLabel1.setMinimumSize(new java.awt.Dimension(12, 17));
        jLabel1.setPreferredSize(new java.awt.Dimension(12, 17));
        jLabel1.setRequestFocusEnabled(false);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.setMaximumSize(new java.awt.Dimension(40, 30));
        jTextField7.setMinimumSize(new java.awt.Dimension(40, 30));
        jTextField7.setPreferredSize(new java.awt.Dimension(40, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(".");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setMaximumSize(new java.awt.Dimension(12, 17));
        jLabel2.setMinimumSize(new java.awt.Dimension(12, 17));
        jLabel2.setPreferredSize(new java.awt.Dimension(12, 17));
        jLabel2.setRequestFocusEnabled(false);

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField8.setMaximumSize(new java.awt.Dimension(40, 30));
        jTextField8.setMinimumSize(new java.awt.Dimension(40, 30));
        jTextField8.setPreferredSize(new java.awt.Dimension(40, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(".");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setMaximumSize(new java.awt.Dimension(12, 17));
        jLabel3.setMinimumSize(new java.awt.Dimension(12, 17));
        jLabel3.setPreferredSize(new java.awt.Dimension(12, 17));
        jLabel3.setRequestFocusEnabled(false);

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.setMaximumSize(new java.awt.Dimension(0, 0));
        jTextField9.setMinimumSize(new java.awt.Dimension(40, 30));
        jTextField9.setPreferredSize(new java.awt.Dimension(40, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("/");
        jLabel4.setToolTipText("");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setMaximumSize(new java.awt.Dimension(12, 17));
        jLabel4.setMinimumSize(new java.awt.Dimension(12, 17));
        jLabel4.setPreferredSize(new java.awt.Dimension(12, 17));
        jLabel4.setRequestFocusEnabled(false);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setMaximumSize(new java.awt.Dimension(40, 30));
        jTextField1.setMinimumSize(new java.awt.Dimension(40, 30));
        jTextField1.setPreferredSize(new java.awt.Dimension(40, 30));

        btnJedenIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnJedenIP.setText("1");
        btnJedenIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJedenIPActionPerformed(evt);
            }
        });

       btnDwaIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDwaIP.setText("2");
        btnDwaIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDwaIPActionPerformed(evt);
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
    }
