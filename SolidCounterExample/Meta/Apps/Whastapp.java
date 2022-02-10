package Meta.Apps;

import Meta.Relations.Relations;
import Meta.Services.MetaServices;


public class Whastapp extends MetaServices implements Relations {
    public void toMessage(String messageToFriend) {
        System.out.println("Whatsapp text");
    }

    public void videosharing(String video) {
        System.out.println("Whatsapp video");
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
