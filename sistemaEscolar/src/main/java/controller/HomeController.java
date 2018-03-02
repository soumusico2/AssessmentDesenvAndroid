package controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sistemaEscolar.dao.dadosDAO;
import br.com.sistemaEscolar.model.ContaModel;

@Controller
public class HomeController {
	
	dadosDAO dao = new dadosDAO();
	
	@RequestMapping("/form")
	public String exibirFormulario() {
		
		return "formulario";
	}
	
	@RequestMapping("/adicionarConta")
	public String adiciona(ContaModel conta) throws SQLException{
		
		dao.Inserir(conta);
		return "conta-adicionada";
	}
}
