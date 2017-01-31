package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


	    Observer sys1 = new TurniketSys1();
	    Observable observable = new Entrance1();

	    observable.addObserver(sys1);

	    Entrance1 entrance1 = (Entrance1)observable;
	    entrance1.enter(in.next());
    }
}
