import java.util.ArrayList;

class First1 {

    public static void main(String[] args) {
        ArrayList<Integer> age = new ArrayList<>();

        // add operation 
        age.add(5);
        age.add(6);
        System.out.println(age);  // [5, 6]
        age.add(0,4545);

        // get function       mena use to print
        int element = age.get(1);
        System.out.println(element);  // 6

        // remove element 
        age.remove(1);
        System.out.println(age);  // [5]

        // To avoid error, either check size or re-add an element
        age.add(23);  // now list is [5, 23]
        age.set(1, 100);  // replace 23 with 100
        System.out.println(age);  // [5, 100]




        // contains 
        System.out.println(age.contains(12));



        // size of a array list 
        ArrayList<Integer> number=new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(5);
        number.add(3);
        System.out.println(number.size());
        for(int i=0;i<number.size();i++){
            System.out.println(number.get(i));
        }

    }
}
