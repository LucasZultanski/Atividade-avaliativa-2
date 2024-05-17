public class Main {
    public static void main(String[] args) {
        RetanguloComBordasArredondadas retangulo1 = new RetanguloComBordasArredondadas();
        retangulo1.desenhar(20, 10, "teste.");

        RetanguloComLinhasDuplas retangulo2 = new RetanguloComLinhasDuplas();
        retangulo2.desenhar(20, 10, "teste.");

        RetanguloComASCIIArt retangulo3 = new RetanguloComASCIIArt();
        retangulo3.desenhar(20, 10, "teste.");

        RetanguloComBordasArredondadasColorido retangulo4 = new RetanguloComBordasArredondadasColorido();
        retangulo4.desenhar(20, 10, "teste.", "\u001B[35m", "\u001B[46m");
        }
    }
