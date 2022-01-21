package mypackage;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
    System.setProperty("","");
    WebDriver driver=new ChromeDriver();
    driver.getUrl("");
  }
}
