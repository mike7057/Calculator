

public class Display {

    public static void printNumber() {
        

        String inputStr = StringHolder.inputValue;

        // TODO: Need to make inputstr which is string from button into something useful like if else statement
        // TODO: in order to actually do math
        
        if (inputStr.matches("[0-9.]")) { // Checks to see if String coming in is a number or decimal
            System.out.println(" in");
            StringHolder.displayTextHolder = StringHolder.displayTextHolder + inputStr;
            
        } else if (inputStr.matches("")){ // If a symbol is pressed such as +-*/
            Integer inputInt = Integer.valueOf(inputStr); // Converts String into Int of numbers
            System.out.println(inputInt);
        } else { // If clear or something similar is pressed

        }

        System.out.println(inputStr);


        return ;
    }
}
