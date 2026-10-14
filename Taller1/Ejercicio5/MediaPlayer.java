public class MediaPlayer{
    private Integer volume;
    private boolean playbackState;

    private boolean isValidVolume(Integer volume) {
        return volume >= 0 && volume <= 100;
    }

    public MediaPlayer(){
        this.volume = 50;
        this.playbackState = false;
    }

    public MediaPlayer(Integer volume){
        if(isValidVolume(volume)){
            this.volume = volume;
        } else {
            this.volume = 50;
        }
        this.playbackState = false;
    }
    public boolean increaseVolume(){ 
        if (this.volume + 5 <= 100) {
            this.volume = this.volume + 5;
            return true;
        }
        return false;
    }
    public boolean decreaseVolume(){ 
        if (this.volume - 5 >= 0) {
            this.volume = this.volume - 5;
            return true;
        }
        return false;
    }
    public boolean play(){
        if (!playbackState){
            this.playbackState = true;
            return true;
        }
        return false;
    }
    public boolean stop(){
        if (this.playbackState){
            this.playbackState = false;
            return true;
        }
        return false;
    }
    public Integer getVolume(){
        return this.volume;
    }
    public boolean getPlaybackState(){
        return this.playbackState;
    }
}