package com.me;

//https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
/*
Autoboxing is the automatic conversion that the Java compiler makes
between the primitive types and their corresponding object wrapper classes.
For example, converting an int to an Integer, a double to a Double,
and so on. If the conversion goes the other way, this is called unboxing.
 */

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Patrick");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        Integer myIntValue = 56; // converted to this at compile time; Integer.valueOf(56);
        int myInt = myIntValue.intValue(); // myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl += 0.5) {  //incrementing it by .5 each time we go through the loop
            myDoubleValues.add(dbl);   //AUTOBOXING - converting a base primitive type int to an integer
        }

        for(int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);   //UNBOXING -from the object wrapper and
                                                    // converting it back to a primitve type
            System.out.println(i + "  --> " + value);
        }

    }

}

//results;
/*
0  --> 0.0
1  --> 0.5
2  --> 1.0
3  --> 1.5
4  --> 2.0
5  --> 2.5
6  --> 3.0
7  --> 3.5
8  --> 4.0
9  --> 4.5
10  --> 5.0
11  --> 5.5
12  --> 6.0
13  --> 6.5
14  --> 7.0
15  --> 7.5
16  --> 8.0
17  --> 8.5
18  --> 9.0
19  --> 9.5
20  --> 10.0
 */