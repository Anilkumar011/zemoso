package Services.Apps.Instagram;

import Services.Relations.Family;
import Services.Relations.Friends;
import Services.Relations.MutualConnections;
import Services.service.ImagePosting;

public class Instagram extends ImagePosting implements Family, Friends, MutualConnections {

    public void toMessage(String messageToFriend){
        System.out.println("Message from Instagram :"+ messageToFriend);

    }
    public void videosharing(String video) {
        System.out.println("Instagram Reels :"+video);
    }
    public void ImageShare(String Image){
        System.out.println("Instagram Image post :"+Image);
    }

    @Override
    public void MutualConnect() {

    }

    @Override
    public void Family() {

    }

    @Override
    public void friend() {

    }
}
