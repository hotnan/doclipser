/*
* generated by Xtext
*/
package com.zenika.docker.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DockerfileDslStandaloneSetup extends DockerfileDslStandaloneSetupGenerated{

	public static void doSetup() {
		new DockerfileDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
