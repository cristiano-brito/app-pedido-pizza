package br.edu.infnet.apppedidopizza;

import br.edu.infnet.model.domain.app.Atributo;
import br.edu.infnet.model.domain.app.Classe;
import br.edu.infnet.model.domain.app.Projeto;
import br.edu.infnet.model.service.AppService;
import br.edu.infnet.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class AppTeste implements ApplicationRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private AppService appService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        String dir ="C:/Users/crist/Documents/";
        String arq ="app.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                Projeto projeto = null;
                List<Classe> classes = null;
                List<Atributo> atributos = null;

                String linha = leitura.readLine();
                while (linha != null) {

                    String[] campos = linha.split(";");

                    switch (campos[0].toUpperCase()) {
                        case "P":
                            classes = new ArrayList<>();

                            projeto = new Projeto();
                            projeto.setNome(campos[1]);
                            projeto.setDescricao(campos[2]);
                            projeto.setClasses(classes);

                            break;

                        case "C":
                            atributos = new ArrayList<>();

                            Classe classe = new Classe();
                            classe.setNome(campos[1]);
                            classe.setAtributos(atributos);

                            classes.add(classe);

                            break;

                        case "A":
                            Atributo atributo = new Atributo(campos[1], campos[2], campos[3]);

                            atributos.add(atributo);

                            break;

                        default:
                            System.out.println("Op????o inv??lida!!!");
                            break;
                    }

                    //System.out.println(">>>>>>" + linha);
                    //System.out.println(">>>>>>" + Arrays.toString(campos));

                    linha = leitura.readLine();
                }

                appService.incluir(projeto);

                leitura.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("[ERRO] O arquivo n??o existe!!");;

            } catch (IOException e) {
                System.out.println("[ERRO] Problema no fechamento do arquivo!!");;
            }
        } finally {
            System.out.println("Terminou!!!");
        }

    }
}
