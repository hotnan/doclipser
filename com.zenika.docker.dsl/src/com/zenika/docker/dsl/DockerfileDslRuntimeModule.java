/*
 * generated by Xtext
 */
package com.zenika.docker.dsl;

import org.eclipse.xtext.resource.IResourceServiceProvider;

import com.zenika.docker.dsl.resource.DockerfileResourceServiceProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class DockerfileDslRuntimeModule extends com.zenika.docker.dsl.AbstractDockerfileDslRuntimeModule {

	  public Class<? extends IResourceServiceProvider> bindIResourceServiceProvider() {
	    return DockerfileResourceServiceProvider.class;
	  }
}