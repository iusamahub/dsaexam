using System.ComponentModel;
using BOL;
using DAL;

namespace BLL;

public class BLLManager{

    public List<Timesheet> GetAll(){

        List<Timesheet> blist = new List<Timesheet>();
        blist = DBTimesheet.GetAll();
        return blist;
    }
}