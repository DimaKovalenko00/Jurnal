package by.dmitry.kovalenko.controller;

import by.dmitry.kovalenko.model.entity.Groop;
import by.dmitry.kovalenko.service.GroopService;
import by.dmitry.kovalenko.service.OtdelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by user on 04.02.2019.
 */
@Controller
@RequestMapping("/groops")
public class GroopController {



    @Autowired
    private GroopService groopService;
    @Autowired
    private OtdelService otdelService;
    @RequestMapping( method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("groops", groopService.findAll());
        return "groops";
    }
    @RequestMapping(value ="/add", method = RequestMethod.POST)
    public String getAllForAdd(HttpServletRequest request, HttpServletResponse response) {
        Groop groop = new Groop();
        groop.setOtdel(otdelService.findByIdOtdela((String) request.getParameter("id")));
        int date=Integer.parseInt((String) request.getParameter("date"));
        groop.setGod_postup(Integer.parseInt((String) request.getParameter("date")));
        groop.setNomer_groop(((String) request.getParameter("g")));
        groopService.save(groop);
        return "/vipolneno";

    }

    @RequestMapping(value ="/searth", method = { RequestMethod.GET, RequestMethod.POST })
    private String fd(Model model,HttpServletRequest request, HttpServletResponse response) {

        model.addAttribute("groops",groopService.findFilterParametrs((String) request.getParameter("searthf")));

        return "groops";
    }

    @RequestMapping(value = "/delete1", method = RequestMethod.POST)
    private String delete1(HttpServletRequest request, HttpServletResponse response) {
        String num = (String) request.getParameter("id");
        if(num!=null)
        {
            int id = Integer.parseInt(num);
            groopService.delete(id);
        }
        return "/vipolneno";

    }

//
//    @RequestMapping( method = RequestMethod.GET)
//    public String animalCategoryRequest(Model model) {
//        model.addAttribute("groop", groopService.getGroop());
//        return "students_list";
//    }
//    @RequestMapping(value ="/new", method = RequestMethod.POST)
//    private String groopadd(HttpServletRequest request, HttpServletResponse response) {
//        String nomerGroop = (String) request.getParameter("nomer_groop");
//        String god_postup = (String)request.getParameter("god_postup");
//        String otdel_id = (String)request.getParameter("otdel_id");
//
//        groopService.addGroop(nomerGroop, god_postup, otdel_id);
//
//        return "/vipolneno";
//    }
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
