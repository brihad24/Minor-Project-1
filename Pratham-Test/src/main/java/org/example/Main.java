package org.example;
import org.example.service.FetchCSVData;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FetchCSVData fetchCSVData = new FetchCSVData();
        fetchCSVData.display();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your ");
       String dis =sc.nextLine();
       
        fetchCSVData.findNearByDoctor(dis);
    }
}