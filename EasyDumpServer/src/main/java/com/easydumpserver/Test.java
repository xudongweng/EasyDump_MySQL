/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easydumpserver;

import com.easydumpserver.mysql.controller.MySQLDumpStringController;
import com.easydumpserver.mysql.helper.compress.ZipUtilsHelper;
import com.easydumpserver.mysql.model.DumpArrObject;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author sheriff
 */
public class Test {
    public static void main(String[] args) throws IOException{
        MySQLDumpStringController a=new MySQLDumpStringController();
        a.setDumpBaseInfo();
        a.setDumpString();
        DumpArrObject dao=a.getDumpString();
        dao.printList();
        //Process process = Runtime.getRuntime().exec("");
        List dumpList=dao.getArrDump();
        List dumpPathList=dao.getDumpPath();
        int i=dumpList.size();
        ZipUtilsHelper zuh=new ZipUtilsHelper();
        while(--i>=0){
            InputStream in = Runtime.getRuntime().exec("").getInputStream();
            //zuh.zipStreamCompress(in, destPath, filename);
        }
        /*
        byte b[] = new byte[1024];  
        ZipOutputStream zout = null;
        
        zout = new ZipOutputStream(new FileOutputStream("D:\\e.zip"));
        ZipEntry e = new ZipEntry("e.sql");
        zout.putNextEntry(e); 
        InputStream in = Runtime.getRuntime().exec("E:\\MySQL\\bin\\mysqldump  --default-character-set=utf8 --single-transaction -h192.168.3.70 --user=sa --password=123456 --port=3306 sbtest").getInputStream();
        
        int len = 0;  
        while ((len = in.read(b)) != -1) {
            System.out.println(len);
            zout.write(b, 0, len);  
        }  

        zout.closeEntry();  
        zout.flush();  
        zout.close();  

        in.close();
        */
    }
}
