package com.sunbeaminfo.sh.bookshop.models;

import java.util.List;

public interface ShoppingCart {

	List<Integer> getCart();

	void setCart(List<Integer> cart);

}