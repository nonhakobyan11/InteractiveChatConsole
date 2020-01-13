package com.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
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
