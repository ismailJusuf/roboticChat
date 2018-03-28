package com.happycoderz.todolistfirebasesample.login;

public class LoginContract {

    public interface Presenter {

        void onLoginButtonClicked (String email, String password);

        void onSignupButtonClicked (String email, String password);

        //void checkLoginStatus ();

    }


    public interface LoginView {

        void onLoginResult (String email);

        void onSignupResult (String email);

        void onError (String errorMessage);

    }


}
