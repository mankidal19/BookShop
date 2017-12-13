package coreservlets;

/** Describes a catalog item for on-line store. The itemID
 *  uniquely identifies the item, the short description
 *  gives brief info like the book title and author,
 *  the long description describes the item in a couple
 *  of sentences, and the cost gives the current per-item price.
 *  Both the short and long descriptions can contain HTML
 *  markup.
 *  <P>
 *  Taken from Core Servlets and JavaServer Pages 2nd Edition
 *  from Prentice Hall and Sun Microsystems Press,
 *  http://www.coreservlets.com/.
 *  &copy; 2003 Marty Hall; may be freely used or adapted.
 */

public class CatalogItem {
  private String itemID;
  private String shortDescription;
  private String longDescription;
  private double cost;
  private String bookType;

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

  public CatalogItem(String itemID, String shortDescription,
                     String longDescription, double cost, String bookType) {
    this.setItemID(itemID);
    this.setShortDescription(shortDescription);
    this.setLongDescription(longDescription);
    this.setCost(cost);
    this.setBookType(bookType);
  }
    
  public String getItemID() {
    return(itemID);
  }

  protected void setItemID(String itemID) {
    this.itemID = itemID;
  }

  public String getShortDescription() {
    return(shortDescription);
  }

  protected void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public String getLongDescription() {
    return(longDescription);
  }

  protected void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public double getCost() {
    return(cost);
  }

  protected void setCost(double cost) {
    this.cost = cost;
  }
}
