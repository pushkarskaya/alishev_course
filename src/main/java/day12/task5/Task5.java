package day12.task5;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist member1band1 = new MusicArtist("Алёна Антонова", 22);
        MusicArtist member2band1 = new MusicArtist("Татьяна Иванова", 20);
        MusicArtist member3band1 = new MusicArtist("Наталья Пушкарёва", 21);
        MusicArtist member4band1 = new MusicArtist("Татьяна Иванова", 20);
        MusicArtist member5band1 = new MusicArtist("Екатерина Болотова", 23);

        ArrayList<MusicArtist> members1 = new ArrayList<>();
        members1.add(member1band1);
        members1.add(member2band1);
        members1.add(member3band1);
        members1.add(member4band1);
        members1.add(member5band1);

        MusicBand band1 = new MusicBand("Комбинация", 1988, members1);
        band1.printMembers();

        MusicArtist member1band2 = new MusicArtist("Шура БИ-2", 55);
        MusicArtist member2band2 = new MusicArtist("Лева БИ-2", 57);

        ArrayList<MusicArtist> members2 = new ArrayList<>();
        members2.add(member1band2);
        members2.add(member2band2);
        MusicBand band2 = new MusicBand("БИ-2", 1988, members2);
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);
        System.out.println("Состав группы " + band1.getName() + " после слияния: ");
        band1.printMembers();

        System.out.println("Состав группы " + band2.getName() + " после слияния: ");
        band2.printMembers();
    }
}
