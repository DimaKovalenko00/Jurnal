package by.dmitry.kovalenko.controller;

import by.dmitry.kovalenko.model.entity.Coment;
import by.dmitry.kovalenko.service.ComentService;
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
@RequestMapping("/inf")
public class InfoController {


    @Autowired
    private ComentService comentService;
    @RequestMapping( method = RequestMethod.GET)
    public String getAll(Model model) {

        return "registr";
    }
    @RequestMapping(value ="/add", method = RequestMethod.POST)
    public String getAllForAdd(HttpServletRequest request, HttpServletResponse response) {
        Coment coment = new Coment();
        coment.setName_coment((String) request.getParameter("1"));
        coment.setComent((String) request.getParameter("2"));
        coment.setPochta((String) request.getParameter("3"));

            comentService.save(coment);
        return "/vipolneno";

    }
    @RequestMapping( value = "/list",method = RequestMethod.GET)
    public String getAll1(Model model) {
        model.addAttribute("coments", comentService.findAll());
        return "coments";
    }
}
