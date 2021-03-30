package com.stackroute.oops;

/*
    Class for Analyzing the products present in ProductRepository
 */
public class ProductService {
     Product products[]=ProductRepository.getProducts();
    /*
        Returns the name of the product given the productCode
     */
    public String findProductNameByCode(int productCode) {
        int check=0,i;
        for(i=0;i<products.length;i++)
        {
            if(products[i].getProductCode()==productCode) {
                check = 1;
                break;
            }
        }
        if (check==1)
            return products[i].getName();
        else
            return null;
    }

    /*
        Returns the Product with maximum price in a given category
     */
    public Product findMaxPriceProductInCategory(String category) {
        int j = 0;
        double max;
        Product p[];
        if (category == null || category =="")
            return null;
        else {
            int size=0;
            for (Product pr:products) {
                if (pr.getCategory() == category) {
                    size++;
                }
            }
            p=new Product[size];
            int check = 0;
            Product temp[] = new Product[1];
            if(size!=0)
            {
                for (Product pr:products) {
                    if (pr.getCategory() == category) {
                        p[j]=new Product(pr.getProductCode(),pr.getName(),pr.getPrice(),pr.getCategory());
                        j++;
                    }
                }
                max = p[0].getPrice();
                for (Product pr:p) {
                    if (pr.getPrice() > max){
                        max = pr.getPrice();
                        temp[0]=pr;
                        check=1;
                    }
                }

            }
            if (check == 1)
                return temp[0];
            else
                return null;
        }
    }
    /*
        Returns a array of products for a given category
     */
    public Product[] getProductsByCategory(String category) {
        Product p[];
        int j=0,temp=0;
        if(category==null || category=="")
            return null;
        else{
            int size=0;
            for (Product pr:products){
                if(pr.getCategory()==category){
                size++;}
            }
            p=new Product[size];
            if(size!=0) {
                for (Product pr : products) {
                    if (pr.getCategory() == category) {
                        temp = 1;
                        p[j] = new Product(pr.getProductCode(), pr.getName(), pr.getPrice(), pr.getCategory());
                        j++;
                    }
                }
            }
          if(temp==1)
             return p;
          else
            return null;
        }
    }

}
