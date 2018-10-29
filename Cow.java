class Cow implements Animal
{
  //variable
  protected String myType;
  protected String mySound;
  
  //constructor w/ arguments
  public Cow(String type, String sound)
  {
    myType = type;
    mySound = sound;
  }
 
  //constructor w/o constructor
  public Cow()
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
  