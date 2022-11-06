package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;
import java.util.logging.Logger;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        super();
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId()==1){
            System.out.println("kabul edilmiyor"); // is  kodlari burada yazilir
        }
//        HibernateProductDao dao=new HibernateProductDao();
//        dao.add(product); burada bu kodu yazanda hibernate e bagli olmus oluruq.
        this.productDao.add(product);
        this.loggerService.logToSystem("urwn eklendi"+product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
