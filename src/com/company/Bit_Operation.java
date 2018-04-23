package com.company;
import  java.util.*;

public class Bit_Operation {

    public static void main(String[] args) {

                System.out.println ("Keep  try");

                Scanner  scan= new Scanner (System.in);
          System.out.println("Input  the first number for: ");
                int x=scan.nextInt();
                System.out.println  (Integer.toBinaryString(x)+" this is a result returned by method toBinaryString ");
          System.out.println(" Input the second number: ");
                int b=scan.nextInt();
          System.out.println (Integer.toBinaryString(b));
                int c=b&x;
                System.out.println ();
                System.out.println (c+ " is result  of &  in decimical ");
                System.out.println (Integer.toBinaryString(c));
                int d= b^x;
                System.out.println (d +" is a result of ^ in decimical ");
                System.out.println (Integer.toBinaryString(d));
                System.out.println ();
                int  f= b|x;
                System.out.println (f+" is a result of  | in decimical ");
                System.out.println (Integer.toBinaryString(f));
                System.out.println ();

                System.out.println (Integer. toBinaryString(x) +" is number "+x+" in binary  expression ");
                int binaryShift=x>>2 ;
                int bshleft=x<<2 ;
                System.out.println ();
                System.out.println ("after  operation  shift right >>");
                System.out.println (binaryShift);
                System.out.println (Integer.toBinaryString(binaryShift));
                System.out.println ();
                System.out.println ("after  operation  shift left <<");
                System.out.println (bshleft);


                System.out.println (Integer.toBinaryString(bshleft));

                int s=0b11001110;
                System.out.println (s+" :s");
                System.out.println (Integer.toBinaryString(s)+" : s in the  binary  code") ;




                System.out.println("To the Capital letters:	");
                char str_letter;

                for (int i = 0 ;i < 26; i++)
                {

                    str_letter = (char)('a'+i	);
                    System.out.print(str_letter);

                    str_letter = (char)((int)(str_letter & 65503));// I am here using transformation from char type into integer , and then into char

                    System.out.print(str_letter+" ");

                }

                System.out.println();
                System.out.println("To the lowcase letters :");
                char letter ;

                for( int i =0; i < 26 ; i++)

                {

                    letter = (char)( 'A'+ i );
                    System.out.print(letter);
                    letter = (char)((int)(letter|32));
                    System.out.print(letter + " ");

                }
                System.out.println();
     /* // In these code lines I am going to use operation Exlusive OR  ///////////
     for creation a coded message using special key and then for decrypted message//
      */////////////////////////////////////////////////////////////////////////////

                System.out.println("Exlusive OR: ");
                String message = "Java and Python are good languages.";
                String coded_message="";
                String decrypted ="";
                int key = 0b11111111010111110;
                System.out.println();
                System.out.println("Source message: ");
                System.out.println(message);

///////////////////            Encrypting message         /////////////////////////////////

                for ( int i =0 ;i < message.length() ; i++ )
                {
                    coded_message = coded_message + (char)(message.charAt(i)^key);

                }

                System.out.println("Encrypted message: ");
                System.out.println(coded_message);
                System.out.println();

/////////////////////////////////////////////////////////////////////////////////////////
                // Decrypting message
                for ( int j = 0; j < coded_message.length(); j++)

                {
                    decrypted = decrypted + (char)(coded_message.charAt(j)^key);
                }



                System.out.println("Decrypted message: ");
                System.out.println(decrypted);
                System.out.println();








            }
        }






