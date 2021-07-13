package by.dmitry.kovalenko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {

    /*private MainService mainService;
    private StudentService studentService;**/


    @RequestMapping(method = RequestMethod.GET)
    public String mainRequest(){

        return "main";
    }
  /*  @RequestMapping(value ="/auntification", method = RequestMethod.POST)
    private String auntification(HttpServletRequest request, HttpServletResponse response) {
        String login = (String) request.getParameter("login");
        String password = (String) request.getParameter("password");
        if(mainService.check(login,password)!=null) {

            return "/students";
        }
        return "/";

    }**/
}
