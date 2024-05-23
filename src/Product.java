class Product{
    private String name;
    private String type;
    private String place;
    private int warranty;

    public Product() {
    }

    public Product(String name,String type, String place, int warranty) {
        this.name = name;
        this.type = type;
        this.place = place;
        this.warranty = warranty;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public String getType() {
        return type;
    }

    public int getWarranty() {
        return warranty;
    }

    @Override
    public String toString() {
        return "Product{name="+this.name+", type = "+this.type+", place = "+this.place+", warranty = "+this.warranty+"}";
    }

}