
package Interfaces;

import java.util.Date;

public interface IUcus {
    public int getUcusNo();
    public void setUcusNo(int ucusNo);
    public int getNereden();
    public void setNereden(int nereden);
    public int getNereye();
    public void setNereye(int nereye);
    public double getUcusSuresi();
    public void setUcusSuresi(double ucusSuresi);
    public int getRezerveYolcuSayisi();
    public void setRezerveYolcuSayisi(int rezerveYolcuSayisi);
    public String getUcakSeriNo();
    public void setUcakSeriNo(String ucakSeriNo);
    public Date geIUcusTarihi();
    public void setIUcusTarihi(Date ucusTarihi);
}
