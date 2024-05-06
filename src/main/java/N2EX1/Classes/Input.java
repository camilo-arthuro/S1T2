package N2EX1.Classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    // Attributes
    static Scanner input = new Scanner(System.in);

    // Methods
    public static byte readByte(String message){
        byte num = 0;
        boolean error = false;
        do{
            try{
                System.out.println(message);
                num = input.nextByte();
                error = false;
            } catch (InputMismatchException exByte){
                System.out.println("Invalid format, try again!");
                error = true;
            } finally {
                input.nextLine();
            }
        } while (error);
        return num;
    }

    public static int readInt(String message){
        int num = 0;
        boolean error = false;

        do{
            try{
                System.out.println(message);
                num = input.nextInt();
                error = false;
            } catch (InputMismatchException exInt){
                System.out.println("Invalid format, try again!");
                error = true;
            } finally {
                input.nextLine();
            }
        } while (error);
        return num;
    }

    public static float readFloat(String message){
        float num = 0f;
        boolean error = false;

        do{
            try{
                System.out.println(message);
                num = input.nextFloat();
                error = false;
            } catch (InputMismatchException exFloat){
                System.out.println("Invalid format, try again!");
                error = true;
            } finally {
                input.nextLine();
            }
        } while (error);
        return  num;
    }

    public static double readDouble(String message){
        double num = 0d;
        boolean error = false;

        do{
            try{
                System.out.println(message);
                num = input.nextDouble();
                error = false;
            } catch (InputMismatchException exDouble){
                System.out.println("Invalid format, try again!");
                error = true;
            } finally {
                input.nextLine();
            }
        } while (error);
        return num;
    }

    public static char readChar(String message){
        char value = ' ';
        boolean error = false;

        do{
            try{
                System.out.println(message);
                value = input.next().charAt(0);
                error = false;
            } catch (Exception exChar){
                System.out.println("Invalid format, try again!");
                error = true;
            } finally {
                input.nextLine();
            }
        } while (error);
        return value;
    }

    public static String readString(String message){
        String value = "";
        boolean error = false;

        do{
            try{
                System.out.println(message);
                value = input.next();
                error = false;
            } catch (Exception exString){
                System.out.println("Invalid format, try again!");
                error = true;
            } finally {
                input.nextLine();
            }
        } while (error);
        return value;
    }

    public static boolean readYesNo(String message){
        boolean value = true;
        boolean error = false;
        String option = "";

        do{
            try{
                System.out.println(message);
                option = input.next();
                if (option.equalsIgnoreCase("Y")){
                    value = true;
                    error = false;
                } else if (option.equalsIgnoreCase("N")){
                    value = false;
                    error = false;
                } else {
                    System.out.println("Enter a valid option");
                    error = true;
                }
            } catch (Exception exString){
                System.out.println("Invalid format, try again!");
                error = true;
            } finally {
                input.nextLine();
            }
        } while (error);
        return value;
    }

}
