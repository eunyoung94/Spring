package com.koreait.fashionshop.model.product.repository;

import java.util.List;

import com.koreait.fashionshop.model.domain.SubCategory;

public interface SubCategoryDAO {
	//CRUD
	public List selectAll();//��� ���ڵ� �������� 
	public List selectAllById(int topcategory_id);//������ ���� ī�װ��� �Ҽӵ� ����ī�װ� ��ϰ�������	
	public SubCategory select(int topcategory_id);
	public void insert(SubCategory topcategory);
	public void update(SubCategory topcategory);
	public void delete(int topcategory_id);

}