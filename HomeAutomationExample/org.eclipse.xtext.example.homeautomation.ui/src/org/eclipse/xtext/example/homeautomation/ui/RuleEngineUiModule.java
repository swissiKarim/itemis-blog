/*******************************************************************************
 * Copyright (c) 2015, 2019 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.example.homeautomation.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.example.homeautomation.ui.editor.RuleEngineEditorEx;
import org.eclipse.xtext.ui.editor.XtextEditor;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
public class RuleEngineUiModule extends AbstractRuleEngineUiModule {

	public RuleEngineUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends XtextEditor> bindXtextEditor() {
		return RuleEngineEditorEx.class;
	}
}
