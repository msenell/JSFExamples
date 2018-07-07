package net.mustafasenel;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "odemeController")
@RequestScoped
public class OdemeController implements Serializable
{
    private static final long serialVersionUID = 1L;
    public boolean siparisOnayi = true;
    public int siparisToplam = 50;
    
    public OdemeController() 
    {
        
    }
    
    public boolean isSiparisOnayi()
    {
        return siparisOnayi;
    }

    public void setSiparisOnayi(boolean siparisOnayi) {
        this.siparisOnayi = siparisOnayi;
    }

    public int getSiparisToplam() {
        return siparisToplam;
    }

    public void setSiparisToplam(int siparisToplam) {
        this.siparisToplam = siparisToplam;
    }
    
    public String goToOdeme()
    {
        return "odeme";
    }
    
    public String goToSiparis()
    {
        return "siparis";
    }
    
    public String goToUrunler()
    {
        return "urunler";
    }
    
    public String goToUyeOl()
    {
        return "uyeol";
    }
    
}
