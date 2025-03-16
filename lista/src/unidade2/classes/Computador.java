package unidade2.classes;

public class Computador extends Equipamento {
    private boolean placaDeVideo;
    private boolean ssd;

    public Computador(String nome, double preco, boolean placaDeVideo, boolean ssd) {
        super(nome, preco);
        this.placaDeVideo = placaDeVideo;
        this.ssd = ssd;
    }

    public boolean isPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(boolean placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "Placa de vídeo: " + (placaDeVideo ? "Sim" : "Não") + "\n";
        s += "SSD: " + (ssd ? "Sim" : "Não") + "\n";
        return s;
    }

    
}
