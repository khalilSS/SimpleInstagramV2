package com.example.simpleinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("PLZlipt7vVH4UO4PtRAYIlRLOrtrDv2Iv8picOYp")
                .clientKey("nVCj9H6JuVG7b4uZMwBAbR3VkSz5fACFIgz0agcq")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
