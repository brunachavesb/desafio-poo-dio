import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Java básico ao avançado");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("JavaScript básico ao avançado");
        curso2.setCargahoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do curso Java");
        mentoria.setDescricao("Aprendendo a programar com Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Desenvolva suas habilidades em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamilla = new Dev();
        devCamilla.setNome("Camilla");
        devCamilla.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camilla: " + devCamilla.getConteudosInscritos());
        devCamilla.progredir();
        devCamilla.progredir();
        devCamilla.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Camilla: " + devCamilla.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Camilla: " + devCamilla.getConteudosConcluidos());
        System.out.println("XP: " + devCamilla.calcularTotalXp());

        System.out.println("----------------");

        Dev devBruna = new Dev();
        devBruna.setNome("Bruna");
        devBruna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Bruna: " + devBruna.getConteudosInscritos());
        devBruna.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Bruna: " + devBruna.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Bruna: " + devBruna.getConteudosConcluidos());
        System.out.println("XP: " + devBruna.calcularTotalXp());


    }

}