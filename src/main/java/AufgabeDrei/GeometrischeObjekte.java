package AufgabeDrei;

import java.util.ArrayList;

public class GeometrischeObjekte {
    private final ArrayList<GeometricObject> list;

    public GeometrischeObjekte() {
        list = new ArrayList<>();
    }

    public void add(GeometricObject geometricObject) {
        list.add(geometricObject);
    }

    public int getAnzahl() {
        return list.size();
    }

    public void ausgeben() {
        for (GeometricObject geometricObject : list) {
            if (geometricObject instanceof Kugel) {
                ((Kugel) geometricObject).prettyPrint();
            }
            if (geometricObject instanceof Wuerfel) {
                ((Wuerfel) geometricObject).prettyPrint();
            }
        }
    }
}
