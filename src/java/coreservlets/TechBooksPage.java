package coreservlets;

import db_conn.DBUtils;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/** A specialization of the CatalogPage servlet that
 *  displays a page selling two famous computer books.
 *  Orders are sent to the OrderPage servlet.
 *  <P>
 *  Taken from Core Servlets and JavaServer Pages 2nd Edition
 *  from Prentice Hall and Sun Microsystems Press,
 *  http://www.coreservlets.com/.
 *  &copy; 2003 Marty Hall; may be freely used or adapted.
 */

public class TechBooksPage extends CatalogPage {
  public void init() {
//    String[] ids = { "hall001", "hall002" };
    List<String> ids = null;
      try {
          ids = DBUtils.queryTechBook();
          setItems(ids);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(TechBooksPage.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(TechBooksPage.class.getName()).log(Level.SEVERE, null, ex);
      }
    
    setTitle("All-Time Best Computer Books");
  }
}
