package com.koreait.fashionshop.model.domain;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class Product {
	private int product_id;
	private SubCategory subCategory;
	private String product_name;
	private int price;
	private String brand;
	private String detail;
	private String filename; //currentTimeMills로 할것임
	
	
	//이미지 하나를 자동으로 처리하는 객체 선언 
	//단, 이름을 html의 업로드 컴포넌트 파라미터명과 일치시켜야 자동으로 업로드 처리..
	private MultipartFile repImg;	//대표이미지 
	private MultipartFile[] addImg; //추가 이미지는 선택사항이며, 동시에 배열
	
    //조인할 대 써먹을거야
	private Score score;
	private List<Psize>psizeList;
	private List<Color>colorList;
	private List<Image>imageList;
	
	//insert할때 써먹었음..
	private Color[] color;//색상값들
	private Psize[] psize;//사이즈
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public SubCategory getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public MultipartFile getRepImg() {
		return repImg;
	}
	public void setRepImg(MultipartFile repImg) {
		this.repImg = repImg;
	}
	public MultipartFile[] getAddImg() {
		return addImg;
	}
	public void setAddImg(MultipartFile[] addImg) {
		this.addImg = addImg;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	public List<Psize> getPsizeList() {
		return psizeList;
	}
	public void setPsizeList(List<Psize> psizeList) {
		this.psizeList = psizeList;
	}
	public List<Color> getColorList() {
		return colorList;
	}
	public void setColorList(List<Color> colorList) {
		this.colorList = colorList;
	}
	public List<Image> getImageList() {
		return imageList;
	}
	public void setImageList(List<Image> imageList) {
		this.imageList = imageList;
	}
	public Color[] getColor() {
		return color;
	}
	public void setColor(Color[] color) {
		this.color = color;
	}
	public Psize[] getPsize() {
		return psize;
	}
	public void setPsize(Psize[] psize) {
		this.psize = psize;
	}

	
	
	
}
