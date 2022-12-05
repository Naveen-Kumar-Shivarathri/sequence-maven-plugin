package com.oneentropy.util;

import java.io.File;

public class FileUtil {

    public static void preparePath(String path){
        File file = new File(path);
        if(!file.exists()){
            file.getParentFile().mkdirs();
        }
    }

    public static String concatPath(String parent, String childPath, String extension){
        File child = new File(childPath);
        String childFileName = child.getName();
        if(childFileName.matches("(.*)\\.(.*)")){
            childFileName = childFileName.substring(0,childFileName.lastIndexOf(".")+1)+extension;
        }
        return parent+File.separator+childFileName;
    }

}
