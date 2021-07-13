package by.dmitry.kovalenko.controller;

import by.dmitry.kovalenko.model.entity.Student;
import by.dmitry.kovalenko.service.GroopService;
import by.dmitry.kovalenko.service.PredmetService;
import by.dmitry.kovalenko.service.StudentService;
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
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private GroopService groopService;

    @Autowired
    private PredmetService predmetService;

    @Autowired
    private StudentService studentService;

    @RequestMapping( method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students";
    }
    @RequestMapping(value ="/add", method = RequestMethod.POST)
    public String getAllForAdd(HttpServletRequest request, HttpServletResponse response) {
        Student student = new Student();
        student.setGroop(groopService.findById((String) request.getParameter("id")));
        student.setF((String) request.getParameter("f"));
        student.setI((String) request.getParameter("i"));
        student.setO((String) request.getParameter("o"));
        studentService.save(student);
        return "/vipolneno";

    }
    @RequestMapping(value ="/delete1", method = { RequestMethod.GET, RequestMethod.POST, },params = "inf")
    private String info(Model model,HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("students",studentService.findById((String) request.getParameter("id")));
       /* model.addAttribute("mil",studentService.findAllByIdM((String) request.getParameter("id")));
        model.addAttribute("med",studentService.findAllByIdMe((String) request.getParameter("id")));*/
        return "info";

    }
    @RequestMapping(value ="/searth", method = { RequestMethod.GET, RequestMethod.POST })
    private String fd(Model model,HttpServletRequest request, HttpServletResponse response) {

        model.addAttribute("students",studentService.findFilterParametrs((String) request.getParameter("searthf"),(String) request.getParameter("searthi"),(String) request.getParameter("searthg")));

        return "students";
    }

    /*@RequestMapping( value ="/new",method = RequestMethod.GET)
    public String getAllForAdd(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "student_add";
    }*/
    @RequestMapping(value = "/delete1", method = RequestMethod.POST,params = "del")
    private String delete1(HttpServletRequest request, HttpServletResponse response) {
        String num = (String) request.getParameter("id");
        if(num!=null)
        {
            int id = Integer.parseInt(num);
            studentService.delete(id);
        }
        return "/vipolneno";

    }

/*
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private String post(HttpServletRequest request, HttpServletResponse response) {
        Student student = new Student();
        student.setF((String)request.getParameter("f"));
        student.setI((String)request.getParameter("i"));
        student.setO((String)request.getParameter("o"));
        student.setKol_nb(Integer.parseInt((String)request.getParameter("kol_nb")));

        //student.setPredmetUspevaimost(request.getParameter("predmetUspevaimost"));
        //student.setGroop(request.getParameter("groop"));
        studentService.save(student);
        return "/vipolneno";


    }
*/

//        @RequestMapping( method = RequestMethod.GET)
//        public String animalCategoryRequest(Model model) {
//            model.addAttribute("students", studentService.findAllProducts());
//            return "students_list";
//        }
//    @RequestMapping(value ="/new", method = RequestMethod.GET)
//    private String newCategory(Model model) {
//        model.addAttribute("student", studentService.findAllProducts());
//        return "/groop_new";
//    }
//    @RequestMapping( value ="/us", method = RequestMethod.GET)
//    public String getStudents(Model model) {
//        model.addAttribute("students", studentService.findAllProducts());
//        return "list";
//
//    }


}
