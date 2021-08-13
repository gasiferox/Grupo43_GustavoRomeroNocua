/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author maverick
 */
public class DataModelDB {
    
    public ArrayList<DataDB>getOwners(int idOwner) {
        Conexion con = new Conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        DataDB datosDB;
        ArrayList listOwner = new ArrayList();
        try {
            String sql = "SELECT id, owner FROM `tb_pet_owners` WHERE 1";
            //String sql = "SELECT * FROM tb_pet tp INNER JOIN tb_pet_owners tpo ON tp.id_owner_pet = tpo.id ORDER BY tp.id";
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (cn != null) {
                System.out.println("Conexión éxitosa con el DataModelDB");
                while (rs.next()) {
                    datosDB = new DataDB();
                    datosDB.setIdOwner(rs.getInt("id"));
                    datosDB.setOwner(rs.getString("owner"));
                    listOwner.add(datosDB);
                }
            }else {
                JOptionPane.showMessageDialog(null, ".::Error al realizar la consulta::.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, ".::Error en la conexión::.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listOwner;

    }
    
    public ArrayList<DataDB>getBreed(int idBreed) {
        Conexion con = new Conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        DataDB datosDB;
        ArrayList listBreed = new ArrayList();
        try {
            String sql = "SELECT id, name FROM tb_breeds tb";
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (cn != null) {
                System.out.println("Conexión éxitosa con el DataModelDB 2");
                while (rs.next()) {
                    datosDB = new DataDB();
                    datosDB.setIdBreed(rs.getInt("id"));
                    datosDB.setBreedName(rs.getString("name"));
                    listBreed.add(datosDB);
                }
            }else {
                JOptionPane.showMessageDialog(null, ".::Error al realizar la consulta::.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, ".::Error en la conexión::.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listBreed;

    }
    
}
