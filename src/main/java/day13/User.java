package day13;

import java.util.ArrayList;

public class User {
    ArrayList<String> subscriptions;
    private String username;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public ArrayList<String> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user.getUsername());
    }

    public boolean isSubscribed(User user) {
        if (subscriptions.contains(user.getUsername())) {
            return true;
        } else return false;
    }

    public boolean isFriend(User user) {
        if ((user.subscriptions.contains(username)) && (subscriptions.contains(user.getUsername()))) {
            return true;
        } else {
            return false;
        }
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String toString() {
        return getUsername();
    }
}
