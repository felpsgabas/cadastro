package com.produto.cadastro.Controller;

import com.produto.cadastro.Service.ProdutoService;
import com.produto.cadastro.produtos.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/produtos")
public class ProdutoController {
    private  final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }
    @GetMapping
    public List<Produto> carregaProduto(){
        return service.listaDeProdutos();
    }

    @PostMapping
    public Produto salvaNovoProduto(@RequestBody Produto produtos){
              return service.cadastrarProdutos(produtos);
}
@DeleteMapping  ("/id")
public void deletarProduto(@PathVariable Long id){
service.excluirProduto(id);

}
@GetMapping ("/id")
public Produto buscarProdutoPeloId(@PathVariable Long id){
        return service.buscarProdutoId(id);
}
}
