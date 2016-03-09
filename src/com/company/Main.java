package com.company;

//public class Main {

    /*public static void main(String[] args) {
	int x=10;
       // x++;
        //x=x+1
        //System.out.println(x++); postincrement
       // System.out.println(++x); preincrement
        //System.out.println(x);
        //x +=5; //x = x+5;
        //x -=5; // x = x-5;
        //x /=5; // x = x/5;
        x *=5; //x=x*5:
        System.out.println(x);


    }
}*/

/*import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormat;

/*public class Main {

    public static void main(String[] args) {
        short my_variable = 10;
        float my_decimal = (float)11.5 ;
        double my_double = 11.56;
        char my_char = 'A';
        boolean is_true = false;

        System.out.println(my_variable);
        System.out.println(my_decimal);
        System.out.println(my_double);
        System.out.println(my_char);
        System.out.println(is_true);
    }
}*/
/*public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter some number");
        int user_input_number = scan.nextInt();

        System.out.println("The entered value is");
        System.out.print(user_input_number);

        Scanner scan1 = new Scanner (System.in);
        System.out.println("Enter some decimal value");
        double user_input_double = scan1.nextDouble();

        System.out.println("The entered value is");
        System.out.print(user_input_double);

        Scanner scan2 = new Scanner (System.in);
        System.out.println("Enter some String");
        String user_input_string = scan2.nextLine();

        System.out.println("The entered String is");
        System.out.print(user_input_string);
    }}
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        //int x , y , answer;
        double x , y , answer;
        x = 20;
        y = 30;
        //answer = x + y;
        //answer = x - y;
        //answer = x * y;
        answer = x/y;

        System.out.println("Answer = " + answer);

        DecimalFormat formatter = new DecimalFormat("#,###,###.##");
        System.out.println("Simple calculator!");
        System.out.println("Enter a number:");
        double number1 = scan.nextDouble();
        System.out.println("Enter another number");
        double number2 = scan.nextDouble();
        System.out.println("Mathematical operators: /n1 - Addition"
        + "/n2 - Subtraction + /n3 - Multiplication + /n4 - Division ");
        System.out.println("Please enter your choice.");
        int operator = scan.nextInt();
        if (number2 == 0 && operator == 4)
        {
            System.out.println("You can not divide by zero.");
        }else{
            System.out.println("The result is " +
            formatter.format(calculate(number1, number2, operator)));

        }
        }
        public static double calculate (double number1, double number2, int operator){

        if(operator == 1) {
            return number1 + number2;
        }else if(operator == 2) {
            return number1 - number2;
        }else if (operator == 3) {
            return number1 * number2;
        }else {
            return number1 / number2;


        }}}*/


/*public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        int mynumber = 5;
        System.out.println(mynumber);
        float f = 4.5f;
        char c = 'a';
        String s1 = new String ("Who let the dogs out");
        String s2 = "Who, who, who, who?!";
        String s3 = s1 + s2;
        System.out.println(s3);
    }
}
public class Main {

    public static void main(String[] args) {

        boolean b = false;
        b = true;

        boolean toBe = false;
        b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
    }}}*/

/*import java.util.Scanner;

//import java.util.Scanner;
public class Main {

    /*public static void main(String[] args) {

        Scanner userInputScanner = new Scanner(System.in);

        // Testing nextLine();
        //System.out.print("\nWhat is your name? ");
        //String name = userInputScanner.nextLine();

        //
        /*for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/
        //while
        /*
        while (true){
            // your code goes here
        }
         */
        /*int count = 0;
        while (count < 10 && count > 0) {
            System.out.println(count);
            count++; // count = count + 1
        }*/


        /*int month = 2;

        switch (month) {
            case 1:  System.out.println("January");
            case 2:  System.out.println("February");

            default: break;
        }*/

        /*String a = "Hello World";
        System.out.println(a);
        a = "LearnItGirl";
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);*/


        /*int b = 10;
        System.out.println(b);
        b = 12;
        System.out.println(b);*/
        //Arrays


       /* int[] ages;
        ages = new int[3]; //new type_of_variables[size]
        ages[0] = 11;
        ages[1] = 10;
        ages[2] = 3;

        /*System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);*/
        //System.out.println(ages[3]);

        /*for (int j = 0; j < ages.length; j++)
            System.out.println(ages[j]);*/


        /*String animals[] = new String[3];
        String animals[];
        animals = new String[3];

        animals[0] = "dog";
        animals[1] = "cat";
        animals[2] = "bird";

        for (int i = 0; i < animals.length; i++)
            System.out.println("Name: " + animals[i] + " " + "Age " + ages[i]);*/

        //classes example - http://www.tutorialspoint.com/java/java_object_classes.htm

//new method

    //public static int methodName(int a, int b) {{
        // body


//basic operators - http://www.tutorialspoint.com/java/java_basic_operators.htm
//conditional operator ( ? : )

public class Main {

        public static void main(String[] args) {
    int a, b;
    a = 10;
    b = (a == 1) ? 20: 30;
    System.out.println( "Value of b is : " +  b );//this I do not understand

    b = (a == 10) ? 20: 30;
    System.out.println( "Value of b is : " + b ); //this I do not understand

           /* int age = 21;

            System.out.println(age > 50 ? "You are old" : "You are young");
            // System.out.println(age > 50 ? "if true" : "if false");*/


        }
}

