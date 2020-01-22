package com.homework;

import java.util.Scanner;

public class ChatMember {
    Scanner scan = new Scanner(System.in);
    private String nickname;


    public ChatMember(int i){
        System.out.print("Enter new nickname: " );
        this.nickname = scan.nextLine();
    }

    public String getNickname() {
        return nickname;
    }


}
