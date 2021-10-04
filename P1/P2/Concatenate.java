package P1.P2;
import P1.Strings;
public class Concatenate extends Strings{
    int n;
    public Concatenate(int n) {
        super(n);
        this.n = n;
    }
    public void concat_all_strings(){
        String temp = "";
        String[] obj= get_data();
        for (int i = 0; i < n; i++) {
            temp += obj[i];
        }
        System.out.println(temp);
    }
}