package javaKalkulator;

/**
 *
 * @author Tomek
 */
public class MatKalkulator extends javax.swing.JFrame {

    private double wynik1 = 0.0;
    private double wynik2 = 0.0;
   private double minus = 0.0;
    private char znak;
    private final String Blad = "błąd danych";
    private final String Z = "0";
    private final char Kropka = '.';
    private int pom;
    private String T;
    private String pole1="";
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
        btnMinus = new javax.swing.JButton();
        btnMnozenie = new javax.swing.JButton();
        btnPodziel = new javax.swing.JButton();
        btnPierwiastek = new javax.swing.JButton();
        btnPlusMinus = new javax.swing.JButton();
        txtWynik = new javax.swing.JTextField();
        btnKasuj = new javax.swing.JButton();
        btnPrzecinek = new javax.swing.JButton();
        btnWyczysc = new javax.swing.JButton();
        btnRownasie = new javax.swing.JButton();
        jPanelNaukowy = new javax.swing.JPanel();
        btnBin = new javax.swing.JButton();
        btnHex = new javax.swing.JButton();
        btnOct = new javax.swing.JButton();
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
        lbladressieci1 = new javax.swing.JLabel();
        lbladressieci0 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnsieci = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

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
        
       btnTrzyIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTrzyIP.setText("3");
        btnTrzyIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrzyIPActionPerformed(evt);
            }
        });

        btnCzteryIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCzteryIP.setText("4");
        btnCzteryIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCzteryIPActionPerformed(evt);
            }
        });

        btnPiecIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPiecIP.setText("5");
        btnPiecIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiecIPActionPerformed(evt);
            }
        });

        btnSzescIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSzescIP.setText("6");
        btnSzescIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSzescIPActionPerformed(evt);
            }
        });

        btnSiedemIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSiedemIP.setText("7");
        btnSiedemIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiedemIPActionPerformed(evt);
            }
        });

        btnOsiemIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOsiemIP.setText("8");
        btnOsiemIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsiemIPActionPerformed(evt);
            }
        });

        btnDziewiecIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDziewiecIP.setText("9");
        btnDziewiecIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDziewiecIPActionPerformed(evt);
            }
        });

        btnZeroIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnZeroIP.setText("0");
        btnZeroIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroIPActionPerformed(evt);
            }
        });

        btnWyznaczIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnWyznaczIP.setText("=");
        btnWyznaczIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWyznaczIPActionPerformed(evt);
            }
        });

        btnKasujIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnKasujIP.setText("C");
        btnKasujIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKasujIPActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout jIPPanelLayout = new javax.swing.GroupLayout(jIPPanel);
        jIPPanel.setLayout(jIPPanelLayout);
        jIPPanelLayout.setHorizontalGroup(
            jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIPPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jIPPanelLayout.createSequentialGroup()
                        .addComponent(btnCzteryIP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPiecIP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSzescIP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jIPPanelLayout.createSequentialGroup()
                        .addComponent(btnJedenIP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDwaIP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTrzyIP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jIPPanelLayout.createSequentialGroup()
                        .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnZeroIP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSiedemIP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOsiemIP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKasujIP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnWyznaczIP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDziewiecIP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(76, 76, 76))
        );
        jIPPanelLayout.setVerticalGroup(
            jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIPPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jIPPanelLayout.createSequentialGroup()
                        .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnJedenIP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDwaIP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTrzyIP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCzteryIP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPiecIP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSzescIP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDziewiecIP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOsiemIP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSiedemIP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnZeroIP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnWyznaczIP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKasujIP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(54, Short.MAX_VALUE))
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
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelStandardowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelNaukowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jIPPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelStandardowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelNaukowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jIPPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
        
        private void btnJedenActionPerformed(java.awt.event.ActionEvent evt) {                                         
       String btnJedenTekst = txtWynik.getText() + btnJeden.getText();
       txtWynik.setText(btnJedenTekst);        
    }                                        

    private void btnDwaActionPerformed(java.awt.event.ActionEvent evt) {                                       
       String btnDwaTekst = txtWynik.getText() + btnDwa.getText();
       txtWynik.setText(btnDwaTekst); 
    }                                      

    private void btnTrzyActionPerformed(java.awt.event.ActionEvent evt) {                                        
       String btnTrzyTekst = txtWynik.getText() + btnTrzy.getText();
       txtWynik.setText(btnTrzyTekst);
    }                                      

       private void btnPiecActionPerformed(java.awt.event.ActionEvent evt) {                                        
       String btnPiecTekst = txtWynik.getText() + btnPiec.getText();
       txtWynik.setText(btnPiecTekst);
    }                                       

    private void btnCzteryActionPerformed(java.awt.event.ActionEvent evt) {                                          
       String btnCzteryTekst = txtWynik.getText() + btnCztery.getText();
       txtWynik.setText(btnCzteryTekst);
    }                                         
 private void btnSzescActionPerformed(java.awt.event.ActionEvent evt) {                                         
      String btnSzescTekst = txtWynik.getText() + btnSzesc.getText();
       txtWynik.setText(btnSzescTekst);
      
    }                                        

    private void btnSiedemActionPerformed(java.awt.event.ActionEvent evt) {                                          
      String btnSiedemTekst = txtWynik.getText() + btnSiedem.getText();
       txtWynik.setText(btnSiedemTekst);
    }                                         

    private void btnOsiemActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String btnOsiemTekst = txtWynik.getText() + btnOsiem.getText();
       txtWynik.setText(btnOsiemTekst);
    }                                        

    private void btnDziewiecActionPerformed(java.awt.event.ActionEvent evt) {                                            
      String btnDziewiecTekst = txtWynik.getText() + btnDziewiec.getText();
       txtWynik.setText(btnDziewiecTekst); 
    }                                           

    private void btnBinActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void btnOctActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void btnHexActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {                                        
       String btnZeroTekst = txtWynik.getText() + btnZero.getText();
       txtWynik.setText(btnZeroTekst);
    }                                       

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {                                        
       wynik1 = Double.parseDouble( txtWynik.getText( ) ) ;
       txtWynik.setText("");
       znak = '+';
    }                                       

    private void btnZero1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnZero2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnZero3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnZero4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnPierwiastekActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
        this.setResizable(true);
        this.setSize(240, 360);
    }                                    

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        this.setResizable(false);
        this.setSize(240, 360);
    }                                      

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setResizable(false);
        this.setSize(500, 360);
        jPanelStandardowy.setVisible(true);
        jPanelNaukowy.setVisible(true);
        jIPPanel.setVisible(false);
    }                                          

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setResizable(false);
        this.setSize(240, 360);
        jPanelStandardowy.setVisible(true);
        jPanelNaukowy.setVisible(false);
        jIPPanel.setVisible(false);
    }                                          

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setResizable(false);
        this.setSize(620, 400);
        jPanelStandardowy.setVisible(false);
        jPanelNaukowy.setVisible(false);
        jIPPanel.setVisible(true);
    }                                          

    private void btnJedenIPActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void btnDwaIPActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnTrzyIPActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void btnCzteryIPActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btnPiecIPActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void btnSzescIPActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void btnSiedemIPActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btnOsiemIPActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void btnDziewiecIPActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void btnZeroIPActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void btnWyznaczIPActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void btnKasujIPActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    /**
     * @param args the command line arguments
     */
      
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MatKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatKalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnBin;
    private javax.swing.JButton btnCztery;
    private javax.swing.JButton btnCzteryIP;
    private javax.swing.JButton btnDwa;
    private javax.swing.JButton btnDwaIP;
    private javax.swing.JButton btnDziewiec;
    private javax.swing.JButton btnDziewiecIP;
    private javax.swing.JButton btnHex;
    private javax.swing.JButton btnJeden;
    private javax.swing.JButton btnJedenIP;
    private javax.swing.JButton btnKasujIP;
    private javax.swing.JButton btnOct;
    private javax.swing.JButton btnOsiem;
    private javax.swing.JButton btnOsiemIP;
    private javax.swing.JButton btnPiec;
    private javax.swing.JButton btnPiecIP;
    private javax.swing.JButton btnPierwiastek;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSiedem;
    private javax.swing.JButton btnSiedemIP;
    private javax.swing.JButton btnSzesc;
    private javax.swing.JButton btnSzescIP;
    private javax.swing.JButton btnTrzy;
    private javax.swing.JButton btnTrzyIP;
    private javax.swing.JButton btnWyznaczIP;
    private javax.swing.JButton btnZero;
    private javax.swing.JButton btnZero1;
    private javax.swing.JButton btnZero2;
    private javax.swing.JButton btnZero3;
    private javax.swing.JButton btnZero4;
    private javax.swing.JButton btnZeroIP;
    private javax.swing.JPanel jIPPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanelNaukowy;
    private javax.swing.JPanel jPanelStandardowy;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtWynik;
    // End of variables declaration                   
}

