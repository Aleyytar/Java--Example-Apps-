/* The Asset represents any tangible property that has a value
 * @Author: Ali Haydar Turgut*/
public class Asset{
  
  private String name;
  //remember the description of asset
  private String description;
  //store the cost basis of the asset
  private double costbasis;
  //store the current price of the asset.
  private double currentprice;
  //the capital gains from the asset
  private static double capitalgains = 0;
  
  /* A constructor to create an Asset with a (String)name, (double)costbasis
   * @param String name
   * @param double costbasis*/
  public Asset(String name,double costbasis){
    this.name=name;
    this.costbasis=costbasis; 
  }
  
  /* Retrieve the name of the asset
   * @return String representing the asset name
   */
  public String getName(){
    return this.name;
  }
  
  /* Change the name of the asset
   * @param String representing the asset name
   */
  public void setName(String name){
    this.name=name;
  }
  
  /* Retrieve description of the asset
   * @return String representing the asset description
   */
  public String getDescription(){
    return this.description;
  }
  
  /* Change description of the asset
   * @param String representing the asset description
   */
  public void setDescription(String description){
    this.description=description;
  }
  
  /* Retrieve costbasis of the asset
   * @return double representing the costbasis
   */
  public double getCostBasis(){
    return this.costbasis;
  }
  
  /* Change costbasis of the asset
   * @param  double representing the costbasis value
   */
  public void setCostBasis(double costbasis){
    this.costbasis=costbasis;
  }
  
  /*Retrieve the current price of the asset.
   * @return double current price of the asset.
   */
  public double getCurrentPrice(){
    return this.currentprice;
  }
  
  /*Change the current price of the asset.
   * @param double current price of the asset.
   */
  public void setCurrentPrice(double currentprice){
    this.currentprice=currentprice;
  }
  
  /* Retrieve the capitalgains profit
   * @return Capitalgains
   */
  public double getCapitalGains(){
     return this.capitalgains;
  }
  
  
   /* Change the capitalgains profit
   * @param curretprice-costbasis = Capitalgains
   */
  public void setCapitalGains(double capitalgains) {
     this.capitalgains=capitalgains;
  }
  
 
    
  
  
}
