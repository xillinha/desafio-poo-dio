import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPriscilla = new Dev();
        devPriscilla.setNome("Priscilla");
        devPriscilla.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devPriscilla.getConteudosInscritos());

        devPriscilla.progredir();
        devPriscilla.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devPriscilla.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devPriscilla.getConteudosConcluidos());
        System.out.println("XP: " + devPriscilla.calcularTotalXp());

        System.out.println("--------------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}