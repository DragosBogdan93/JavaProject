package lab6;

import lab3.LogicalOp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        LogicalOp op = new LogicalOp();
        myList.add("Dragos");
        myList.add("Bogdan");
        myList.add("Razvan");
        myList.add("Reymond");
        myList.add("Corina");
        op.printList(myList);
        op.addParameterToList(myList,"Gigel");
        System.out.println(myList);
        op.printFromToAList(myList,3);
        op.printReverseAList(myList);
        op.addValueToIndex(myList,3,"Merge???");
        System.out.println(myList);
        op.setValueToList(myList, "Bine");
        System.out.println(myList);
        List<String> newList = new ArrayList<>();
        newList.add("What?");
        newList.add("Where?");
        newList.add("Who?");
        newList.add("How?");
        op.printValueOfIndex(newList);
        List<Integer> intList = new ArrayList<>();
        intList.add(222);
        intList.add(212);
        intList.add(324);
        intList.add(542);
        intList.add(22);
        intList.add(219);
        intList.add(543);
        intList.add(555);
        intList.add(234);
        intList.add(1);
        System.out.println(op.printBiggestNumberList(intList));













    }
    }
