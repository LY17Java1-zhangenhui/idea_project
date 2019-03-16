package com.qhit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        		for (int i = 1; i <= 9; i++) {
        			for (int j = 1; j <= i; j++) {
        				System.out.print(i+"*"+j+"="+j*i+"	");
        			}
        			System.out.print("\n");
        		}


    }
}
