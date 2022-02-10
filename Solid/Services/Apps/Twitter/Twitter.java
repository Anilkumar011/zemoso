package Services.Apps.Twitter;
import Services.Relations.MutualConnections;
import Services.service.TextService;

public class Twitter extends TextService implements MutualConnections {

    public void toMessage(String messageToFriend){

        System.out.println("tweet from Twitter :"+ messageToFriend);
    }

    @Override
    public void MutualConnect() {

    }
}
