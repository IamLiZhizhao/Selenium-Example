# 工程简介



# 延伸阅读
1. 谷歌驱动下载路径：https://sites.google.com/a/chromium.org/chromedriver/downloads

2. WebDriver
可以通过强制类型转换把WebDriver转成JavascriptExecutor，然后就可以执行JS脚本了
((JavascriptExecutor)webDriver).executeScript("window.print();");

3. FileUtil
FileUtil.fileToPdf() 是通过寻找本机安装的chrome.exe 去启动无头浏览器执行 打印操作，把html文件转成pdf文件
chrome --headless --disable-gpu --print-to-pdf=D:/tmpPrint/print.pdf D:/tmpPrint/print.html 

