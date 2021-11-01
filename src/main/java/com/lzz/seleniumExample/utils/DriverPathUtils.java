package com.lzz.seleniumExample.utils;

import java.io.File;

/**
 * @ClassName DriverPathUtils
 * @Descriiption DriverPathUtils driver路径工具类
 * @Author yanjiantao
 * @Date 2019/1/22 9:38
 **/
public class DriverPathUtils {

    private static final String DEV_PATH = "src/main/resources/driver/";

    private static final String PROD_PATH = System.getProperty("user.dir")+ File.separator+"driver"+ File.separator;

    private static final String CHROME_PATH = "C:\\Users\\admin\\AppData\\Local\\Google\\Chrome\\User Data\\";

    private static final String CHROME_PATH_PROD = "C:\\Users\\onegene\\AppData\\Local\\Google\\Chrome\\User Data";

    private static final String PRINT_FOLDER_PATH = "D:\\tmpPrint";

    private static final String PRINT_HTML_PATH = PRINT_FOLDER_PATH + File.separator + "print.html";
    private static final String PRINT_PDF_PATH = PRINT_FOLDER_PATH + File.separator + "print.pdf";


    public static String getPrintFolderPath() {
        return PRINT_FOLDER_PATH;
    }

    public static String getPrintHtmlPath() {
        return PRINT_HTML_PATH;
    }

    public static String getPrintPdfPath() {
        return PRINT_PDF_PATH;
    }



    /**
     *  path
     * @return  path
     */
    public static final String getDevPath() {
        return DEV_PATH;
    }

    /**
     * prod-path
     * @return  path
     */
    public static final String getPath() {
        return PROD_PATH;
    }

    /**
     * local
     * @return
     */
    /*public static final String getChromePath() {
        return CHROME_PATH;
    }*/

    /**
     * prod
     * @return path
     */
    public static final String getChromePath() {
        return CHROME_PATH_PROD;
    }

}
