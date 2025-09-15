import java.util.Arrays;
import java.util.Comparator;

public class Solution{
    public static void main(String [] args){
        String [] arr1 = {"Abc","Xyz","fghfg","adas","tuTY","dsa"};
        String [] arr2 = {"week","GEEKS"};

        System.out.println("Input:"+Arrays.toString(arr1));
        sortLexIgnoreCase(arr1);
        System.out.println("Output:" + Arrays.toString(arr1));

        System.out.println("\nInput:" + Arrays.toString(arr2));
        sortLexIgnoreCase(arr2);
        System.out.println("Output:"+Arrays.toString(arr2));
    }
    
    public static void sortLexIgnoreCase(String[] arr){
        if(arr == null || arr.length == 0){
            return;
        }
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });
    }
}