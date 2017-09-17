package modelo.Bodega;

import modelo.Empresa;


public class Producto extends Empresa {

    private int ClaveProd;
    private int CantExistProd;
    private int MinProd;
    private int MaxProd;
    private String DescProd;
    private String ClasifProd;
    private double PrecioProd;

    public Producto(int ClaveProd, int CantExistProd, int MinProd, int MaxProd, String DescProd, String ClasifProd, double PrecioProd) {
        this.setClaveProd(ClaveProd);
        this.setCantExistProd(CantExistProd);
        this.setMinProd(MinProd);
        this.setMaxProd(MaxProd);
        this.setDescProd(DescProd);
        this.setClasifProd(ClasifProd);
        this.setPrecioProd(PrecioProd);

    }

    public int getClaveProd() {
        return ClaveProd;
    }

    public void setClaveProd(int claveProd) {
        ClaveProd = claveProd;
    }

    public int getCantExistProd() {
        return CantExistProd;
    }

    public void setCantExistProd(int cantExistProd) {
        CantExistProd = cantExistProd;
    }

    public int getMinProd() {
        return MinProd;
    }

    public void setMinProd(int minProd) {
        MinProd = minProd;
    }

    public int getMaxProd() {
        return MaxProd;
    }

    public void setMaxProd(int maxProd) {
        MaxProd = maxProd;
    }

    public String getDescProd() {
        return DescProd;
    }

    public void setDescProd(String descProd) {
        DescProd = descProd;
    }

    public String getClasifProd() {
        return ClasifProd;
    }

    public void setClasifProd(String clasifProd) {
        ClasifProd = clasifProd;
    }

    public double getPrecioProd() {
        return PrecioProd;
    }

    public void setPrecioProd(double precioProd) {
        PrecioProd = precioProd;
    }

}


//Get's y Set's

