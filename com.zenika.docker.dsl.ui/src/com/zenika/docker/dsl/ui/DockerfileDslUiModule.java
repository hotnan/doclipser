/*
 * generated by Xtext
 */
package com.zenika.docker.dsl.ui;

import static com.zenika.docker.dsl.ui.XtextSetup.configureXtextToWorkWithFileNames;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Use this class to register components to be used within the IDE.
 */
public class DockerfileDslUiModule extends com.zenika.docker.dsl.ui.AbstractDockerfileDslUiModule {
	public DockerfileDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
		configureXtextToWorkWithFileNames(new InjectorProvider());
	}
}