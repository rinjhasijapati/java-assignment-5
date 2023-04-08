 import java.io.FileInputStream;
 import java.io.ObjectInputStream;

    public class ObjectDeserilization {
        public static void main(String[] args) {
            try (FileInputStream fis = new FileInputStream("person.txt");
                 ObjectInputStream obj1 = new ObjectInputStream(fis)) {
                Person person1 = (Person) obj1.readObject();
                Person person2 = (Person) obj1.readObject();

                System.out.println(person1);
                System.out.println(person2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
