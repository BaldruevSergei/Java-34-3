package homework.sportmens;

public class SportsmensAppl {


    public static void main(String[] args) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            System.out.println(menus[i]);
        }
        System.out.println(menus);
    }
        /*
        List<Sportsmen> time = new ArrayList<>();
        time.add(new Sportsmen("DD", "AD", 1,"Glory", 11.08));
        time.add(new Sportsmen("FF", "AF", 10,"Victory", 10.8));
        time.add(new Sportsmen("SS", "AS", 25,"Slave", 10.02));
        time.add(new Sportsmen("Usain", "Bolt", 0,"First", 9.58));


        System.out.println("===========  Unsorted List =============");
        for (Sportsmen e : time){
            System.out.println(e);
             }
        time.sort(Sportsmen:: compareTo);
        System.out.println("===========  Sorted List =============");
        for (Sportsmen e : time){
            System.out.println(e);
        }
    }*/
}
