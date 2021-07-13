package by.dmitry.kovalenko.controller;

import by.dmitry.kovalenko.service.GroopService;
import by.dmitry.kovalenko.service.OtdelService;
import by.dmitry.kovalenko.service.PredmetService;
import by.dmitry.kovalenko.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by user on 20.05.2019.
 */
@Controller
@RequestMapping("/add")
public class AddController {

    @Autowired
    private GroopService groopService;

    @Autowired
    private OtdelService otdelService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private PredmetService predmetService;

    @RequestMapping( method = RequestMethod.GET)
    public String getAllForAdd(Model model) {
        model.addAttribute("groops", groopService.findAll());
        model.addAttribute("predmets", predmetService.findAll());
        return "student_add";

    }
    @RequestMapping(value ="/newgroop", method = RequestMethod.GET)
    public String getAllForAddGroop(Model model) {
        model.addAttribute("otdeli", otdelService.findAll());
        return "groop_add";

    }
    @RequestMapping(value ="/newotmetka", method = RequestMethod.GET)
    public String getAllForAddOtmetka(Model model) {
        model.addAttribute("students", studentService.findAll());
        model.addAttribute("predmets", predmetService.findAll());
        return "otmetka_add";

    }
}