package com.koreait.fashionshop.model.payment.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.koreait.fashionshop.model.domain.Cart;
import com.koreait.fashionshop.model.domain.Member;

public interface PaymentService {
	
//��ٱ��� ���� ���� 
	public List selectCartList(); //ȸ�����о��� ��� ������ �������� 
	public List selectCartList(int member_id); //Ư�� ȸ���� ��ٱ��� ���� 
	public Cart selectCart(int cart_id);
	public void insert(Cart cart);
	public void update(List<Cart>cartList);
	public void delete(Cart cart); // ȸ��id�� ���� ������ ������ ����..
	public void delete(Member member); // ȸ��id�� ���� ������ ������ ����..
	
	//��������
}
