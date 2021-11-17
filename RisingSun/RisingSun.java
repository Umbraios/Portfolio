import objectdraw.*;
import java.awt.*;

/**
 * A program that produces an animation of the sun rising.
 * The animation is driven by clicking the mouse button.
 * The faster the mouse is clicked, the faster the sun will rise.
 */
public class RisingSun extends WindowController
{
    
  private FilledOval sun;
  private Text instructions;
  
    // The begin method is called when the program starts
   public void begin() 
   {  
      // Create a circle at location (150, 350) with radius 100
      sun = new FilledOval(150,350,100,100,canvas);
      
      instructions = new Text("Please click the mouse repeatedly",20,20,canvas);
      
      
      
   }

public void onMouseClick(Location point)
{
    sun.move(0, -10);
    instructions.hide();
}

public void onMouseExit(Location point)
{
    sun.moveTo(150, 350);
    instructions.show();
    
}



}
