/* The A Equity instance represents an asset 
 * represents an asset where you can own shares of the asset. 
 * @Author: Ali Haydar Turgut*/

public class Equity extends Asset{
  private char symbol;//symbol field
  private double numbershares;//field numbershares
  
 /* A constructor to create an Equity with a name, symbol, and interestrate
  *@param String name
  *@param double symbol
  *@param double currentPrice
  */
  public Equity(String name, char symbol, double currentprice){
    super(name, 0.0);//parent's cons (Asset class)
    this.symbol = symbol;
    this.setCurrentPrice(this.getCurrentPrice());
  }
  
  /* Retrieve the symbol
   * @return symbol
   */
  public char getSymbol(){
    return this.symbol;
  }
  
  /* Retrieve the NumberShares
   * @return numbershares
   */
  public double getNumberShares(){
    return this.numbershares;
  }
  
  /* Change the NumberShares
   * @param double numbershares
   */
  public void setNumberShares(double numbershares){
    this.numbershares = numbershares;
  }
  
}