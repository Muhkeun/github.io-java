package classtest;

public class ForNameTest {
    public static void main(String[] args) {
        try{
            //forName => Parameter : name - fully qualified name of the desired class
            //Return: class object representing the desired class
            Class cla = Class.forName("java.util.Date");

            //newInstance => Return: a newly allocated instance of the class represented by this object.
            Object obj = cla.newInstance();
            System.out.println(obj.toString());

        //ClassNotFoundException - if the initialization provoked by this method fails.
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
