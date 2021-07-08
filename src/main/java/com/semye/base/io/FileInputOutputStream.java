package com.semye.base.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * 输入输出流
 */
public class FileInputOutputStream {

    public static void main(String[] args) throws IOException {
        fileOutputStream();
        fileInputStream();
    }

    public static void fileInputStream() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("file.txt");
            byte[] buff = new byte[1024];
            int read = 0;
            StringBuffer stringBuffer = new StringBuffer();
            while (read != -1) {
                read = fileInputStream.read(buff);
                if (read != -1) {
                    System.out.println(read);
                    String b = new String(buff, StandardCharsets.UTF_8).trim();
                    System.out.println(b);
                    stringBuffer.append(b);
                }
            }
            System.out.println(stringBuffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void fileOutputStream() {
        String aa = "helloworlddasdasdla;kfsdl;ksd;flksdfl;lkw" +
                "enfdlsflskdfjlskdjfklsdjflksdncm,nsldnflksdjfklsjdfklsdjfklsjdfklsdjfklsdjfklsdj" +
                "fklsjdklfjsldkfjlksdjflksdm,csndhwoernlkwehruwhfskdlhfskdhfglkwjnflkjnfksdbfosudbfsmd" +
                "nbjsdfklsjdhfkjsdhfkljsdnflkjsdhfkjsdhflskdjnfsdmnfkljchskdjhfnwkjebrjwekbkjcnaskljdnslkdfn" +
                ";lskdfjnslk;dfmsdlmkmcnjsdkhbflwken nk;dnzcjknw; kedn nmsnc;ohdnjsdkhbflwken nk;dnzcjknw; ked" +
                "n nmsnc;ohdnl;ckndjsdkhbflwken nk;dnzcjknw; kedn nmsnc;ohdnl;ckndjsdkhbflw" +
                "ken nk;dnzcjknw; kedn nmsnc;ohdnl;ckndjsdkhbflwken nk;dnzcjknw; kedn" +
                " nmsnc;ohdnl;ckndjsdkhbflwken nk;dnzcjknw; kedn nmsnc;ohdn" +
                "l;ckndjsdkhbflwken nk;dnzcjknw; kedn nmsnc;ohdnl;ckndjsdkhbf" +
                "lwken nk;dnzcjknw; kedn nmsnc;ohdnl;ckndjsdkhbflwken nk;dnzcj" +
                "knw; kedn nmsnc;ohdnl;ckndjsdkhbflwken nk;dnzcjknw; kedn nmsn" +
                "c;ohdnl;ckndjsdkhbflwken nk;dnzcjknw; kedn nmsnc;ohdnl;ckndjsdkh" +
                "bflwken nk;dnzcjknw; kedn nmsnc;ohdnl;ckndjsdkhbflwken nk;dnzcjknw" +
                "; kedn nmsnc;ohdnl;ckndjsdkhbflwken nk;dnzcjknw; kedn nmsnc;ohdnl;ckndjsdkhbflwken nk" +
                ";dnzcjknw; kedn nmsnc;ohdnl;ckndjsdkhbflwken nk;dnzcjknw; kedn nmsnc;ohdnl;ckndjsdkhbflwken nk" +
                ";dnzcjknw; kedn nmsnc;ohdnl;ckndjsdkhbflwken nk;dnzcjknw; kedn nmsnc;ohdnl;ckndjsdkhb" +
                "flwken nk;dnzcjknw; kedn nmsnc;ohdnl;ckndjsdkhbflwken nk;dnzcjk" +
                "nw; kedn nmsnc;ohdnl;ckndjsdkhbflwken nk;dnzcjkn" +
                "w; kedn nmsnc;ohdnl;ckndjsdkhbflwken nk;dnzcjknw; kedn nmsnc;ohdn" +
                "l;ckndjsdkhbflwken nk;dnzcjknw; kedn nmsnc;ohdnl;ckndjsdkhbflwken nk;dnzcjknw; kedn nmsnc;ohdnl;ckndjsdkhbflwken nk;dnzcjknw; kedn nmsnc;ohdnl;ckndjsdkhbflwken nk;dnzcjknw; kedn nmsnc;ohdnl;ckndl;ckndsl;knflskdjfsldkfhsldkfhsdkjfhskjdhncksdjnkjfnkjsd123";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("file.txt");
            fileOutputStream.write(aa.getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
