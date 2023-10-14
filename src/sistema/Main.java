package sistema;

public class Main {
    public static void main(String[] args) throws Exception {
        Usuario use = new Usuario();

        use.setNomeCompleto("Otaviano");

        System.out.println(use.getNomeCompleto());
    }
}
