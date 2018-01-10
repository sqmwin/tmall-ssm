
package comparator;


import java.util.Comparator;

import com.sqm.tmall.pojo.Product;

/**
 *<p>
 *
 *@author   sqm
 *@version  1.0
 */
public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return (int) (p1.getPromotePrice()-p2.getPromotePrice());
	}

}