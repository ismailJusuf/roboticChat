package com.happycoderz.todolistfirebasesample.main;

import com.happycoderz.todolistfirebasesample.Models.Message;

/**
 * Created by EminAyar on 28.03.2018.
 */

public class MainContract {

    public interface Presenter {

        void startListeningMessages ();

        void onMessageSendClicked(String message);

    }


    public interface View {

        void onMessageAdded(Message message);

    }


}
