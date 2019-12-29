package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Information info = new Information();

        Scanner scanner = new Scanner( System.in );

        //String employeepos;
        while (true) {
            System.out.println( "enter your name : " );
            String firstname = scanner.nextLine();
            info.setFirstname( firstname );

            System.out.println( "enter your lastname : " );
            String lastname = scanner.nextLine();
            info.setLastname( lastname );

            System.out.println( "enter your account number : " );
            String accountnum = scanner.nextLine();
            info.setAccountnumber( accountnum );

            System.out.println( "enter your position : " );
            String employeepos = scanner.nextLine();
            info.setEmployeeposition( employeepos );

            System.out.println("you are : "+info.getFirstname()+" "+info.getLastname());
            System.out.println("your account number is "+info.getAccountnumber() );

            if (employeepos.equals( "manager" )) {
                double salary=info.setSalary( 3000000 );
                System.out.println( "your salary is "+salary+" & it settled");
            }
            else if (employeepos.equals( "employee" )){
                double salary=info.setSalary( 1000000 );
                System.out.println("your salary is "+salary+" & it settled");
            }


        }







    }
}
