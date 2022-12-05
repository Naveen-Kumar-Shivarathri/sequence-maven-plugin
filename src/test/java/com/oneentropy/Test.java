package com.oneentropy;

import com.oneentropy.model.Component;
import com.oneentropy.util.PDFGenerator;
import com.oneentropy.util.ResourceReader;

import java.io.IOException;

public class Test {

    public static void main(String args[]){
        String path = "D:\\source\\sequence-maven-plugin\\sequence-maven-plugin\\hld\\echo.yml";
        String baseDir = "D:\\source\\sequence-maven-plugin\\sequence-maven-plugin\\hld";
        try {
            Component component = ResourceReader.readComponent(path);
            PDFGenerator.generatePDF(component,baseDir,path);
            System.out.println(component.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
