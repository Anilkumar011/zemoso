package Services.Apps.SnapChat;
import Services.Relations.Family;
import Services.Relations.Friends;
import Services.service.StatusUpload;

public class SnapChat extends StatusUpload implements Family, Friends {

    public void toMessage(String messageToFriend){
        System.out.println("Message from SnapChat :"+ messageToFriend);
    }

    public void videosharing(String video) {
        System.out.println("SnapCaht video :"+video);
    }

    public void ImageShare(String Image){
        System.out.println("SnapChat Image post "+Image);
    }
    public void Status(String status){
        System.out.println("Status :"+status);
    }

    @Override
    public void Family() {
    }

    @Override
    public void friend() {

    }
}
