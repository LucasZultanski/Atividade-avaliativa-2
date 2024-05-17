class RetanguloComASCIIArt {
    void desenhar(int largura, int altura, String texto) {
        if (texto.length() > largura - 2) {
            texto = texto.substring(0, largura - 3) + "...";
        }
        System.out.println(".-" + "-".repeat(largura - 2) + "-.");
        for (int i = 0; i < altura; i++) {
            if (i == altura / 2) {
                System.out.println("|" + " ".repeat((largura - texto.length() - 2) / 2) + texto + " ".repeat((largura - texto.length() - 1) / 2) + "|");
            } else {
                System.out.println("|" + " ".repeat(largura - 2) + "|");
            }
        }
        System.out.println("`-" + "-".repeat(largura - 2) + "-'");
    }
}
