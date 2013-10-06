package org.kermeta.spem.processexecution.view;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.kermeta.spem.processexecution.view.actions.ProcessAction;

public class ProcessMediator {

	private static final boolean STRICT = true;

	private ProcessFigure view;

	private IProject project;
	
	private ProcessPart part;

	public ProcessMediator(ProcessPart part) {
		this.part = part;
	}

	public boolean isStrict() {
		return STRICT;
	}

	public void setView(ProcessFigure view) {
		this.view = view;
	}
	
	public ProcessFigure getView(){
		return view;
	}

	/**
	 * Also initializes the action.
	 */
	protected HyperlinkFigure createLinkFigure(String text, ProcessAction action) {
		HyperlinkFigure linkFigure = new HyperlinkFigure(action);
		linkFigure.setText(text);
		return linkFigure;
	}

	public IProject getProject() {
		return project;
	}

	protected void setModelName(TaskFigure figure, URI uri) {
		figure.setName(uri == null ? null : uri.lastSegment());
		figure.setFullName(uri == null ? null : uri.toString());
	}

}
