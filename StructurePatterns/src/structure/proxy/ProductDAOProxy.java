package structure.proxy;

import java.util.List;
import java.util.logging.Logger;

public class ProductDAOProxy extends ProductDAO{
	
	private static final Logger LOG = Logger.getLogger(ProductDAOProxy.class.getName());
	private static final Integer SLOW = 5000;
	private ProductDAO dao;
	
	public ProductDAOProxy(ProductDAO dao) {
		super(dao.findAll());
		this.dao = dao;
	}
	
	@Override
	public List<Product> findAll() {
		long start = System.currentTimeMillis();
		LOG.info("Starting method ProductDAO.findAll");
		var ret =  this.dao.findAll();
		LOG.info("Finished method ProductDAO.findAll");
		logSlowQuery(start);
		return ret;
	}
	
	@Override
	public Product find(Integer id) {
		long start = System.currentTimeMillis();
		LOG.info("Starting method ProductDAO.find");
		var ret = super.find(id);
		LOG.info("Finished method ProductDAO.find");
		logSlowQuery(start);
		return ret;
	}
	
	@Override
	public void save(Product product) {
		long start = System.currentTimeMillis();
		LOG.info("Starting method ProductDAO.save");
		super.save(product);
		LOG.info("Finished method ProductDAO.save");
		logSlowQuery(start);
	}
	
	@Override
	public void delete(Product product) {
		long start = System.currentTimeMillis();
		LOG.info("Starting method ProductDAO.delete");
		super.delete(product);
		LOG.info("Finished method ProductDAO.delete");
		logSlowQuery(start);
	}
	
	private void logSlowQuery(long start) {
		long timelapse = System.currentTimeMillis() - start;
		StackTraceElement frame = Thread.getAllStackTraces().get(Thread.currentThread())[3];
		if(timelapse >= SLOW)LOG.warning("Method ProductDAO."+ frame.getMethodName() + " took too much time to finish. Timelapse: " + timelapse);
	}

}
