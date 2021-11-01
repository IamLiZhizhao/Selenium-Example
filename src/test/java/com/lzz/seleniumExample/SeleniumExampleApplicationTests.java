package com.lzz.seleniumExample;

import com.lzz.seleniumExample.utils.DriverPathUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;

@SpringBootTest
class SeleniumExampleApplicationTests {

    @Test
    void contextLoads() throws IOException {

        Runtime runtime = Runtime.getRuntime();
        runtime.exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe --headless --disable-gpu --print-to-pdf=D:/tmpPdf/demo2.pdf D:/printDemo/demo.html");
//        runtime.exec("chrome --headless --disable-gpu --print-to-pdf=D:/tmpPdf/demo2.pdf D:/printDemo/demo.html");
    }


    @Test
    void writeFile() throws IOException {

//        Runtime runtime = Runtime.getRuntime();
//        runtime.exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe D:/printDemo/demo.html");
    }


    @Test
    void checkFile() throws IOException {
        System.out.println(File.separator);
        System.out.println(File.pathSeparator);
    }

}
