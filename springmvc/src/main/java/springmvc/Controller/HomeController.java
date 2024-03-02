package springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("name", "My name is Ankit Savani 123");
        System.out.println("home");
        return "index";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("about");
        return "about";
    }

    @RequestMapping("/help")
    public ModelAndView help(){
        System.out.println("This is Help Page");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "This string is from help controller");
        modelAndView.addObject("id", 123);
        LocalDateTime now = LocalDateTime.now();
        modelAndView.addObject("time", now);

        modelAndView.setViewName("help");
        return modelAndView;
    }
}
