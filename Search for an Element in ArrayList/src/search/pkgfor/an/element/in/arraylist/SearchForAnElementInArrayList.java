
package search.pkgfor.an.element.in.arraylist;

import java.util.ArrayList;

public class SearchForAnElementInArrayList {

    public static void main(String[] args) {
        ArrayList<String> keywords = new ArrayList<>();

        keywords.add("Java");
        keywords.add("Python");
        keywords.add("C++");
        keywords.add("JavaScript");

        String searchKeyword = "Java";
        if (keywords.contains(searchKeyword)) {
            System.out.println(searchKeyword + " có trong danh sách.");
        } else {
            System.out.println(searchKeyword + " không có trong danh sách.");
        }
        // TODO code application logic here
    }
    
}
