package com.koreait.fashionshop.model.domain;

public class Score {
	private int score_id;
	private int product_id;
	private int star; //별점은 1~5까지 
	
	public int getScore_id() {
		return score_id;
	}
	public void setScore_id(int score_id) {
		this.score_id = score_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	
	
}
