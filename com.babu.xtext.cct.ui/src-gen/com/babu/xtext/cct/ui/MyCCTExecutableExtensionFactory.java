/*
 * generated by Xtext
 */
package com.babu.xtext.cct.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.babu.xtext.cct.ui.internal.MyCCTActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyCCTExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MyCCTActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MyCCTActivator.getInstance().getInjector(MyCCTActivator.COM_BABU_XTEXT_CCT_MYCCT);
	}
	
}
