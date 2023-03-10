package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<String> subscriptions;
    private String username;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<String> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user.getUsername());
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user.getUsername());
    }

    public boolean isFriend(User user) {
        return user.subscriptions.contains(username) && subscriptions.contains(user.getUsername());
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String toString() {
        return getUsername();
    }
}
