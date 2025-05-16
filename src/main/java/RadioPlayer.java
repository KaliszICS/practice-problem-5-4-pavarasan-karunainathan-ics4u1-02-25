class RadioPlayer implements Player{
    private boolean onOff;
    private double[] stationList;
    private double station;
    private int volume;
    private int currentIndex;
    
    public RadioPlayer(double[] stationList){
	this.stationList = stationList;
	this.volume = 0;
	this.onOff = false;
	this.station = 0;
	this.currentIndex = 0;
    }

    public void start(){
	this.onOff = true;
	this.station = stationList[0];
	this.currentIndex = 0;
    }

    public void stop(){
	this.onOff = false;
	this.station = 0;
    }

    public boolean getOnOff(){
	return this.onOff;
    }

    public void volumeUp(){
	this.volume += 2;
    }

    public void volumeDown(){
	this.volume -= 2;
    }

    public int getVolume(){
	return this.volume;
    }

    public void next(){
	this.station = this.stationList[++this.currentIndex];
    }

    public void previous(){
	this.station = this.stationList[--this.currentIndex];
    }

    public double getStation(){
	return this.station;
    }
}
