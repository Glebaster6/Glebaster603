package ru.itis.utils;

import java.io.File;

/**
 * Created by Admin on 29.03.2017.
 */
public class FileUtils {
    private File file;
    private File[] files;
    private File instant;
    private String defaultPah = "C:\\Users\\Admin";

    public FileUtils(String path){
        this.file = new File(path);
        this.files = file.listFiles();
    }

    public FileUtils(){
        this.file = new File(defaultPah);
    }

    public void showFiles(){
        if (file.exists()){
            for (int i = 0; i < files.length; i++){
                System.out.print(files[i] + " ");
                rwx(files[i]);
                sizeOfFile(files[i]);
                System.out.println();
            }
        } else {
            System.out.println("This file doesnt exist");
        }
    }

    public void sizeOfFile (File file){
        long length = file.length()/8;
        if( length/(1024*1024 *1024) >0  )
        {
            System.out.print(length/(1024*1024*1024) + " ");
        } else if (length/(1024*1024) > 0){
            System.out.print(length/(1024*1024) + " ");
        } else if (length/(1024)> 0 ){
            System.out.print(length/1024 + " ");
        } else {
            System.out.println(length + " ");
        }
    }

    public void sizeOfFile (String name){
        instant = new File(name);
        long length = file.length()/8;
        if( length/(1024*1024 *1024) >0  )
        {
            System.out.print(length/(1024*1024*1024) + " ");
        } else if (length/(1024*1024) > 0){
            System.out.print(length/(1024*1024) + " ");
        } else if (length/(1024)> 0 ){
            System.out.print(length/1024 + " ");
        } else {
            System.out.println(length + " ");
        }
    }

    public void rwx(String name){
        instant = new File(name);
        System.out.print("Readable " + instant.canRead() + " Writable " + instant.canWrite() + " Executable " + instant.canExecute() + " ");
    }
    public void rwx(File file){
        System.out.print("Readable " + file.canRead() + " Writable " + file.canWrite() + " Executable " + file.canExecute() + " ");
    }
}
