package ClaseMañana.Ejercicio1;

public class Celular implements Precedable<Celular>{

    private int number;
    private String user;

    public int GetNumber() {
        return number;
    }
    public void SetNumber(int number) {
        this.number = number;
    }

    public String GetUser() {
        return user;
    }
    public void SetUser(String user) {
        this.user = user;
    }

    public Celular(){}

    public Celular(int numero, String user){
        SetNumber(numero);
        SetUser(user);
    }

    @Override
    public int PrecedeA(Celular celular) {
        return this.GetNumber() - celular.GetNumber();
    }

    @Override
    public String toString(){
        return this.GetUser() + " - " + this.GetNumber();
    }
}
