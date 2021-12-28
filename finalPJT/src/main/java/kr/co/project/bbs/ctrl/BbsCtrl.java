package kr.co.project.bbs.ctrl;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.project.bbs.model.vo.BbsVO;
import kr.co.project.bbs.model.vo.FilterVO;
import kr.co.project.bbs.service.BbsService;

@Controller
public class BbsCtrl {
	
	@Resource(name="bbsS")
	private BbsService service ;
	
	@RequestMapping(value = "bbs_list", method = RequestMethod.GET)
	public String list(Model model) {
		System.out.println(">>>> bbs ctrl list");
		List<Object> list = service.listService();
		model.addAttribute("boards", list);
		
		return "listAll";
	}
	
	@RequestMapping(value = "bbs_read", method = RequestMethod.GET)
	public String read(BbsVO obj, Model model) {
		System.out.println(">>>> bbs ctrl read");
		Object bbs = service.readService(obj);
		model.addAttribute("bbs", bbs);
		
		return "read";
	}
	@RequestMapping(value = "bbs_registerForm", method = RequestMethod.GET)
	public String registerForm() {
		System.out.println(">>>> bbs ctrl registerForm");
		
		return "register";
	}
	@RequestMapping(value = "bbs_register", method = RequestMethod.POST)
	public String register(BbsVO obj) {
		System.out.println(">>>> bbs ctrl register");
		int flag = service.postService(obj);
		
		return "redirect:/bbs_list";
	}
	@RequestMapping(value = "bbs_modifyForm"  , method = RequestMethod.GET)
	public String modifyForm(BbsVO obj, Model model) {
		System.out.println(">>> bbs ctrl modifyForm");
		Object bbs = service.readService(obj); 
		model.addAttribute("bbs", bbs) ; 
		
		return "modify";
	}
	@RequestMapping(value = "bbs_modify"  , method = RequestMethod.POST)
	public String modify(BbsVO obj) {
		System.out.println(">>> bbs ctrl modify");
		int flag = service.updateService(obj); 
		
		return "redirect:/bbs_list";
	}
	@RequestMapping(value = "bbs_search", method = RequestMethod.POST)
	public List<Object> search(FilterVO search) {
		System.out.println(">>>> bbs ctrl search");
		System.out.println(">>> param data "+search);
		List<Object> list = service.searchService(search);
		return list;
	}

}
