package com.lzz.seleniumExample.utils;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileUtil {

    /**
    * dirname目录名 D:\\mkdirname
    * filename文件名D:\\mkdirname\\newfile.txt
    * 创建文件目录和文件
    */
    public void createFileAndDir(String dirname, String filename) {
        //"D:\\mkdirname"
        File filedir =new File(dirname);

        //如果文件夹不存在则创建
        if (!filedir .exists() && !filedir .isDirectory()) {
//            log.info("目录不存在");
            filedir.mkdir();
        } else {
//            log.info("目录存在");
        }

        //路径包括文件名 D:\mkdirname\newfile.txt
        File file=new File(filename);
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    /**
    * 读取文件中的内容
    */
    public String readFileContent(String filename) throws IOException{
        String content="";
        try (FileReader fileReader=new FileReader(filename);
             BufferedReader bufferedReader=new BufferedReader(fileReader)) {
            try{
                String read=null;
                while((read=bufferedReader.readLine())!=null){
                    content=content+read+"\r\n";
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("读取出来的文件内容是："+"\r\n"+content);
        return content;
    }

    /**
     * 往文件写入内容
     * 操作文件有4种模式
     * 'r'	以只读方式打开。调用结果对象的任何 write 方法都将导致抛出 IOException。
     * "rw"	打开以便读取和写入。如果该文件尚不存在，则尝试创建该文件。
     * "rws"	打开以便读取和写入，对于 "rw"，还要求对文件的内容或元数据的每个更新都同步写入到底层存储设备。
     * "rwd"  	打开以便读取和写入，对于 "rw"，还要求对文件内容的每个更新都同步写入到底层存储设备。
     */
    public boolean writeToFile(String content,String fileName) throws IOException{
//        RandomAccessFile mm=null;
        boolean flag=false;
        FileOutputStream o=null;

        try {
            o = new FileOutputStream(fileName);
            o.write(content.getBytes(StandardCharsets.UTF_8));
            o.close();
//            mm=new RandomAccessFile(fileName,"rw");
//            mm.writeBytes(content);
            flag=true;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally{
//            if(mm!=null){
//                mm.close();
//            }
        }
        return flag;
    }

    /**
     * 把内容写入指定文件内
     * @param content 文件内容
     * @return
     */
    public boolean writeToGivenFile(String content) {
        boolean flag = false;

        File filedir =new File(DriverPathUtils.getPrintFolderPath());
        //如果文件夹不存在则创建
        if (!filedir .exists() && !filedir .isDirectory()) {
            filedir.mkdir();
        }

        try (FileOutputStream o = new FileOutputStream(DriverPathUtils.getPrintHtmlPath())) {
            o.write(content.getBytes(StandardCharsets.UTF_8));
            o.close();
            flag = true;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 特定html文件转成pdf文件
     * @return
     */
    public void fileToPdf() throws IOException, InterruptedException {

        String command = "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe --headless --disable-gpu --print-to-pdf=" +
                DriverPathUtils.getPrintPdfPath() + " " + DriverPathUtils.getPrintHtmlPath();

        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(command);
        int i = process.waitFor();
        process.destroy();

    }

    /**
     * 获取文件的byte[]数据
     * @return
     */
    public byte[] getFileBytes(String path) {
        File file = new File(path);
        try (FileInputStream in = new FileInputStream(file);
             ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            byte[] b = new byte[1024];
            while (in.read(b) != -1) {
                out.write(b, 0, b.length);
            }
            return out.toByteArray();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

//
//    /**
//     * main方法测试类
//     */
//    public static void main(String[] args) throws IOException {
//        // TODO Auto-generated method stub
//        FileUtil fileUtil=new FileUtil();
//        fileUtil.writeToFile("dddd", "D:\\printDemo\\newfile.txt");
//    }

}

