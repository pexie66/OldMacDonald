class Pig implements Animal
{
  //variable
  private String myType;
  private String mySound;
  
  //constructor w/ arguments
  public Pig (String type, String sound)
  {
    myType = type;
    mySound = sound;
  }
 
  //constructor w/o constructor
  public Pig()
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
  