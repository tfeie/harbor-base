package com.the.harbor.base.util;

import java.util.ArrayList;
import java.util.List;

import com.the.harbor.base.enumeration.base.Behaviour;

public final class ValidatorUtil {

	public static boolean validate(String value, Behaviour[] enumValArr) {
		List<String> valueList = new ArrayList<String>();
		for (Behaviour enumVal : enumValArr) {
			valueList.add(enumVal.getValue().toUpperCase());
		}
		if (value == null || "".equals(value.trim())) {
			return false;
		}
		if (!valueList.contains(value.toUpperCase())) {
			return false;
		}
		return true;
	}

}
