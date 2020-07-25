package com.lysachenko;

import com.lysachenko.builder.User;
import com.lysachenko.chain.Chain;
import com.lysachenko.singleton.Singleton;

public class Executor {

    public void run() {
        User user = User.builder()
                .setLogin("user_login")
                .setPassword("user_password")
                .setFirstName("Roman")
                .setLastName("Lysachenko")
                .setAge(20)
                .setCity("Odessa")
                .build();

        System.out.println(user.toString());

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);

        Chain chain = new Chain();

        chain.process(12);
        chain.process(-50);
        chain.process(0);
        chain.process(12332);
    }
}
