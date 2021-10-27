package lesson_2;

public class Notebook implements Comparable<Notebook>{
    private int price;
    private int ram;
    private Brands brand;


    @Override
    public int compareTo(Notebook notebook) {

        if(this.price == notebook.price){
            if(this.ram == notebook.ram){
                if ( this.brand == notebook.brand ){
                    return 0;
                }else{
                    return this.brand.ordinal() - notebook.brand.ordinal();
                }
            }else{
                return this.ram - notebook.ram;
            }

        }else{
            return this.price - notebook.price;
        }
    }

    public Notebook(){}

    public Notebook(Notebook notebook){
        this.price = notebook.price;
        this.ram = notebook.ram;
        this.brand = notebook.brand;
    }

    public Notebook(int price, int ram, Brands brand){
        this.price = price;
        this.ram = ram;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return
                "{" +
                "price=" + price +
                ", ram=" + ram +
                ", brand='" + brand + '\'' +
                '}'
                ;
    }

}

