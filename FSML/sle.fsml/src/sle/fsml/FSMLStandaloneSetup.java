/*
* generated by Xtext
*/
package sle.fsml;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FSMLStandaloneSetup extends FSMLStandaloneSetupGenerated{

	public static void doSetup() {
		new FSMLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

