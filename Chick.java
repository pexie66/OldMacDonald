class Chick implements Animal
{
  //variable
  private String myType;
  private String mySound;
  
  //constructor w/ arguments
  public Chick (String type, String sound)
  {
    myType = type;
    double a = Math.random();
    if (a < 0.5)
    mySound = "cheep";
    else mySound = "cluck";
  }
 
  //constructor w/o constructor
  public Chick()
  {
    myType = "unknown";
    mySound = "unknown";
  }
  
  public String getSound()
  {
    return mySound;
  }
  
  public String getType()
  {
    return myType;
  }
}
    
  