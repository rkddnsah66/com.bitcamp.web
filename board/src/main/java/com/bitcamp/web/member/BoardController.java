package com.bitcamp.web.member;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value = "/board/write_form", method = RequestMethod.GET)
	public String writeForm(Locale locale, Model model) {
		logger.info("=== BoardController: writeForm() ENTER ===");
		return "board/write";
	}
}
