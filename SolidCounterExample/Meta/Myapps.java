package Meta;

import Meta.Apps.*;
import Meta.Services.SendMail;

public class Myapps {
    public static <Instagram> void main(String args[]){
        Whastapp Wobj = new Whastapp();
        String whatsup = "Sharmaji : Good Morning Quotes";
        String whatvideo = "Video from Family Group";
        Wobj.toMessage(whatsup);
        Wobj.videosharing(whatvideo);
        System.out.println();


        Twitter TwitterObj = new Twitter();
        String twit= "Elon Musk : DogeCoin will be Accepted";
        TwitterObj.toMessage(twit);
        System.out.println();

        SnapChat Sobj = new SnapChat();
        String snap = " Ashish Updates His Status";
        Sobj.Status(snap);
        System.out.println();

        String Ad= "SMS";
        SendAd Sob = new SendAd();
        if(Ad=="SMS"){
            SendMail Mobj = new SendMail();
            Sob.Sent(Mobj);
        }

    }
}
