package com.markelova.seaport._main;

import com.markelova.seaport.entity.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dock> docs = new ArrayList<>(Arrays.asList(
                new Dock(),
                new Dock(),
                new Dock(),
                new Dock()
        ));

        for (int i = 0; i <= 3; i++) {
            System.out.println(new Warehouse(docs.get(i)));
        }

        Port port = new Port("Lastochka", docs);

        System.out.println(port);

        for (int i = 0; i < 100; i++) {
            System.out.println(new Ship());
        }

        Dispatcher dispatcher = new Dispatcher();
    }
}
