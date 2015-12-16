package com.areguig.package1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.areguig.package2.Component1;

@Service
public class Service1 {

	@Autowired
	private Component1 component1;
}
