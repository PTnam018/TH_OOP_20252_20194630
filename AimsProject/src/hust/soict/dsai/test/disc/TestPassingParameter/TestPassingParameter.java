package hust.soict.dsai.test.disc.TestPassingParameter;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class TestPassingParameter {

    public static void main(String[] args) { // TODO Auto-generated method stub

        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        // swap các tiêu đề DVD
        swap(jungleDVD, cinderellaDVD);
        // in ra tiêu đề của hai DVD
        System.out.println("jungle dvd title:" + jungleDVD.getTitle());
        System.out.println("cinderella dvd title:" + cinderellaDVD.getTitle());
        // thay đổi tiêu đề của DVD Jungle
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        // in ra tiêu đề của DVD Jungle
        System.out.println("jungle dvd title:" + jungleDVD.getTitle());
    }
    // hàm swap
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    // hàm thay đổi tiêu đề DVD
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}