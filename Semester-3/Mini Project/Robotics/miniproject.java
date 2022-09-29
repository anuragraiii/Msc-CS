import ch.aplu.robotsim.*;
public class miniproject {
    public miniproject()
	  {
	    NxtRobot robot=new NxtRobot();
	    Gear gear=new Gear();
	    LightSensor ls1=new LightSensor(SensorPort.S1);
	    LightSensor ls2=new LightSensor(SensorPort.S2);
	    robot.addPart(gear);
	    robot.addPart(ls1);
	    robot.addPart(ls2);
	    gear.forward();
	   
	    while(true)
	    {
	      int rightValue=ls1.getValue();
	      int leftValue=ls2.getValue();
	      int d=rightValue - leftValue;
	      if(d>100)
	        gear.rightArc(0.1);
	      if(d < -100)
	        gear.leftArc(0.1);
	      if(d > -100 && d < 100 && rightValue > 500)
	        gear.forward();
	    }
	  }
	  public static void main(String args[])
	  {
	     new miniproject();
	  }
	  static
	  {
	    NxtContext.setStartPosition(430,230);
	    NxtContext.setStartDirection(-90);
	    NxtContext.useBackground("sprites/yellowpath.gif");
	  }
}