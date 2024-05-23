import java.util.ArrayList;
import java.util.List;

class ProductService{

    List<Product> Products = new ArrayList<>();

    public void addProduct(Product p)
    {
        Products.add(p);
    }

    public List<Product> getAllProducts()
    {
        return Products;
    }

    public Product getProductByName(String name)
    {
        for(Product p:Products)
        {
            if(p.getName().equalsIgnoreCase(name))
            {
                return p;
            }
        }

        return null;
    }

    public Product getProductByType(String type)
    {
        for(Product p:Products)
        {
            if(p.getType().equalsIgnoreCase(type))
            {
                return p;
            }
        }

        return null;
    }

    public Product getProductByPlace(String place)
    {
        for(Product p:Products)
        {
            if(p.getPlace().equalsIgnoreCase(place))
            {
                return p;
            }
        }

        return null;
    }

    public Product getProductByWarranty(int year)
    {
        for(Product p:Products)
        {
            if(p.getWarranty()==year)
            {
                return p;
            }
        }

        return null;
    }

    public List<Product> getProductByText(String text)
    {
        List<Product> desired = new ArrayList<>();

        for(Product p:Products)
        {
            if(p.getName().toLowerCase().contains(text.toLowerCase()) || p.getType().toLowerCase().contains(text.toLowerCase()) || p.getPlace().toLowerCase().contains(text.toLowerCase()))
            {
                desired.add(p);
            }
        }

        return desired;
    }

    public boolean checkIfExpired(Product p)
    {
        if(p.getWarranty()<2024)
            return true;
        else;
            return false;
    }
}