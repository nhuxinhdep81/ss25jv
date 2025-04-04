package ex4;

class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("choi vlc file: " + fileName);
    }
}
