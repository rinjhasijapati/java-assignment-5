import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

    public class ObjectSerilization {
        public static void main(String[] args) {
            Person person1 = new Person("Ram", 20);
            Person person2 = new Person("Shyam", 21);

            try (FileOutputStream fos = new FileOutputStream("person.txt");
                 ObjectOutputStream obj = new ObjectOutputStream(fos)) {
                obj.writeObject(person1);
                obj.writeObject(person2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
