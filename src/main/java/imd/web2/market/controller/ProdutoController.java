package imd.web2.market.controller;

import imd.web2.market.model.ProdutosEntity;
import imd.web2.market.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = {"/produto"} )
public class ProdutoController {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public String status(){
        return "IMD MARKET: API ON";
    }

    @GetMapping("/getAll")
    public List<ProdutosEntity> getAll(){
        return repository.findAll();
    }
    @GetMapping("/get/{id}")
    public Optional<ProdutosEntity> getById(@PathVariable(value="id") Long id){
        return repository.findById(id);
    }

    @PostMapping("/post")
    public void postProduct(@RequestBody @Valid ProdutosEntity p){
        repository.save(p);
    }

    @PutMapping("/put")
    public void putProduct(@RequestBody @Valid ProdutosEntity p){
        repository.save(p);
    }
    @DeleteMapping("/delete/{id}")
    public void DeleteProduct(@PathVariable(value="id") Long id){
        repository.deleteById(id);
    }
    @DeleteMapping("/inativar/{id}")
    public void DeleteLogic(@PathVariable(value="id") Long id){
        Optional<ProdutosEntity> p = repository.findById(id);
        if(p.isPresent()){
            p.get().setAtivo(false);
            repository.save(p.get());
        }
    }
}
