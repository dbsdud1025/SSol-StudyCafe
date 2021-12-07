package kr.co.studycafe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	public HomeController() {
		System.out.println("HomeController 객체 생성");
	}
	
	@RequestMapping("/home.do")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/index");
		return mav;
	}
	
	@RequestMapping("/popupguide.do")
	public ModelAndView popupguide() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/popup_guide");
		return mav;
	}
	
}
