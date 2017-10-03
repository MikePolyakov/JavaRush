package level01.task08.task0829d;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //list of addresses
        ArrayList<String> addressBook = new ArrayList<>();
        while (true) {
            String city = reader.readLine();
            String family = reader.readLine();
            if (family.isEmpty() || city.isEmpty()) break;
            addressBook.add(city);
            addressBook.add(family);
        }

        //read city
        String cityName = reader.readLine();
        int N = addressBook.size();
        for (int i = 0; i < N; i++) {
            if (cityName.equals(addressBook.get(i))) System.out.println(addressBook.get(i + 1));
        }
    }
}



