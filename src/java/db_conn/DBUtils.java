/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_conn;

import coreservlets.CatalogItem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import db_conn.ConnectionUtils;

/**
 *
 * @author PCUSER
 */
public class DBUtils {
    public static List<CatalogItem> queryAllBook() throws SQLException, ClassNotFoundException {
       Connection conn = ConnectionUtils.getConnection();
       String sql = "Select * from catalogitem ";

       PreparedStatement pstm = conn.prepareStatement(sql);

       ResultSet rs = pstm.executeQuery();
       List<CatalogItem> list = new ArrayList<CatalogItem>();
       while (rs.next()) {

            String itemID = rs.getString("itemID");
            String shortDescription = rs.getString("shortDescription");
            String longDescription = rs.getString("longDescription");
            double cost = rs.getDouble("cost");
            String bookType = rs.getString("bookType");


           CatalogItem book = new CatalogItem( itemID,  shortDescription, longDescription,  cost,  bookType);

           list.add(book);
       }
       return list;
   }
    
    public static List<String> queryKidBook() throws SQLException, ClassNotFoundException {
       Connection conn = ConnectionUtils.getConnection();
       String sql = "Select * from catalogitem WHERE bookType='K'";

       PreparedStatement pstm = conn.prepareStatement(sql);

       ResultSet rs = pstm.executeQuery();
       List<String> list = new ArrayList<String>();
       while (rs.next()) {

            String itemID = rs.getString("itemID");
//            String shortDescription = rs.getString("shortDescription");
//            String longDescription = rs.getString("longDescription");
//            double cost = rs.getDouble("cost");
//            String bookType = rs.getString("bookType");

           list.add(itemID);
       }
       return list;
   }

    public static List<String> queryTechBook() throws ClassNotFoundException, SQLException {
        Connection conn = ConnectionUtils.getConnection();
       String sql = "Select * from catalogitem WHERE bookType='T'";

       PreparedStatement pstm = conn.prepareStatement(sql);

       ResultSet rs = pstm.executeQuery();
       List<String> list = new ArrayList<String>();
       while (rs.next()) {

            String itemID = rs.getString("itemID");
//            String shortDescription = rs.getString("shortDescription");
//            String longDescription = rs.getString("longDescription");
//            double cost = rs.getDouble("cost");
//            String bookType = rs.getString("bookType");

           list.add(itemID);
       }
       return list;
    }

     public static void insertBook(Connection conn, CatalogItem book) throws SQLException {
        String sql = "Insert into catalogitem(itemID, shortDescription, longDescription, cost, bookType) values (?,?,?,?,?)";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        pstm.setString(1, book.getItemID());
        pstm.setString(2, book.getShortDescription());
        pstm.setString(3, book.getLongDescription());
        pstm.setDouble(4, book.getCost());
        pstm.setString(5, book.getBookType());
        
 
        pstm.executeUpdate();
    }
 
    public static CatalogItem findBook(Connection conn, String code) throws SQLException {
        String sql = "Select * from catalogitem where itemID=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, code);
 
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
            
        String shortDesc = rs.getString("shortDescription");
        String longDesc = rs.getString("longDescription");
        String type = rs.getString("bookType");
        double price = rs.getDouble("cost");
            
            
            CatalogItem book = new CatalogItem(code, shortDesc, longDesc, price,type);
            
            return book;
        }
        return null;
    }
 
    public static void updateBook(Connection conn, CatalogItem book) throws SQLException {
        String sql = "Update catalogitem set shortDescription=?, longDescription=?, cost=?, bookType=? where itemID=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        pstm.setString(5, book.getItemID());
        pstm.setString(1, book.getShortDescription());
        pstm.setString(2, book.getLongDescription());
        pstm.setDouble(3, book.getCost());
        pstm.setString(4, book.getBookType());
        
 
        pstm.executeUpdate();
    }
 
    public static void deleteBook(Connection conn, String code) throws SQLException {
        String sql = "delete from catalogitem where itemID=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        pstm.setString(1, code);
        
 
        pstm.executeUpdate();
    }
 
}
