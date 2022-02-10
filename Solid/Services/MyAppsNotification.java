package Services;

import Services.Apps.EmailAds.AdsService;
import Services.Apps.Instagram.Instagram;
import Services.Apps.SnapChat.SnapChat;
import Services.Apps.Twitter.Twitter;
import Services.Apps.Whatsapp.Whatsapp;
import Services.service.Ads.Ads;
import Services.service.Ads.SendMails;
import Services.service.Ads.SendSMS;

public class MyAppsNotification {
    public static void main(String args[]){
        Whatsapp Wobj = new Whatsapp();
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

        Instagram Iobj = new Instagram();
        String Img= "Priyanka Chopra Uploaded New Images";
        Iobj.ImageShare(Img);
        System.out.println();

        String AdsType = "mails";
        if(AdsType == "mail"){
           SendMails obj = new SendMails();
            AdsService o = new AdsService();
            o.Ad(obj);
           }

        else {
             SendSMS obj = new SendSMS();
             AdsService o = new AdsService();
             o.Ad(obj);
        }
    }
}
