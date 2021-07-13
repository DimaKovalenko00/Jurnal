package by.dmitry.kovalenko.controller;

import by.dmitry.kovalenko.model.entity.OtmetkaPoPredmetu;
import by.dmitry.kovalenko.service.PredmetService;
import by.dmitry.kovalenko.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by user on 04.02.2019.
 */
@Controller
@RequestMapping("/predmet")
public class PredmetController {



    @Autowired
    private PredmetService predmetService;
    @Autowired
    private StudentService studentService;
    @RequestMapping( method = GET)
    public String getAll(Model model) {
        model.addAttribute("predmeti", predmetService.findAll());
        return "predmeti";
    }

//
//    @RequestMapping( method = RequestMethod.GET)
//    public String animalCategoryRequest(Model model) {
//        model.addAttribute("groop", groopService.getGroop());
//        return "students_list";
//    }


    @RequestMapping(value ="/otmetki", method = { RequestMethod.GET, RequestMethod.POST })
    private String fd(Model model,HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("otmetki",predmetService.findId((String) request.getParameter("id")));

        return "otmetki";
    }
    @RequestMapping(value ="/add", method = RequestMethod.POST)
    public String getAllForAdd(HttpServletRequest request, HttpServletResponse response) {
        OtmetkaPoPredmetu otmetkaPoPredmetu = new OtmetkaPoPredmetu();
        otmetkaPoPredmetu.setOtmetka(Integer.parseInt((String) request.getParameter("f")));
        otmetkaPoPredmetu.setData_otmetky(new Date());
       otmetkaPoPredmetu.setPredmet(predmetService.findByIdStudent((String) request.getParameter("ids"),(String) request.getParameter("idp")));
        predmetService.saveOt(otmetkaPoPredmetu);
        return "/vipolneno";

    }
//    @RequestMapping(value ="/studentnew", method = RequestMethod.GET)
//    private String newStudent(Model model) {
//        model.addAttribute("groops", groopService.getGroop());
//        return "/student_add";
//    }
//    @RequestMapping(value ="/delete", method = RequestMethod.GET)
//    private String deleteRequest(Model model) {
//        model.addAttribute("groops", groopService.getGroop());
//        return "/student_delet";
//    }
//
//    @RequestMapping(value ="/del", method = RequestMethod.POST)
//    private String animaldelete(HttpServletRequest request, HttpServletResponse response) {
//        String id = (String) request.getParameter("id");
//        int num = Integer.parseInt(id);
//        groopService.delGroop(num);
//
//        return "/vipolneno";
//    }



}
