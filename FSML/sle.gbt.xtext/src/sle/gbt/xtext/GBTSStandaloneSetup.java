/*
* generated by Xtext
*/
package sle.gbt.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GBTSStandaloneSetup extends GBTSStandaloneSetupGenerated{

	public static void doSetup() {
		new GBTSStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

