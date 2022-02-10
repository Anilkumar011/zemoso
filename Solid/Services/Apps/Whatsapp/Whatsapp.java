package Services.Apps.Whatsapp;

import Services.Relations.Family;
import Services.Relations.Friends;
import Services.service.Entertainment;

public class Whatsapp extends Entertainment implements Family, Friends {

    public void toMessage(String messageToFriend){
        System.out.println("Message from Whatsapp :"+ messageToFriend);

    }
    public void videosharing(String video) {
        System.out.println("Whatsapp video :"+video);
    }

    @Override
    public void Family() {

    }

    @Override
    public void friend() {

    }
}
