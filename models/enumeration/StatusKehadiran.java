package models.enumeration;

public enum StatusKehadiran {

    HADIR(1), ALPHA(0);
    private int status;

    StatusKehadiran(int status) {
        this.status = status;
    }

    int getStatus(){
        return this.status;
    }

}