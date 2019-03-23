/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;

/**
 *
 * @author DouglasD
 */
public class DataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char letter = 'A';
        /*
        char is a singular letter
        */
        boolean done = false;
        /*
        boolean can only be true or false.
        */
        int radius = 10;
        /*
        int is a whole number
        */
        byte red = 127;
        /*
        byte has a minimum value of -128 and max value of 127. Used for saving memory in large arrays.
        */
        short age = 32767;
        /*
        short is similar for byte but with a max and min of 32768
        */
        long population = 313459000;
        /*
        long is similar to short but with a max and min of 2^63
        */
        float price = 10.59f;
        /* 
        float should not  be using for money and currency. Float is 32 bit percision while double is 64 bit.
        */
        double cashBalance = 3.145;
        /*
        double is a decimal value
        */
        String name = "Daneel Douglas";
        /*
        Strings are an arry of chars
        */
    }
    
}
