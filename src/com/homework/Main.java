package com.homework;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to our interactive chat!");
        System.out.println();

        ChatService.createActiveMembersArray();

        System.out.println();
        System.out.println("Now you are active members of this chat.");
        System.out.println();

        ChatService.chooseOption();
    }
}
