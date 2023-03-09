package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");
        MessageDatabase.addNewMessage(user1, user2, "привет, user1");
        MessageDatabase.addNewMessage(user1, user2, "давай повторим пройденный материал. Какие принцыпы ООП ты знаешь?");
        MessageDatabase.addNewMessage(user2, user1, "привет,user2");
        MessageDatabase.addNewMessage(user2, user1, "Инкапсуляция, наследование, полиморфизм");
        MessageDatabase.addNewMessage(user2, user1, "Рассказать? в чем они заключаются?");
        MessageDatabase.addNewMessage(user3, user1, "Привет, user1. Меня зовут user3");
        MessageDatabase.addNewMessage(user3, user1, "У тебя классный ник");
        MessageDatabase.addNewMessage(user3, user1, "Ты любишь играть в настолки?");
        MessageDatabase.addNewMessage(user1, user3, "Привет,да, играю в монополию");
        MessageDatabase.addNewMessage(user1, user3, "А у тебя какая любимая игра?");
        MessageDatabase.addNewMessage(user1, user3, "Играл когда-нибудь в монополию");
        MessageDatabase.addNewMessage(user3, user1, "Конечно! Это моя любимая игра");

        MessageDatabase.showDialog(user1, user3);
    }
}
