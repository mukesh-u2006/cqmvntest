package com.adobe.cq.impl;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

import com.adobe.cq.KeyService;

@Component
@Service
public class KeyServiceImpl implements KeyService {

	private String key = null;

	public void setKey(String val) {
		this.key = val;
	}

	public String getKey() {
		//String strI = Integer.toString(key);
		return key+" Upadhyay";
	}

}
