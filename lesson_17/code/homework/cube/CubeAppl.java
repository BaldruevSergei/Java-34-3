package homework.cube;

import homework.cube.model.Cube;

public class CubeAppl {
    public static void main(String[] args) {
        Cube cub1 = new Cube(6);
        Cube cub2= new Cube(8);
        Cube cube3= new Cube(100);

        cub1.Display();
        cub1.Number();
        cub1.Perimetr(cub1.number);
        cub1.Square(cub1.number);
        cub1.Volume(cub1.number);
        cub1.line();

        cub2.Display();
        cub2.Number();
        cub2.Perimetr(cub2.number);
        cub2.Square(cub2.number);
        cub2.Volume(cub2.number);
        cub2.line();

        cube3.Display();
        cube3.Number();
        cube3.Perimetr(cube3.number);
        cube3.Square(cube3.number);
        cube3.Volume(cube3.number);

    }
}
