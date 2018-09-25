import java.util.ArrayList;

public class Panier 
{
    private ArrayList<Orange> liste;
    private int tailleMax;
    
    public Panier(ArrayList<Orange> l, int  tailleM)
    {
        if(tailleM <= this.tailleMax)
        {
            ArrayList liste = new ArrayList<Orange>();
            for (Orange o : l) 
            {
                liste.add(l);
            }
        }
    }
    
    public boolean estPlein()
    {
        if(this.liste.size() == this.tailleMax)
        {
            return true;
        }
        else
            return false;
    }
    
    public boolean estVide()
    {
        if(this.liste.size() == 0)
        {
            return true;
        }
        else
            return false;
    }
    
    public String toString()
    {
        for (Orange o : this.liste) 
        {
            System.out.println("Prix : " + o.getPrix() + " Pays d'origine : " + o.getOrigine());
        }
        return "";
    }
    
    public boolean equals(Panier p)
    {
        return (this.liste.size() == p.liste.size());
    }
    
    public void ajoute(Orange o)
    {
        this.liste.add(o);
    }
    
    public void retire()
    {
        int taille = this.liste.size();
        this.liste.remove(taille-1);
    }
    
    public double getPrix()
    {
        double prix = 0;
        for (Orange o : this.liste) 
        {
            prix = prix + o.getPrix();
        }
        return prix;
    }
}
