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
	private String filename; //currentTimeMills�� �Ұ���
	
	
	//�̹��� �ϳ��� �ڵ����� ó���ϴ� ��ü ���� 
	//��, �̸��� html�� ���ε� ������Ʈ �Ķ���͸�� ��ġ���Ѿ� �ڵ����� ���ε� ó��..
	private MultipartFile repImg;	//��ǥ�̹��� 
	private MultipartFile[] addImg; //�߰� �̹����� ���û����̸�, ���ÿ� �迭
	
    //������ �� ������ž�
	private Score score;
	private List<Psize>psizeList;
	private List<Color>colorList;
	private List<Image>imageList;
	
	//insert�Ҷ� ��Ծ���..
	private Color[] color;//���󰪵�
	private Psize[] psize;//������
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
