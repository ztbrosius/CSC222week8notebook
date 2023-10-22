import java.util.*;
public class StringMethods
{
    public static void main(String[] args)
    {
        String aString;
        int strLen;
        Scanner in = new Scanner(System.in);
        int numSpaces = 0;
        final int POS = 7;
        System.out.print("Enter a sentence >> ");
        aString = in.nextLine();
        strLen = aString.length();
        System.out.println("The length of your sentence is " + strLen);
        for(int i = 0; i < strLen; i++)
        {
            Character ch = aString.charAt(i);
            //char ch = 'T';

            //if(ch == 'e')
            if(Character.toUpperCase(ch) == 'T')
                numSpaces++;
        }
        System.out.println("The number of e's in your sentence is " + numSpaces);
        if(aString.indexOf('.') == -1)
            System.out.println("There were no periods in your sentence");
        else
            System.out.println("There was at least one period in your sentence");
        System.out.println("Your sentence from position " + POS +
                " to the end is \"" + aString.substring(POS) + "\"");
    }
}