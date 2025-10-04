package kawn.bizzbee;

import kawn.bizzbee.dbconnection.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello there");
        DatabaseConnection.getInstance(); 
     }
}