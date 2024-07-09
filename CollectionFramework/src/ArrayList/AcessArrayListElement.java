package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AcessArrayListElement {
    public static void main(String[] args){
        List<String> lt= new ArrayList<>();
        System.out.println("Is top list is empty : " + lt.isEmpty());
        Collections.addAll(lt, "Google","Microsoft","Amazon","PWC","CTS","TCS");
        System.out.println("Companies "+ lt.size());
        System.out.println(lt);
        String Topcompanies= lt.get(0);
        String SecondTop = lt.get(1);
        String thirdTop = lt.get(2);
        String LastComp = lt.get(lt.size()-1);

        System.out.println("Topcompanies "+Topcompanies);
        System.out.println("Second top companies "+ SecondTop);
        System.out.println("Third top comapny "+thirdTop);
        System.out.println("Last company "+ LastComp);
    }
}
