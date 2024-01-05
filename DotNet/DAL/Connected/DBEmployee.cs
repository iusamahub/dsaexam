namespace DAL;

using BOL;
using MySql.Data.MySqlClient;
using Org.BouncyCastle.Cms;

public class DBEmployee{

    public static string conString = "server=192.168.10.150; port=3306; user=dac46; password=welcome; database=dac46";

    
    public static List<Employee> LoginData(string name, string password){
        List<Employee> list = new List<Employee>();
        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conString;

        string query = "Select * from employee";

        try{
            MySqlCommand cmd = new MySqlCommand(query, conn);
        
        conn.Open();
        MySqlDataReader rd = cmd.ExecuteReader();

        while(rd.Read()){
            string Name = rd["name"].ToString();
            string Password = rd["password"].ToString();

            Employee ts = new Employee(Name, Password);

            list.Add(ts);
        }
        rd.Close();
        }catch(Exception e){
            Console.WriteLine(e.Message);
        }finally{
            conn.Close();
        }

        return list;
    }

    

}