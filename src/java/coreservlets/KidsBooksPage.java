package coreservlets;

import db_conn.ConnectionUtils;
import db_conn.DBUtils;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/** A specialization of the CatalogPage servlet that
 *  displays a page selling three famous kids-book series.
 *  Orders are sent to the OrderPage servlet.
 *  <P>
 *  Taken from Core Servlets and JavaServer Pages 2nd Edition
 *  from Prentice Hall and Sun Microsystems Press,
 *  http://www.coreservlets.com/.
 *  &copy; 2003 Marty Hall; may be freely used or adapted.
 */

public class KidsBooksPage extends CatalogPage {
  public void init() {
//    String[] ids = { "lewis001", "alexander001", "rowling001" };
    List<String> ids = null;
      try {
          ids = DBUtils.queryKidBook();
          setItems(ids);
      } catch (SQLException ex) {
          Logger.getLogger(KidsBooksPage.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(KidsBooksPage.class.getName()).log(Level.SEVERE, null, ex);
      }
    setTitle("All-Time Best Children's Fantasy Books");
  }
}
