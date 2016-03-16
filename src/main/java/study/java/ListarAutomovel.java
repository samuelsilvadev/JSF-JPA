package study.java;

import java.util.List;

import study.java.model.Automovel;
import study.repositorios.Automoveis;

public class ListarAutomovel {
	
	public static void main(String[] args) {
		Automoveis automoveis = new Automoveis();
		List<Automovel> automovels = automoveis.listarTodos();
		
		for(Automovel a : automovels){
			System.out.println(a.getModelo());
		}
	}
}

