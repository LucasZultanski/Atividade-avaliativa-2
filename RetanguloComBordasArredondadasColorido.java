public class RetanguloComBordasArredondadasColorido {
    void desenhar(int largura, int altura, String texto, String corTexto, String corFundo) {
        if (texto.length() > largura - 2) {
            texto = texto.substring(0, largura - 3) + "...";
        }
        System.out.print(corFundo + corTexto);
        System.out.println("╭" + "-".repeat(largura - 2) + "╮\u001B[0m");
        for (int i = 0; i < altura; i++) {
            if (i == altura / 2) {
                System.out.print(corFundo + corTexto);
                System.out.print("│" + " ".repeat((largura - texto.length() - 2) / 2) + texto + " ".repeat((largura - texto.length() - 1) / 2) + "│\u001B[0m\n");
            } else {
                System.out.print(corFundo + corTexto);
                System.out.println("│" + " ".repeat(largura - 2) + "│\u001B[0m");
            }
        }
        System.out.print(corFundo + corTexto);
        System.out.println("╰" + "-".repeat(largura - 2) + "╯\u001B[0m");
    }
}

