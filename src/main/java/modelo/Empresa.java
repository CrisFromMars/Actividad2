package modelo;

import modelo.Bodega.Producto;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Empresa {

    /*
    private int claveProd;
    private int cantExistProd;
    private int minProd;
    private int maxProd;
    private String descProd;
    private String clasifProd;
    private double precioProd;
    */



    public static void main(String[] args){

        Empresa empresa = new Empresa();
        List<Producto> productos = new ArrayList<>();

        //Lista de productos

        Producto papelBano = new Producto(0, 20, 1, 30, "Producto para despues de hacer del 2", "Limpieza", 12.50);//Aqui se generan nuevos productos poniendo en el parentesis el valor que se quiere asignar.

        Producto refresco = new Producto(1, 34, 5, 50, "Bebida con azucar", "Bebida", 10.50);

        Producto leche = new Producto(2, 5, 5, 20, "Bebida lactea", "Bebida", 13.45);

        Producto chocolate = new Producto(3, 13, 5, 50, "Dulce energetico", "Dulce", 15.99);

        Producto pistaches = new Producto(4, 6, 1, 20, "Pistaches para botanear", "Refrigerio", 6.50);

        Producto azucar = new Producto(5, 10, 4, 39, "Endulzante rico", "Despensa", 7.90);

        Producto sal = new Producto(6, 18, 6, 30, "Sal de mar", "Despensa", 10.50);

        Producto knorSuiza = new Producto(7, 5, 5, 10, "Condimento de pollo para el caldo", "Despensa", 5.00);

        Producto ricoPollo = new Producto(8, 40, 10, 60, "Condimento de pollo para el caldo de pollo", "Despensa", 2.00);

        Producto redbull = new Producto(9, 10, 10, 30, "bebida energetica", "Bebida", 10.50);

        Producto viveCien = new Producto(10, 12, 3, 15, "Bebida energizante", "Bebida", 10.50);

        Producto sabritasSal = new Producto(11, 39, 10, 50, "Frituras sabor aire", "Refrigerio", 13.00);

        Producto agua = new Producto(12, 5, 10, 50, "fresca de manantial", "Bebida", 10.50);

        Producto tostitos = new Producto(13, 12, 10, 50, "Frituras de maiz", "Refrigerio", 11.00);

        Producto rancheritos = new Producto(14, 23, 10, 50, "Frituras sabor chile", "Refrigerio", 8.00);

        Producto doritos = new Producto(15, 30, 10, 50, "Frituras sabor queso", "Refrigerio", 10.00);

        Producto gansito = new Producto(16, 5, 5, 10, "pastelito cubierto de chocolate", "Despensa", 10.50);

        Producto chamito = new Producto(17, 10, 1, 10, "Bebida para la salud", "Bebida", 25.00);

        Producto frutsiLimon = new Producto(18, 5,5, 20, "Frutsi sabor limon", "Bebida", 10.50);

        Producto frutsiNaranja = new Producto(19, 5, 5, 20, "Frutsi sabor naranja", "Bebida", 4.00);

        Producto frutsiManzana = new Producto(20, 10, 5, 20, "Frutsi sabor manzana", "Bebida", 4.00);

        Producto aspirinas = new Producto(21, 10, 15, 30, "para dolor de cabeza", "Despensa", 10.50);

        Producto frutsiUva = new Producto(22, 5, 5, 20, "Frutsi sabor uva ", "Bebida", 4.00);

        Producto natillaVainilla = new Producto(23, 4, 1, 10, "Natilla en bote ", "Dulce", 5.50);

        Producto toallasSanitarias = new Producto(24, 5, 10, 20, "super absorbentes", "Limpieza", 10.50);

        Producto natillaChocolate = new Producto(25, 8, 1, 10, "Natilla en bote ", "Dulce", 5.50);

        Producto servilletas = new Producto(26, 5, 5, 30, "suaves y resistentes", "Limpieza", 10.50);

        Producto carneHamburguesa = new Producto(27, 8, 3, 8, "Carne de sirloin para burguers", "Carnes frias", 120.00);

        Producto frijolBolsa = new Producto(28, 2, 5, 10, "recien hechos", "Despensa", 10.50);

        Producto waffles = new Producto(29, 10, 3, 12, "Waffles mantequilla", "Refrigerio", 90.00);

        Producto chorizo = new Producto(30, 5, 10, 15, "puro de cerdo", "Carnes frias", 10.50);

        Producto arrachera = new Producto(31, 12, 3, 15, "Arrachera deluxe", "Carnes frias", 160.00);

        Producto filetePescado = new Producto(32, 5, 1, 8, "Filete sin espinas", "Carnes frias", 40.90);

        Producto brocoli = new Producto(33, 5, 5, 10, "frescura y sabor", "FYV", 10.50);

        Producto bonelessBBQ = new Producto(34, 4, 1, 8, "Pollo sabor bbq", "Carnes frias", 49.50);

        Producto bonelessBuffalo = new Producto(35, 5, 1, 8, "Pollo sabor buffalo picante", "Carnes frias", 49.50);

        Producto salsaCatsup = new Producto(36, 5, 5, 10, "fresca y rica", "Despensa", 10.50);

        Producto pastaDental = new Producto(37, 10, 5, 20, "maxima frescura", "Despensa", 10.50);

        Producto jabonTrastes = new Producto(38, 5, 5, 16, "Desengrasa todo", "Despensa", 10.50);

        Producto jabonRopa = new Producto(39, 10, 8, 20, "blancura y frescura", "Despensa", 10.50);

        Producto cafe = new Producto(40, 20, 5, 30, "cafe marca nescafe", "Despensa", 30.00);

        Producto galletas = new Producto(41, 50, 10, 50, "galletas de chocolate gamesa", "Despensa", 10.50);

        Producto arroz = new Producto(42, 20, 5, 20, "Arroz Verde valle", "Despensa", 10.50);

        Producto queso = new Producto(43, 5, 5, 10, "Queso La Villita", "Lacteos", 10.50);

        Producto jamon = new Producto(44, 10, 3, 10, "jamon de pavo fud", "Carnes frias", 10.50);

        Producto cebolla = new Producto(45, 20, 5, 20, "Cebolla blanca", "FYV", 10.50);

        Producto salchicha = new Producto(46, 10 , 5, 28, "Salchichas fud", "Carnes frias", 39.80);

        Producto lecheChocolate = new Producto(47, 5, 5, 10, "Pura de vaca", "Lacteos", 10.50);

        Producto tomate = new Producto(48, 18, 10, 28, "Tomate rojo", "FYV", 10.50);

        Producto mantequilla = new Producto(49, 3, 5, 10, "Sin grasa" , "Lacteos", 10.50);

        Producto totopos = new Producto(50, 6, 1, 6, "Totopos con sal", "Despensa", 13.99);

        Producto panDeCaja = new Producto(51, 5, 7, 10, "puro de trigo", "despensa", 10.50);

        Producto Croquetas  = new Producto(52, 10, 5, 10, "Croquetas para perro", "Alimento mascota", 89.00);

        Producto mazapan = new Producto(53, 5, 30, 50, "mazapan de cacahuate", "Dulce", 10.50);

        Producto Wiskas  = new Producto(54, 10, 5, 10, "Croquetas para gato", "Alimento mascota", 89.50);

        Producto hojuelasPez  = new Producto(55, 8, 3, 15, "Alimento para pescado", "Alimento mascota", 80.00);

        Producto mielParaHotCakes = new Producto(56, 5, 10, 15, "dulce para hotcakes", "Despensa", 10.50);

        Producto semillasCanario  = new Producto(57, 5, 2, 8, "Alimento para pajaros pequeños", "Alimento mascota", 29.50);

        Producto atunAceite  = new Producto(58, 20, 5, 40, "Atun en aceite", "Despensa", 12.00);

        Producto refrescoDieta = new Producto(59,15, 29, 50, "dietetico", "refrigerio", 10.50);

        Producto atunAgua  = new Producto(60, 12, 5, 40, "Atun en agua", "Despensa", 12.00);

        Producto sardina  = new Producto(61, 8, 2, 10, "Sardina con salsa de tomate", "Despensa",19.00);

        Producto CarneMolida = new Producto(62, 4, 5, 10, "tierna y suave", "Carnes frias", 10.50);

        Producto Sabrozedor  = new Producto(63, 5, 5, 15, "Condimento variado", "Despensa", 18.00);

        Producto tangTe  = new Producto(64, 10, 5, 15, "Saborizante de agua sabor Te", "Despensa", 8.50);

        Producto Naranjas = new Producto(65, 12, 10, 20, "veracruzana dulce", "FYV", 10.50);

        Producto tangJamaica  = new Producto(66, 8, 5, 15, "Saborizante de agua de Limon que sabe a Tamarindo pero es de Jamaica", "Despensa", 8.50);

        Producto chiclesTrident = new Producto(67, 15, 10, 30, "sabores frutales", "Dulce", 10.50);

        Producto tangDurazno  = new Producto(68, 10, 5, 15, "Saborizante de agua sabor Durazno", "Despensa", 8.50);

        Producto tangLimon  = new Producto(69, 2, 5, 15, "Saborizante de agua sabor Limon", "Despensa", 8.50);

        Producto yoghurt = new Producto(70, 5, 5, 10, "deslactosado", "Lacteos", 10.50);

        Producto tangHorchata  = new Producto(71, 5, 5, 15, "Saborizante de agua sabor Horchata", "Despensa", 8.50);

        Producto frijolesEnLata = new Producto(72, 5, 2, 10, "Frijoles enlatados", "Despensa", 12.50);

        Producto tortillasHarina = new Producto(73, 10, 10, 15, "trigo entero", "Despensa", 10.50);

        Producto frijolesRefritos  = new Producto(74, 10, 7, 19, "Frijoles refritos en bolsa", "Despensa", 10.99);

        Producto maruchanLimon = new Producto(75, 10, 8, 12, "Sopa instantanea de Limon", "Despensa", 8.50);

        Producto chileCurtido = new Producto(76, 10, 5, 30, "La costeña por sabor", "Despensa", 10.50);

        Producto maruchanPiquin = new Producto(77, 10, 8, 12, "Sopa instantanea de camaron con piquin", "Despensa", 8.50);

        Producto maruchanHabanero = new Producto(78, 10, 8, 12, "Sopa instantanea de camaron y habanero", "Despensa", 8.50);

        Producto panMolido = new Producto(79, 5, 5, 10, "Recien molido", "Despensa", 10.50);

        Producto maruchanPollo = new Producto(80, 10, 8, 12, "Sopa instantanea de pollo", "Despensa", 8.50);


        // añadir a la lista

        productos.add(agua);
        productos.add(arrachera);
        productos.add(arroz);
        productos.add(aspirinas);
        productos.add(atunAceite);
        productos.add(atunAgua);
        productos.add(azucar);
        productos.add(bonelessBBQ);
        productos.add(bonelessBuffalo);
        productos.add(brocoli);
        productos.add(cafe);
        productos.add(carneHamburguesa);
        productos.add(CarneMolida);
        productos.add(cebolla);
        productos.add(chamito);
        productos.add(chiclesTrident);
        productos.add(chileCurtido);
        productos.add(chocolate);
        productos.add(chorizo);
        productos.add(Croquetas);
        productos.add(doritos);
        productos.add(filetePescado);
        productos.add(frijolBolsa);
        productos.add(frijolesEnLata);
        productos.add(frijolesRefritos);
        productos.add(frutsiLimon);
        productos.add(frutsiManzana);
        productos.add(frutsiNaranja);
        productos.add(frutsiUva);
        productos.add(galletas);
        productos.add(gansito);
        productos.add(hojuelasPez);
        productos.add(jabonRopa);
        productos.add(jabonTrastes);
        productos.add(jamon);
        productos.add(knorSuiza);
        productos.add(leche);
        productos.add(lecheChocolate);
        productos.add(mantequilla);
        productos.add(maruchanHabanero);
        productos.add(maruchanLimon);
        productos.add(maruchanPiquin);
        productos.add(maruchanPollo);
        productos.add(mazapan);
        productos.add(mielParaHotCakes);
        productos.add(Naranjas);
        productos.add(natillaChocolate);
        productos.add(natillaVainilla);
        productos.add(panDeCaja);
        productos.add(panMolido);
        productos.add(papelBano);
        productos.add(pastaDental);
        productos.add(pistaches);
        productos.add(queso);
        productos.add(rancheritos);
        productos.add(redbull);
        productos.add(refresco);
        productos.add(refrescoDieta);
        productos.add(ricoPollo);
        productos.add(sabritasSal);
        productos.add(Sabrozedor);
        productos.add(sal);
        productos.add(salchicha);
        productos.add(salsaCatsup);
        productos.add(sardina);
        productos.add(semillasCanario);
        productos.add(servilletas);
        productos.add(tangDurazno);
        productos.add(tangHorchata);
        productos.add(tangJamaica);
        productos.add(tangLimon);
        productos.add(tangTe);
        productos.add(toallasSanitarias);
        productos.add(tomate);
        productos.add(tortillasHarina);
        productos.add(tostitos);
        productos.add(totopos);
        productos.add(viveCien);
        productos.add(waffles);
        productos.add(yoghurt);



            //  PROBLEMA 1

        System.out.println("PROBLEMA 1: ");

        AtomicInteger counter = new AtomicInteger(0);
        productos.forEach(a-> {
            if(a.getCantExistProd() > 20) {
              //  System.out.println(a.getDescProd());
              //  System.out.println("-|-|-|-|-|");
                counter.addAndGet(1);

            }

        });

        System.out.println("Productos con cantidad mayor a 20: "+ counter);
        System.out.println();
        System.out.println();

            //   PROBLEMA 2
        System.out.println("PROBLEMA 2: ");

        AtomicInteger counter2 = new AtomicInteger(0);
        productos.forEach(a-> {
            if(a.getCantExistProd() < 15) {
                //  System.out.println(a.getDescProd());
                //  System.out.println("-|-|-|-|-|");
                counter2.addAndGet(1);

            }

        });

        System.out.println("Productos con cantidad menor a 15: "+ counter2);
        System.out.println();
        System.out.println();



            //      PROBLEMA 3
        System.out.println("PROBLEMA 3: ");
        productos.forEach(a-> {
            if(a.getPrecioProd() > 15.50) {
                //  System.out.println(a.getDescProd());
                System.out.println("-|-|-|-|-|");
                System.out.println(a.toString());
                System.out.print(a.getClasifProd());
                System.out.println(" Por $" + a.getPrecioProd());


            }

        });
        System.out.println();
        System.out.println();


        //      PROBLEMA 4
        System.out.println("PROBLEMA 4: ");
        productos.forEach(a-> {
            if((a.getPrecioProd() > 20.30) && (a.getPrecioProd() < 45.00)) {
                //  System.out.println(a.getDescProd());
                System.out.println("-|-|-|-|-|");
                System.out.println(a.toString());
            }
        });
        System.out.println();
        System.out.println();

        //      PROBLEMA 5
        System.out.println("PROBLEMA 5: ");
        AtomicInteger counterC1 = new AtomicInteger(0);
        AtomicInteger counterC2 = new AtomicInteger(0);
        AtomicInteger counterC3 = new AtomicInteger(0);
        AtomicInteger counterC4 = new AtomicInteger(0);
        AtomicInteger counterC5 = new AtomicInteger(0);
        AtomicInteger counterC6 = new AtomicInteger(0);
        AtomicInteger counterC7 = new AtomicInteger(0);
        AtomicInteger counterC8 = new AtomicInteger(0);
        AtomicInteger counterC9 = new AtomicInteger(0);
        AtomicInteger counterC10 = new AtomicInteger(0);
        productos.forEach(a-> {

            if(a.getClasifProd().equals("Limpieza")) {
                //  System.out.println(a.getDescProd());
                counterC1.addAndGet(1);
            }

            if(a.getClasifProd().equals("Bebida")) {
                //  System.out.println(a.getDescProd());
                counterC2.addAndGet(1);
            }

            if(a.getClasifProd().equals("Dulce")) {
                //  System.out.println(a.getDescProd());
                counterC3.addAndGet(1);
            }

            if(a.getClasifProd().equals("Refrigerio")) {
                //  System.out.println(a.getDescProd());
                counterC4.addAndGet(1);
            }

            if(a.getClasifProd().equals("Despensa")) {
                //  System.out.println(a.getDescProd());
                counterC5.addAndGet(1);
            }
/*
            if(a.getClasifProd().equals("Carne")) {
                //  System.out.println(a.getDescProd());
                counterC6.addAndGet(1);
            }
*/
            if(a.getClasifProd().equals("FYV")) {
                //  System.out.println(a.getDescProd());
                counterC7.addAndGet(1);
            }

            if(a.getClasifProd().equals("Lacteos")) {
                //  System.out.println(a.getDescProd());
                counterC8.addAndGet(1);
            }

            if(a.getClasifProd().equals("Carnes frias")) {
                //  System.out.println(a.getDescProd());
                counterC9.addAndGet(1);
            }

            if(a.getClasifProd().equals("Alimento mascota")) {
                //  System.out.println(a.getDescProd());
                counterC10.addAndGet(1);
            }


        });
        System.out.println("    Productos");
        System.out.println("Limpieza: " + counterC1);
        System.out.println("Bebida: " + counterC2);
        System.out.println("Dulce: " + counterC3);
        System.out.println("Refrigerio: " + counterC4);
        System.out.println("Despensa: " + counterC5);
        // System.out.println("Carne: " + counterC6);
        System.out.println("Frutas y Verduras: " + counterC7);
        System.out.println("Lacteos: " + counterC8);
        System.out.println("Carnes frias: " + counterC9);
        System.out.println("Alimento mascota: " + counterC10);


    }
}
