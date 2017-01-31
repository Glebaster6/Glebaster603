package com.company;
import  java.io.*;


/**
 * Created by Admin on 30.01.2017.
 */
public class MainWriterSingleton {
    private static MainWriterSingleton instance;


    private MainWriterSingleton(){

    }

    public static void write( String text) {
        File dir1 = new File("C://blog");
        File file = new File( "C://blog", "a.txt");

        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

     static {
        instance = new MainWriterSingleton();
     }

    public static MainWriterSingleton getInstance(){
        return instance;
    }

}
