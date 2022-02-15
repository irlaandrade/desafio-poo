package com.bootcampDesafio.desafio;

import com.bootcampDesafio.desafio.dominio.Curso;
import com.bootcampDesafio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class DesafioApplication {
	public static void main(String[] args) {
		Curso curso1 = new Curso();

		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do curso Java");
		curso1.setCargaHoraria(8);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrição da mentoria de Java");
		mentoria1.setData(LocalDate.now());

		System.out.println(curso1);
		System.out.println(mentoria1);
	}

}
