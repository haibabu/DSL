package org.babu.xtext.training.smalljava.validation;

import org.babu.xtext.training.smalljava.smalljavaDsl.Attribute;
import org.babu.xtext.training.smalljava.smalljavaDsl.SmallClass;
import org.babu.xtext.training.smalljava.smalljavaDsl.SmalljavaDslPackage;
import org.eclipse.xtext.validation.Check;

public class SmalljavaDslValidator extends AbstractSmalljavaDslValidator {

	@Check
	public void checkSmallClassNameStartswithCapitalLetter( SmallClass smallClass) {
		String name=smallClass.getName();
		if(Character.isLowerCase(name.charAt(0))){
			warning("Small class  name shoud start with a capital letter",
					SmalljavaDslPackage.Literals.SMALL_CLASS__NAME,IssueCodes.INVALID_CLASS_NAME,smallClass.getName());
		}
		
	}
	
	@Check
	public void checlClassHierarchy( SmallClass smallClass) {
		if(smallClass==smallClass.getSuperClass()){
		
			error(smallClass.getName() + "cannot extend itself", SmalljavaDslPackage.Literals.SMALL_CLASS__NAME);
		}
		
	}
	@Check
	public void checkAttributeNameStartswithLowerCase( Attribute attribute) {
		String name=attribute.getName();
		if(Character.isUpperCase(name.charAt(0))){
			warning("Small class  name shoud start with a lower case letter", SmalljavaDslPackage.Literals.ATTRIBUTE__NAME);
		}
		
	}
	
	
}
