package Services.Apps.EmailAds;


import Services.service.Ads.Ads;
import Services.service.Ads.SendMails;
import Services.service.Ads.SendSMS;

public  class AdsService  {

    public void Ad(Ads obj){
        obj.SendAds();
    }



}
