package pooUD4CasoPractico5;

public class Programa {
    public static void main(String[] args) {
        PuestoTrabajo puesto1 = new PuestoTrabajo("P1", "Consultor", 2000);
        PuestoTrabajo puesto2 = new PuestoTrabajo("P2", "Administrativo", 1500);
        Consultor consultor = new Consultor("12345678A", "Juan", "Perez", "Calle Mayor 1", "28080", "Madrid", puesto1, "Senior");
        Administrativo administrativo = new Administrativo("87654321B", "Maria", "Lopez", "Calle Menor 2", "28081", "Madrid", puesto2, "5 años");
        System.out.println(consultor.toString());
        System.out.println(administrativo.toString());
        consultor.getAtributos();
        administrativo.getAtributos();
    }
}
