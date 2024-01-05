namespace DAL;

using BOL;
using MySql.Data.MySqlClient;
using Org.BouncyCastle.Cms;

public class DBTimesheet{
    public static string conString = "server=192.168.10.150; port=3306; user=dac46; password=welcome; database=dac46";

    public static List<Timesheet> GetAll(){

        List<Timesheet> tlist = new List<Timesheet>();

        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conString;

        string query = "SELECT * FROM timesheet";

        try{
        
        MySqlCommand cmd = new MySqlCommand(query, conn);
        
        conn.Open();
        MySqlDataReader rd = cmd.ExecuteReader();

        while(rd.Read()){
            int Id = int.Parse(rd["id"].ToString());
            string Date = rd["date"].ToString();
            string Work_description = rd["work_description"].ToString();
            int Hours = int.Parse(rd["hours"].ToString());
            string Status = rd["status"].ToString();

            Timesheet ts = new Timesheet(Id, Date, Work_description, Hours, Status);

            tlist.Add(ts);
        }
        rd.Close();


        }catch(Exception e){
            Console.WriteLine(e.Message);
        }finally{
            conn.Close();
        }
        return tlist;
    }


    public static void InsertData(Timesheet ts){

        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conString;

        string query = "insert into timesheet values(@id, @date, @work_description, @hours, @status)";

        MySqlCommand cmd = new MySqlCommand(query , conn);

        cmd.Parameters.AddWithValue("@id", ts.id);
        cmd.Parameters.AddWithValue("@date", ts.date);
        cmd.Parameters.AddWithValue("@work_description", ts.work_description);
        cmd.Parameters.AddWithValue("@hours", ts.hours);
        cmd.Parameters.AddWithValue("@status", ts.status);

        try{
            conn.Open();
            cmd.ExecuteNonQuery();
        }catch(Exception e){
            Console.WriteLine(e.Message);
        }finally{
            conn.Close();
        }
    }

    
    public static Timesheet GetById(int id){
        // List<Timesheet> tlist = new List<Timesheet>();
        Timesheet ts = null;
        MySqlConnection conn = new MySqlConnection();
        conn.ConnectionString = conString;
        string query = "SELECT * FROM timesheet WHERE id=" +id;

        try{
        
        MySqlCommand cmd = new MySqlCommand(query, conn);
        
        conn.Open();
        MySqlDataReader rd = cmd.ExecuteReader();

        while(rd.Read()){
            int Id = int.Parse(rd["id"].ToString());
            string Date = rd["date"].ToString();
            string Work_description = rd["work_description"].ToString();
            int Hours = int.Parse(rd["hours"].ToString());
            string Status = rd["status"].ToString();

            ts = new Timesheet(Id, Date, Work_description, Hours, Status);

        }
        rd.Close();


        }catch(Exception e){
            Console.WriteLine(e.Message);
        }finally{
            conn.Close();
        }
        return ts;
    }


}