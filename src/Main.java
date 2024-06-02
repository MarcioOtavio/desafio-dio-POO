import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(0);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Javascript");
        curso2.setDescricao("descricao curso Javascript");
        curso2.setCargaHoraria(10);

        System.out.print(curso1);
        System.out.print(curso2);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.print(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos(curso1);
        bootcamp.getConteudos(curso2);
        bootcamp.getConteudos(mentoria);

        System.out.println("*--------------*");

        Dev devMarcio = new Dev();
        devMarcio.setNome("Marcio");
        devMarcio.progredir();
        System.out.println(devMarcio.getNome() + " Conteudos inscritos: " + devMarcio.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devMarcio.getConteudosConcluidos());
        System.out.println("XP : " + devMarcio.calcularTotalXp());

        System.out.println("*--------------*");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        System.out.println(devCamila.getNome() + " Conteudos inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("XP : " + devMarcio.calcularTotalXp());


    }
}