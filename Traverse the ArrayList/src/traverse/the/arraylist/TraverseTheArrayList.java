
package traverse.the.arraylist;

import java.util.ArrayList;

public class TraverseTheArrayList {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Hải Phòng");
        cities.add("Đà Nẵng");
        cities.add("Hà Nội");
        cities.add("Hai Dương");
        cities.add("Huế");

        System.out.println("Danh sách các thành phố:");
        for (String city : cities) {
            System.out.println(city);
        }
        // TODO code application logic here
    }
    
}
