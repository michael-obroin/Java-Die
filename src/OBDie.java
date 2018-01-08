
public class OBDie extends Die
{

	final int MAX = 100;
	
	public int roll()
	   {
	      faceValue = (int)(Math.random() * MAX) + 1;

	      return faceValue;
	   }

}
