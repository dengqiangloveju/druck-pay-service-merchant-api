package com.druck.pay.facade;

import com.druck.pay.domain.Merchant;

public interface MerchantFacade {
	public void save(Merchant merchant);
	public Merchant findById(String id);
	public Merchant findByKey(String payKey);
}
