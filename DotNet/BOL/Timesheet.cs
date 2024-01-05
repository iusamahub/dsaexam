namespace BOL;

public class Timesheet{

    public int id{get;set;}
    public string date{get;set;}
    public string work_description{get;set;}
    public int hours{get;set;}
    public string status{get;set;}


    public Timesheet(int id){
        this.id = id;
    }
    public Timesheet(int id, string date, string work_description, int hours, string status){

        this.id=id;
        this.date=date;
        this.work_description=work_description;
        this.hours=hours;
        this.status=status;
    }

    
}