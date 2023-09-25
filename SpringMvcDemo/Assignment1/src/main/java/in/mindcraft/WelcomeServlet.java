package in.mindcraft;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeServlet {
	@RequestMapping("/wel")
public ModelAndView wel(HttpServletRequest request,HttpServletResponse response) {
	String name = request.getParameter("name");
	ModelAndView mv = new ModelAndView();
	mv.setViewName("result.jsp");
	mv.addObject("name", name);
	return mv;
}
}
