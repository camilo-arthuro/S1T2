package N2EX1;

import N2EX1.Classes.Input;

public class Exercise2 {
    public static void runExercise2() {
        Input firstInput = new Input();

        //InputMismatchException
        System.out.println(firstInput.readByte("Byte \nEnter your age: "));
        System.out.println(firstInput.readInt("Integer \nEnter your age: "));
        System.out.println(firstInput.readFloat("Float \nEnter your age: "));
        System.out.println(firstInput.readDouble("Double \nEnter your age: "));
        //Exception
        System.out.println(firstInput.readChar("Char \nEnter the initial of your first name: "));
        System.out.println(firstInput.readString("String \nEnter a piece of text: "));
        System.out.println(firstInput.readYesNo("Boolean \nEnter Y for true or N for false: "));
    }
}
