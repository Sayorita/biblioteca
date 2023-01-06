/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Livros;
import dao.DaoLivros;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sarac
 */
public class FrmCadLivros extends javax.swing.JInternalFrame {
    DaoLivros cadlivro = new DaoLivros();
    List<Livros> lista = new ArrayList<Livros>();
    
    int indice = 0;
    /**
     * Creates new form FrmCadLivros
     */
    public FrmCadLivros() {
        initComponents();
        txtcod.setEnabled(false);
        lista = cadlivro.getLivros();
        mostrarDadosTela();
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblCabecalho = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblEditora = new javax.swing.JLabel();
        lblClassificação = new javax.swing.JLabel();
        lblEstante = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        cbxClassificacao = new javax.swing.JComboBox<>();
        txtEditora = new javax.swing.JTextField();
        cbxEstante = new javax.swing.JComboBox<>();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblcod = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLivros = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();

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

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(219, 188, 94));

        lblCabecalho.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        lblCabecalho.setText("Cadastro de livros");

        lblTitulo.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblTitulo.setText("Titulo do livro: ");

        lblAutor.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblAutor.setText("Autor do livro: ");

        lblAno.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblAno.setText("Ano de Lançamento: ");

        lblEditora.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblEditora.setText("Id Editora: ");

        lblClassificação.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblClassificação.setText("Classificação do livro: ");

        lblEstante.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        lblEstante.setText("Estante: ");

        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTituloKeyPressed(evt);
            }
        });

        txtAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAutorKeyPressed(evt);
            }
        });

        txtAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAnoKeyPressed(evt);
            }
        });

        cbxClassificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecionar--", "Ação", "Aventura", "Auto Ajuda", "Biografia", "Comédia ", "Conto", "Drama", "Ficção Cientifica", "Infato Juvenil", "Jovem Adulto", "Poesia", "Romance", "Suspense", " ", " ", " " }));
        cbxClassificacao.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                cbxClassificacaoComponentHidden(evt);
            }
        });
        cbxClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClassificacaoActionPerformed(evt);
            }
        });

        txtEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditoraActionPerformed(evt);
            }
        });

        cbxEstante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecionar--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));

        btnNovo.setBackground(new java.awt.Color(51, 255, 51));
        btnNovo.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("NOVO");
        btnNovo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 255)));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(102, 204, 255));
        btnEditar.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 255)));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(204, 0, 204));
        btnSalvar.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("SALVAR");
        btnSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 255)));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblcod.setText("Código: ");

        btnAnterior.setBackground(new java.awt.Color(153, 153, 153));
        btnAnterior.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setText("<<");
        btnAnterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setBackground(new java.awt.Color(153, 153, 153));
        btnProximo.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnProximo.setForeground(new java.awt.Color(255, 255, 255));
        btnProximo.setText(">>");
        btnProximo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnPrimeiro.setBackground(new java.awt.Color(153, 153, 153));
        btnPrimeiro.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnPrimeiro.setForeground(new java.awt.Color(255, 255, 255));
        btnPrimeiro.setText("|<");
        btnPrimeiro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnUltimo.setBackground(new java.awt.Color(153, 153, 153));
        btnUltimo.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnUltimo.setForeground(new java.awt.Color(255, 255, 255));
        btnUltimo.setText(">|");
        btnUltimo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        tblLivros.setBackground(new java.awt.Color(204, 204, 204));
        tblLivros.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tblLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Título", "Autor", "Ano", "Class", "Estante", "ID Editora"
            }
        ));
        tblLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLivrosMouseClicked(evt);
            }
        });
        tblLivros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblLivrosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblLivros);

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 255)));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblcod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEditora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEstante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblClassificação)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTitulo)
                                    .addComponent(lblAutor))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(lblCabecalho)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcod)
                            .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAutor)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAno)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblClassificação)
                            .addComponent(cbxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstante)
                            .addComponent(cbxEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEditora)
                            .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblCabecalho)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditoraActionPerformed

    private void cbxClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClassificacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxClassificacaoActionPerformed

    private void cbxClassificacaoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cbxClassificacaoComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxClassificacaoComponentHidden

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtcod.setText("");
        txtEditora.setText("");
        txtTitulo.setText("");
        txtAutor.setText("");
        txtAno.setText("");
        cbxClassificacao.setSelectedItem("--Selecionar--");
        cbxEstante.setSelectedItem("--Selecionar--");       
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       Livros livro = new Livros();
      

       livro.titulo = txtTitulo.getText();
       livro.autor = txtAutor.getText();
       livro.ano = Integer.parseInt(txtAno.getText());
       livro.classificacao = cbxClassificacao.getSelectedItem().toString();
       livro.estante = cbxEstante.getSelectedItem().toString();
       livro.idEditora = Integer.parseInt(txtEditora.getText());
       
       cadlivro.salvarLivro(livro);
       lista.clear();
       lista = cadlivro.getLivros();

       
        indice = lista.size() - 1;
        mostrarDadosTela();
        preencherTabela();
        
       JOptionPane.showMessageDialog(this, "Livro salvo com sucesso!!!");

       txtTitulo.setText(lista.get(0).titulo);
       txtAutor.setText(lista.get(0).autor);
       txtAno.setText(""+lista.get(0).ano);
       cbxClassificacao.setSelectedItem(lista.get(0).classificacao);
       cbxEstante.setSelectedItem(lista.get(0).estante);
       txtEditora.setText(""+lista.get(0).idEditora);
       
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtTituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtAutor.requestFocus();
        }
    }//GEN-LAST:event_txtTituloKeyPressed

    private void txtAutorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtAno.requestFocus();
        }
    }//GEN-LAST:event_txtAutorKeyPressed

    private void txtAnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtEditora.requestFocus();
        }
    }//GEN-LAST:event_txtAnoKeyPressed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Livros livro = new Livros();
        
        livro.cod = Integer.parseInt(txtcod.getText());
        livro.titulo = txtTitulo.getText();
        livro.autor = txtAutor.getText();
        livro.ano = Integer.parseInt(txtAno.getText());
        livro.classificacao = cbxClassificacao.getSelectedItem().toString();
        livro.estante = cbxEstante.getSelectedItem().toString();
        livro.idEditora = Integer.parseInt(txtEditora.getText());
        
        cadlivro.alterarLivro(livro);
        lista.clear();
        lista = cadlivro.getLivros();

        indice = lista.size() - 1;
        mostrarDadosTela();
        preencherTabela();
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if(indice>0){
            indice--;
            btnProximo.setEnabled(true);
            btnUltimo.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(this, "Você já está no primeiro Registro", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnPrimeiro.setEnabled(false);
            btnAnterior.setEnabled(false);
            btnProximo.setEnabled(true);
            btnUltimo.setEnabled(true);
        }
        mostrarDadosTela();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        if(indice<lista.size()-1)
        {
            indice ++;
            btnAnterior.setEnabled(true);
            btnPrimeiro.setEnabled(true);
        }else
        {
            JOptionPane.showMessageDialog(this, "Você já está no ultimo Registro", "Atenção",JOptionPane.WARNING_MESSAGE);
            btnProximo.setEnabled(false);
            btnUltimo.setEnabled(false);
            btnAnterior.setEnabled(true);
            btnPrimeiro.setEnabled(true);
        }
        
        mostrarDadosTela();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        indice = 0;
        mostrarDadosTela();
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        indice = lista.size()-1;
        mostrarDadosTela();
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void tblLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLivrosMouseClicked
         preencheFormByTable();
    }//GEN-LAST:event_tblLivrosMouseClicked

    private void tblLivrosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblLivrosKeyReleased
        if(evt.getKeyCode()== 38 || evt.getKeyCode()==40)
        {
            preencheFormByTable();
        }
    }//GEN-LAST:event_tblLivrosKeyReleased

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (lista.isEmpty()) {
           
                JOptionPane.showMessageDialog(this, "Não exitem dados para serem excluídos");
            
                } else {
                    
                         int recid = Integer.parseInt(txtcod.getText());
             
                        int op = JOptionPane.showConfirmDialog(this, "Têm certeza que deseja excluir o livro ?", "Exclusão", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
                        if (op == 0) {

                        cadlivro.excluirLivro(recid);
                        lista.clear();
                        lista = cadlivro.getLivros();
                        
                        if (lista.isEmpty()) {
                            txtcod.setText("");
                            txtEditora.setText("");
                            txtTitulo.setText("");
                            txtAutor.setText("");
                            txtAno.setText("");
                            cbxClassificacao.setSelectedItem("--Selecionar--");
                            cbxEstante.setSelectedItem("--Selecionar--");  
                        } else {
                            indice = lista.size() - 1;
                            mostrarDadosTela();
                            preencherTabela();
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Você desistiu de excluir");
                    }
            
            
            
               
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cbxClassificacao;
    private javax.swing.JComboBox<String> cbxEstante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCabecalho;
    private javax.swing.JLabel lblClassificação;
    private javax.swing.JLabel lblEditora;
    private javax.swing.JLabel lblEstante;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblcod;
    private javax.swing.JTable tblLivros;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditora;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtcod;
    // End of variables declaration//GEN-END:variables
public void mostrarDadosTela() 
{

       txtcod.setText(""+lista.get(indice).cod);
       txtTitulo.setText(lista.get(indice).titulo);
       txtAutor.setText(lista.get(indice).autor);
       txtAno.setText(""+lista.get(indice).ano);
       cbxClassificacao.setSelectedItem(lista.get(indice).classificacao);
       cbxEstante.setSelectedItem(lista.get(indice).estante);
       txtEditora.setText(""+lista.get(indice).idEditora);
       
    }
public void preencherTabela()
{
    tblLivros.getColumnModel().getColumn(0).setPreferredWidth(10);
    tblLivros.getColumnModel().getColumn(1).setPreferredWidth(120);
    tblLivros.getColumnModel().getColumn(2).setPreferredWidth(10);
    tblLivros.getColumnModel().getColumn(3).setPreferredWidth(10);
    tblLivros.getColumnModel().getColumn(4).setPreferredWidth(20);
    tblLivros.getColumnModel().getColumn(5).setPreferredWidth(9);
    tblLivros.getColumnModel().getColumn(6).setPreferredWidth(10);
    
    DefaultTableModel modelo = (DefaultTableModel)tblLivros.getModel();
    modelo.setNumRows(0);//Limpar Tabela
    
    for(int i=0;i<lista.size();i++){
        modelo.addRow(new Object[]{
            lista.get(i).cod,
            lista.get(i).titulo,
            lista.get(i).autor,
            lista.get(i).ano,
            lista.get(i).classificacao,
            lista.get(i).estante,
            lista.get(i).idEditora
        });
    }
    
       
}


public void preencheFormByTable()
{
    int linechoose = tblLivros.getSelectedRow();
    txtcod.setText(tblLivros.getValueAt(linechoose, 0).toString());
    txtTitulo.setText(tblLivros.getValueAt(linechoose, 1).toString());
    txtAutor.setText(tblLivros.getValueAt(linechoose, 2).toString());
    txtAno.setText(tblLivros.getValueAt(linechoose, 3).toString());
    cbxClassificacao.setSelectedItem(tblLivros.getValueAt(linechoose, 4));
    cbxEstante.setSelectedItem(tblLivros.getValueAt(linechoose, 5));
    txtEditora.setText(tblLivros.getValueAt(linechoose, 6).toString());
}

}
