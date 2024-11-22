/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Disporapar HST
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.text.DateFormatSymbols;
import com.toedter.calendar.JCalendar;

public class Aplikasiperhitunganhari extends javax.swing.JFrame {

    public Aplikasiperhitunganhari() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        bulan = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jCalendar1 = new com.toedter.calendar.JCalendar(); // Menambahkan JCalendar

        // Menambahkan Label dan TextField untuk Hari Pertama dan Hari Terakhir
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bulan.setFont(new java.awt.Font("Tw Cen MT", 1, 18));
        bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { 
            "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", 
            "September", "Oktober", "November", "Desember" }));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18));
        jLabel1.setText("Bulan");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36));
        jLabel2.setText("Aplikasi Perhitungan Hari");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18));
        jLabel3.setText("Tahun");

        jSpinner1.setPreferredSize(new java.awt.Dimension(64, 27));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 24));
        jButton1.setText("Hitung");
        jButton1.setPreferredSize(new java.awt.Dimension(72, 27));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18));
        jLabel4.setText("Hasil");

        // Menambahkan Label dan TextField untuk Hari Pertama dan Hari Terakhir
        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18));
        jLabel5.setText("Hari Pertama");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 18));
        jLabel6.setText("Hari Terakhir");

        // Menambahkan JCalendar ke layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bulan, 0, 223, Short.MAX_VALUE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3))
                        .addGap(36, 36, 36)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap(37, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bulan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap()
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        // Mengambil bulan dan tahun dari JCalendar
        int month = jCalendar1.getMonthChooser().getMonth() + 1; // Mengambil bulan (JCalendar dimulai dari 0)
        int year = jCalendar1.getYearChooser().getYear(); // Mengambil tahun

        // Menghitung jumlah hari dalam bulan yang dipilih
        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth(); // Jumlah hari dalam bulan

        // Mendapatkan hari pertama dan hari terakhir
        LocalDate firstDay = yearMonth.atDay(1);
        LocalDate lastDay = yearMonth.atEndOfMonth();

        // Mendapatkan nama hari dalam bahasa Indonesia
        String[] dayNames = new DateFormatSymbols(new java.util.Locale("id", "ID")).getWeekdays();
        String firstDayName = dayNames[firstDay.getDayOfWeek().getValue()];
        String lastDayName = dayNames[lastDay.getDayOfWeek().getValue()];

        // Menampilkan hasil (jumlah hari, hari pertama, hari terakhir)
        jTextField1.setText("Jumlah hari: " + daysInMonth);
        jTextField2.setText(":" + firstDayName);
        jTextField3.setText(": " + lastDayName);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplikasiperhitunganhari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> bulan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5; // Label untuk Hari Pertama
    private javax.swing.JLabel jLabel6; // Label untuk Hari Terakhir
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2; // TextField untuk Hari Pertama
    private javax.swing.JTextField jTextField3; // TextField untuk Hari Terakhir
    private com.toedter.calendar.JCalendar jCalendar1; // Deklarasi JCalendar
    // End of variables declaration                   
}
