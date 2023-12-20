package homework.tostoy;

import java.sql.Array;
import java.util.*;

//Задача 1. Посчитайте количество повторяющихся букв в предложении Л.Н. Толстого.
public class QuantityWordsTolstoy {
    public static void main(String[] args) {
        // massive of proposal
        String str =  " В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, - в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, - когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, - в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, - в губернском городе К. был съезд помещиков, и кончались дворянские выборы. ";

        // convert (add) to ArrayList and split

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(str.split("")));
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(str.split(" ")));
        System.out.println(list);
        System.out.println("============== Of leter ==============");
        printWordsFrequency(list);
        System.out.println();
        System.out.println("============== Of words  ================");
        printWordsFrequency(list1);


    }
    private static  void printWordsFrequency(List<String> words) {
        Map<String, Integer> resMap = new HashMap<>();

        for (String word : words) {
            if (!resMap.containsKey(word)) { // такая буква еще не встречалась
                resMap.put(word, 1); // пишем в мапу слово и 1
            } else {
                resMap.put(word, resMap.get(word) + 1); //
            }

        }
        Set<Map.Entry<String, Integer>> entries = resMap.entrySet();
        System.out.println("======== Quantity  =============== ");
        for (Map.Entry<String, Integer> etry: entries){
            System.out.println(etry.getKey() + " -> " + etry.getValue());
        }


    }
}
