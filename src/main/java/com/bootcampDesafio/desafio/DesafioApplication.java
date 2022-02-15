package com.bootcampDesafio.desafio;

import com.bootcampDesafio.desafio.dominio.Bootcamp;
import com.bootcampDesafio.desafio.dominio.Conteudo;
import com.bootcampDesafio.desafio.dominio.Curso;
import com.bootcampDesafio.desafio.dominio.Dev;
import com.bootcampDesafio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class DesafioApplication {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Algoritmos e Estruturas de Dados");
		curso2.setDescricao("Descrição do curso Algoritmos e Estruturas de Dados");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição da mentoria de Java");
		mentoria.setData(LocalDate.now());

//		System.out.println(curso1);
//		System.out.println(mentoria);

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev dev = new Dev();
		dev.setNome("Irla");
		dev.increverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos " + dev.getConteudosInscritos());
		dev.progredir();
		dev.progredir();
		System.out.println("---");
		System.out.println("Conteúdos Inscritos " + dev.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos " + dev.getConteudosConcluidos());
		System.out.println("XP: " + dev.calcularTotalXp());

		System.out.println("----------------------------");

		Dev dev1 = new Dev();
		dev1.setNome("João");
		dev1.increverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos " + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		dev1.progredir();
		System.out.println("---");
		System.out.println("Conteúdos Inscritos " + dev1.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
	}

}
