package AllSaintsBOT.saints;

import AllSaintsBOT.AllSaintsBOT;

import java.time.MonthDay;

public class Saint {
    private String name;
    private String description;
    private String imgAdress;
    private MonthDay date;
    boolean female;

    public Saint(String name, String description, String imgAdress, MonthDay date, boolean female) {
        this.name = name;
        this.description = description;
        this.imgAdress = imgAdress;
        this.date = date;
        this.female = female;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgAdress() {
        return imgAdress;
    }

    public void setImgAdress(String imgAdress) {
        this.imgAdress = imgAdress;
    }

    public MonthDay getDate() {
        return date;
    }

    public void setDate(MonthDay date) {
        this.date = date;
    }

    public boolean isFemale() {
        return female;
    }

}
