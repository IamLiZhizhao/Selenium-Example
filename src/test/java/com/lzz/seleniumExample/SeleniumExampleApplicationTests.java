package com.lzz.seleniumExample;

import com.lzz.seleniumExample.utils.DriverPathUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class SeleniumExampleApplicationTests {

    @Test
    void contextLoads() throws IOException {

        Runtime runtime = Runtime.getRuntime();
//        runtime.exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe D:/printDemo/demo.html");
        runtime.exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe --headless --disable-gpu --print-to-pdf=D:/printDemo/demo2.pdf D:/printDemo/demo.html");
    }


    @Test
    void writeFile() throws IOException {

        Runtime runtime = Runtime.getRuntime();
//        runtime.exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe D:/printDemo/demo.html");

        runtime.exec("echo <?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n" +
                "    <title>\n" +
                "      table - hiprint\n" +
                "    </title>\n" +
                "    <style>\n" +
                "      \n" +
                "        body {\n" +
                "            font-family: simsunb\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-pagination {\n" +
                "            display: inline-block;\n" +
                "            padding-left: 0;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-pagination &gt; li {\n" +
                "            border: 1px solid #bdc3c7;\n" +
                "            -moz-border-radius: 2px;\n" +
                "            -webkit-border-radius: 2px;\n" +
                "            display: block;\n" +
                "            float: left;\n" +
                "            padding: 5px;\n" +
                "            text-decoration: none;\n" +
                "            margin-right: 5px;\n" +
                "            margin-bottom: 5px;\n" +
                "            font-family: helvetica;\n" +
                "            font-size: 13px;\n" +
                "            cursor: pointer\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-pagination &gt; li &gt; span {\n" +
                "            padding: 0 10px 0 10px;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-pagination &gt; li &gt; a {\n" +
                "            color: #bdc3c7;\n" +
                "            font-weight: bold;\n" +
                "            text-decoration: none;\n" +
                "            font-size: 11px;\n" +
                "            padding: 3px;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-pagination &gt; li &gt; a:hover {\n" +
                "            color: red;\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        .hiprint-pagination-sm &gt; li &gt; a {\n" +
                "            padding: 5px 10px;\n" +
                "            font-size: 12px;\n" +
                "            line-height: 1.5;\n" +
                "        }\n" +
                "\n" +
                "        .rect-printElement-types .hiprint-printElement-type {\n" +
                "            display: block;\n" +
                "        }\n" +
                "\n" +
                "        .rect-printElement-types .hiprint-printElement-type {\n" +
                "            padding: 0 0 0 0;\n" +
                "            list-style: none;\n" +
                "        }\n" +
                "\n" +
                "        .rect-printElement-types .hiprint-printElement-type &gt; li &gt; .title {\n" +
                "            display: block;\n" +
                "            padding: 4px 0px;\n" +
                "            clear: both;\n" +
                "        }\n" +
                "\n" +
                "        .rect-printElement-types .hiprint-printElement-type &gt; li &gt; ul {\n" +
                "            padding: 0 0 0 0;\n" +
                "            display: block;\n" +
                "            list-style: none;\n" +
                "        }\n" +
                "\n" +
                "        .rect-printElement-types .hiprint-printElement-type &gt; li &gt; ul &gt; li {\n" +
                "            display: block;\n" +
                "            width: 50%;\n" +
                "            float: left;\n" +
                "            max-width: 100px;\n" +
                "        }\n" +
                "\n" +
                "        .rect-printElement-types .hiprint-printElement-type &gt; li &gt; ul &gt; li &gt; a {\n" +
                "            height: 92px;\n" +
                "            padding: 12px 6px;\n" +
                "            margin-left: -1px;\n" +
                "            line-height: 1.42857143;\n" +
                "            color: #337ab7;\n" +
                "            text-decoration: none;\n" +
                "            background-color: #fff;\n" +
                "            border: 1px solid #ddd;\n" +
                "            margin-right: 5px;\n" +
                "            width: 95%;\n" +
                "            max-width: 100px;\n" +
                "            display: inline-block;\n" +
                "            text-align: center;\n" +
                "            margin-bottom: 7px;\n" +
                "            box-sizing: border-box;\n" +
                "            color: #b9a5a6;\n" +
                "            border: 1px solid rgba(0, 0, 0, 0.2);\n" +
                "            border-radius: 3px;\n" +
                "            box-shadow: 0 1px 0 0 rgba(0, 0, 0, 0.15);\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        .small-printElement-types .hiprint-printElement-type {\n" +
                "            display: block;\n" +
                "        }\n" +
                "\n" +
                "        .small-printElement-types .hiprint-printElement-type {\n" +
                "            padding: 0 0 0 0;\n" +
                "            list-style: none;\n" +
                "        }\n" +
                "\n" +
                "        .small-printElement-types .hiprint-printElement-type &gt; li &gt; .title {\n" +
                "            display: block;\n" +
                "            padding: 4px 0px;\n" +
                "            clear: both;\n" +
                "        }\n" +
                "\n" +
                "        .small-printElement-types .hiprint-printElement-type &gt; li &gt; ul {\n" +
                "            padding: 0 0 0 0;\n" +
                "            display: block;\n" +
                "            list-style: none;\n" +
                "            width: 100%;\n" +
                "        }\n" +
                "\n" +
                "        .small-printElement-types .hiprint-printElement-type &gt; li &gt; ul &gt; li {\n" +
                "            display: block;\n" +
                "            width: 50%;\n" +
                "            float: left;\n" +
                "            padding: 0 4px;\n" +
                "        }\n" +
                "\n" +
                "        .small-printElement-types .hiprint-printElement-type &gt; li &gt; ul &gt; li &gt; a {\n" +
                "            height: 22px;\n" +
                "            line-height: 20px;\n" +
                "            color: #337ab7;\n" +
                "            text-decoration: none;\n" +
                "            background-color: #fff;\n" +
                "            border: 1px solid #ddd;\n" +
                "            margin-right: 5px;\n" +
                "            width: 100%;\n" +
                "            display: block;\n" +
                "            text-align: center;\n" +
                "            margin-bottom: 7px;\n" +
                "            box-sizing: border-box;\n" +
                "            color: #b9a5a6;\n" +
                "            border: 1px solid rgba(0, 0, 0, 0.2);\n" +
                "            border-radius: 3px;\n" +
                "            box-shadow: 0 1px 0 0 rgba(0, 0, 0, 0.15);\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-toolbar {\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-toolbar &gt; ul {\n" +
                "            padding: 0px;\n" +
                "            margin-bottom: 5px;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-toolbar &gt; ul &gt; li {\n" +
                "            display: inline-block;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-toolbar &gt; ul &gt; li &gt; a {\n" +
                "            position: relative;\n" +
                "            float: left;\n" +
                "            padding: 3px 10px;\n" +
                "            margin-left: -1px;\n" +
                "            line-height: 1.42857143;\n" +
                "            color: #337ab7;\n" +
                "            text-decoration: none;\n" +
                "            background-color: #fff;\n" +
                "            border: 1px solid #ddd;\n" +
                "            margin-right: 4px;\n" +
                "            cursor: pointer;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printElement-type .glyphicon-class {\n" +
                "            display: block;\n" +
                "            text-align: center;\n" +
                "            word-wrap: break-word;\n" +
                "            font-family: Helvetica, sans-serif;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printElement-type .glyphicon {\n" +
                "            margin-top: 5px;\n" +
                "            margin-bottom: 10px;\n" +
                "            font-size: 37px;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items {\n" +
                "            font-size: .75rem;\n" +
                "            padding: 10px 5px;\n" +
                "            display: flex;\n" +
                "            flex-wrap: wrap;\n" +
                "            align-items: flex-end;\n" +
                "            box-sizing: border-box;\n" +
                "            width: 100%;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .hiprint-option-item {\n" +
                "            box-sizing: border-box;\n" +
                "            float: left;\n" +
                "            width: 50%;\n" +
                "            margin-bottom: 5px;\n" +
                "            padding: 0 5px;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .hiprint-option-item-row {\n" +
                "            width: 100%;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-item-label {\n" +
                "            margin: 5px 5px 3px 0;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .hiprint-option-item-field input, .hiprint-option-items .hiprint-option-item-field select, .hiprint-option-items .hiprint-option-item-field textarea {\n" +
                "            color: inherit;\n" +
                "            background-color: transparent;\n" +
                "            box-sizing: border-box;\n" +
                "            width: 100%;\n" +
                "            position: relative;\n" +
                "            padding: 3px;\n" +
                "            z-index: 1;\n" +
                "            border: 1px solid rgb(169, 169, 169);\n" +
                "            height: 19pt;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-item-settingBtn {\n" +
                "            height: 19pt;\n" +
                "            line-height: 19pt;\n" +
                "            font-size: 12px;\n" +
                "            padding: 0 24px;\n" +
                "            background: #00c1de;\n" +
                "            border-color: transparent;\n" +
                "            color: #fff;\n" +
                "            display: inline-block;\n" +
                "            margin: 5px;\n" +
                "            font-weight: 400;\n" +
                "            border: 1px solid transparent;\n" +
                "            font-family: PingFangSC, helvetica neue, hiragino sans gb, arial, microsoft yahei ui, microsoft yahei, simsun, \"sans-serif\";\n" +
                "            vertical-align: middle;\n" +
                "            transition: .3s cubic-bezier(.4, 0, .2, 1);\n" +
                "            transform: translateZ(0);\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-item-deleteBtn {\n" +
                "            background: red;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors {\n" +
                "            position: relative;\n" +
                "        }\n" +
                "        .hiprint-option-items .minicolors-swatch {\n" +
                "            position: absolute;\n" +
                "            vertical-align: middle;\n" +
                "            background-position: -80px 0;\n" +
                "            cursor: text;\n" +
                "            padding: 0;\n" +
                "            margin: 0;\n" +
                "            display: inline-block;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-swatch-color {\n" +
                "            position: absolute;\n" +
                "            top: 0;\n" +
                "            left: 0;\n" +
                "            right: 0;\n" +
                "            bottom: 0;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors input[type=hidden] + .minicolors-swatch {\n" +
                "            width: 28px;\n" +
                "            position: static;\n" +
                "            cursor: pointer;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors input[type=hidden][disabled] + .minicolors-swatch {\n" +
                "            cursor: default;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-panel {\n" +
                "            position: absolute;\n" +
                "            width: 173px;\n" +
                "            background: white;\n" +
                "            border: solid 1px #CCC;\n" +
                "            box-shadow: 0 0 20px rgba(0, 0, 0, .2);\n" +
                "            z-index: 99999;\n" +
                "            box-sizing: content-box;\n" +
                "            display: none;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-panel.minicolors-visible {\n" +
                "            display: block;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-position-top .minicolors-panel {\n" +
                "            top: -154px;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-position-right .minicolors-panel {\n" +
                "            right: 0;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-position-bottom .minicolors-panel {\n" +
                "            top: auto;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-position-left .minicolors-panel {\n" +
                "            left: 0;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-with-opacity .minicolors-panel {\n" +
                "            width: 194px;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors .minicolors-grid {\n" +
                "            position: relative;\n" +
                "            top: 1px;\n" +
                "            left: 1px; /* LTR */\n" +
                "            width: 150px;\n" +
                "            height: 150px;\n" +
                "            margin-bottom: 2px;\n" +
                "            background-position: -120px 0;\n" +
                "            cursor: crosshair;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors .minicolors-grid-inner {\n" +
                "            position: absolute;\n" +
                "            top: 0;\n" +
                "            left: 0;\n" +
                "            width: 150px;\n" +
                "            height: 150px;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-slider-saturation .minicolors-grid {\n" +
                "            background-position: -420px 0;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-slider-saturation .minicolors-grid-inner {\n" +
                "            background-position: -270px 0;\n" +
                "            background-image: inherit;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-slider-brightness .minicolors-grid {\n" +
                "            background-position: -570px 0;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-slider-brightness .minicolors-grid-inner {\n" +
                "            background-color: black;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-slider-wheel .minicolors-grid {\n" +
                "            background-position: -720px 0;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-slider,\n" +
                "        .hiprint-option-items .minicolors-opacity-slider {\n" +
                "            position: absolute;\n" +
                "            top: 1px;\n" +
                "            left: 152px; /* LTR */\n" +
                "            width: 20px;\n" +
                "            height: 150px;\n" +
                "            background-color: white;\n" +
                "            background-position: 0 0;\n" +
                "            cursor: row-resize;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-slider-saturation .minicolors-slider {\n" +
                "            background-position: -60px 0;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-slider-brightness .minicolors-slider {\n" +
                "            background-position: -20px 0;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-slider-wheel .minicolors-slider {\n" +
                "            background-position: -20px 0;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-opacity-slider {\n" +
                "            left: 173px; /* LTR */\n" +
                "            background-position: -40px 0;\n" +
                "            display: none;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-with-opacity .minicolors-opacity-slider {\n" +
                "            display: block;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-grid .minicolors-picker {\n" +
                "            position: absolute;\n" +
                "            top: 70px;\n" +
                "            left: 70px;\n" +
                "            width: 12px;\n" +
                "            height: 12px;\n" +
                "            border: solid 1px black;\n" +
                "            border-radius: 10px;\n" +
                "            margin-top: -6px;\n" +
                "            margin-left: -6px;\n" +
                "            background: none;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-grid .minicolors-picker &gt; div {\n" +
                "            position: absolute;\n" +
                "            top: 0;\n" +
                "            left: 0;\n" +
                "            width: 8px;\n" +
                "            height: 8px;\n" +
                "            border-radius: 8px;\n" +
                "            border: solid 2px white;\n" +
                "            box-sizing: content-box;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-picker {\n" +
                "            position: absolute;\n" +
                "            top: 0;\n" +
                "            left: 0;\n" +
                "            width: 18px;\n" +
                "            height: 2px;\n" +
                "            background: white;\n" +
                "            border: solid 1px black;\n" +
                "            margin-top: -2px;\n" +
                "            box-sizing: content-box;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-swatches,\n" +
                "        .hiprint-option-items .minicolors-swatches li {\n" +
                "            margin: 5px 0 3px 5px; /* LTR */\n" +
                "            padding: 0;\n" +
                "            list-style: none;\n" +
                "            overflow: hidden;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-swatches .minicolors-swatch {\n" +
                "            position: relative;\n" +
                "            float: left; /* LTR */\n" +
                "            cursor: pointer;\n" +
                "            margin: 0 4px 0 0; /* LTR */\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-with-opacity .minicolors-swatches .minicolors-swatch {\n" +
                "            margin-right: 7px; /* LTR */\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-swatch.selected {\n" +
                "            border-color: #000;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-inline {\n" +
                "            display: inline-block;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-inline .minicolors-input {\n" +
                "            display: none !important;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-inline .minicolors-panel {\n" +
                "            position: relative;\n" +
                "            top: auto;\n" +
                "            left: auto; /* LTR */\n" +
                "            box-shadow: none;\n" +
                "            z-index: auto;\n" +
                "            display: inline-block;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-theme-bootstrap .minicolors-swatch {\n" +
                "            z-index: 2;\n" +
                "            top: 3px;\n" +
                "            left: 3px;\n" +
                "            width: 17px;\n" +
                "            height: 17px;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-theme-bootstrap .minicolors-swatches .minicolors-swatch {\n" +
                "            margin-bottom: 2px;\n" +
                "            top: 0;\n" +
                "            left: 0; /* LTR */\n" +
                "            width: 20px;\n" +
                "            height: 20px;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-theme-bootstrap .minicolors-swatch-color {\n" +
                "            border-radius: inherit;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-theme-bootstrap.minicolors-position-right &gt; .minicolors-swatch {\n" +
                "            left: auto; /* LTR */\n" +
                "            right: 3px; /* LTR */\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-theme-bootstrap .minicolors-input {\n" +
                "            float: none;\n" +
                "            padding-left: 23px; /* LTR */\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-theme-bootstrap.minicolors-position-right .minicolors-input {\n" +
                "            padding-right: 44px; /* LTR */\n" +
                "            padding-left: 12px; /* LTR */\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-theme-bootstrap .minicolors-input.input-lg + .minicolors-swatch {\n" +
                "            top: 4px;\n" +
                "            left: 4px; /* LTR */\n" +
                "            width: 37px;\n" +
                "            height: 37px;\n" +
                "            border-radius: 5px;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-theme-bootstrap .minicolors-input.input-sm + .minicolors-swatch {\n" +
                "            width: 24px;\n" +
                "            height: 24px;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .minicolors-theme-bootstrap .minicolors-input.input-xs + .minicolors-swatch {\n" +
                "            width: 18px;\n" +
                "            height: 18px;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-items .input-group .minicolors-theme-bootstrap:not(:first-child) .minicolors-input {\n" +
                "            border-top-left-radius: 0; /* LTR */\n" +
                "            border-bottom-left-radius: 0; /* LTR */\n" +
                "        }\n" +
                "\n" +
                "        .hitable {\n" +
                "        }\n" +
                "\n" +
                "        .hitable .selected {\n" +
                "            background: #3e66ad;\n" +
                "        }\n" +
                "\n" +
                "        .hitable tr.resizerRow,\n" +
                "        .hitable .resizerRow td {\n" +
                "            border: 0pt dashed;\n" +
                "            height: 0pt;\n" +
                "            background: #fff;\n" +
                "        }\n" +
                "\n" +
                "        .hitable tr.resizerRow + tr,\n" +
                "        .hitable tr.resizerRow + tr td {\n" +
                "            border-top: 0px !important;\n" +
                "        }\n" +
                "\n" +
                "        .hitable td.resizerColumn {\n" +
                "            border: 0pt dashed;\n" +
                "            width: 0.000001px !important;\n" +
                "            background: #fff;\n" +
                "        }\n" +
                "\n" +
                "        .hitable td.resizerColumn + td {\n" +
                "            border-left: 0px !important;\n" +
                "        }\n" +
                "\n" +
                "        .columngrips {\n" +
                "            height: 0px;\n" +
                "            position: absolute;\n" +
                "        }\n" +
                "\n" +
                "        .columngrip {\n" +
                "            margin-left: -5px;\n" +
                "            position: absolute;\n" +
                "            z-index: 5;\n" +
                "            width: 10px;\n" +
                "        }\n" +
                "\n" +
                "        .columngrip .gripResizer {\n" +
                "            position: absolute;\n" +
                "            filter: alpha(opacity=1);\n" +
                "            opacity: 0;\n" +
                "            width: 10px;\n" +
                "            height: 100%;\n" +
                "            cursor: col-resize;\n" +
                "            top: 0px;\n" +
                "        }\n" +
                "\n" +
                "        .columngripDraging {\n" +
                "            border-left: 1px dotted black;\n" +
                "        }\n" +
                "\n" +
                "        .rowgrips {\n" +
                "            height: 0px;\n" +
                "            width: 0px;\n" +
                "            position: absolute;\n" +
                "        }\n" +
                "\n" +
                "        .rowgrip {\n" +
                "            margin-top: -5px;\n" +
                "            position: absolute;\n" +
                "            z-index: 5;\n" +
                "            height: 10px;\n" +
                "        }\n" +
                "\n" +
                "        .rowgrip .gripResizer {\n" +
                "            position: absolute;\n" +
                "            filter: alpha(opacity=1);\n" +
                "            opacity: 0;\n" +
                "            height: 10px;\n" +
                "            width: 100%;\n" +
                "            cursor: row-resize;\n" +
                "            left: 0px;\n" +
                "        }\n" +
                "\n" +
                "        .rowgripDraging {\n" +
                "            border-top: 1px dotted black;\n" +
                "        }\n" +
                "\n" +
                "        .hitable .hitable-editor-text {\n" +
                "            border: 1px solid;\n" +
                "            width: 95%;\n" +
                "            height: 80%;\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        .hipanel-disable {\n" +
                "            height: 0px;\n" +
                "            display: block !important;\n" +
                "            top: 8500px;\n" +
                "            width: 0px;\n" +
                "            overflow: hidden;\n" +
                "            position: absolute;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint_rul_wrapper {\n" +
                "            position: absolute;\n" +
                "            height: 100%;\n" +
                "            width: 100%;\n" +
                "            overflow: hidden;\n" +
                "            pointer-events: none;\n" +
                "            border: 0;\n" +
                "            border-top: 1px solid rgb(201, 190, 190);\n" +
                "            border-left: 1px solid rgb(201, 190, 190);\n" +
                "            padding-left: 15px;\n" +
                "            margin: -16px\n" +
                "        }\n" +
                "\n" +
                "        .hiprint_rul_wrapper .h_img {\n" +
                "            position: absolute;\n" +
                "            top: 0px;\n" +
                "            left: 15px;\n" +
                "            width: 400mm;\n" +
                "            height: 15px;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint_rul_wrapper .v_img {\n" +
                "            width: 400mm;\n" +
                "            transform: rotate(90deg);\n" +
                "            transform-origin: 0 100%;\n" +
                "            height: 15px;\n" +
                "            position: absolute;\n" +
                "            top: -2px;\n" +
                "            left: 0px;\n" +
                "        }\n" +
                "\n" +
                "        /*hiprint-option-table*/\n" +
                "\n" +
                "        .hiprint-option-table-selected-columns {\n" +
                "            color: inherit;\n" +
                "            background-color: transparent;\n" +
                "            box-sizing: border-box;\n" +
                "            width: 100%;\n" +
                "            position: relative;\n" +
                "            padding: 0px;\n" +
                "            list-style: none;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-option-table-selected-columns .hiprint-option-table-selected-item {\n" +
                "            color: inherit;\n" +
                "            background-color: transparent;\n" +
                "            box-sizing: border-box;\n" +
                "            width: 100%;\n" +
                "            padding: 0 3px;\n" +
                "            border: 1px solid rgb(169, 169, 169);\n" +
                "            line-height: 19pt;\n" +
                "            margin: 3px 0;\n" +
                "        }\n" +
                "\n" +
                "        /*hi-pretty */\n" +
                "        .hi-pretty * {\n" +
                "            box-sizing: border-box;\n" +
                "        }\n" +
                "\n" +
                "        .hi-pretty input:not([type='checkbox']):not([type='radio']) {\n" +
                "            display: none;\n" +
                "        }\n" +
                "\n" +
                "        .hi-pretty {\n" +
                "            position: relative;\n" +
                "            display: inline-block;\n" +
                "            margin-right: 1em;\n" +
                "            white-space: nowrap;\n" +
                "            line-height: 1;\n" +
                "        }\n" +
                "\n" +
                "        .hi-pretty input {\n" +
                "            position: absolute;\n" +
                "            left: 0;\n" +
                "            top: 0;\n" +
                "            min-width: 1em;\n" +
                "            width: 100%;\n" +
                "            height: 100%;\n" +
                "            z-index: 2;\n" +
                "            opacity: 0;\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "            cursor: pointer;\n" +
                "        }\n" +
                "\n" +
                "        .hi-pretty .state label {\n" +
                "            position: initial;\n" +
                "            display: inline-block;\n" +
                "            font-weight: normal;\n" +
                "            margin: 0;\n" +
                "            text-indent: 1.5em;\n" +
                "            min-width: calc(1em + 2px);\n" +
                "        }\n" +
                "\n" +
                "        .hi-pretty .state label:before,\n" +
                "        .hi-pretty .state label:after {\n" +
                "            content: '';\n" +
                "            width: calc(1em + 2px);\n" +
                "            height: calc(1em + 2px);\n" +
                "            display: block;\n" +
                "            box-sizing: border-box;\n" +
                "            border-radius: 0;\n" +
                "            border: 1px solid transparent;\n" +
                "            z-index: 0;\n" +
                "            position: absolute;\n" +
                "            left: 0;\n" +
                "            top: calc((0% - (100% - 1em)) - 8%);\n" +
                "            background-color: transparent;\n" +
                "        }\n" +
                "\n" +
                "        .hi-pretty .state label:before {\n" +
                "            border-color: #bdc3c7;\n" +
                "        }\n" +
                "\n" +
                "        .hi-pretty .state.p-is-hover,\n" +
                "        .hi-pretty .state.p-is-indeterminate {\n" +
                "            display: none;\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        .hi-pretty.p-default.p-fill .state label:after {\n" +
                "            -webkit-transform: scale(1);\n" +
                "            -ms-transform: scale(1);\n" +
                "            transform: scale(1);\n" +
                "        }\n" +
                "\n" +
                "        .hi-pretty.p-default .state label:after {\n" +
                "            -webkit-transform: scale(0.6);\n" +
                "            -ms-transform: scale(0.6);\n" +
                "            transform: scale(0.6);\n" +
                "        }\n" +
                "\n" +
                "        .hi-pretty.p-default input:checked ~ .state label:after {\n" +
                "            background-color: #bdc3c7 !important;\n" +
                "        }\n" +
                "\n" +
                "        .hi-pretty.p-default.p-thick .state label:before,\n" +
                "        .hi-pretty.p-default.p-thick .state label:after {\n" +
                "            border-width: calc(1em / 7);\n" +
                "        }\n" +
                "\n" +
                "        .hi-pretty.p-default.p-thick .state label:after {\n" +
                "            -webkit-transform: scale(0.4) !important;\n" +
                "            -ms-transform: scale(0.4) !important;\n" +
                "            transform: scale(0.4) !important;\n" +
                "        }\n" +
                "\n" +
                "        @media print {\n" +
                "            body {\n" +
                "                margin: 0px;\n" +
                "                padding: 0px;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        @page {\n" +
                "            margin: 0;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printPaper * {\n" +
                "            box-sizing: border-box;\n" +
                "            -moz-box-sizing: border-box; /* Firefox */\n" +
                "            -webkit-box-sizing: border-box; /* Safari */\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printPaper *:focus {\n" +
                "            outline: -webkit-focus-ring-color auto 0px;\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        .hiprint-page-break-avoid {\n" +
                "            page-break-after: avoid;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printPaper {\n" +
                "            position: relative;\n" +
                "            padding: 0 0 0 0;\n" +
                "            page-break-after: always;\n" +
                "            overflow-x: hidden;\n" +
                "            overflow: hidden;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printPaper .hiprint-printPaper-content {\n" +
                "            position: relative;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printPaper.design {\n" +
                "            overflow: visible;\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        .hiprint-printTemplate .hiprint-printPanel {\n" +
                "            page-break-after: always;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printPaper, hiprint-printPanel {\n" +
                "            box-sizing: border-box;\n" +
                "            border: 0px;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printPanel .hiprint-printPaper:last-child {\n" +
                "            page-break-after: avoid;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printTemplate .hiprint-printPanel:last-child {\n" +
                "            page-break-after: avoid;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printPaper .hideheaderLinetarget {\n" +
                "            border-top: 0px dashed rgb(201, 190, 190) !important;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printPaper .hidefooterLinetarget {\n" +
                "            border-top: 0px dashed rgb(201, 190, 190) !important;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printPaper.design {\n" +
                "            border: 1px dashed rgba(170, 170, 170, 0.7);\n" +
                "        }\n" +
                "\n" +
                "        .design .hiprint-printElement-table-content, .design .hiprint-printElement-longText-content {\n" +
                "            overflow: hidden;\n" +
                "            box-sizing: border-box;\n" +
                "        }\n" +
                "\n" +
                "        .design .resize-panel {\n" +
                "            box-sizing: border-box;\n" +
                "            border: 1px dotted;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printElement-text {\n" +
                "            background-color: transparent;\n" +
                "            background-repeat: repeat;\n" +
                "            padding: 0 0 0 0;\n" +
                "            border: 0.75pt none rgb(0, 0, 0);\n" +
                "            direction: ltr;\n" +
                "            font-family: 'SimSun';\n" +
                "            font-size: 9pt;\n" +
                "            font-style: normal;\n" +
                "            font-weight: normal;\n" +
                "            padding-bottom: 0pt;\n" +
                "            padding-left: 0pt;\n" +
                "            padding-right: 0pt;\n" +
                "            padding-top: 0pt;\n" +
                "            text-align: left;\n" +
                "            text-decoration: none;\n" +
                "            line-height: 9.75pt;\n" +
                "            box-sizing: border-box;\n" +
                "            word-wrap: break-word;\n" +
                "            word-break: break-all;\n" +
                "        }\n" +
                "\n" +
                "        .design .hiprint-printElement-text-content {\n" +
                "            border: 1px dashed rgb(206, 188, 188);\n" +
                "            box-sizing: border-box;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printElement-longText {\n" +
                "            background-color: transparent;\n" +
                "            background-repeat: repeat;\n" +
                "            border: 0.75pt none rgb(0, 0, 0);\n" +
                "            direction: ltr;\n" +
                "            font-family: 'SimSun';\n" +
                "            font-size: 9pt;\n" +
                "            font-style: normal;\n" +
                "            font-weight: normal;\n" +
                "            padding-bottom: 0pt;\n" +
                "            padding-left: 0pt;\n" +
                "            padding-right: 0pt;\n" +
                "            padding-top: 0pt;\n" +
                "            text-align: left;\n" +
                "            text-decoration: none;\n" +
                "            line-height: 9.75pt;\n" +
                "            box-sizing: border-box;\n" +
                "            word-wrap: break-word;\n" +
                "            word-break: break-all;\n" +
                "            /*white-space: pre-wrap*/\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        .hiprint-printElement-table {\n" +
                "            background-color: transparent;\n" +
                "            background-repeat: repeat;\n" +
                "            color: rgb(0, 0, 0);\n" +
                "            border-color: rgb(0, 0, 0);\n" +
                "            border-style: none;\n" +
                "            direction: ltr;\n" +
                "            font-family: 'SimSun';\n" +
                "            font-size: 9pt;\n" +
                "            font-style: normal;\n" +
                "            font-weight: normal;\n" +
                "            padding-bottom: 0pt;\n" +
                "            padding-left: 0pt;\n" +
                "            padding-right: 0pt;\n" +
                "            padding-top: 0pt;\n" +
                "            text-align: left;\n" +
                "            text-decoration: none;\n" +
                "            padding: 0 0 0 0;\n" +
                "            box-sizing: border-box;\n" +
                "            line-height: 9.75pt;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printElement-table thead {\n" +
                "            background: #e8e8e8;\n" +
                "            font-weight: 700;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printElement-tableTarget, .hiprint-printElement-tableTarget tr, .hiprint-printElement-tableTarget td {\n" +
                "            border-color: rgb(0, 0, 0);\n" +
                "            border-style: none;\n" +
                "            border: 1px solid rgb(0, 0, 0);\n" +
                "            font-weight: normal;\n" +
                "            direction: ltr;\n" +
                "            padding-bottom: 0pt;\n" +
                "            padding-left: 0pt;\n" +
                "            padding-right: 0pt;\n" +
                "            padding-top: 0pt;\n" +
                "            text-decoration: none;\n" +
                "            vertical-align: middle;\n" +
                "            box-sizing: border-box;\n" +
                "            word-wrap: break-word;\n" +
                "            word-break: break-all;\n" +
                "            /*line-height: 9.75pt;\n" +
                "            font-size: 9pt;*/\n" +
                "        }\n" +
                "\n" +
                "        /*.hiprint-printElement-tableTarget tr,*/\n" +
                "        .hiprint-printElement-tableTarget td {\n" +
                "            height: 18pt;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printPaper .hiprint-paperNumber {\n" +
                "            font-size: 9pt;\n" +
                "        }\n" +
                "\n" +
                "        .design .hiprint-printElement-table-handle {\n" +
                "            position: absolute;\n" +
                "            height: 21pt;\n" +
                "            width: 21pt;\n" +
                "            background: red;\n" +
                "            z-index: 1;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printPaper .hiprint-paperNumber-disabled {\n" +
                "            float: right !important;\n" +
                "            right: 0 !important;\n" +
                "            color: gainsboro !important;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printElement-vline, .hiprint-printElement-hline {\n" +
                "            border: 0px none rgb(0, 0, 0);\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printElement-vline {\n" +
                "            border-left: 0.75pt solid #000;\n" +
                "            border-right: 0px none rgb(0, 0, 0) !important;\n" +
                "            border-bottom: 0px none rgb(0, 0, 0) !important;\n" +
                "            border-top: 0px none rgb(0, 0, 0) !important;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printElement-hline {\n" +
                "            border-top: 0.75pt solid #000;\n" +
                "            border-right: 0px none rgb(0, 0, 0) !important;\n" +
                "            border-bottom: 0px none rgb(0, 0, 0) !important;\n" +
                "            border-left: 0px none rgb(0, 0, 0) !important;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-printElement-oval, .hiprint-printElement-rect {\n" +
                "            border: 0.75pt solid #000;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-text-content-middle {\n" +
                "            display: table;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-text-content-middle &gt; div {\n" +
                "            display: table-cell;\n" +
                "            vertical-align: middle\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-text-content-bottom {\n" +
                "            display: table;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-text-content-bottom &gt; div {\n" +
                "            display: table-cell;\n" +
                "            vertical-align: bottom\n" +
                "        }\n" +
                "\n" +
                "        /*hi-grid-row */\n" +
                "        .hi-grid-row {\n" +
                "            position: relative;\n" +
                "            height: auto;\n" +
                "            margin-right: 0;\n" +
                "            margin-left: 0;\n" +
                "            zoom: 1;\n" +
                "            display: block;\n" +
                "            box-sizing: border-box;\n" +
                "        }\n" +
                "\n" +
                "        .hi-grid-row::after, .hi-grid-row::before {\n" +
                "            display: table;\n" +
                "            content: '';\n" +
                "            box-sizing: border-box;\n" +
                "        }\n" +
                "\n" +
                "        .hi-grid-col {\n" +
                "            display: block;\n" +
                "            box-sizing: border-box;\n" +
                "            position: relative;\n" +
                "            float: left;\n" +
                "            flex: 0 0 auto;\n" +
                "        }\n" +
                "\n" +
                "        .table-grid-row {\n" +
                "            margin-left: -0pt;\n" +
                "            margin-right: -0pt;\n" +
                "        }\n" +
                "\n" +
                "        .tableGridColumnsGutterRow {\n" +
                "            padding-left: 0pt;\n" +
                "            padding-right: 0pt;\n" +
                "        }\n" +
                "\n" +
                "        .hiprint-gridColumnsFooter {\n" +
                "            text-align: left;\n" +
                "            clear: both;\n" +
                "        }\n" +
                "\n" +
                "        .hicontextmenu {\n" +
                "            position: absolute;\n" +
                "            display: inline-block;\n" +
                "            width: 215px;\n" +
                "            padding: 0 0;\n" +
                "            margin: 0;\n" +
                "            font-family: inherit;\n" +
                "            font-size: inherit;\n" +
                "            list-style-type: none;\n" +
                "            list-style: none;\n" +
                "            background: #fff;\n" +
                "            border: 1px solid #bebebe;\n" +
                "            border-radius: 2px;\n" +
                "            font-size: 13px;\n" +
                "        }\n" +
                "\n" +
                "        .hicontextmenuroot .hicontextmenuitem {\n" +
                "            position: relative;\n" +
                "            -webkit-box-sizing: content-box;\n" +
                "            -moz-box-sizing: content-box;\n" +
                "            box-sizing: content-box;\n" +
                "            padding: .2em 12px;\n" +
                "            color: #2f2f2f;\n" +
                "            -webkit-user-select: none;\n" +
                "            -moz-user-select: none;\n" +
                "            -ms-user-select: none;\n" +
                "            text-decoration: none;\n" +
                "\n" +
                "            user-select: none;\n" +
                "            background-color: #fff;\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        .hicontextmenuroot &gt; .hicontextmenuitem:hover,\n" +
                "        .hicontextmenuroot .hicontextmenuitem &gt; a:hover {\n" +
                "            background-color: #f3f3f3;\n" +
                "        }\n" +
                "\n" +
                "        .hicontextmenuroot .hicontextmenuitem &gt; a {\n" +
                "            text-decoration: none;\n" +
                "            color: #363636;\n" +
                "            line-height: 22px;\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        .hicontextmenuroot .hicontextsubmenu &gt; ul {\n" +
                "            display: none;\n" +
                "            position: absolute;\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        .hicontextmenuroot .hicontextsubmenu:hover &gt; ul {\n" +
                "            display: block;\n" +
                "            left: 100%;\n" +
                "            top: -1px;\n" +
                "            margin-left: 0px;\n" +
                "        }\n" +
                "\n" +
                "        .hicontextmenuroot .borderBottom {\n" +
                "            border-bottom: 1px solid #efe6e6;\n" +
                "        }\n" +
                "\n" +
                "        .hicontextmenuroot .disable &gt; a {\n" +
                "\n" +
                "            color: #ccc;\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        .hicontextmenuroot &gt; .disable:hover,\n" +
                "        .hicontextmenuroot .disable &gt; a:hover {\n" +
                "            background-color: #fff;\n" +
                "        }\n" +
                "    </style>\n" +
                "    <style type=\"text/css\">\n" +
                "      .hicontextmenu {\n" +
                "\tposition: absolute;\n" +
                "\tdisplay: inline-block;\n" +
                "\twidth: 215px;\n" +
                "\tpadding: 0 0;\n" +
                "\tmargin: 0;\n" +
                "\tfont-family: inherit;\n" +
                "\tfont-size: inherit;\n" +
                "\tlist-style-type: none;\n" +
                "\tlist-style: none;\n" +
                "\tbackground: #fff;\n" +
                "\tborder: 1px solid #bebebe;\n" +
                "\tborder-radius: 2px;\n" +
                "\tfont-size: 13px;\n" +
                "}\n" +
                "\n" +
                ".hicontextmenuroot .hicontextmenuitem {\n" +
                "\tposition: relative;\n" +
                "\t-webkit-box-sizing: content-box;\n" +
                "\t-moz-box-sizing: content-box;\n" +
                "\tbox-sizing: content-box;\n" +
                "\tpadding: .2em 12px;\n" +
                "\tcolor: #2f2f2f;\n" +
                "\t-webkit-user-select: none;\n" +
                "\t-moz-user-select: none;\n" +
                "\t-ms-user-select: none;\n" +
                "\ttext-decoration: none;\n" +
                "\n" +
                "\tuser-select: none;\n" +
                "\tbackground-color: #fff;\n" +
                "\n" +
                "}\n" +
                "\n" +
                ".hicontextmenuroot&gt;.hicontextmenuitem:hover,\n" +
                ".hicontextmenuroot .hicontextmenuitem &gt; a:hover {\n" +
                "\tbackground-color: #f3f3f3;\n" +
                "}\n" +
                "\n" +
                ".hicontextmenuroot .hicontextmenuitem&gt;a {\n" +
                "\ttext-decoration: none;\n" +
                "\tcolor: #363636;\n" +
                "\tline-height: 22px;\n" +
                "\n" +
                "}\n" +
                "\n" +
                ".hicontextmenuroot .hicontextsubmenu&gt;ul {\n" +
                "\tdisplay: none;\n" +
                "\tposition: absolute;\n" +
                "\n" +
                "}\n" +
                "\n" +
                ".hicontextmenuroot .hicontextsubmenu:hover&gt;ul {\n" +
                "\tdisplay: block;\n" +
                "\tleft: 100%;\n" +
                "\ttop: -1px;\n" +
                "\tmargin-left: 0px;\n" +
                "}\n" +
                "\n" +
                ".hicontextmenuroot .borderBottom {\n" +
                "\tborder-bottom: 1px solid #efe6e6;\n" +
                "}\n" +
                "\n" +
                ".hicontextmenuroot .disable&gt; a {\n" +
                "  \n" +
                "    color: #ccc;\n" +
                "   \n" +
                "}\n" +
                ".hicontextmenuroot&gt;.disable:hover,\n" +
                ".hicontextmenuroot .disable&gt; a:hover {\n" +
                "\tbackground-color:#fff;\n" +
                "}\n" +
                "    </style>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <div id=\"hiprint-printTemplate\" class=\"hiprint-printTemplate\" style=\"margin-top:50px;\">\n" +
                "      <div id=\"print-preview\" class=\"\" style=\"margin-top:50px;margin-bottom:50px;\">\n" +
                "        <div class=\"hiprint-printTemplate\">\n" +
                "          <div class=\"hiprint-printPanel panel-index-0\">\n" +
                "            <div class=\"hiprint-printPaper\" style=\"width: 101mm; height: 100mm;\" original-height=\"101\">\n" +
                "              <div class=\"hiprint-printPaper-content\" style=\"top: 3.75pt;\">\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 28.5pt; height: 19.5pt; font-size: 16.5pt; left: 148.5pt; top: 4.5pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    最\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 13.5pt; height: 14pt; font-family: Microsoft YaHei; font-size: 14pt; font-weight: bold; line-height: 14pt; left: 153pt; top: 6pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    5\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 75pt; height: 19.5pt; font-family: Microsoft YaHei; font-size: 25pt; font-weight: bolder; line-height: 18pt; left: 171pt; top: 7.5pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    A012\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 21pt; height: 19.5pt; font-size: 15pt; font-weight: bolder; color: rgb(255, 255, 255); left: 253.5pt; top: 9pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    包材\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div class=\"hiprint-printElement hiprint-printElement-oval\" style=\"border: 1px solid; position: absolute; border-radius: 50%; width: 15pt; height: 15pt; border-width: 1pt; left: 232pt; top: 10pt;\">\n" +
                "                </div>\n" +
                "                <div class=\"hiprint-printElement hiprint-printElement-oval\" style=\"border: 1px solid; position: absolute; border-radius: 50%; width: 15pt; height: 15pt; left: 252pt; top: 10pt;\">\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 15pt; height: 15pt; font-size: 15pt; font-weight: bold; line-height: 15pt; left: 232.5pt; top: 10.5pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    预\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 87pt; height: 9pt; font-size: 7.5pt; line-height: 7.5pt; left: 91.5pt; top: 22.5pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    只双休日/节\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 87pt; height: 18pt; left: 184.5pt; top: 30pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    <svg width=\"100%\" display=\"block\" height=\"100%\" class=\"hibarcode_imgcode\" preserveaspectratio=\"none slice\" x=\"0px\" y=\"0px\" viewbox=\"0 0 112 37\" xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" style=\"transform: translate(0,0)\">\n" +
                "                      <rect x=\"0\" y=\"0\" width=\"112\" height=\"37\" style=\"fill:#ffffff;\"/>\n" +
                "                      <g transform=\"translate(0, 0)\" style=\"fill:#000000;\">\n" +
                "                        <rect x=\"0\" y=\"0\" width=\"2\" height=\"37\"/>\n" +
                "                        <rect x=\"3\" y=\"0\" width=\"1\" height=\"37\"/>\n" +
                "                        <rect x=\"6\" y=\"0\" width=\"3\" height=\"37\"/>\n" +
                "                        <rect x=\"11\" y=\"0\" width=\"2\" height=\"37\"/>\n" +
                "                        <rect x=\"15\" y=\"0\" width=\"1\" height=\"37\"/>\n" +
                "                        <rect x=\"18\" y=\"0\" width=\"3\" height=\"37\"/>\n" +
                "                        <rect x=\"22\" y=\"0\" width=\"2\" height=\"37\"/>\n" +
                "                        <rect x=\"26\" y=\"0\" width=\"1\" height=\"37\"/>\n" +
                "                        <rect x=\"28\" y=\"0\" width=\"3\" height=\"37\"/>\n" +
                "                        <rect x=\"33\" y=\"0\" width=\"1\" height=\"37\"/>\n" +
                "                        <rect x=\"37\" y=\"0\" width=\"2\" height=\"37\"/>\n" +
                "                        <rect x=\"41\" y=\"0\" width=\"1\" height=\"37\"/>\n" +
                "                        <rect x=\"44\" y=\"0\" width=\"3\" height=\"37\"/>\n" +
                "                        <rect x=\"48\" y=\"0\" width=\"2\" height=\"37\"/>\n" +
                "                        <rect x=\"52\" y=\"0\" width=\"1\" height=\"37\"/>\n" +
                "                        <rect x=\"55\" y=\"0\" width=\"3\" height=\"37\"/>\n" +
                "                        <rect x=\"59\" y=\"0\" width=\"1\" height=\"37\"/>\n" +
                "                        <rect x=\"61\" y=\"0\" width=\"2\" height=\"37\"/>\n" +
                "                        <rect x=\"66\" y=\"0\" width=\"3\" height=\"37\"/>\n" +
                "                        <rect x=\"70\" y=\"0\" width=\"1\" height=\"37\"/>\n" +
                "                        <rect x=\"72\" y=\"0\" width=\"2\" height=\"37\"/>\n" +
                "                        <rect x=\"77\" y=\"0\" width=\"3\" height=\"37\"/>\n" +
                "                        <rect x=\"81\" y=\"0\" width=\"1\" height=\"37\"/>\n" +
                "                        <rect x=\"83\" y=\"0\" width=\"2\" height=\"37\"/>\n" +
                "                        <rect x=\"88\" y=\"0\" width=\"2\" height=\"37\"/>\n" +
                "                        <rect x=\"91\" y=\"0\" width=\"2\" height=\"37\"/>\n" +
                "                        <rect x=\"96\" y=\"0\" width=\"2\" height=\"37\"/>\n" +
                "                        <rect x=\"99\" y=\"0\" width=\"2\" height=\"37\"/>\n" +
                "                        <rect x=\"104\" y=\"0\" width=\"3\" height=\"37\"/>\n" +
                "                        <rect x=\"108\" y=\"0\" width=\"1\" height=\"37\"/>\n" +
                "                        <rect x=\"110\" y=\"0\" width=\"2\" height=\"37\"/>\n" +
                "                      </g>\n" +
                "                    </svg>\n" +
                "                    <div class=\"hibarcode_displayValue\">\n" +
                "                      20190827545454\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 49.5pt; height: 9.75pt; font-size: 7.5pt; left: 91.5pt; top: 33pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    白天配送\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 66pt; height: 18pt; font-family: Microsoft YaHei; font-size: 13.5pt; font-weight: bolder; left: 22.5pt; top: 36pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    顺丰速运\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 69pt; height: 12pt; font-size: 7.5pt; left: 91.5pt; top: 43.5pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    2019年03月09日\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 84pt; height: 9.75pt; left: 184.5pt; top: 48pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    20190827545454\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 79.5pt; height: 15pt; font-size: 8.25pt; left: 12pt; top: 51pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    80152019I617500986\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 64pt; height: 64pt; left: 205.5pt; top: 66pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\" title=\"SF12345678\">\n" +
                "                    <svg viewbox=\"0 0 25 25\" width=\"100%\" height=\"100%\" fill=\"#ffffff\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n" +
                "                      <rect fill=\"#ffffff\" width=\"100%\" height=\"100%\"/>\n" +
                "                      <rect fill=\"#000000\" width=\"1\" height=\"1\" id=\"template\"/>\n" +
                "                      <use x=\"0\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"1\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"2\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"3\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"4\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"5\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"12\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"15\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"19\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"20\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"21\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"22\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"23\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"24\" y=\"0\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"1\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"1\" href=\"#template\"/>\n" +
                "                      <use x=\"8\" y=\"1\" href=\"#template\"/>\n" +
                "                      <use x=\"10\" y=\"1\" href=\"#template\"/>\n" +
                "                      <use x=\"11\" y=\"1\" href=\"#template\"/>\n" +
                "                      <use x=\"13\" y=\"1\" href=\"#template\"/>\n" +
                "                      <use x=\"14\" y=\"1\" href=\"#template\"/>\n" +
                "                      <use x=\"15\" y=\"1\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"1\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"1\" href=\"#template\"/>\n" +
                "                      <use x=\"24\" y=\"1\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"2\" href=\"#template\"/>\n" +
                "                      <use x=\"2\" y=\"2\" href=\"#template\"/>\n" +
                "                      <use x=\"3\" y=\"2\" href=\"#template\"/>\n" +
                "                      <use x=\"4\" y=\"2\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"2\" href=\"#template\"/>\n" +
                "                      <use x=\"12\" y=\"2\" href=\"#template\"/>\n" +
                "                      <use x=\"13\" y=\"2\" href=\"#template\"/>\n" +
                "                      <use x=\"14\" y=\"2\" href=\"#template\"/>\n" +
                "                      <use x=\"15\" y=\"2\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"2\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"2\" href=\"#template\"/>\n" +
                "                      <use x=\"20\" y=\"2\" href=\"#template\"/>\n" +
                "                      <use x=\"21\" y=\"2\" href=\"#template\"/>\n" +
                "                      <use x=\"22\" y=\"2\" href=\"#template\"/>\n" +
                "                      <use x=\"24\" y=\"2\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"3\" href=\"#template\"/>\n" +
                "                      <use x=\"2\" y=\"3\" href=\"#template\"/>\n" +
                "                      <use x=\"3\" y=\"3\" href=\"#template\"/>\n" +
                "                      <use x=\"4\" y=\"3\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"3\" href=\"#template\"/>\n" +
                "                      <use x=\"9\" y=\"3\" href=\"#template\"/>\n" +
                "                      <use x=\"10\" y=\"3\" href=\"#template\"/>\n" +
                "                      <use x=\"11\" y=\"3\" href=\"#template\"/>\n" +
                "                      <use x=\"15\" y=\"3\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"3\" href=\"#template\"/>\n" +
                "                      <use x=\"20\" y=\"3\" href=\"#template\"/>\n" +
                "                      <use x=\"21\" y=\"3\" href=\"#template\"/>\n" +
                "                      <use x=\"22\" y=\"3\" href=\"#template\"/>\n" +
                "                      <use x=\"24\" y=\"3\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"4\" href=\"#template\"/>\n" +
                "                      <use x=\"2\" y=\"4\" href=\"#template\"/>\n" +
                "                      <use x=\"3\" y=\"4\" href=\"#template\"/>\n" +
                "                      <use x=\"4\" y=\"4\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"4\" href=\"#template\"/>\n" +
                "                      <use x=\"11\" y=\"4\" href=\"#template\"/>\n" +
                "                      <use x=\"12\" y=\"4\" href=\"#template\"/>\n" +
                "                      <use x=\"15\" y=\"4\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"4\" href=\"#template\"/>\n" +
                "                      <use x=\"20\" y=\"4\" href=\"#template\"/>\n" +
                "                      <use x=\"21\" y=\"4\" href=\"#template\"/>\n" +
                "                      <use x=\"22\" y=\"4\" href=\"#template\"/>\n" +
                "                      <use x=\"24\" y=\"4\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"5\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"5\" href=\"#template\"/>\n" +
                "                      <use x=\"8\" y=\"5\" href=\"#template\"/>\n" +
                "                      <use x=\"10\" y=\"5\" href=\"#template\"/>\n" +
                "                      <use x=\"11\" y=\"5\" href=\"#template\"/>\n" +
                "                      <use x=\"13\" y=\"5\" href=\"#template\"/>\n" +
                "                      <use x=\"14\" y=\"5\" href=\"#template\"/>\n" +
                "                      <use x=\"15\" y=\"5\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"5\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"5\" href=\"#template\"/>\n" +
                "                      <use x=\"24\" y=\"5\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"1\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"2\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"3\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"4\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"5\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"8\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"10\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"12\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"14\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"19\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"20\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"21\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"22\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"23\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"24\" y=\"6\" href=\"#template\"/>\n" +
                "                      <use x=\"8\" y=\"7\" href=\"#template\"/>\n" +
                "                      <use x=\"9\" y=\"7\" href=\"#template\"/>\n" +
                "                      <use x=\"13\" y=\"7\" href=\"#template\"/>\n" +
                "                      <use x=\"15\" y=\"7\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"7\" href=\"#template\"/>\n" +
                "                      <use x=\"4\" y=\"8\" href=\"#template\"/>\n" +
                "                      <use x=\"5\" y=\"8\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"8\" href=\"#template\"/>\n" +
                "                      <use x=\"7\" y=\"8\" href=\"#template\"/>\n" +
                "                      <use x=\"9\" y=\"8\" href=\"#template\"/>\n" +
                "                      <use x=\"11\" y=\"8\" href=\"#template\"/>\n" +
                "                      <use x=\"14\" y=\"8\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"8\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"8\" href=\"#template\"/>\n" +
                "                      <use x=\"19\" y=\"8\" href=\"#template\"/>\n" +
                "                      <use x=\"23\" y=\"8\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"9\" href=\"#template\"/>\n" +
                "                      <use x=\"2\" y=\"9\" href=\"#template\"/>\n" +
                "                      <use x=\"5\" y=\"9\" href=\"#template\"/>\n" +
                "                      <use x=\"7\" y=\"9\" href=\"#template\"/>\n" +
                "                      <use x=\"8\" y=\"9\" href=\"#template\"/>\n" +
                "                      <use x=\"9\" y=\"9\" href=\"#template\"/>\n" +
                "                      <use x=\"13\" y=\"9\" href=\"#template\"/>\n" +
                "                      <use x=\"14\" y=\"9\" href=\"#template\"/>\n" +
                "                      <use x=\"15\" y=\"9\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"9\" href=\"#template\"/>\n" +
                "                      <use x=\"17\" y=\"9\" href=\"#template\"/>\n" +
                "                      <use x=\"19\" y=\"9\" href=\"#template\"/>\n" +
                "                      <use x=\"20\" y=\"9\" href=\"#template\"/>\n" +
                "                      <use x=\"23\" y=\"9\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"10\" href=\"#template\"/>\n" +
                "                      <use x=\"1\" y=\"10\" href=\"#template\"/>\n" +
                "                      <use x=\"2\" y=\"10\" href=\"#template\"/>\n" +
                "                      <use x=\"5\" y=\"10\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"10\" href=\"#template\"/>\n" +
                "                      <use x=\"7\" y=\"10\" href=\"#template\"/>\n" +
                "                      <use x=\"9\" y=\"10\" href=\"#template\"/>\n" +
                "                      <use x=\"10\" y=\"10\" href=\"#template\"/>\n" +
                "                      <use x=\"12\" y=\"10\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"10\" href=\"#template\"/>\n" +
                "                      <use x=\"17\" y=\"10\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"10\" href=\"#template\"/>\n" +
                "                      <use x=\"19\" y=\"10\" href=\"#template\"/>\n" +
                "                      <use x=\"20\" y=\"10\" href=\"#template\"/>\n" +
                "                      <use x=\"22\" y=\"10\" href=\"#template\"/>\n" +
                "                      <use x=\"23\" y=\"10\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"11\" href=\"#template\"/>\n" +
                "                      <use x=\"1\" y=\"11\" href=\"#template\"/>\n" +
                "                      <use x=\"3\" y=\"11\" href=\"#template\"/>\n" +
                "                      <use x=\"4\" y=\"11\" href=\"#template\"/>\n" +
                "                      <use x=\"5\" y=\"11\" href=\"#template\"/>\n" +
                "                      <use x=\"10\" y=\"11\" href=\"#template\"/>\n" +
                "                      <use x=\"11\" y=\"11\" href=\"#template\"/>\n" +
                "                      <use x=\"13\" y=\"11\" href=\"#template\"/>\n" +
                "                      <use x=\"14\" y=\"11\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"11\" href=\"#template\"/>\n" +
                "                      <use x=\"17\" y=\"11\" href=\"#template\"/>\n" +
                "                      <use x=\"19\" y=\"11\" href=\"#template\"/>\n" +
                "                      <use x=\"21\" y=\"11\" href=\"#template\"/>\n" +
                "                      <use x=\"22\" y=\"11\" href=\"#template\"/>\n" +
                "                      <use x=\"23\" y=\"11\" href=\"#template\"/>\n" +
                "                      <use x=\"24\" y=\"11\" href=\"#template\"/>\n" +
                "                      <use x=\"2\" y=\"12\" href=\"#template\"/>\n" +
                "                      <use x=\"3\" y=\"12\" href=\"#template\"/>\n" +
                "                      <use x=\"4\" y=\"12\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"12\" href=\"#template\"/>\n" +
                "                      <use x=\"10\" y=\"12\" href=\"#template\"/>\n" +
                "                      <use x=\"12\" y=\"12\" href=\"#template\"/>\n" +
                "                      <use x=\"13\" y=\"12\" href=\"#template\"/>\n" +
                "                      <use x=\"15\" y=\"12\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"12\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"12\" href=\"#template\"/>\n" +
                "                      <use x=\"21\" y=\"12\" href=\"#template\"/>\n" +
                "                      <use x=\"22\" y=\"12\" href=\"#template\"/>\n" +
                "                      <use x=\"23\" y=\"12\" href=\"#template\"/>\n" +
                "                      <use x=\"24\" y=\"12\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"13\" href=\"#template\"/>\n" +
                "                      <use x=\"1\" y=\"13\" href=\"#template\"/>\n" +
                "                      <use x=\"2\" y=\"13\" href=\"#template\"/>\n" +
                "                      <use x=\"4\" y=\"13\" href=\"#template\"/>\n" +
                "                      <use x=\"5\" y=\"13\" href=\"#template\"/>\n" +
                "                      <use x=\"7\" y=\"13\" href=\"#template\"/>\n" +
                "                      <use x=\"9\" y=\"13\" href=\"#template\"/>\n" +
                "                      <use x=\"10\" y=\"13\" href=\"#template\"/>\n" +
                "                      <use x=\"11\" y=\"13\" href=\"#template\"/>\n" +
                "                      <use x=\"12\" y=\"13\" href=\"#template\"/>\n" +
                "                      <use x=\"13\" y=\"13\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"13\" href=\"#template\"/>\n" +
                "                      <use x=\"19\" y=\"13\" href=\"#template\"/>\n" +
                "                      <use x=\"20\" y=\"13\" href=\"#template\"/>\n" +
                "                      <use x=\"24\" y=\"13\" href=\"#template\"/>\n" +
                "                      <use x=\"4\" y=\"14\" href=\"#template\"/>\n" +
                "                      <use x=\"5\" y=\"14\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"14\" href=\"#template\"/>\n" +
                "                      <use x=\"7\" y=\"14\" href=\"#template\"/>\n" +
                "                      <use x=\"8\" y=\"14\" href=\"#template\"/>\n" +
                "                      <use x=\"11\" y=\"14\" href=\"#template\"/>\n" +
                "                      <use x=\"15\" y=\"14\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"14\" href=\"#template\"/>\n" +
                "                      <use x=\"20\" y=\"14\" href=\"#template\"/>\n" +
                "                      <use x=\"21\" y=\"14\" href=\"#template\"/>\n" +
                "                      <use x=\"7\" y=\"15\" href=\"#template\"/>\n" +
                "                      <use x=\"9\" y=\"15\" href=\"#template\"/>\n" +
                "                      <use x=\"10\" y=\"15\" href=\"#template\"/>\n" +
                "                      <use x=\"12\" y=\"15\" href=\"#template\"/>\n" +
                "                      <use x=\"13\" y=\"15\" href=\"#template\"/>\n" +
                "                      <use x=\"14\" y=\"15\" href=\"#template\"/>\n" +
                "                      <use x=\"15\" y=\"15\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"15\" href=\"#template\"/>\n" +
                "                      <use x=\"17\" y=\"15\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"15\" href=\"#template\"/>\n" +
                "                      <use x=\"19\" y=\"15\" href=\"#template\"/>\n" +
                "                      <use x=\"21\" y=\"15\" href=\"#template\"/>\n" +
                "                      <use x=\"22\" y=\"15\" href=\"#template\"/>\n" +
                "                      <use x=\"24\" y=\"15\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"1\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"3\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"8\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"11\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"12\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"13\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"14\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"17\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"19\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"20\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"21\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"22\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"24\" y=\"16\" href=\"#template\"/>\n" +
                "                      <use x=\"8\" y=\"17\" href=\"#template\"/>\n" +
                "                      <use x=\"14\" y=\"17\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"17\" href=\"#template\"/>\n" +
                "                      <use x=\"20\" y=\"17\" href=\"#template\"/>\n" +
                "                      <use x=\"23\" y=\"17\" href=\"#template\"/>\n" +
                "                      <use x=\"24\" y=\"17\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"1\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"2\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"3\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"4\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"5\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"8\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"9\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"11\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"12\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"13\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"14\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"15\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"20\" y=\"18\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"19\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"19\" href=\"#template\"/>\n" +
                "                      <use x=\"8\" y=\"19\" href=\"#template\"/>\n" +
                "                      <use x=\"10\" y=\"19\" href=\"#template\"/>\n" +
                "                      <use x=\"12\" y=\"19\" href=\"#template\"/>\n" +
                "                      <use x=\"13\" y=\"19\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"19\" href=\"#template\"/>\n" +
                "                      <use x=\"20\" y=\"19\" href=\"#template\"/>\n" +
                "                      <use x=\"21\" y=\"19\" href=\"#template\"/>\n" +
                "                      <use x=\"22\" y=\"19\" href=\"#template\"/>\n" +
                "                      <use x=\"23\" y=\"19\" href=\"#template\"/>\n" +
                "                      <use x=\"24\" y=\"19\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"20\" href=\"#template\"/>\n" +
                "                      <use x=\"2\" y=\"20\" href=\"#template\"/>\n" +
                "                      <use x=\"3\" y=\"20\" href=\"#template\"/>\n" +
                "                      <use x=\"4\" y=\"20\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"20\" href=\"#template\"/>\n" +
                "                      <use x=\"8\" y=\"20\" href=\"#template\"/>\n" +
                "                      <use x=\"9\" y=\"20\" href=\"#template\"/>\n" +
                "                      <use x=\"13\" y=\"20\" href=\"#template\"/>\n" +
                "                      <use x=\"15\" y=\"20\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"20\" href=\"#template\"/>\n" +
                "                      <use x=\"17\" y=\"20\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"20\" href=\"#template\"/>\n" +
                "                      <use x=\"19\" y=\"20\" href=\"#template\"/>\n" +
                "                      <use x=\"20\" y=\"20\" href=\"#template\"/>\n" +
                "                      <use x=\"21\" y=\"20\" href=\"#template\"/>\n" +
                "                      <use x=\"22\" y=\"20\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"21\" href=\"#template\"/>\n" +
                "                      <use x=\"2\" y=\"21\" href=\"#template\"/>\n" +
                "                      <use x=\"3\" y=\"21\" href=\"#template\"/>\n" +
                "                      <use x=\"4\" y=\"21\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"21\" href=\"#template\"/>\n" +
                "                      <use x=\"9\" y=\"21\" href=\"#template\"/>\n" +
                "                      <use x=\"11\" y=\"21\" href=\"#template\"/>\n" +
                "                      <use x=\"12\" y=\"21\" href=\"#template\"/>\n" +
                "                      <use x=\"13\" y=\"21\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"21\" href=\"#template\"/>\n" +
                "                      <use x=\"17\" y=\"21\" href=\"#template\"/>\n" +
                "                      <use x=\"21\" y=\"21\" href=\"#template\"/>\n" +
                "                      <use x=\"24\" y=\"21\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"22\" href=\"#template\"/>\n" +
                "                      <use x=\"2\" y=\"22\" href=\"#template\"/>\n" +
                "                      <use x=\"3\" y=\"22\" href=\"#template\"/>\n" +
                "                      <use x=\"4\" y=\"22\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"22\" href=\"#template\"/>\n" +
                "                      <use x=\"10\" y=\"22\" href=\"#template\"/>\n" +
                "                      <use x=\"12\" y=\"22\" href=\"#template\"/>\n" +
                "                      <use x=\"13\" y=\"22\" href=\"#template\"/>\n" +
                "                      <use x=\"17\" y=\"22\" href=\"#template\"/>\n" +
                "                      <use x=\"21\" y=\"22\" href=\"#template\"/>\n" +
                "                      <use x=\"22\" y=\"22\" href=\"#template\"/>\n" +
                "                      <use x=\"23\" y=\"22\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"23\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"23\" href=\"#template\"/>\n" +
                "                      <use x=\"9\" y=\"23\" href=\"#template\"/>\n" +
                "                      <use x=\"14\" y=\"23\" href=\"#template\"/>\n" +
                "                      <use x=\"16\" y=\"23\" href=\"#template\"/>\n" +
                "                      <use x=\"17\" y=\"23\" href=\"#template\"/>\n" +
                "                      <use x=\"19\" y=\"23\" href=\"#template\"/>\n" +
                "                      <use x=\"21\" y=\"23\" href=\"#template\"/>\n" +
                "                      <use x=\"22\" y=\"23\" href=\"#template\"/>\n" +
                "                      <use x=\"23\" y=\"23\" href=\"#template\"/>\n" +
                "                      <use x=\"0\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"1\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"2\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"3\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"4\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"5\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"6\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"10\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"11\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"12\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"14\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"17\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"18\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"20\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"21\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"22\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"23\" y=\"24\" href=\"#template\"/>\n" +
                "                      <use x=\"24\" y=\"24\" href=\"#template\"/>\n" +
                "                    </svg>\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 126pt; height: 13.5pt; font-family: Microsoft YaHei; font-size: 9pt; left: 54pt; top: 69pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    15978585655,15945636754\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 45pt; height: 13.5pt; font-family: Microsoft YaHei; left: 9pt; top: 69pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    洁高畅\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 195pt; height: 21pt; font-family: Microsoft YaHei; font-size: 9pt; line-height: 9.75pt; left: 9pt; top: 82.5pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    河北省.沧州市.泊头市.河东街道不清楚街123号马兰坡半坡腰往左走五十米左右文化会展中心\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 154.5pt; height: 19.5pt; font-size: 18pt; font-weight: bold; line-height: 21pt; left: 9pt; top: 103.5pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    41-371A-B20-123\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 148.5pt; height: 35pt; left: 9pt; top: 123pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    <svg width=\"100%\" display=\"block\" height=\"100%\" class=\"hibarcode_imgcode\" preserveaspectratio=\"none slice\" x=\"0px\" y=\"0px\" viewbox=\"0 0 145 72\" xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" style=\"transform: translate(0,0)\">\n" +
                "                      <rect x=\"0\" y=\"0\" width=\"145\" height=\"72\" style=\"fill:#ffffff;\"/>\n" +
                "                      <g transform=\"translate(0, 0)\" style=\"fill:#000000;\">\n" +
                "                        <rect x=\"0\" y=\"0\" width=\"2\" height=\"72\"/>\n" +
                "                        <rect x=\"3\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"6\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"11\" y=\"0\" width=\"2\" height=\"72\"/>\n" +
                "                        <rect x=\"14\" y=\"0\" width=\"3\" height=\"72\"/>\n" +
                "                        <rect x=\"18\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"22\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"26\" y=\"0\" width=\"2\" height=\"72\"/>\n" +
                "                        <rect x=\"31\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"33\" y=\"0\" width=\"2\" height=\"72\"/>\n" +
                "                        <rect x=\"37\" y=\"0\" width=\"3\" height=\"72\"/>\n" +
                "                        <rect x=\"42\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"44\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"46\" y=\"0\" width=\"3\" height=\"72\"/>\n" +
                "                        <rect x=\"50\" y=\"0\" width=\"4\" height=\"72\"/>\n" +
                "                        <rect x=\"55\" y=\"0\" width=\"2\" height=\"72\"/>\n" +
                "                        <rect x=\"58\" y=\"0\" width=\"2\" height=\"72\"/>\n" +
                "                        <rect x=\"62\" y=\"0\" width=\"2\" height=\"72\"/>\n" +
                "                        <rect x=\"66\" y=\"0\" width=\"2\" height=\"72\"/>\n" +
                "                        <rect x=\"70\" y=\"0\" width=\"3\" height=\"72\"/>\n" +
                "                        <rect x=\"74\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"77\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"79\" y=\"0\" width=\"4\" height=\"72\"/>\n" +
                "                        <rect x=\"84\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"88\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"90\" y=\"0\" width=\"4\" height=\"72\"/>\n" +
                "                        <rect x=\"97\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"99\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"103\" y=\"0\" width=\"2\" height=\"72\"/>\n" +
                "                        <rect x=\"107\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"110\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"114\" y=\"0\" width=\"3\" height=\"72\"/>\n" +
                "                        <rect x=\"118\" y=\"0\" width=\"2\" height=\"72\"/>\n" +
                "                        <rect x=\"121\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"124\" y=\"0\" width=\"2\" height=\"72\"/>\n" +
                "                        <rect x=\"129\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"132\" y=\"0\" width=\"2\" height=\"72\"/>\n" +
                "                        <rect x=\"137\" y=\"0\" width=\"3\" height=\"72\"/>\n" +
                "                        <rect x=\"141\" y=\"0\" width=\"1\" height=\"72\"/>\n" +
                "                        <rect x=\"143\" y=\"0\" width=\"2\" height=\"72\"/>\n" +
                "                      </g>\n" +
                "                    </svg>\n" +
                "                    <div class=\"hibarcode_displayValue\">\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div class=\"hiprint-printElement hiprint-printElement-image\" style=\"position: absolute; width: 39pt; height: 48pt; left: 214.5pt; top: 130.5pt;\">\n" +
                "                  <div class=\"hiprint-printElement-image-content\" style=\"height:100%;width:100%\">\n" +
                "                    <img style=\"width:100%;height:100%;\" src=\"\"/>\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 12pt; height: 48pt; font-size: 7.5pt; line-height: 7.5pt; left: 259.5pt; top: 130.5pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    已安检已验视\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 17pt; height: 17pt; font-family: Microsoft YaHei; font-size: 15pt; font-weight: bold; left: 192pt; top: 135pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    换\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 17pt; height: 17pt; font-family: Microsoft YaHei; font-size: 15pt; font-weight: bold; left: 193.5pt; top: 156pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    A\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div class=\"hiprint-printElement hiprint-printElement-oval\" style=\"border: 1px solid; position: absolute; border-radius: 50%; width: 17pt; height: 17pt; border-width: 1pt; left: 190pt; top: 157pt;\">\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 49.5pt; height: 24pt; font-family: Microsoft YaHei; font-size: 20pt; font-weight: bolder; line-height: 24pt; left: 10.5pt; top: 160.5pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    S13\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 112.5pt; height: 10.5pt; line-height: 10.5pt; left: 64.5pt; top: 162pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    子单号SF2002295960847\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 112.5pt; height: 9.75pt; line-height: 10.5pt; left: 64.5pt; top: 174pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    母单号SF2002295960847\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 96pt; height: 18pt; font-size: 18pt; font-weight: bolder; line-height: 18pt; left: 174pt; top: 178.5pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    096AB1C211\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 96pt; height: 10.5pt; font-size: 9pt; left: 10.5pt; top: 184.5pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    VIP_5020109398504\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 42pt; height: 22.5pt; font-family: Microsoft YaHei; font-size: 8pt; font-weight: bold; left: 10.5pt; top: 195pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    航空禁运*易碎*\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div tabindex=\"1\" class=\"hiprint-printElement hiprint-printElement-text\" style=\"position: absolute; width: 207pt; height: 21pt; left: 67.5pt; top: 196.5pt;\">\n" +
                "                  <div class=\"hiprint-printElement-text-content hiprint-printElement-content\" style=\"height:100%;width:100%\">\n" +
                "                    <svg width=\"100%\" display=\"block\" height=\"100%\" class=\"hibarcode_imgcode\" preserveaspectratio=\"none slice\" x=\"0px\" y=\"0px\" viewbox=\"0 0 222 43\" xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" style=\"transform: translate(0,0)\">\n" +
                "                      <rect x=\"0\" y=\"0\" width=\"222\" height=\"43\" style=\"fill:#ffffff;\"/>\n" +
                "                      <g transform=\"translate(0, 0)\" style=\"fill:#000000;\">\n" +
                "                        <rect x=\"0\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"3\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"8\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"11\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"15\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"17\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"22\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"27\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"31\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"33\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"37\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"41\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"44\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"46\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"49\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"55\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"58\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"63\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"66\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"69\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"73\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"77\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"81\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"86\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"88\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"91\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"95\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"99\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"102\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"107\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"110\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"113\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"117\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"121\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"126\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"128\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"132\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"136\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"138\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"143\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"148\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"150\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"154\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"158\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"161\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"165\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"168\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"173\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"176\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"179\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"183\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"187\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"191\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"194\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"198\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"202\" y=\"0\" width=\"4\" height=\"43\"/>\n" +
                "                        <rect x=\"207\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"209\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                        <rect x=\"214\" y=\"0\" width=\"3\" height=\"43\"/>\n" +
                "                        <rect x=\"218\" y=\"0\" width=\"1\" height=\"43\"/>\n" +
                "                        <rect x=\"220\" y=\"0\" width=\"2\" height=\"43\"/>\n" +
                "                      </g>\n" +
                "                    </svg>\n" +
                "                    <div class=\"hibarcode_displayValue\">\n" +
                "                    </div>\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <span class=\"hiprint-paperNumber\" style=\"position: absolute; top: 200pt; left: 203pt; display: none;\">\n" +
                "                  1-1\n" +
                "                </span>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "    <div style=\"width:1in;height:1in;position:absolute;left:0px;top:0px;z-index:99;visibility:hidden\">\n" +
                "    </div>\n" +
                "  </body>\n" +
                "</html>\n >D:/printDemo/print.html");
    }

}
