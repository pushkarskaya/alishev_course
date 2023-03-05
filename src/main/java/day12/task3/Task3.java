package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Комбинация", 1988);
        MusicBand band2 = new MusicBand("Кино", 1981);
        MusicBand band3 = new MusicBand("На-На", 1989);
        MusicBand band4 = new MusicBand("Комбинация", 1988);
        MusicBand band5 = new MusicBand("Serebro", 2006);
        MusicBand band6 = new MusicBand("Краски", 2001);
        MusicBand band7 = new MusicBand("Пицца", 2010);
        MusicBand band8 = new MusicBand("Город 312", 2001);
        MusicBand band9 = new MusicBand("30.02", 2004);
        MusicBand band10 = new MusicBand("БИ-2", 1988);

        ArrayList<MusicBand> array = new ArrayList<MusicBand>();
        array.add(band1);
        array.add(band2);
        array.add(band3);
        array.add(band4);
        array.add(band5);
        array.add(band6);
        array.add(band7);
        array.add(band8);
        array.add(band9);
        array.add(band10);
        System.out.println(array);
        Collections.shuffle(array);
        System.out.println(array);
        System.out.println(groupsAfter2000(array));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        ArrayList<MusicBand> groups = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                groups.add(band);
            }
        }
        return groups;
    }


}
