package net.kzn.onlineshopping.controller;
import net.kzn.shoppingbackend.dao.CategoryDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class PageController {
	@Autowired
	private CategoryDAO categoryDAO;
	@RequestMapping(value={"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClicksHome", true);
		return mv;
	}
	@RequestMapping(value="/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClicksAbout", true);
		return mv;
	}
	@RequestMapping(value="/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClicksContact", true);
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