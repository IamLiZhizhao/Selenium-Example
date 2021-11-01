package com.lzz.seleniumExample;

import com.lzz.seleniumExample.utils.SeleniumUtils;
import org.openqa.selenium.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        WebDriver webDriver = SeleniumUtils.
                openAccess();
        try {
            Thread.sleep(100);
//            getHtml(webDriver);
            getHtmlByHeadless(webDriver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }  finally {
            webDriver.close();
        }
    }

    private static void getHtml(WebDriver webDriver) throws InterruptedException, AWTException, IOException {
        webDriver.get("file://D:/printDemo/demo.html");

        String currentWin = webDriver.getWindowHandle();

        // 根据class寻找元素，并且点击
//        Thread.sleep(1000);
//        WebElement addpBtn = webDriver.findElement(By.className("addp"));
//        addpBtn.click();
//        // 根据id寻找元素，并且点击
//        Thread.sleep(1000);
//        WebElement genLayoutBtn = webDriver.findElement(By.id("genLayout"));
//        genLayoutBtn.click();

        currentWin = webDriver.getWindowHandle();
        Set<String> handles = webDriver.getWindowHandles();
        for (String handle : handles) {
            if (currentWin.equals(handle)) {
                continue;
            }
            webDriver = webDriver.switchTo().window(handle);
        }

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(7000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(1000);
//
//        Runtime runtime = Runtime.getRuntime();
////        String exeDir = System.getProperty("user.dir") + "\\src\\main\\resources\\driver\\" + "pdf.exe";
//        //d:\printDemo\demo.pdf
//        String[] commandArray = {DriverPathUtils.getDevPath() + "pdf.exe", "demo.pdf"};
//        runtime.exec(commandArray);
//
//        Thread.sleep(3000);

//        webDriver.close();
        webDriver.switchTo()
                .window(currentWin);
    }

    private static void getHtmlByHeadless(WebDriver webDriver) throws InterruptedException, AWTException, IOException {
        webDriver.get("file://D:/printDemo/demo.html");

        String currentWin = webDriver.getWindowHandle();

        // 根据class寻找元素，并且点击
//        Thread.sleep(1000);
//        WebElement addpBtn = webDriver.findElement(By.className("addp"));
//        addpBtn.click();

        currentWin = webDriver.getWindowHandle();
        Set<String> handles = webDriver.getWindowHandles();
        for (String handle : handles) {
            if (currentWin.equals(handle)) {
                continue;
            }
            webDriver = webDriver.switchTo().window(handle);
        }
        Thread.sleep(4000);

//        ((JavascriptExecutor)webDriver).executeScript(
//                "window.print();");
//
//        Thread.sleep(2000);
        // 根据id寻找元素，并且点击
        WebElement printBtn = webDriver.findElement(By.id("print"));
        printBtn.sendKeys(Keys.CONTROL,"p");
        Thread.sleep(2000);
        printBtn.sendKeys(Keys.ENTER);

//
//        Thread.sleep(1000);
//        printBtn.click();
//        Thread.sleep(1000);
//        printBtn.sendKeys(Keys.ENTER);
//
//        Thread.sleep(1000);
//
//        Runtime runtime = Runtime.getRuntime();
////        String exeDir = System.getProperty("user.dir") + "\\src\\main\\resources\\driver\\" + "pdf.exe";
//        //d:\printDemo\demo.pdf
//        String[] commandArray = {DriverPathUtils.getDevPath() + "pdf.exe", "demo.pdf"};
//        runtime.exec(commandArray);
//
//        Thread.sleep(3000);

//        webDriver.close();
        webDriver.switchTo()
                .window(currentWin);
    }



}
