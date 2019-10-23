public class Triangle {
    //States of the object

    //constanta particulara a triunghiului
    //ramane cu aceeasi valoare pe toata durata de viata a clasei
    public static final int SIDES = 3;
    //latura AB a triunghiului de tip integer
    public int sideAB;
    //latura BC a triunghiului de tip integer
    public int sideBC;
    //latura CA a triunghiului de tip integer
    public int sideCA;
    //inaltimea triunghiului de tip integer necesara pentru a calcula Aria
    public int triangleHeight;

    //Constructor implicit
    public Triangle() {

    }

    //Constructor folosit pentru a initializa variabilele declarate la inceputul clasei
    public Triangle(int sideAB, int sideBC, int sideCA, int triangleHeight) {
        this.sideAB = sideAB;
        this.sideBC = sideBC;
        this.sideCA = sideCA;
        this.triangleHeight = triangleHeight;
    }

    //Constructor utilizat pentru initializarea tuturor variabilelor, in afara de inaltime
    public Triangle(int sideAB, int sideBC, int sideCA) {
        this.sideAB = sideAB;
        this.sideBC = sideBC;
        this.sideCA = sideCA;
    }

    //Behaviors of the object
    // calcul perimetru triunghi, se aduna toate laturile
    //returneaza un rezultat de tip double
    public int getPerimeter() {
        int perimeter = sideAB + sideBC + sideCA;
        return perimeter;
    }

    //calculeaza perimetul triunghiului cu ajutorul parametrilor introdusi
    //returneaza un rezultat de tip int
    public int getPerimeter(int sideAB, int sideBC, int sideCA) {
        int perimeter = sideAB + sideBC + sideCA;
        return perimeter;
    }

    //calcul arie triunghi
    // A=((baza*h)/2)
    //consider baza triunghiului latura BC
    //metoda va returna un rezultat de tip double
    public int getArea() {
        int area = ((sideBC * triangleHeight) / 2);
        return area;
    }

    //aceeasi metoda va primi 2 parametrii de tip int
    //primul parametru este baza triunghiului
    //al doilea parametru este inaltimea
    public int getArea(int sideBC, int triangleHeight) {
        int area = ((sideBC * triangleHeight) / 2);
        return area;
    }

    //metoda de tip void
    //afiseaza valorea fiecarei laturi
    public void getTriangleSides(){
        System.out.println("Laturile triunghiului: AB="+sideAB+" BC="+sideBC+" CA="+sideCA);
    }

    //afiseaza intaltimea triunghiului.
    //in cazul in care nu a fost initializata afiseaza mesaj
    public void getTriangleHeight(){
        if (triangleHeight == 0) {
            System.out.println("Triangle height was not defined");
        }else {
            System.out.println("Triangle Height: h=" + triangleHeight);
        }
     }

     //afiseaza constanta initializata la inceputul clasei
    public void getTriangleSidesCONSTANT(){
        System.out.println("Triangle Sides: "+SIDES);
    }

}
