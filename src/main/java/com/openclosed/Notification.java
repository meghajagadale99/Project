package com.openclosed;

public
class Notification {
    public void sendOpt(String medium){
        if(medium.equals("email")){//send otp through email
            System.out.println("emailService");
        }
        if(medium.equals("facebook")){//send otp through mobile
            System.out.println("mobileService");
        }
        //send otp through okta
    }
}
