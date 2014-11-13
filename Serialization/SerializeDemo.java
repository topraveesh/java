import java.io.*;

public class SerializeDemo
{
   public static void main(String [] args)
   {
      Employee e = new Employee();
      e.setName("Praveesh");
      e.setId("1");
      try
      {
         FileOutputStream fileOut = new FileOutputStream("D:\\Praveesh\\employee.txt");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}
