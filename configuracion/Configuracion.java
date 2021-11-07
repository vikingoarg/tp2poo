package configuracion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import base.Plan;
import derivada.PlanInternet;
import derivada.PlanMovil;
import derivada.PlanTV;

public class Configuracion {

    List<PlanInternet> planesDeInternet = new ArrayList<PlanInternet>();
    List<PlanMovil> planesDeMovil = new ArrayList<PlanMovil>();
    List<PlanTV> planesDeTv = new ArrayList<PlanTV>();

    public void instanciaPlanes() {

        planesDeInternet.add(new PlanInternet(1001,"Fibertel 100MB", 500));
        planesDeInternet.add(new PlanInternet(1002,"Fibertel 10MB", 300));
        planesDeInternet.add(new PlanInternet(1003,"Fibertel 50MB", 1000));
        planesDeMovil.add(new PlanMovil(2001,"Black 20MB", 400));
        planesDeMovil.add(new PlanMovil(2002,"Black 10MB", 200));
        planesDeMovil.add(new PlanMovil(2003,"Black 30MB", 800));
        planesDeTv.add(new PlanTV(3001,"Flow Basico", 700));
        planesDeTv.add(new PlanTV(3002,"Flow Premium", 900));
    }

    public void planesDisponibles(int familiaDeProducto) {
        switch (familiaDeProducto) {
        case 1:
            planesDeInternet.stream().forEach((a) -> System.out.println(a.getIdDelPlan() +"-" +a.getNombreDelPLan()));

            break;
        case 2:


            planesDeMovil.stream().forEach((a) -> System.out.println(a.getIdDelPlan() +"-" +a.getNombreDelPLan()));

            break;
        case 3:

            planesDeTv.stream().forEach((a) -> System.out.println(a.getIdDelPlan() +"-" +a.getNombreDelPLan()));

            break;

        default:

            System.out.println("familia de Producto invalida");
            break;
        }

    };

}