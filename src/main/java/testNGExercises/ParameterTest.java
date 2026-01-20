package testNGExercises;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
  @Test
  @Parameters({"browser"})
  public void display(String name) {
	  System.out.println("Text is "+name);
  }
  @Test
  @Parameters({"message"})
  public void display1(String msg) {
	  System.out.println("Text is "+msg);
  }
  
}
