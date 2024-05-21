
/**
 * Mail Class holds values for type, destination, units, & postagePerUnit.
 * Contains getter & setter methods for those values.
 *
 * Author: Collins Ramsey
 * 9/1/2022 11:12 am
 */
public class Mail
{
    // private instance variables type, destination, units, & postagePerUnit
    private String type;
    private String destination;
    private int units;
    private double postagePerUnit;
    
    /*
     * Mail standard constructor
     * 
     * @param none
     * @return either String, int, or double
     */
    public Mail() {
        type = "";
        destination = "";
        units = 0;
        postagePerUnit = 0.0;
    }
    /*
     * setDestination - this method sets the value of destination as a String
     * 
     * @param String dest
     * @return nothing
     */
    public void setDestination(String dest) {
        destination = dest;
    }
    /*
     * setUnits - this method sets the value of units as an int
     * 
     * @param int howMany
     * @return nothing
     */
    public void setUnits(int howMany) {
        units = howMany;
    }
    /*
     * setPostagePerUnit - this method sets the value of stamps as a double
     * 
     * @param double stamps
     * @return nothing
     */
    public void setPostagePerUnit(double stamps) {
        postagePerUnit = stamps;
    }
    /*
     * setType - this method sets the type of mail as a String
     * 
     * @param String newType
     * @return nothing
     */
    public void setType(String newType) {
        type = newType;
    }
    /*
     * getDestination - this method gets the mail destination
     * 
     * @param none
     * @return String 
     */
    public String getDestination() {
        return destination;
    }
    /*
     * getUnits - this method gets the number of pieces of mail
     * 
     * @param none
     * @return int
     */
    public int getUnits() {
        return units;
    }
    /*
     * getPostagePerUnit - this method gets the number of stamps per unit
     * 
     * @param none
     * @return double
     */
    public double getPostagePerUnit() {
        return postagePerUnit;
    }
    /*
     * getType - this method gets the type of mail 
     * 
     * @param none
     * @return String
     */
    public String getType() {
        return type;
    }
}
