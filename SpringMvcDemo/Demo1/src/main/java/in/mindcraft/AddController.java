package in.mindcraft;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
    @RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("add Called....");
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		int result = a+b;
		System.out.println (result);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("result", result);
		return mv;
	}
    
   
}
