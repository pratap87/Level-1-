import java.util.*;
import java.io.*;
class Admin{
   private String firstName;
   private String lastName;
   private String dept;
   private String password;
   private String email;
  public void changePass(String pass){
      this.password=pass;
}
 public void getDetails(){
      System.out.println("Name: "+firstName+" "+lastName);
      System.out.println("Email: "+email);

 }
  public String generateRandom(){
        String string="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvxyz";
        StringBuilder sb=new StringBuilder();
         for(int i=1;i<=8;i++){
            int index=(int)(string.length()*Math.random());
            sb.append(string.charAt(index));
          }
       return sb.toString();
}
     public Admin(String firstName,String lastName,String dept){
                     this.firstName=firstName;
                     this.lastName=lastName;
                     this.dept=dept;
                     this.email=lastName.toLowerCase()+firstName.toLowerCase()+"."+dept+"@gmail.com";
                     this.password=generateRandom();
  }
}

class Test{
   public static void main(String[] args)throws Exception{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String firstName=br.readLine();
       String lastName=br.readLine();
       String dept=br.readLine();
       Admin obj=new Admin(firstName,lastName,dept);
       obj.getDetails();
     
   }
}
