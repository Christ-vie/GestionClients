package com.ynov.projet.service;

import com.ynov.projet.beans.Client;
import com.ynov.projet.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientService {
    @Autowired
    private IDao iDao;
    @GetMapping(value ="/listeClients")
    public List<Client> listeClients(){
        return iDao.findAll();
    }
    @GetMapping(value ="/listeClients/{id}")
    public Client listeClients(@PathVariable(name="id") Integer id){
        return iDao.findById(id).get();
    }
    @PutMapping(value ="/listeClients/{id}")
    public Client update(@PathVariable(name="id") Integer id, @RequestBody Client cl){
        cl.SetId(id);
        return iDao.save(cl);
    }
    @PostMapping(value ="/listeClients")
    public Client save( @RequestBody Client cl){
        return iDao.save(cl);
    }
    @DeleteMapping(value ="/listeClients/{id}")
    public void delete(@PathVariable(name="id") Integer id){
         iDao.deleteById(id);
    }





}
