package com.ynov.projet;

import com.ynov.projet.beans.Client;
import com.ynov.projet.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


@SpringBootApplication
public class AppMainApplication  implements CommandLineRunner {

    @Autowired
    private IDao iDao;

    public static void main(String[] args) {
        SpringApplication.run( AppMainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        iDao.save(new Client(4,"laura","kaka"));
        iDao.save(new Client(6,"junior","malaika"));
        iDao.save(new Client(5,"Skama","nocx"));

        iDao.findAll().forEach(p->{
            System.out.println(p.toString());
        });

    }
}
