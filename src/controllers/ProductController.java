package controllers;

import java.util.List;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import entities.Product;
import models.ProductModel;

@ManagedBean(name="ProductController")
@SessionScoped
public class ProductController {
 
	private ProductModel productModel = new ProductModel();
	private String err;
	
	public List<Product> findAll(){
		return productModel.findAll();
	}
	
	
	public String delete(){
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		
		try {
			if(request.getParameterValues("prodname") != null ) {
				for(String prodname : request.getParameterValues("prodname")) {
					productModel.delete(productModel.find(Integer.parseInt(prodname)));					
				}
				return "index?faces-redirect=true";
			}
				
		} catch (Exception e) {
			this.err = e.getMessage();
		}
		return null;
		
		
		
	}
	
	
	public void changeLang(String lang) {
		FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(lang));
	}
	
	
}
