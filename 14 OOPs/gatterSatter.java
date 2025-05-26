// get: to return the value
// set: to modify the value
// this: keyword is used to refer to the current object

public class gatterSatter {

    static class Student {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String newName) {
            name = newName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int newAge) {
            if (newAge >= 0) {
                age = newAge;
            }
        }
    }

    public static void main(String[] args) {
        Student shan = new Student();
        shan.setAge(20);
        shan.setName("Mohd Shan");

        System.out.println("Name: " + shan.getName());
        System.out.println("Age: " + shan.getAge());
    }
}
