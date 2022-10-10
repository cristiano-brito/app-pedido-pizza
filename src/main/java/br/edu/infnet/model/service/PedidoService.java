package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Pedido;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.repository.PedidoRepository;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public void incluir(Pedido pedido) {
        pedidoRepository.save(pedido);

        AppImpressao.relatorio("Inclusão do pedido "
                + pedido.getDescricao()
                + " realizada com sucesso!!!", pedido);
    }

    public Collection<Pedido> obterLista() {

        return (Collection<Pedido>) pedidoRepository.findAll();
    }

    public Collection<Pedido> obterLista(Usuario usuario) {

        return pedidoRepository.findAll(usuario.getId());
    }

    public void excluir(Integer id) {

        pedidoRepository.deleteById(id);
    }
}
