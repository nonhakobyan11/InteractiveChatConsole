package com.homework;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;


public class ChatService {
    public static ArrayList<ChatMember> activeMemberList = new ArrayList<>();
    public static String history = "";
    public static Scanner scan = new Scanner(System.in);
    public static String sms ;
    public static int quantity;
    public static String currentMember = "";


    public static ArrayList<ChatMember> createActiveMembersArray() {
        System.out.print("Select number of chat members: ");
        quantity = scan.nextInt();
        System.out.println();
        System.out.println("Please enter your nicknames. ");

        for (int i = 0; i < quantity; i++) {
            activeMemberList.add(new ChatMember(i));
        }
        return activeMemberList;

    }

    public static void chooseOption() {
        while (!activeMemberList.isEmpty()) {
            System.out.print("Input your nickname in this chat: ");
            currentMember = scan.next();
            System.out.println();
            int count = 0;
            for (ChatMember i : activeMemberList) {
                if (currentMember.equals(i.getNickname())) {
                    System.out.println("Current User is " + i.getNickname());
                    count++;
                    while (true) {
                        System.out.println("Press Number for Action\n1. Send message\n2. Change current user\n3. Exit chat");
                        String option = scan.next();
                        if (option.equals("1")) {
                            sendMessage();
                        } else if (option.equals("2")) {
                            break;
                        } else if (option.equals("3")) {
                            activeMemberList.remove(i);
                            if (activeMemberList.isEmpty()) {
                                System.out.println("No one left in chat. Chat is closed.  Below you can see the chat history.");
                                System.out.println();
                                System.out.println("Chat history is: " + "\n" + history);
                                exit(0);
                            } else {
                                System.out.println(currentMember + " left the chat. Please change current User.");
                            }
                            break;
                        } else {
                            System.out.println("Something went wrong. Please be careful and choose one of the options below.");
                        }
                    }
                }
            }
            if (count == 0) {
                System.out.println("You are not active member in the chat. Try again.");
            }
        }
    }


    public static void sendMessage() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        String sms = scan.next();
        history += formatter.format(date) + " Member " + currentMember + "\n" + sms + "\n";
        if (sms != " ") {
            System.out.println();
            System.out.println("Your message is successfully sent.");
            System.out.println();
        }
    }

}