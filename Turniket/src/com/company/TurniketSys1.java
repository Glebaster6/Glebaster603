package com.company;

/**
 * Created by Admin on 30.01.2017.
 */
public class TurniketSys1 implements Observer {

    public void handle (Object argument){
     if(argument instanceof String){
         String value = (String)argument;

         char[] a = value.toCharArray();
         boolean b = true;
         int c = 0;
         int d = 0;
         for (int i = 0; i < a.length; i++){
             if (a[i] > 'A' && a[i] < 'Z' | a[i] > 'a' && a[i] < 'z' ){
                 c++;
             } else if (a[i] == ' '){
                 d++;
             }
         }
         if ( c!= 0 & d!= 0 & c + d == a.length){
            MainWriterSingleton.getInstance().write(value);
         }
     }
    }
}
