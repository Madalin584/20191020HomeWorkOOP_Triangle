public class Main {
    public static void main(String[] args) {
        //Se creeaza o noua referinta a clasei Triangle, tr1 care instantiaza
        //un obiect de tip Triangle cu parametrii X
        //apelare constructor initializat
        Triangle triangle1=new Triangle(3,4,2,2);

        //Obiectul tr1 apeleaza metoda getPerimeter pentru calculul perimetrului
        System.out.println("Perimetrul obiectului triangle1 ce apeleaza metoda getPerimeter(): "+ triangle1.getPerimeter());

        //Obiectul tr1 apeleaza metoda getArea pentru calculul ariei
        System.out.println("Aria obiectului triangle1 ce apeleaza metoda getArea(): "+ triangle1.getArea());

        //Afiseaza inaltimea triunghiului
        triangle1.getTriangleHeight();
        //Afiseaza constanta clasei
        triangle1.getTriangleSidesCONSTANT();
        //Afiseaza valorile tuturor laturilor
        triangle1.getTriangleSides();


        Triangle triangle2=new Triangle();
        System.out.println("Calcului ariei triunghiului cu ajutorul metodei getArea() cu parametrii: "+triangle2.getArea(2,3));
        System.out.println("Calcului perimetrului triunghiului cu ajutorul metodei getPerimeter() cu parametrii: "+triangle2.getPerimeter(10,5,6));

        //Aceleasi metode de mai sus se aplica pentru obiectul triangle2
        triangle2.getTriangleSides();//va genera 0, nu au initializate
        triangle2.getTriangleSidesCONSTANT();
        triangle2.getTriangleHeight();
    }
}
