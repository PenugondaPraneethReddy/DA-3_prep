package P1; 
import java.util.Scanner;
public class Strings{ 
  int N;
  String[] obj;
  public Strings(int n){
    N=n;
    obj = new String[N];
  } 
  public void put_data(){
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < obj.length; i++) {
      obj[i] = sc.next();
    }
    sc.close();
  }
  public String[] get_data(){
     return obj;
  }
}

//dsdsdfdsf