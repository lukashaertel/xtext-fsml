/*
* generated by Xtext
*/
package sle.fsml;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class FSMLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return sle.fsml.ui.internal.FSMLActivator.getInstance().getInjector("sle.fsml.FSML");
	}
	
}
