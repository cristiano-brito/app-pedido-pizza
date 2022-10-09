package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.repository.UsuarioRepository;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private static Map<String, Usuario> mapaUsuario = new HashMap<>();

    public Usuario validar(String email, String senha) {

        Usuario usuario = mapaUsuario.get(email);

        if(usuario != null && senha.equals(usuario.getSenha())) {
            return usuario;
        }
        return null;
    }

    public void incluir(Usuario usuario) {
        usuarioRepository.save(usuario);

        mapaUsuario.put(usuario.getEmail(), usuario);

        AppImpressao.relatorio("Inclusão do usuário "
                + usuario.getNome()
                + " realizada com sucesso!!!", usuario);
    }

    public void excluir(String email) {
        //usuarioRepository.deleteById();
        mapaUsuario.remove(email);
    }

    public Collection<Usuario> obterLista() {
        //return usuarioRepository.findAll();
        return mapaUsuario.values();
    }
}
