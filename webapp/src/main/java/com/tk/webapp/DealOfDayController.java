/**
 * 
 */
package com.tk.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Tauseef.Khan
 *
 */
@Controller
public class DealOfDayController {
	
	@Autowired
	DealOfDayRepository dealOfDayRepository;
	
	
	@RequestMapping("/dealOfDayList")
	public String accountList(Model model) {
		model.addAttribute("dealOfDays", dealOfDayRepository.getAllDealOfDays());
		return "dealOfDayList";
	}
	
	@RequestMapping("/dealOfDayDetails")
	public String accountDetails(@RequestParam("name") String name, Model model) {
		model.addAttribute("dealOfDay", dealOfDayRepository.getDealOfDay(name));
		return "dealOfDayDetails";
	}
}