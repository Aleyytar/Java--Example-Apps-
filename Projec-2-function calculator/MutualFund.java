/* A MutualFund instance represents an equity 
 * that is the shares of a mutual fund.  
 * @Author: Ali Haydar Turgut*/

public class MutualFund extends Equity{
  private double load;
  private double shares;
  
  /* A constructor to create an MutualFund with a name, char symbol, double load,  and double currentprice
  *@param String name
  *@param char symbol
  *@param double currentprice
  *@param double load
  */  
  public MutualFund(String name, char symbol, double currentprice, double load){
    super(name, symbol, currentprice);
    this.load = load;
  }
  /* Retrieve the Load
   * @return load
   */  
  public double getLoad(){
    return this.load;
  }
  
   /* Change the load
   * @param load
   */  
  public void setLoad(double load){
    this.load = load;
  }
  
   /* Change the shares
   * @param shares
   */  
  public void setShares(double shares){
     this.shares=shares; 
  }
  
  /* Retrieve the shares
   * @return shares
   */  
  public double getShares(){
     return this.shares; 
  }
  
  /* If the money amount is not positive, the method returns 0 and does nothing.
   * Otherwise, the method increases the number of shares owned in the mutual fund by input amount x
   *(100% - load) / current price. The cost basis is increased by the input amount, and the input amount
   *is returned.
   * 
   *@param amount
   *@retun amount */
  
  public double Buy(double amount){
    if (amount <= 0){
     return 0;
  }
    this.setShares(amount * (1 - load / 100) / this.getCurrentPrice());
    this.setNumberShares(shares);
    this.setCostBasis(amount);
    return amount;
  } 
}