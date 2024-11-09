
package update.an.element.in.arraylist;

import java.util.ArrayList;

public class UpdateAnElementInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        numbers.set(2, 100);

        System.out.println("Danh sách sau khi cập nhật: " + numbers);
        // TODO code application logic here
    }
    
}
