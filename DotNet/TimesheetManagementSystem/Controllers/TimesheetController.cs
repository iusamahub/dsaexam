using System.Diagnostics;
using BLL;
using BOL;
using DAL;
using Microsoft.AspNetCore.Mvc;
using Org.BouncyCastle.Asn1.Cms;
using TimesheetManagementSystem.Models;

namespace TimesheetManagementSystem.Controllers;

public class TimesheetController : Controller
{
    private readonly ILogger<TimesheetController> _logger;

    public TimesheetController(ILogger<TimesheetController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        return View();
    }

    public IActionResult Display()
    {
        BLLManager bobj = new BLLManager();
        List<Timesheet> allData = bobj.GetAll();
        ViewData["allTimesheets"] = allData;
        return View();
    }

    public IActionResult Insert(int id, string date, string work_description, int hours, string status)
    {
        Timesheet ts = new Timesheet(id, date, work_description, hours, status);
        DBTimesheet.InsertData(ts);
        return View();
    }
    

    public IActionResult Details(int id)
    {
        Timesheet ts = DBTimesheet.GetById(id);
        ViewData["data"] = ts;
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
