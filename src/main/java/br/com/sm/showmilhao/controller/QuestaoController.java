package br.com.sm.showmilhao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.sm.showmilhao.model.Questao;
import br.com.sm.showmilhao.repository.QuestaoRepository;

@Controller
public class QuestaoController {

	@Autowired
	private QuestaoRepository qr;
	
	@RequestMapping(value = "/iniciarQuestao", method = RequestMethod.GET)
	public String form() {
		return "questao/formQuestao";
	}

	@RequestMapping(value = "/iniciarQuestao", method = RequestMethod.POST)
	public String form(Questao q) {
		
		qr.save(q);
		
		return "redirect:/iniciarQuestao";
	}
	
	
	@RequestMapping("/listaQuestao")
	public ModelAndView listaQuestao() {
		
		ModelAndView mv = new ModelAndView("index");
		
		Iterable<Questao> questoes = qr.findAll();
		
		
		mv.addObject("listaQuestao",questoes);
		
		return mv;
		
	}
	
	
}
