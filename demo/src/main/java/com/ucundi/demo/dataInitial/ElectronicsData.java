package com.ucundi.demo.dataInitial;

import com.ucundi.demo.domain.*;
import com.ucundi.demo.repositories.monitoresRepositories;
import com.ucundi.demo.repositories.mousesRepositories;
import com.ucundi.demo.repositories.tecladosRepositories;
import com.ucundi.demo.repositories.serviciosRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class ElectronicsData implements CommandLineRunner {

    private final monitoresRepositories MonitoresRepository;
    private final mousesRepositories MousesRepository;
    private final serviciosRepositories ServiciosRepository;
    private final tecladosRepositories TecladosRepository;

    public ElectronicsData(monitoresRepositories monitoresRepository, mousesRepositories mousesRepository,
            serviciosRepositories serviciosRepository, tecladosRepositories tecladosRepository) {
        MonitoresRepository = monitoresRepository;
        MousesRepository = mousesRepository;
        ServiciosRepository = serviciosRepository;
        TecladosRepository = tecladosRepository;
    }

    @Override
    public void run(String... args){
        /**
         * monitores
         */
        monitoresEntity monitor1 = new monitoresEntity("pantalla curba","16pulgadas",100, "asus");
        MonitoresRepository.save(monitor1);
        monitoresEntity monitor2 = new monitoresEntity("pantalla curba","16pulgadas",100, "asus");
        MonitoresRepository.save(monitor2);
        monitoresEntity monitor3 = new monitoresEntity("pantalla curba","16pulgadas",100, "asus");
        MonitoresRepository.save(monitor3);
        monitoresEntity monitor4 = new monitoresEntity("pantalla curba","16pulgadas",100, "asus");
        MonitoresRepository.save(monitor4);
        monitoresEntity monitor5 = new monitoresEntity("pantalla curba","16pulgadas",100, "asus");
        MonitoresRepository.save(monitor5);
        monitoresEntity monitor6 = new monitoresEntity("pantalla curba","16pulgadas",100, "asus");
        MonitoresRepository.save(monitor6);
        monitoresEntity monitor7 = new monitoresEntity("pantalla curba","16pulgadas",100, "asus");
        MonitoresRepository.save(monitor7);
        monitoresEntity monitor8 = new monitoresEntity("pantalla curba","16pulgadas",100, "asus");
        MonitoresRepository.save(monitor8);
        monitoresEntity monitor9 = new monitoresEntity("pantalla curba","16pulgadas",100, "asus");
        MonitoresRepository.save(monitor9);
        monitoresEntity monitor10 = new monitoresEntity("pantalla curba","16pulgadas",100, "asus");
        MonitoresRepository.save(monitor10);
        /**
         * mouses
         */
        mousesEntity mouse1 = new mousesEntity("mouseGamer", "15pulgadas", "50", "lenovo");
        MousesRepository.save(mouse1);
        mousesEntity mouse2 = new mousesEntity("mouseGamer", "15pulgadas", "50", "lenovo");
        MousesRepository.save(mouse2);
        mousesEntity mouse3 = new mousesEntity("mouseGamer", "15pulgadas", "50", "lenovo");
        MousesRepository.save(mouse3);
        mousesEntity mouse4 = new mousesEntity("mouseGamer", "15pulgadas", "50", "lenovo");
        MousesRepository.save(mouse4);
        mousesEntity mouse5 = new mousesEntity("mouseGamer", "15pulgadas", "50", "lenovo");
        MousesRepository.save(mouse5);
        mousesEntity mouse6 = new mousesEntity("mouseGamer", "15pulgadas", "50", "lenovo");
        MousesRepository.save(mouse6);
        mousesEntity mouse7 = new mousesEntity("mouseGamer", "15pulgadas", "50", "lenovo");
        MousesRepository.save(mouse7);
        mousesEntity mouse8 = new mousesEntity("mouseGamer", "15pulgadas", "50", "lenovo");
        MousesRepository.save(mouse8);
        mousesEntity mouse9 = new mousesEntity("mouseGamer", "15pulgadas", "50", "lenovo");
        MousesRepository.save(mouse9);
        mousesEntity mouse10 = new mousesEntity("mouseGamer", "15pulgadas", "50", "lenovo");
        MousesRepository.save(mouse10);
        /**
         * Servicios
         */
        serviciosEntity servicio1 = new serviciosEntity("pantalla curba","16pulgadas","50", "asus");
        ServiciosRepository.save(servicio1);
        serviciosEntity servicio2 = new serviciosEntity("pantalla curba","16pulgadas","50", "asus");
        ServiciosRepository.save(servicio2);
        serviciosEntity servicio3 = new serviciosEntity("pantalla curba","16pulgadas","50", "asus");
        ServiciosRepository.save(servicio3);
        serviciosEntity servicio4 = new serviciosEntity("pantalla curba","16pulgadas","50", "asus");
        ServiciosRepository.save(servicio4);
        serviciosEntity servicio5 = new serviciosEntity("pantalla curba","16pulgadas","50", "asus");
        ServiciosRepository.save(servicio5);
        serviciosEntity servicio6 = new serviciosEntity("pantalla curba","16pulgadas","50", "asus");
        ServiciosRepository.save(servicio6);
        serviciosEntity servicio7 = new serviciosEntity("pantalla curba","16pulgadas","50", "asus");
        ServiciosRepository.save(servicio7);
        serviciosEntity servicio8 = new serviciosEntity("pantalla curba","16pulgadas","50", "asus");
        ServiciosRepository.save(servicio8);
        serviciosEntity servicio9 = new serviciosEntity("pantalla curba","16pulgadas","50", "asus");
        ServiciosRepository.save(servicio9);
        serviciosEntity servicio10 = new serviciosEntity("pantalla curba","16pulgadas","50", "asus");
        ServiciosRepository.save(servicio10);
        /**
         * teclados
         */
        tecladosEntity teclado1 = new tecladosEntity("pantalla curba","16pulgadas","30", "asus");
        TecladosRepository.save(teclado1);
        tecladosEntity teclado2 = new tecladosEntity("pantalla curba","16pulgadas","30", "asus");
        TecladosRepository.save(teclado2);
        tecladosEntity teclado3 = new tecladosEntity("pantalla curba","16pulgadas","30", "asus");
        TecladosRepository.save(teclado3);
        tecladosEntity teclado4 = new tecladosEntity("pantalla curba","16pulgadas","30", "asus");
        TecladosRepository.save(teclado4);
        tecladosEntity teclado5 = new tecladosEntity("pantalla curba","16pulgadas","30", "asus");
        TecladosRepository.save(teclado5);
        tecladosEntity teclado6 = new tecladosEntity("pantalla curba","16pulgadas","30", "asus");
        TecladosRepository.save(teclado6);
        tecladosEntity teclado7 = new tecladosEntity("pantalla curba","16pulgadas","30", "asus");
        TecladosRepository.save(teclado7);
        tecladosEntity teclado8 = new tecladosEntity("pantalla curba","16pulgadas","30", "asus");
        TecladosRepository.save(teclado8);
        tecladosEntity teclado9 = new tecladosEntity("pantalla curba","16pulgadas","30", "asus");
        TecladosRepository.save(teclado9);
        tecladosEntity teclado10 = new tecladosEntity("pantalla curba","16pulgadas","30", "asus");
        TecladosRepository.save(teclado10);


        System.out.println("cantidad de monitores\n");
        System.out.println("monitores: "+ MonitoresRepository.count());
    } 

}
