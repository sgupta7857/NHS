package com.citizen.controller;

import com.citizen.model.RegularAmount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class RegularAmountController {

	@RequestMapping(value = "/check_regular_amount", method = RequestMethod.POST)
	public String checkRegularAmount(@Valid RegularAmount regularAmount, BindingResult result) {

		if (result.hasErrors()) {
			return "regularAmount";
		} else {
			return "success";
		}

	}

	@RequestMapping(method = RequestMethod.GET)
	public String displayCustomerForm(ModelMap model) {

		model.addAttribute("regularAmount", new RegularAmount());
		return "regularAmount";

	}

}