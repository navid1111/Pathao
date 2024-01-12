import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User  {
    public String name;
    public Integer id;
    public String location;
    public String Password;
    public Integer balance;
    public List<Services>OrderHistry=new ArrayList<>();


    public User(String name,Integer id,String password,String location,Integer balance){

        this.id=id;
        this.name=name;
        this.Password=password;
        this.location=location;
        this.balance=balance;


    }
}
