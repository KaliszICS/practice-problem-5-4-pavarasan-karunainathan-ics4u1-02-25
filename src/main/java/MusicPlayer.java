class MusicPlayer implements Player{
    private boolean onOff;
    private String[] musicList;
    private String currentSong;
    private int volume;
    private int currentIndex;
    
    public MusicPlayer(String[] musicList){
	this.musicList = musicList;
	this.volume = 0;
	this.onOff = false;
	this.currentSong = "";
	this.currentIndex = 0;
    }

    public void start(){
	this.onOff = true;
	this.currentSong = musicList[0];
	this.currentIndex = 0;
    }

    public void stop(){
	this.onOff = false;
	this.currentSong = "";
    }

    public boolean getOnOff(){
	return this.onOff;
    }

    public void volumeUp(){
	this.volume++;
    }

    public void volumeDown(){
	this.volume--;
    }

    public int getVolume(){
	return this.volume;
    }

    public void next(){
	this.currentSong = this.musicList[++this.currentIndex];
    }

    public void previous(){
	this.currentSong = this.musicList[--this.currentIndex];
    }

    public String getCurrentSong(){
	return this.currentSong;
    }
}
