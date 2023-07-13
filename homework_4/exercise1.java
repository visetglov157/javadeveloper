package homework_4;

import java.util.LinkedList;

public class exercise1 {

    public static void main(String[] args) {

        int[] listMas = {9,4,6,1,3,7,5, 2};
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : listMas) {
            linkList.add(temp);
        }
        
        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size()-temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }


        System.out.println("linkList = " + linkList);

        
    }
}
