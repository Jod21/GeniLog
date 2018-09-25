public class Orange 
{
    private double prix;
    private String pays;

    public Orange (double pr, String pa)
    {
        try 
        {
            if(pr > 0)
            {
                this.prix = pr;
            }
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Le prix doit être positif !");
        }
        this.pays = pa;
    }
    
    public double getPrix()
    {
        return this.prix;
    }
    
    public String getOrigine()
    {
        return this.pays;
    }
    
    public boolean equals(Orange o)
    {
        return (this.prix == o.getPrix()) && this.pays.equals(o.getOrigine());
    }    
}

