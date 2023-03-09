package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    public static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);
        messages.add(message);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        List<Message> dialog = new ArrayList<>();
        for (Message message : messages
        ) {
            if (((message.getSender().getUsername().contains(u1.getUsername())) &&
                    (message.getReceiver().getUsername().contains(u2.getUsername()))) ||
                    ((message.getSender().getUsername().contains(u2.getUsername())) &&
                            (message.getReceiver().getUsername().contains(u1.getUsername())))) {
                dialog.add(message);
            }
        }
        for (Message d : dialog
        ) {
            System.out.println(d.getSender() + ": " + d.getText());
        }

    }
}
