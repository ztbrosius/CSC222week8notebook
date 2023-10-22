// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("The midterm exam is due on 10/23/23 at 6 am.");


            String slogan1 = "I'm lovin' it.";
            String slogan2 = "Have it your way";
            String slogan3 = "Finger lickin' good.";
            System.out.println("Famous advertising slogans:");
            System.out.println(slogan1 + "   **   " + slogan2 + "   **   " + slogan3);



            // check to see if the slogans are the same
        if(slogan1.equalsIgnoreCase((slogan2))){
            System.out.println("These two slogans are equal.");
        }
        else{
            System.out.println("These are not the same");

            StringBuilder sb = new StringBuilder("Hello");
            String result = sb.toString();
            System.out.println(result);

            sb.reverse();
            String reversedResult = sb.toString();
            System.out.println(reversedResult);
        }

    }
}