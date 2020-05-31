package com.company.tasks.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task_30 {

    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        mylist.add("Hello");
        mylist.add("Java");
        mylist.add("4");
        Iterator it = mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}


 class Main{

    static Iterator func(ArrayList mylist){
        Iterator it=mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element instanceof String){

            }else {
               // it.re
            }

            break;
        }
        return it;

    }
    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for(int i=0;i<m;i++){
            mylist.add(sc.next());
        }

        Iterator it=func(mylist);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}

