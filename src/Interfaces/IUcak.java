package Interfaces;

import java.util.Date;

public interface IUcak {
    public String getModel();
    public void setModel(String model);
    public String getSeriNo();
    public void setSeriNo(String seriNo);
    public Date getBakimTarihi();
    public void setBakimTarihi(Date bakimTarihi);
    public int getKoltukKapasitesi();
    public void setKoltukKapasitesi(int koltukKapasitesi);
}