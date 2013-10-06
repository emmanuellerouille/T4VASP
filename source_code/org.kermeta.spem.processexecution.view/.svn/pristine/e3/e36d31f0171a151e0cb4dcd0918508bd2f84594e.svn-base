package org.kermeta.spem.processexecution.view.dialogs;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.kermeta.spem.activity.Edge;

public class DecisionNodeDialog extends Dialog {

	private String question;
	private ArrayList<Edge> answers;
	private Edge answer;

	public DecisionNodeDialog(Shell parentShell, String question, ArrayList<Edge> answers) {
		super(parentShell);
		this.question = question;
		this.answers = answers;
		answer = null;
	}

	protected Control createDialogArea(Composite parent) {

		Composite container = (Composite) super.createDialogArea(parent);
		final GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		container.setLayout(gridLayout);

		Label filterLabel = new Label(container, SWT.NONE);
		filterLabel.setLayoutData(new GridData(GridData.BEGINNING, GridData.CENTER, false, false));
		filterLabel.setText(question);

		for(final Edge a : answers){
			final Button button = new Button(container, SWT.RADIO);
			button.setText(a.getGuard());
			button.addSelectionListener(new SelectionAdapter(){
				public void widgetSelected(SelectionEvent e) {
					answer = a;
				}
			});
		}
		return container;
	}

	public Edge getAnswer(){
		return answer;
	}

}
