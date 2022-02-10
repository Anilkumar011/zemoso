package Meta.Apps;

import Meta.Relations.Relations;
import Meta.Services.MetaServices;

public class Instagram extends MetaServices implements Relations {
    public void toMessage(String messageToFriend) {
        System.out.println("Instagram msg");
    }

    public void videosharing(String video) {
        System.out.println("Instagram video");
    }

    public void ImageShare(String Image) {
        System.out.println("Instagram Image");
    }

    @Override
    public void MutualConnections() {

    }

    @Override
    public void Family() {

    }

    @Override
    public void Friends() {

    }
}
