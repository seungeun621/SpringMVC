package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Subject;
import kr.ac.hansung.service.SubjectService;

@Controller
public class SubjectController {

	private SubjectService subjectService;

	@Autowired
	public void setOffersService(SubjectService offersService) {
		this.subjectService = offersService;
	}

	@RequestMapping("/gradecheck")
	public String showOffers(Model model) {

		Integer a = subjectService.getSubjectCountName(2014, 1);
		Integer b = subjectService.getSubjectCountName(2014, 2);
		Integer c = subjectService.getSubjectCountName(2015, 1);
		Integer d = subjectService.getSubjectCountName(2015, 2);
		Integer e = subjectService.getSubjectCountName(2016, 1);
		
		model.addAttribute("a",a);
		model.addAttribute("b",b);
		model.addAttribute("c",c);
		model.addAttribute("d",d);
		model.addAttribute("e",e);

		return "gradecheck";
	}

	@RequestMapping("/gradecountcheck")
	public String createOffers(Model model) {
		
		int a = subjectService.getSubjectCountName("교필");
		int b = subjectService.getSubjectCountName("핵교A");
		int c = subjectService.getSubjectCountName("핵교B");
		int d = subjectService.getSubjectCountName("전지");
		int e = subjectService.getSubjectCountName("전선");
		int f = subjectService.getSubjectCountName("전기");
		int g = subjectService.getSubjectCountName("일교");
		int h = a+b+c+d+e+f+g;	
		
		model.addAttribute("a",a);
		model.addAttribute("b",b);
		model.addAttribute("c",c);
		model.addAttribute("d",d);
		model.addAttribute("e",e);
		model.addAttribute("f",f);
		model.addAttribute("g",g);
		model.addAttribute("h",h);

		return "gradecountcheck";
	}

	@RequestMapping("/register")
	public String register(Model model) {

		return "register";
	}

	@RequestMapping("/menu")
	public String menu(Model model) {

		List<Subject> subject = subjectService.getCurruntApplication();
		
		model.addAttribute("subject", subject);
		
		return "menu";
	}
	
	@RequestMapping("/A")
	public String A(Model model) {

		List<Subject> subject = subjectService.getCurrunt(2014, 1);
		
		model.addAttribute("subject", subject);
		
		return "A";
	}
	
	@RequestMapping("/B")
	public String B(Model model) {

		List<Subject> subject = subjectService.getCurrunt(2014, 2);
		
		model.addAttribute("subject", subject);
		
		return "B";
	}
	
	@RequestMapping("/C")
	public String C(Model model) {

		List<Subject> subject = subjectService.getCurrunt(2015, 1);
		
		model.addAttribute("subject", subject);
		
		return "C";
	}
	
	@RequestMapping("/D")
	public String D(Model model) {

		List<Subject> subject = subjectService.getCurrunt(2015, 2);
		
		model.addAttribute("subject", subject);
		
		return "C";
	}
	
	@RequestMapping("/E")
	public String E(Model model) {

		List<Subject> subject = subjectService.getCurrunt(2016, 1);
		
		model.addAttribute("subject", subject);
		
		return "E";
	}

}
