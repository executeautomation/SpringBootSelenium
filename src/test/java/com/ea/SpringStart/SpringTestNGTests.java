package com.ea.SpringStart;

import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testcontainers.containers.BrowserWebDriverContainer;

import java.io.File;


//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

@SpringBootTest
public class SpringTestNGTests {

    @LocalServerPort
    private int port;

    @Rule
    public BrowserWebDriverContainer chrome =
            new BrowserWebDriverContainer()
                    .withRecordingMode(BrowserWebDriverContainer.VncRecordingMode.RECORD_FAILING, new File("./target/"))
                    .withCapabilities(new ChromeOptions());



    @Test
    public void shouldSuccessfullyPassThisTestUsingTheRemoteDriver() throws InterruptedException {

        RemoteWebDriver driver = chrome.getWebDriver();
        String url = "https://executeautomation.com";
        System.out.println("Spring Boot URL is: " + url);
        driver.get(url);
        driver.quit();
    }

    @Test
    public void shouldSuccessfullyAlwaysPassThisTestUsingTheRemoteDriver() throws InterruptedException {

        RemoteWebDriver driver = chrome.getWebDriver();
        String url = "https://executeautomation.com";
        System.out.println("Spring Boot URL is: " + url);
        driver.get(url);
        driver.quit();
    }

    @Test
    public void shouldSuccessfullyFailThisTestUsingTheRemoteDriver() throws InterruptedException {

        RemoteWebDriver driver = chrome.getWebDriver();

        System.out.println("Selenium remote URL is: " + chrome.getSeleniumAddress());
        System.out.println("VNC URL is: " + chrome.getVncAddress());

        String url = "https://executeautomation.com";
        System.out.println("Spring Boot URL is: " + url);
        driver.get(url);
        driver.quit();
    }
}
