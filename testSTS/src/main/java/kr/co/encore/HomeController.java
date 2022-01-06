package kr.co.encore;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.encore.model.vo.TestVO;
import kr.co.encore.service.TestService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Resource(name="testS")
	private TestService service ;
	
	@RequestMapping(value = "index.encore", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);

		System.out.println("path -> index.encore ");
		model.addAttribute("msg", "처음 만나는 spring");
		
		return "home";
	}
	
	@RequestMapping(value = "test.encore", method = RequestMethod.GET)
	public String sample() {
		System.out.println("ctrl path -> test.encore ");
		System.out.println("service >>> "+service);
		service.service();
		return "ok";
	}
	
//	@RequestMapping(value = "login.encore", method = RequestMethod.POST)
//	public String login(TestVO vo, Model model) {
//		System.out.println(">>> ctrl login");
//		System.out.println(">>> param "+vo.getId()+"\t"+vo.getPwd());
//		model.addAttribute("user", vo);
//		return "result";
//	}
	
	@RequestMapping(value = "login.encore", method = RequestMethod.POST)
	public ModelAndView login(TestVO vo, Model model) {
		System.out.println(">>> ctrl login");
		System.out.println(">>> param "+vo.getId()+"\t"+vo.getPwd());
		ModelAndView mv = new ModelAndView("result", "user", vo);
		return mv;
	}
	
}
