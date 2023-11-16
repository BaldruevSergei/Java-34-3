package practice.linked_list;

public class NodeListAppl {
    public static void main(String[] args) {

        // создадим список из целых чисел

        NodeListImpl<Integer> listNumbers = new NodeListImpl<>();

        System.out.println(listNumbers.isEmpty());
        listNumbers.add(100);
        listNumbers.add(200);
        listNumbers.add(300);
        listNumbers.add(400);
        for (Integer n : listNumbers){
            System.out.print(n +" | ");
                   }

        // вставить 250 под индексом 2
        System.out.println();
        listNumbers.add(2,250);
        for (Integer n : listNumbers){
            System.out.print(n +" | ");

        }
        System.out.println();
        // удалили 400 под индексом 3
        listNumbers.remove(3);
        for (Integer n : listNumbers){
            System.out.print(n +" | ");
        }
        listNumbers.add(4,null);
        System.out.println();


        listNumbers.remove(3);
        for (Integer n : listNumbers) {
            System.out.print(n + " | ");
        }




        // создадим  список из целых чисел



    }
}
