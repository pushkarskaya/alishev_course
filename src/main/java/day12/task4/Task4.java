package day12.task4;


import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> members = new ArrayList<>();
        members.add("Алёна Антонова");
        members.add("Татьяна Иванова");
        members.add("Наталья Пушкарёва");
        members.add("Екатерина Болотова");
        members.add("Екатерина Болотова");
        MusicBand band1 = new MusicBand("Комбинация", 1988, members);
        band1.printMembers();

        ArrayList<String> members2 = new ArrayList<>();
        members2.add("Шура Би2");
        members2.add("Лева Би2");
        MusicBand band2 = new MusicBand("БИ-2", 1988, members2);
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        System.out.println("Состав группы " + band1.getName() + " после слияния: ");
        band1.printMembers();

        System.out.println("Состав группы " + band2.getName() + " после слияния: ");
        band2.printMembers();
    }
}
