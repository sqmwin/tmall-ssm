
package comparator;


import java.util.Comparator;

import com.sqm.tmall.pojo.Product;
/**
 *<p>
 *
 *@author   sqm
 *@version  1.0
 */
public class ProductSaleCountComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p2.getSaleCount()-p1.getSaleCount();
	}

}