package net.mustafasenel;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import sun.security.util.DerEncoder;

@ManagedBean
@RequestScoped
public class FromActionController implements Serializable
{
    private static final long serialVersionUID = 1L;
    public FromActionController() 
    {
        
    }
    
    public String goToPage1()
    {
        return "success";
    }
    
    public String goToPage2()
    {
        return "success";
    }
    
    public String goToPage3()
    {
        return "positive";
    }
}
