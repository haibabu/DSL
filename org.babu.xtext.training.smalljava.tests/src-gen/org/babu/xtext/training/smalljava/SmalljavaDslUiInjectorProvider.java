/*
* generated by Xtext
*/
package org.babu.xtext.training.smalljava;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SmalljavaDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.babu.xtext.training.smalljava.ui.internal.SmalljavaDslActivator.getInstance().getInjector("org.babu.xtext.training.smalljava.SmalljavaDsl");
	}
	
}
