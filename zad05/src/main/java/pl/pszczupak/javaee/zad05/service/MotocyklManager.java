package pl.pszczupak.javaee.zad05.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ejb.Singleton;

import pl.pszczupak.javaee.zad05.domain.Motocykl;

@Singleton
public class MotocyklManager {

    private List<Motocykl> db = Collections.synchronizedList(new ArrayList<>());

    public void addMotocykl(Motocykl motocykl) {
        db.add(motocykl);
    }

    public void deleteMotocykl(Motocykl motocykl){
        db.remove(motocykl);
    }

    public Motocykl getMotocykl(Integer id) {
        return new Motocykl("Yamaha RX-660", 600, 19999.9);
    }

    public List<Motocykl> getAllMotocykl(){
        return db;
    }

    public void deleteAllMotocykl(){
        db.clear();
    }

}
