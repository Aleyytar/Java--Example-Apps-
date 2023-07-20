/* The A Bond instance represents an asset 
 * that is a loan from a government or corporation
 * @Author: Ali Haydar Turgut*/

public class Bond extends Asset{
  //remember the  principal of the bond.
  private double principal;
  //remember the number of bonds owned.
  private int numberowned;
  //remember the interest rate
  private double interestrate;
  //remember the earnings percentage
  private double earningspercentage;
  
  /* A constructor to create an Bond with a name, principal, and interestrate
  *@param String name
  *@param double principal
  *@param double interestrate
  */
  public  Bond(String name , double principal , double interestrate){
    super(name,0);//parents const inputs
    this.principal = principal;
    this.interestrate = interestrate;
    this.setCurrentPrice(principal);
    this.setCostBasis(0);//The initial cost basis should be 0
    
    //The current price should be set to equal the principal
    this.setCurrentPrice(principal);

        
  }
  
  /* Retrieve the principal
   * @return principal
   */
  public double getPrincipal(){
    return this.principal;
  }
  
   /* Retrieve numberofbond
   * @return numberowned
   */ 
  public int getNumberOwned(){
    return this.numberowned;
  }
  
  /*Change the NumberOwned
   * @param double NumberOwned of the Bond.
   */ 
  public void setNumberOwned(int numberowned){
    this.numberowned = numberowned;
  }
  
  /* Retrieve the interest rate
   * @return interestrate
   */ 
  public double getInterestRate(){
    return this.interestrate;
  }
  
  /*Change the InterestRate
   * @param double InterestRate of the Bond.
   */  
  public void setInterestRate(double interestrate){
    this.interestrate = interestrate;
  }
  
  /*Change the InterestRate
   * @param double InterestRate of the Bond.
   */  
  public void setEarningSpercentage(double earningspercentage){
    this.earningspercentage=earningspercentage;
  }
  
  public double getEarningSpercentage(){
    return this.earningspercentage;
  }
  
  /* Retrieve the payinterest
   * @return  calls (getInterestRate() * getPrincipal())
   * calculeted Ýnterest for Asset price
   */ 
  public double payInterest(){
    return (getInterestRate() * getPrincipal());
  }
  
  
    
  /*The method purchased a bond.
   * @return currentprice
   */ 
  public double buy(){
    //we must have earningspercentage for buy metod
    this.setEarningSpercentage(1.3);
    //The cost basis is increased by the current price
    this.setCostBasis(getCostBasis() + getCurrentPrice());
    //calculeted the capitalgains it must be -currentprice because no sell yet.
    this.setCapitalGains(this.getCapitalGains() - this.getCurrentPrice());
    // used the earningspercentage of Bond field
    this.setCurrentPrice(this.getCurrentPrice()*(this.getEarningSpercentage())); 
    this.setNumberOwned(this.getNumberOwned() + 1);// increased by 1.
    return this.getCurrentPrice();
  }
  
  /* this metot makes calculations of increasing bond payments 
   * and increasing the bond price.
   * The method sells a bond
   * @return currentprice
   */
   public double sell() {
     //if there are no bonds owned,the method returns 0
     if (numberowned == 0) {
        return 0;
      } 
     else 
      {
       this.setCostBasis(this.getCostBasis() - (this.getCostBasis() / this.getNumberOwned()));
       this.setCapitalGains(this.getCapitalGains() + (this.getCurrentPrice() - (this.getCostBasis() / this.getNumberOwned())));
       this.setCurrentPrice(this.getCurrentPrice() );
       this.setNumberOwned(this.getNumberOwned() - 1);// increased by -1.
       return this.getCurrentPrice();
       }
    }

}