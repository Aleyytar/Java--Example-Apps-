/* The A Customer 
 * The Customer class represents a customer account. 
 * @Author: Ali Haydar Turgut*/
public class Customer {
  private Bond bond;
  private MutualFund mutualFund;
  private String firstName;
  private String lastName;
  private double totalCash;

  /* A constructor to create an Equity with Bond bond, MutualFund mutualFund,String firstName,String lastName, and double totalCash
  *@param Bond bond
  *@param MutualFund mutualFund
  *@param String firstName
  *@param String lastName
  *@param double totalCash
  */
   public Customer(Bond bond, MutualFund mutualFund, String firstName, String lastName, double totalCash){
     this.bond = bond;
     this.mutualFund = mutualFund;
     this.firstName = firstName;
     this.lastName = lastName;
     this.totalCash = totalCash;
    }

    /*Retrieve the firstname
    * @return firstname
    */
   public String getFirstName(){
     return firstName;
    }
    
    /*Change the firstname
    * @param firstname
    */
   public void setFirstName(String firstName){
     this.firstName = firstName;
    }

    /*Retrieve the lastname
    * @return lastname
    */
   public String getLastName(){
     return lastName;
    }
    
    /*Change  the lastname
    * @param lasttname
    */
   public void setLastName(String lastName){
     this.lastName = lastName;
    }

     /*Retrieve the Bond
    * @return Bond
    */
   public Bond getBond(){
     return bond;
    }
    
     /*Change  the Bond
    * @param Bond
    */
   public void setBond(Bond bond){
     this.bond = bond;
    }

    /*Retrieve the mutualFund
    * @return mutualFund
    */
   public MutualFund getMutualFund(){
     return mutualFund;
    }
    
    /*Change  the mutualFund
    * @param mutualFund
    */
   public void setMutualFund(MutualFund mutualFund) {
     this.mutualFund = mutualFund;
    }

    
}