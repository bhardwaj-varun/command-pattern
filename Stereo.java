
public class Stereo {
    String location;
    
    public Stereo(String location){
        this.location = location;
    }

    public void on(){
        System.out.println(location + "stereo is on");
    }

    public void off(){
        System.out.println(location + "stereo is off");
    }

    public void setCD(){
        System.out.println(location + "stereo is set for CD input");
    }

    public void setDVD(){
        System.out.print(location + " stereo is set for DVD input");
    }

    public void setRadio(){
        System.out.println(location + "stereo is set for Radio");
    }

    public void setVolume(int volume){
        //code to set the volume
        //valid range: 1-11
        System.out.println(location + "Stereo voulume set to "+ volume);
    }
}
