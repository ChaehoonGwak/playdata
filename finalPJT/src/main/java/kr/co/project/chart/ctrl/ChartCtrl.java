package kr.co.project.chart.ctrl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChartCtrl {
	
	@RequestMapping(value = "chart_line", method = RequestMethod.GET)
	public String line(Model model) {
		System.out.println(">>> ctrl chart line");
		Map<String, List<Integer>> map = new HashMap();
		List<Integer> list01 = new ArrayList();
		list01.add(43934);list01.add(52503);list01.add(57177);list01.add(69658);list01.add(97031);list01.add(119931);list01.add(137133);list01.add(154175);
		
		map.put("Installation", list01);
		model.addAttribute("datas", map);
		
		return "line";
	}

}
