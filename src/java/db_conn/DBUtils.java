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

/**
 *
 * @author PCUSER
 */
public class DBUtils {
    public static List<CatalogItem> queryAllBook(Connection conn) throws SQLException {
       String sql = "Select * from Application ";

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

}
