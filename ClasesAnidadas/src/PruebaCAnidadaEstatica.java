public class PruebaCAnidadaEstatica {
   public static void main(String [] args) {
      CExterna a = new CExterna();
      System.out.println("Inicio principal: " + a.daN());
      a.metododeExterna();
      a.incN();
      System.out.println("Fin del principal: " + a.daN());
   }                  // Fin metodo main
}