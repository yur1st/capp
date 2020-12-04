package com.capp.tech.bootstrap;

import com.capp.tech.model.entity.Address;
import com.capp.tech.model.entity.Guy;
import com.capp.tech.services.AddressService;
import com.capp.tech.services.GuyService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final GuyService guyService;
    private final AddressService addressService;

    public DataLoader(GuyService guyService, AddressService addressService) {
        this.guyService = guyService;
        this.addressService = addressService;
    }

    @Override
    public void run(String... args) throws Exception {

        Guy guy1 = new Guy();
        guy1.setName("Vasily");
        guy1.setLastName("Utkin");
        guyService.save(guy1);

        Guy guy2 = new Guy();
        guy2.setName("Akakiy");
        guy2.setLastName("Huevo");
        guyService.save(guy2);

        Guy guy3 = new Guy();
        guy3.setName("Sebastian");
        guy3.setLastName("Fedorov");
        guyService.save(guy3);

        System.out.println("Loaded Guys....");

        Address address1 = new Address();
        address1.setAddress("Lenina 7");
        address1.setPostalIndex(223322);
        address1.setCity("Zazhopinsk");
        addressService.save(address1);

        Address address2 = new Address();
        address2.setAddress("Zavodskaya 12");
        address2.setPostalIndex(347323);
        address2.setCity("Cimlyansk");
        addressService.save(address2);

        Address address3 = new Address();
        address3.setAddress("Voroshilova 11");
        address3.setPostalIndex(345612);
        address3.setCity("Rostov-Papa");
        addressService.save(address3);

        System.out.println("Loaded adresses...");


    }
}
