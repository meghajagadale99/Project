package com.interfacesegregation;

public
class Facebook implements SocialMedia{
    public
    void chat() {
        System.out.println("1");
    }

    public
    void post() {
        System.out.println("2");
    }

    public
    void sendPhotosAndVideos() {
        System.out.println("3");
    }

    public
    void videoCall() {
        System.out.println("4");
    }
}
