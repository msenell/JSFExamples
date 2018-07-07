package net.mustafasenel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Page2Controller 
{

    public Page2Controller() 
    {
        
    }
    
    public String goToPage2()
    {
        return "sayfa2";
    }
    
}
