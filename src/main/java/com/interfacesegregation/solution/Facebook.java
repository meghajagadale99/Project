package com.interfacesegregation.solution;

public
class Facebook implements SocialMedia, groupVideoCall {
    @Override
    public
    void chat() {
        System.out.println("1");
    }

    @Override
    public
    void sendPhotosAndVideos() {
        System.out.println("2");
    }

    @Override
    public
    void videoCall() {
        System.out.println("3");
    }
}
