package cn.kgc.entity;

/**
 * @program: fenye
 * @ClassName Fruh
 * @description:
 * @author: 熊盛涛
 * @create: 2019-12-20 16:22
 * @Version 1.0
 **/

public class Fruh {
        private int fruhid,weight;
        private String type,breed,area,brief;
        private double price;

    public Fruh() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public int getFruhid() {
        return fruhid;
    }

    public void setFruhid(int fruhid) {
        this.fruhid = fruhid;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
