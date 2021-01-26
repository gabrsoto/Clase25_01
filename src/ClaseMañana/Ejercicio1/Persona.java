package ClaseMañana.Ejercicio1;

public class Persona implements Precedable<Persona> {
    private String name;
    private int document;

    public String GetName() {
        return name;
    }
    public void SetName(String name) {
        this.name = name;
    }

    public int GetDocument() {
        return document;
    }
    public void SetDocument(int document) {
        this.document = document;
    }

    @Override
    public int PrecedeA(Persona persona) {
        return this.GetDocument() - persona.GetDocument();
    }

    public Persona(){}

    public Persona(String name, int document){
        SetName(name);
        SetDocument(document);
    }

    @Override
    public String toString(){
        return Integer.toString(this.GetDocument());
    }
}
