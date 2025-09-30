package ifrn.pi.eventos.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		System.out.println("Método index funcionando");
		return "home";
	}

}
