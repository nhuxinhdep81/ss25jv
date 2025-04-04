package ex4;

class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("choi file mp4: " + fileName);
    }

    @Override
    public void playVlc(String fileName) {
    }
}