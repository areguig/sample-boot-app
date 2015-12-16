package com.areguig.package1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.areguig.package2.Component2;

@Service
public class Service2 {

	@Autowired
	private Component2 component2;
}
