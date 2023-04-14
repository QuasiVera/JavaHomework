package Homework6;

public class Notebook {
    private int ram; 
    private int hdd;
    private String os;
    private String color;
    
    public Notebook(int ram, int hdd, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }
    
    public int getRam() {
        return ram;
    }
    
    public int getHdd() {
        return hdd;
    }
    
    public String getOs() {
        return os;
    }
    
    public String getColor() {
        return color;
    }
    
     @Override
    public String toString() {
        return "Notebook{" +
                "RAM =" + ram +
                " HDD =" + hdd  +
                ", OS ='" + os + '\'' +
                ", color ='" + color + '\'' +
                '}';
    }
    
     @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Notebook)){
            return false;
        }
        Notebook notebook = (Notebook) obj;
        return ram == notebook.ram && hdd == notebook.hdd && os.equals(notebook.os) && color.equals(notebook.color);
    }

    @Override
    public int hashCode() {
        return ram + 7*hdd + 17* os.hashCode() + 13*color.hashCode();
    }

}
