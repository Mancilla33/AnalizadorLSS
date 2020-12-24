
package analizadorlr;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import analizadorlr.Analizador.Analizador;

public class Home extends javax.swing.JFrame implements KeyListener {

    /**
     * Pantalla principal del analizador CHAVEZ ABURTO JOSELYNE MARIANA MANCILLA
     * ALCARAZ JOSE DE JESUS
     */
    private static final long serialVersionUID = 1L;
    NumeroLineaC nL;
    Analizador analizador;

    public Home() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        nL = new NumeroLineaC(Cuadro);
        Scroll.setRowHeaderView(nL);
        Cuadro.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(),
                javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        Scroll.getVerticalScrollBar().setUI(new MyScrollBarUI());
        Scroll.getHorizontalScrollBar().setUI(new MyScrollBarUI());
        Cuadro.addKeyListener(this);
        analizador = new Analizador(this);
    }

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        espec = new javax.swing.JLabel();
        Scroll = new javax.swing.JScrollPane();
        Cuadro = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analizadorlr/IMG/cerrar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(365, 8, 23, 23);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analizadorlr/IMG/btnAnaliza.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 255, 101, 31);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Analizador léxico, sintáctico y semántico");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 15, 280, 14);

        espec.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        espec.setForeground(new java.awt.Color(204, 204, 204));
        espec.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        espec.setText("   0 líneas");
        getContentPane().add(espec);
        espec.setBounds(10, 240, 90, 20);
        espec.getAccessibleContext().setAccessibleName("espec");

        Scroll.setBackground(new java.awt.Color(80, 80, 80));
        Scroll.setBorder(null);

        Cuadro.setBackground(new java.awt.Color(5, 54, 73));
        Cuadro.setColumns(20);
        Cuadro.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Cuadro.setForeground(new java.awt.Color(255, 255, 255));
        Cuadro.setRows(5);
        Cuadro.setToolTipText("");
        Cuadro.setBorder(null);
        Cuadro.setCaretColor(new java.awt.Color(0, 168, 255));
        Scroll.setViewportView(Cuadro);

        getContentPane().add(Scroll);
        Scroll.setBounds(0, 60, 390, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analizadorlr/IMG/fondo1.png")));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);

        pack();
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
        analizador.Analiza(Cuadro.getText() + "\n");

    }// GEN-LAST:event_jButton1MouseClicked

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == (char) 9) {
            int pos = Cuadro.getCaretPosition();

            Cuadro.setText(Cuadro.getText().replace((char) 9 + "", "   "));
            Cuadro.setCaretPosition(pos + 2);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        espec.setText((lineas(Cuadro.getText())) + " líneas");
        nL.repaint();
        repaint();
    }

    public int lineas(String cadena) {
        int count = 1;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == (char) 10) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void keyPressed(KeyEvent ke) {

    }

    private javax.swing.JTextArea Cuadro;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JLabel espec;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;

}
