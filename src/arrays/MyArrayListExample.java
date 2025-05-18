package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayListExample {

    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        list.add(120);
        System.out.println(list);
        int oldsize = list.size();
        
        //List methods ==> .contains() -returntype boolean (True or false) , .set(index,value) if we print this it will return
        //the old value presented in the given index number , .remove(index) this also shows as the old valued tat being removed
        //if we give it in Syso., .get(), this will give the item 
        
        System.out.println(list.contains(70));
        System.out.println(list.contains(75));
        System.out.println(list.set(2, 20));
        System.out.println(list.remove(2));
        System.out.println(list);
        
        for (int i = 0; i<5; i++) {
        	list.add(sc.nextInt());}
       
        System.out.println("Newly added items:");
        for (int i = oldsize; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//10 ; 10<10 false 
        
            
        
    }

}
