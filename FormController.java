package ifrn.pi.eventos.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ifrn.pi.eventos.models.Evento;


@Controller
public class FormController {

	@RequestMapping("/eventos/salvar")
	public String salvarEvento() {
		System.out.println("Evento salvo");
		return "formConfirm";
	}
	
	@PostMapping("/eventos/salvar")
	public String salvarEvento(Evento evento) {
	    System.out.println("Nome: " + evento.getNome());
	    System.out.println("Local: " + evento.getLocal());
	    System.out.println("Data: " + evento.getData());
	    System.out.println("Horario:" + evento.getHorario());
	    return "formConfirm";
	}
	
	}
