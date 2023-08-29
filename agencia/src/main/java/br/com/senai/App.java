package br.com.senai;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.senai.enuns.Estado;
import br.com.senai.enuns.Genero;
import br.com.senai.models.Candidato;
import br.com.senai.models.Endereco;
import br.com.senai.models.Escolaridade;

public class App 
{
    public static void main( String[] args ){
        
        Endereco endereco = new Endereco();
        endereco.cep = "64000000";
        endereco.logradouro = "Rua Porto, 3555";
        endereco.cidade = "Teresina";
        endereco.estado = Estado.PI;

        Candidato joaoguilherme = new Candidato();
        joaoguilherme.nomeCompleto = "João Guilherme da Silva Magalhães";
        joaoguilherme.dataNascimento = LocalDate.of(2000, 10, 16);
        joaoguilherme.email = "joaoguilherme@gmail.com";
        joaoguilherme.genero = Genero.F;
        joaoguilherme.naturalidade = Estado.PI.toString();
        joaoguilherme.nacionalidade = "Brasil";
        joaoguilherme.endereco = endereco;

        Escolaridade e1 = new Escolaridade();
        e1.nomeCurso = "Sistema para Internet";
        e1.nomeInstituicao = "Senai";
        e1.dataInicio = LocalDate.of(2022, 10, 01);
        e1.dataFim = LocalDate.of(2023, 06, 10);

        Escolaridade e2 = new Escolaridade();
        e2.nomeCurso = "Engenharia Civil";
        e2.nomeInstituicao = "Sesi - Escola Conselheiro Saraiva";
        e2.dataInicio = LocalDate.of(2020, 02, 01);
        e2.dataFim = LocalDate.of(2023, 06, 10);

        Candidato aysha = new Candidato();
        aysha.nomeCompleto = "Aysha Cristina Ramos Lima";
        aysha.dataNascimento = LocalDate.of(2007, 02, 04);
        aysha.email = "ayshazinha123@gmail.com";

        // List<Escolaridade> list = new ArrayList<>();
        // list.add(e1);
        // list.add(e2);

        joaoguilherme.escolaridades = Arrays.asList(e1,e2);

        System.out.println("Nome Completo "+joaoguilherme.nomeCompleto);
        System.out.println("Idade: "+ Period.between(joaoguilherme.dataNascimento, LocalDate.now()).getYears());
        System.out.println("Endereço:" + joaoguilherme.endereco.logradouro);

        for (Escolaridade escolaridade : joaoguilherme.escolaridades) {
            System.out.println(escolaridade.nomeCurso+" - "+escolaridade.nomeInstituicao);
        
        System.out.println("Nome Completo "+joaoguilherme.nomeCompleto);
        System.out.println("Maior de idade: "+ (joaoguilherme.eMaioridade()));

        System.out.println("***************************");
        System.out.println("Nome Completo "+aysha.nomeCompleto);
        System.out.println("Maior de idade: "+ (aysha.eMaioridade()));

    }
}
}