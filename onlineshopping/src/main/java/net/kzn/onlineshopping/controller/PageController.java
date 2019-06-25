package net.kzn.onlineshopping.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping(value={"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring Web MVC!!");
		return mv;
	}
	/*Example of RequestParam annotation
	@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting", required=false) String greeting) {
		if(greeting == null)
			greeting = "Hello Abhinav!!";
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}
	Example of PathVariable annotation
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView testPathVariable(@PathVariable("greeting") String greeting) {
		if(greeting == null)
			greeting = "Hello Abhinav!!";
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	} */
}