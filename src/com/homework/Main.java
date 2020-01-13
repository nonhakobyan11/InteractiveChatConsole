package com.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nWelcome to our interactive chat!\n");
        ChatService chatService = new ChatService();
        List activeMembers = new ArrayList<>();
        chatService.setActiveMemberList(activeMembers);
        System.out.println("\nNow you are active members of this chat.\n");
        chatService.chooseOption(activeMembers);
    }
}
