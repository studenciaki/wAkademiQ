/*
 * Paczka Kalkulator
 */
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
    private final char znakE = 'E';
    private int pom;
    private int pomznak;
    private String T;
    private String pole1="";
    private String pole2="";
    private String pole3="";
    private String pole4="";
    private String pole5="";
    private String pomsiec="";
    private String pombroadcast="";
    private static final int MAX_BASE = 36;
    private static final String pattern = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    
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
        lblbroadcastbin1 = new javax.swing.JLabel();
        lblbroadcastbin0 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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
                    .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelStandardowyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKasuj, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRownasie, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrzecinek, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWyczysc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabel11.setMaximumSize(new java.awt.Dimension(380, 23));
        jLabel11.setMinimumSize(new java.awt.Dimension(380, 23));
        jLabel11.setPreferredSize(new java.awt.Dimension(380, 23));

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
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsiecbin1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsiec, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblhosty, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jIPPanelLayout.setVerticalGroup(
            jIPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIPPanelLayout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(lblhosty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(161, Short.MAX_VALUE))
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
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelStandardowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelNaukowy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jIPPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

// Metoda /funkcja/ pomocnicza sprawdzająca czy w wyswietlaczu jest "E"
    int wynik(String dana)
    {
        int ogranicznik = dana.length();
        for (int i = 0; i < ogranicznik; i++) 
        {
          char znaczek = dana.charAt(i); // pobieramy pojedynczy znak z napisu
          if (znaczek == znakE) // porównanie ze znakiem
              pomznak = 1; 
        } 
        
        return pomznak;
    }
// Koniec metody pomocniczej            

    
     private void btnJedenActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
       T = txtWynik.getText();
        if (T.equals("0") || T.equals("-0") ||  T.equals("błąd danych")) { T=""; }
       StringBuilder TB = new StringBuilder(T);
      
       TB.append(btnDwa.getText());
       T = TB.toString();
       txtWynik.setText(T);  
    }                                      

    private void btnTrzyActionPerformed(java.awt.event.ActionEvent evt) {                                        
       T = txtWynik.getText();
        if (T.equals("0") || T.equals("-0") ||  T.equals("błąd danych")) { T=""; }
       StringBuilder TB = new StringBuilder(T);
      
       TB.append(btnTrzy.getText());
       T = TB.toString();
       txtWynik.setText(T);  
    }                                       

    private void btnPiecActionPerformed(java.awt.event.ActionEvent evt) {                                        
       T = txtWynik.getText();
        if (T.equals("0") || T.equals("-0") ||  T.equals("błąd danych")) { T=""; }
       StringBuilder TB = new StringBuilder(T);
      
       TB.append(btnPiec.getText());
       T = TB.toString();
       txtWynik.setText(T);  
    }                                       

     private void btnCzteryActionPerformed(java.awt.event.ActionEvent evt) {                                          
       T = txtWynik.getText();
        if (T.equals("0") || T.equals("-0") ||  T.equals("błąd danych")) { T=""; }
       StringBuilder TB = new StringBuilder(T);
      
       TB.append(btnCztery.getText());
       T = TB.toString();
       txtWynik.setText(T);  
    }    
    
    private void btnSzescActionPerformed(java.awt.event.ActionEvent evt) {                                         
       T = txtWynik.getText();
        if (T.equals("0") || T.equals("-0") ||  T.equals("błąd danych")) { T=""; }
       StringBuilder TB = new StringBuilder(T);
      
       TB.append(btnSzesc.getText());
       T = TB.toString();
       txtWynik.setText(T);  
    }                                        

    private void btnSiedemActionPerformed(java.awt.event.ActionEvent evt) {                                          
       T = txtWynik.getText();
       if (T.equals("0") || T.equals("-0") ||  T.equals("błąd danych")) { T=""; }
       StringBuilder TB = new StringBuilder(T);
      
       TB.append(btnSiedem.getText());
       T = TB.toString();
       txtWynik.setText(T);  
    }                                         

    private void btnOsiemActionPerformed(java.awt.event.ActionEvent evt) {                                         
       T = txtWynik.getText();
        if (T.equals("0") || T.equals("-0") ||  T.equals("błąd danych")) { T=""; }
       StringBuilder TB = new StringBuilder(T);
      
       TB.append(btnOsiem.getText());
       T = TB.toString();
       txtWynik.setText(T);  
    } 
    
         private void btnDziewiecActionPerformed(java.awt.event.ActionEvent evt) {                                            
       T = txtWynik.getText();
        if (T.equals("0") || T.equals("-0") ||  T.equals("błąd danych")) { T=""; }
       StringBuilder TB = new StringBuilder(T);
      
       TB.append(btnDziewiec.getText());
       T = TB.toString();
       txtWynik.setText(T);  
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

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {                                         
       wynik1 = Double.parseDouble( txtWynik.getText( ) ) ;
       txtWynik.setText("");
       znak = '-';
    }                                        

    private void btnMnozenieActionPerformed(java.awt.event.ActionEvent evt) {                                            
       wynik1 = Double.parseDouble( txtWynik.getText( ) ) ;
       txtWynik.setText("");
       znak = '*';
    }                                           

    private void btnPodzielActionPerformed(java.awt.event.ActionEvent evt) {                                           
       wynik1 = Double.parseDouble( txtWynik.getText( ) ) ;
       txtWynik.setText("");
       znak = '/';
    }                                          

    private void btnPierwiastekActionPerformed(java.awt.event.ActionEvent evt) {                                               
       wynik1 = Double.parseDouble( txtWynik.getText() ) ;
       if (wynik1 < 0)  {
           txtWynik.setText(Blad);
           } 
       else {
           wynik1 = Math.sqrt(wynik1);
           txtWynik.setText(String.valueOf(wynik1));
        }
    }                                              

    private void btnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {                                             
       minus = Double.parseDouble( txtWynik.getText() ) ;
       minus = -1 * minus;
       txtWynik.setText(String.valueOf(minus));
    }                                            

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
        this.setResizable(false);
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

    private void btnKasujActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String PT = txtWynik.getText();
        if (PT.equals(Blad)) {
            txtWynik.setText("0");
        }
        else {
        int s = PT.length()-1;
        if (s <= 0) {
            txtWynik.setText(""); 
        }
        else {
        PT = PT.substring(0,s);
        //if (T.equals("0") || T.equals("-0") ||  T.equals("błąd danych")) { T=""; }
       
       txtWynik.setText(PT);
        }
        }
    }                                        

    private void btnPrzecinekActionPerformed(java.awt.event.ActionEvent evt) {                                             
       String btnZeroTekst = txtWynik.getText() ;
       for (int i = 0; i < btnZeroTekst.length(); i++) 
        {
          char znak_z_napisu = btnZeroTekst.charAt(i); // pobieramy pojedynczy znak z napisu
          if (znak_z_napisu == Kropka) // porównanie ze znakiem
              pom = 1; 
        } 
       if (pom != 1)  {
          btnZeroTekst = txtWynik.getText() + ".";
          txtWynik.setText(btnZeroTekst) ;
       }
    }                                            

    private void btnWyczyscActionPerformed(java.awt.event.ActionEvent evt) {                                           
        txtWynik.setText("0");
    }                                          

    private void btnRownasieActionPerformed(java.awt.event.ActionEvent evt) {                                            
       wynik2 = Double.parseDouble( txtWynik.getText( ) ) ;
               
        switch (znak)
        {
            case '+':
                wynik1 = wynik1 + wynik2;
                T = Double.toString(wynik1);
                txtWynik.setText(T);
                break;
                
            case '-':
                wynik1 = wynik1 - wynik2;
                T = Double.toString(wynik1);
                txtWynik.setText(T);
                break;
                
            case '*':
                wynik1 = wynik1 * wynik2;
                T = Double.toString(wynik1);
                txtWynik.setText(T);
                break;
                
            case '/':
                if (wynik2 != 0) {
                    wynik1 = wynik1 / wynik2;
                    T = Double.toString(wynik1);
                    txtWynik.setText(T);
                    }
                else  {
                    txtWynik.setText(Blad);
                } 
                    
                break;
            
                
            default:
                
        }
    }                                           

    private void btnsieciMouseClicked(java.awt.event.MouseEvent evt) {                                      
          /* returns the string representation of the unsigned integer value 
         represented by the argument in binary (base 2) */
      //System.out.println("Binary is " + Integer.toBinaryString(i));

      // returns the number of one-bits 
      //System.out.println("Number of one bits = " + Integer.bitCount(i)); 
    }                                     

    private void btnsieciActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int one, two, three, four, mask; //kolejne oktety i maska
      String s1, s2, s3, s4, s5, s=""; //lancuchy tekstowe dla poszczegolnych oktetow 
      s1 = txtone.getText();
      s2 = txttwo.getText();
      s3 = txtthree.getText();
      s4 = txtfour.getText();
      s5 = txtmask.getText();
    
      
      if ( s5.equals("") || s1.equals("") || s2.equals("") || s3.equals("") || s4.equals("") )
      {
          lblbinary1.setText("Uzupełnij dane!");
      }
      else
      {
          one   = Integer.parseInt(s1);
          two   = Integer.parseInt(s2);
          three = Integer.parseInt(s3);
          four  = Integer.parseInt(s4);
          mask  = Integer.parseInt(s5);
          String bin = Integer.toBinaryString(one);
          int pombin = 8 - bin.length();
          for (int z=1; z<=pombin; z++)
          {
              bin = '0' + bin;
          }
          s = s+bin;
          bin = bin + '.';
          lblbinary1.setText(bin);
          
          
          bin = Integer.toBinaryString(two);
          pombin = 8 - bin.length();
          for (int z=1; z<=pombin; z++)
          {
              bin = '0' + bin;
          }
          s = s+bin;
          bin = bin + '.';
          lblbinary1.setText(lblbinary1.getText() + bin);
          
          bin = Integer.toBinaryString(three);
          pombin = 8 - bin.length();
          for (int z=1; z<=pombin; z++)
          {
              bin = '0' + bin;
          }
          s = s+bin;
          bin = bin + '.';
          lblbinary1.setText(lblbinary1.getText() + bin);
          
          bin = Integer.toBinaryString(four);
          pombin = 8 - bin.length();
          for (int z=1; z<=pombin; z++)
          {
              bin = '0' + bin;
          }
          s = s+bin;
          lblbinary1.setText(lblbinary1.getText() + bin);
          
          //wyznaczanie binarnej maski
          bin = "";
          for (int z=1; z<=mask; z++)
          {
              bin = bin + '1';
              if (z%8 == 0)
              {
                 bin = bin + '.'; 
              }
          }
          
          for (int z=mask+1; z<=32; z++)
          {
              bin = bin + '0';
              if ( (z%8 == 0) && (z != 32) )
              {
                 bin = bin + '.'; 
              }
          }
          
          lblmaska1.setText(bin);
          
          //Wyznaczanie adresu sieci binarnie
          String siecbin = "";
          for (int z = 1; z<=mask; z++) 
          {
              siecbin =  siecbin + s.charAt(z-1); //czytanie pojedynczego znaku z łańcucha s
              if (z%8 == 0)
              {
                 siecbin = siecbin + '.'; 
              }
          }
          for (int z=mask+1; z<=32; z++)
          {
              siecbin = siecbin + '0';
              if ( (z%8 == 0) && (z != 32) )
              {
                 siecbin = siecbin + '.'; 
              }
          }
          lblsiecbin1.setText(siecbin);
          
          //Wyznaczanie adresu sieci dziesiętnie
          int chwila, wyk=128;
          int liczba=0;
          pomsiec =siecbin.substring(0,8)  + siecbin.substring(9);
          pomsiec =pomsiec.substring(0,16) + pomsiec.substring(17);
          pomsiec =pomsiec.substring(0,24) + pomsiec.substring(25);
          lblsiec.setText("");
          
          for (int z=0; z<32; z++)
          {
              chwila = ((int)(pomsiec.charAt(z))) - 48;
              liczba = chwila * wyk + liczba;
              wyk = wyk/2;
              
              if (z%8==7)
              {
                  wyk=128;
                  lblsiec.setText(lblsiec.getText() + Integer.toString(liczba));
                  lblsiec.setText(lblsiec.getText() + '.');
                  liczba=0;
              }
          }
          // koniec wyznaczania numeru sieci       
          
          lblbroadcastbin1.setText("pomsiec");
      }     
    }                                        

    private void txtoneKeyTyped(java.awt.event.KeyEvent evt) {                                
        // TODO add your handling code here:
    }                               

    private void txtoneKeyPressed(java.awt.event.KeyEvent evt) {                                  
        // TODO add your handling code here:
    }                                 

    private void txtoneKeyReleased(java.awt.event.KeyEvent evt) {                                   
        char c = evt.getKeyChar();
        int kodzik = (int)c;
        if ( (kodzik >= 48) && (kodzik <= 57) )
        {
            String pomik = pole1 + c;
            int pom10 = Integer.parseInt(pomik);
            if ( (pomik.length() <=3) && (pom10<256))
                {
                    pole1 = pomik;
                    txtone.setText(pole1);
                }
        
                else
                    {
                    txtone.setText(pole1); 
                    }
        }
        
        else
        {
            txtone.setText("");
            pole1 = txtone.getText();
        }
    }                                  

    private void txttwoKeyReleased(java.awt.event.KeyEvent evt) {                                   
        char c = evt.getKeyChar();
        int kodzik = (int)c;
        if ( (kodzik >= 48) && (kodzik <= 57) )
        {
            String pomik = pole2 + c;
            int pom10 = Integer.parseInt(pomik);
            if ( (pomik.length() <=3) && (pom10<256))
                {
                    pole2 = pomik;
                    txttwo.setText(pole2);
                }
        
                else
                    {
                    txttwo.setText(pole2); 
                    }
        }
        
        else
        {
            txttwo.setText("");
            pole2 = txttwo.getText();
        }
    }                                  

    private void txtthreeKeyReleased(java.awt.event.KeyEvent evt) {                                     
        char c = evt.getKeyChar();
        int kodzik = (int)c;
        if ( (kodzik >= 48) && (kodzik <= 57) )
        {
            String pomik = pole3 + c;
            int pom10 = Integer.parseInt(pomik);
            if ( (pomik.length() <=3) && (pom10<256))
                {
                    pole3 = pomik;
                    txtthree.setText(pole3);
                }
        
                else
                    {
                    txtthree.setText(pole3); 
                    }
        }
        
        else
        {
            txtthree.setText("");
            pole3 = txtthree.getText();
        }
    }                                    

    private void txtfourKeyReleased(java.awt.event.KeyEvent evt) {                                    
        char c = evt.getKeyChar();
        int kodzik = (int)c;
        if ( (kodzik >= 48) && (kodzik <= 57) )
        {
            String pomik = pole4 + c;
            int pom10 = Integer.parseInt(pomik);
            if ( (pomik.length() <=3) && (pom10<256))
                {
                    pole4 = pomik;
                    txtfour.setText(pole4);
                }
        
                else
                    {
                    txtfour.setText(pole4); 
                    }
        }
        
        else
        {
            txtfour.setText("");
            pole4 = txtfour.getText();
        }
    }                                   

    private void txtmaskKeyReleased(java.awt.event.KeyEvent evt) {                                    
        char c = evt.getKeyChar();
        int kodzik = (int)c;
        if ( (kodzik >= 48) && (kodzik <= 57) )
        {
            String pomik = pole5 + c;
            int pom10 = Integer.parseInt(pomik);
            if ( (pomik.length() <=2) && (pom10<33))
                {
                    pole5 = pomik;
                    txtmask.setText(pole5);
                }
        
                else
                    {
                    txtmask.setText(pole5); 
                    }
        }
        
        else
        {
            txtmask.setText("");
            pole5 = txtmask.getText();
        }
        
    }                                   

    private void formWindowDeiconified(java.awt.event.WindowEvent evt) {                                       
        this.setResizable(false);
        this.setSize(240, 360);
        jPanelStandardowy.setVisible(true);
        jPanelNaukowy.setVisible(false);
        jIPPanel.setVisible(false);
    }                                      

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {                                       
        this.setResizable(false);
        this.setSize(240, 360);
        jPanelStandardowy.setVisible(true);
        jPanelNaukowy.setVisible(false);
        jIPPanel.setVisible(false);
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
        java.awt.EventQueue.invokeLater(() -> {
            new MatKalkulator().setVisible(true);
            
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnBin;
    private javax.swing.JButton btnCztery;
    private javax.swing.JButton btnDwa;
    private javax.swing.JButton btnDziewiec;
    private javax.swing.JButton btnHex;
    private javax.swing.JButton btnJeden;
    private javax.swing.JButton btnKasuj;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMnozenie;
    private javax.swing.JButton btnOct;
    private javax.swing.JButton btnOsiem;
    private javax.swing.JButton btnPiec;
    private javax.swing.JButton btnPierwiastek;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton btnPodziel;
    private javax.swing.JButton btnPrzecinek;
    private javax.swing.JButton btnRownasie;
    private javax.swing.JButton btnSiedem;
    private javax.swing.JButton btnSzesc;
    private javax.swing.JButton btnTrzy;
    private javax.swing.JButton btnWyczysc;
    private javax.swing.JButton btnZero;
    private javax.swing.JButton btnsieci;
    private javax.swing.JPanel jIPPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel lblbinary1;
    private javax.swing.JLabel lblbroadcastbin0;
    private javax.swing.JLabel lblbroadcastbin1;
    private javax.swing.JLabel lblhosty;
    private javax.swing.JLabel lblipbinary0;
    private javax.swing.JLabel lblmaska0;
    private javax.swing.JLabel lblmaska1;
    private javax.swing.JLabel lblsiec;
    private javax.swing.JLabel lblsiecbin1;
    private javax.swing.JTextField txtWynik;
    private javax.swing.JTextField txtfour;
    private javax.swing.JTextField txtmask;
    private javax.swing.JTextField txtone;
    private javax.swing.JTextField txtthree;
    private javax.swing.JTextField txttwo;
    // End of variables declaration                   
}

