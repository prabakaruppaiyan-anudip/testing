package testNGExercises;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample {
	@BeforeClass
	public void bf()
	{
		System.out.println("Before class in Sample class");	}
	
	  @Test(priority=0)
	  public void login() 
	  { System.out.println("login method");
	  }
	  @Test(priority=1)
	  public void dashboard() 
	  { System.out.println("dashboard method");
	  }
	  @Test(priority=2)
	  public void logout() 
	  { System.out.println("logout method");
	  }
	 
}
