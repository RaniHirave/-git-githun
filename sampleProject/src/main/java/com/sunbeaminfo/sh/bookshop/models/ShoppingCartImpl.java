package com.sunbeaminfo.sh.bookshop.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Scope(value="session", proxyMode=ScopedProxyMode.INTERFACES)
@Component
public class ShoppingCartImpl implements ShoppingCart {
	private List<Integer> cart;
	public ShoppingCartImpl() {
		System.out.println("ShoppingCartImpl() called...");
		this.cart = new ArrayList<Integer>();
	}
	public List<Integer> getCart() {
		return cart;
	}
	public void setCart(List<Integer> cart) {
		this.cart = cart;
	}
	@Override
	public String toString() {
		return String.format("ShoppingCart [%s]", cart);
	}
}
