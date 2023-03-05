package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static MusicBand transferMembers(MusicBand band1, MusicBand band2) {
        List<MusicArtist> members1 = band1.getMembers();
        List<MusicArtist> members2 = band2.getMembers();
        for (MusicArtist member : members1) {
            members2.add(member);
        }
        band1.getMembers().clear();
        return band2;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return name + " " + year;
    }

    public void printMembers() {
        System.out.println(members);
    }

}


