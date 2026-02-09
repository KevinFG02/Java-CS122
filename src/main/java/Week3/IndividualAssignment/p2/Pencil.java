package Week3.IndividualAssignment.p2;

public class Pencil {
    private boolean mechanical;
    private String brand;
    private boolean eraser;

    public Pencil(){this(true, "Bic", true);}

    public Pencil(String brand){
        this(true, brand, true);
    }

    public Pencil(boolean mechanical, boolean eraser){
        this(mechanical, "Bic", eraser);
    }

    public Pencil(boolean mechanical, String brand, boolean eraser) {
        this.mechanical = mechanical;
        this.brand = brand;
        this.eraser = eraser;
    }

    private boolean isMechanical(){
        return this.mechanical;
    }

    private void setMechanical(boolean mech){
        this.mechanical = mech;
    }

    private String getBrand(){
        return this.brand;
    }

    private void setBrand(String brand){
        this.brand = brand;
    }

    private boolean isEraser(){
        return this.eraser;
    }

    private void setEraser(boolean eraser){
        this.eraser = eraser;
    }

    @Override
    public String toString(){
        String mechPencil;
        String eraserPencil;

        if(mechanical == true){
            mechPencil = "Mechanical ";
        } else {
            mechPencil = "";
        }

        if(eraser == true){
            eraserPencil = " with eraser.";
        } else {
            eraserPencil = " without eraser.";
        }

        return mechPencil + brand + " Pencil" + eraserPencil;
    }
}
