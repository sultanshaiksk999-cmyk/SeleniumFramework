package BDD.StepDef;


import BDD.Utils.fileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class loginYoutube {
    WebDriver dr;
    fileReader fr = new fileReader();

    @Given("open youtube using URL")
    public void open_youtube_using_url() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\shaik. sulthanbasha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        dr = new EdgeDriver();
        dr.manage().window().maximize();
        dr.get(fr.getProperty("Youtube"));
    }

    @When("youtube will load and open")
    public void youtube_will_load_and_open() throws InterruptedException {
        WebElement searchbar = dr.findElement(By.xpath(fr.getProperty("searchbar")));
        searchbar.sendKeys("sreeja");
//dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // 👈 implicit wait new version not work here because dependency is old
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement searchIcon = dr.findElement(By.xpath(fr.getProperty("searchIcon")));
        searchIcon.click();
        Thread.sleep(2000);
    }

    @Then("close the window")
    public void close_the_window() {
        dr.close();

    }


}
