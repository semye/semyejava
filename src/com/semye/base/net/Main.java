package com.semye.base.net;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.zip.GZIPInputStream;

/**
 * 网络相关
 */
public class Main {


    public static void main(String[] args) throws UnknownHostException {

        System.out.println("获取本机的IP地址");
        InetAddress inetAddress = InetAddress.getLocalHost();
        InetAddress localHost = Inet4Address.getLocalHost();
        InetAddress localHost1 = Inet6Address.getLocalHost();
        System.out.println(localHost);
        System.out.println(localHost1);
        System.out.println(inetAddress);

//        try {
//            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
//            System.out.println(networkInterfaces.nextElement().getDisplayName());
//            System.out.println(networkInterfaces.nextElement().getInetAddresses().nextElement().getHostName());
//
//        } catch (SocketException e) {
//            e.printStackTrace();
//        }
        doGet();
    }


    public static void doGet() {
        try {
            URL url = new URL("https://www.douyu.com");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setAllowUserInteraction(true);//设置是否允许用户互动,比如弹出授权对话框
            urlConnection.setConnectTimeout(3000);//设置请求超时时长
            urlConnection.setReadTimeout(30000);//设置读取超时时长
            urlConnection.setUseCaches(true);//设置是否可以缓存
            urlConnection.setDefaultUseCaches(true);//设置默认的UseCache
            urlConnection.setDoInput(true);//从连接中读取
            urlConnection.setRequestProperty("yesheng", "my custom header");//设置请求头
            urlConnection.setRequestProperty("Content-Type", "text/html");
            urlConnection.setRequestProperty("Accept-Charset", "UTF-8");
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoOutput(true);//往连接中写入
            //urlConnection.getOutputStream().write("hahaha".getBytes());//这个操作会把GET请求变成POST请求
            urlConnection.getInputStream();//此方法会阻塞线程
            int code = urlConnection.getResponseCode();
            System.out.println("response code:" + code);

            InputStream inputStream = urlConnection.getInputStream();

            String contentEncoding = urlConnection.getContentEncoding();
            System.out.println(contentEncoding);
            if (contentEncoding!=null&&contentEncoding.equals("gzip")){
                GZIPInputStream gzipInputStream=new GZIPInputStream(inputStream);
                // 获取输入流
                // 定义一个临时字节输出流
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                try {
                    // 开始读取数据
                    byte[] buffer = new byte[256];
                    int len = 0;
                    while ((len = gzipInputStream.read(buffer)) > 0) {
                        baos.write(buffer, 0, len);
                    }
                    String content = baos.toString(StandardCharsets.UTF_8);
                    System.out.println("CONTENT:" + content);
                } finally {
                    // 关闭输入、输出流
                    gzipInputStream.close();
                    baos.close();
                }
            }else {
                // 获取输入流
                // 定义一个临时字节输出流
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                try {
                    // 开始读取数据
                    byte[] buffer = new byte[256];
                    int len = 0;
                    while ((len = inputStream.read(buffer)) > 0) {
                        baos.write(buffer, 0, len);
                    }
                    String content = baos.toString(StandardCharsets.UTF_8);
                    System.out.println("CONTENT:" + content);
                } finally {
                    // 关闭输入、输出流
                    inputStream.close();
                    baos.close();
                }
            }








            CookieManager.getDefault();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
