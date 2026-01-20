package testNGExercises;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderExample {
  @Test(dataProvider = "getData")
  public void login(String u, String p) {
	  System.out.println("User name is "+u);
	  System.out.println("Password is "+p);
  }

  @DataProvider
  public Object[][] getData() {
    Object[][] data=new Object[3][2];
    data[0][0]="user1";
    data[0][1]="p123";
    data[1][0]="user2";
    data[1][1]="p433";
    data[2][0]="user3";
    data[2][1]="p234";
    return data;
  }
}
