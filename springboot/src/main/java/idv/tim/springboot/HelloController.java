package idv.tim.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView  Hello() {
		
		return new ModelAndView("hello"); // 根據view resolver mapping至hello.jsp
	}
	
}
