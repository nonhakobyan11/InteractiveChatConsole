package com.homework;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

import static java.lang.System.exit;

public class ChatService {
    Scanner scan = new Scanner(System.in);
    public String sms;


    public void chooseOption() {
        while (true) {
            System.out.println("Press Number for Action\n1. Send message\n2. Change current user\n3. Exit chat");
            String option = scan.nextLine();
            if (option.equals("1")) {
                sendMessage();
            } else if(option.equals("2")){
                break;
            } else if (option.equals("3")) {
                exitChat();
            } else {
                System.out.println("Something went wrong. Please be careful and choose one of the options below.");
            }

        }
    }


    public void sendMessage(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        sms = scan.nextLine() + " ";
    }

    public void exitChat(){
        System.out.println("Chat is closed. Hope you will be back soon!");
        exit(0);
    }
}
