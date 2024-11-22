
import java.sql.Connection;
import java.sql.DriverManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Contact {
    private String nama;
    private String nomor;
    private String kategori;

    public Contact(String nama, String nomor, String kategori) {
        this.nama = nama;
        this.nomor = nomor;
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    public String getKategori() {
        return kategori;
    }

    public static void tambahKontak(Contact contact) {
        try (Connection conn = DriverManager.getConnection(DBConnection.DB_URL);
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO daftarKontak (nama, nomor, kategori) VALUES (?, ?, ?)")) {
            pstmt.setString(1, contact.getNama());
            pstmt.setString(2, contact.getNomor());
            pstmt.setString(3, contact.getKategori());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void ubahKontak(int id, Contact contact) {
        try (Connection conn = DriverManager.getConnection(DBConnection.DB_URL);
            PreparedStatement pstmt = conn.prepareStatement("UPDATE daftarKontak SET nama = ?, nomor = ?, kategori = ? WHERE id = ?")) {
            pstmt.setString(1, contact.getNama());
            pstmt.setString(2, contact.getNomor());
            pstmt.setString(3, contact.getKategori());
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void hapusKontak(int id) {
        try (Connection conn = DriverManager.getConnection(DBConnection.DB_URL);
            PreparedStatement pstmt = conn.prepareStatement("DELETE FROM daftarKontak WHERE id = ?")) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet getKontak() {
        try {
            Connection conn = DriverManager.getConnection(DBConnection.DB_URL);
            Statement stmt = conn.createStatement();
            return stmt.executeQuery("SELECT * FROM daftarKontak");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ResultSet cariKontak(String query) {
        try {
            Connection conn = DriverManager.getConnection(DBConnection.DB_URL);
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM daftarKontak WHERE nama LIKE ? OR nomor LIKE ?");
            pstmt.setString(1, "%" + query + "%");
            pstmt.setString(2, "%" + query + "%");
            return pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void eksporKeCSV() {
        String fileName = "daftarKontak.csv";
        try (Connection conn = DriverManager.getConnection(DBConnection.DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM daftarKontak");
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            
            writer.write("ID,Nama,Nomor,Kategori\n");
            while (rs.next()) {
                writer.write(rs.getInt("id") + "," +
                             rs.getString("nama") + "," +
                             rs.getString("nomor") + "," +
                             rs.getString("kategori") + "\n");
            }
            JOptionPane.showMessageDialog(null, "Kontak berhasil diekspor ke " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void imporDariCSV() {
        String fileName = "daftarKontak.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             Connection conn = DriverManager.getConnection(DBConnection.DB_URL)) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    tambahKontak(new Contact(data[1], data[2], data[3]));
                }
            }
            JOptionPane.showMessageDialog(null, "Kontak berhasil diimpor dari " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
