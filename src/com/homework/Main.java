package com.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to our interactive chat!");
        System.out.println();
        System.out.print("Select number of chat members: ");
        int quantity = scan.nextInt();

        System.out.println();
        System.out.println("Please enter your nicknames. ");

        // create ChatService object
        ChatService service = new ChatService();

        // creating array with ChatMember objects (depending on members quantity)
        ChatMember[] members = new ChatMember[quantity];
        for (int i = 0; i < quantity; ++i) {
            members[i] = new ChatMember();
        }

        // calling chooseOption() function
        while (true) {
            System.out.println("Input your name to chat");
            String currentMember = scan.next();
            for (ChatMember i : members) {
                if (currentMember.equals(i.getNickname())) {
                    System.out.println("Current Member is " + i.getNickname());
                    service.chooseOption();
                }
            }
            System.out.println("There is no member with this name in the chat. Try again");
        }
    }
}
