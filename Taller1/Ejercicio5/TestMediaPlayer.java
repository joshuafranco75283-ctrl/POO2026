public class TestMediaPlayer {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer(95);
        System.out.println("Initial Volume: " + player.getVolume()); 
        System.out.println("Initial Playback State: " + player.getPlaybackState()); 

        System.out.println("Initializing playback...");
        if (player.play()){
            System.out.println("Playback started.");
        } else {
            System.out.println("Playback is already running.");
        }
        
        System.out.println("Initializing playback again...");
        if (player.play()){
            System.out.println("Playback started.");
        } else {
            System.out.println("Playback is already running.");
        }

        System.out.println("Increasing volume...");
        if (player.increaseVolume()){
            System.out.println("Volume increased +5 to  :" + player.getVolume()+"dB");
        } else{
            System.out.println("Volume is already at maximum.");
        }
        System.out.println("Increasing volume...");
        if (player.increaseVolume()){
            System.out.println("Volume increased +5 to  :" + player.getVolume()+"dB");
        } else{
            System.out.println("Volume is already at maximum.");
        }

        MediaPlayer player2 = new MediaPlayer(5);
        System.out.println("trying to decrease volume below 0...");
        if (player2.decreaseVolume()){
            System.out.println("Volume decreased -5 to  :" + player2.getVolume()+"dB");
        } else{
            System.out.println("Volume is already at minimum.");
        }
        if (player2.decreaseVolume()){
            System.out.println("Volume decreased -5 to  :" + player2.getVolume()+"dB");
        } else{
            System.out.println("Volume is already at minimum.");
        }
        System.out.println("Stopping playback...");
        if(player.stop()){
            System.out.println("Playback stopped.");
        } else {
            System.out.println("Playback is already stopped.");
        }
        System.out.println("Stopping playback...");
        if(player.stop()){
            System.out.println("Playback stopped.");
        } else {
            System.out.println("Playback is already stopped.");
        }
    }
}
