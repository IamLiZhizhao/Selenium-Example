package com.lzz.seleniumExample.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ClassName PropertiesUtils
 * @Descriiption 配置读取工具 指定读取printSetting.properties
 * @Author frank04.li
 * @Date 2021/11/2 17:06
 **/
public class PropertiesUtils {

    private static Properties properties;
    static{
        InputStream inputStream = PropertiesUtils.class.getClassLoader().getResourceAsStream("printSetting.properties");
        Properties p = new Properties();
        try {
            p.load(inputStream);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        properties = p;
    }

    /**
     *  文件内格式 key=value
     * @return  value
     */
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

}
