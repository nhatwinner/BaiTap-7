
package remove.an.element.from.arraylist;

import java.util.ArrayList;

public class RemoveAnElementFromArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        numbers.remove(Integer.valueOf(5));

        System.out.println("Danh sách sau khi xóa số 5: " + numbers);
        // TODO code application logic here
    }
    
}
