package testNGExercises;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EnabledAttribute {
	@BeforeClass
	public void bf()
	{
		System.out.println("Before class in Sample class");	}
	
	  @Test(groups="sanity")
	  public void login() 
	  { System.out.println("login method");
	  }
	  @Test(groups="sanity")
	  public void dashboard() 
	  { System.out.println("dashboard method");
	  }
	  @Test(groups="smoke")
	  public void logout() 
	  { System.out.println("logout method");
	  }
	 
}
