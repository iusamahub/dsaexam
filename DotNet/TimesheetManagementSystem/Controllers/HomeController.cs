using System.Diagnostics;
using BOL;
using DAL;
using Microsoft.AspNetCore.Mvc;
using TimesheetManagementSystem.Models;

namespace TimesheetManagementSystem.Controllers;

public class HomeController : Controller
{
    private readonly ILogger<HomeController> _logger;

    public HomeController(ILogger<HomeController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index(){
        return View();
    }

    public IActionResult Login(string name, string password)
    {
        List<Employee> es = DBEmployee.LoginData(name, password);
        foreach (Employee e in es)
        {
            if(e.name==name && e.password==password){
             return Redirect("Display");
            }
        }
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
