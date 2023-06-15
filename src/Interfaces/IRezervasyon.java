package Interfaces;

import Models.Ucus;

public interface IRezervasyon {
    public IMusteri getMusteri();
    public void setMusteri(IMusteri musteri);
    public Ucus getUcus();
    public void setUcus(Ucus ucus);
    public int getKoltukNo();
    public void setKoltukNo(int koltukNo);
}
