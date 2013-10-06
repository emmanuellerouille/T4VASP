package org.kermeta.spem.parameterreader.dialogs;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.kermeta.spem.parameterreader.Parameter;

public class ParameterDialog extends Dialog{

	private ArrayList<Parameter> parameters;

	public ParameterDialog(Shell parentShell, ArrayList<Parameter> parameters) {
		super(parentShell);
		this.parameters = parameters;
	}

	protected Control createDialogArea(Composite parent) {

		Composite container = (Composite) super.createDialogArea(parent);
		for(final Parameter p : parameters){
			Label parameterName = new Label(container, SWT.NONE);
			parameterName.setText(p.getName()+":");
			Text parameterValue = null;
			if(p.getIsConfidential()){
				parameterValue = new Text(container, SWT.NONE | SWT.PASSWORD);
			}else{
				parameterValue = new Text(container, SWT.NONE);
			}

			final GridData gridData = new GridData();
			gridData.widthHint = 225;
			gridData.heightHint = 15;
			parameterValue.setLayoutData(gridData);
			
			parameterValue.addModifyListener(new ModifyListener(){

				@Override
				public void modifyText(ModifyEvent e) {
					Text text = (Text) e.widget;
					p.setValue(text.getText());			
				}

			});
		}
		return container;
	}

	public ArrayList<Parameter> getParameters(){
		return parameters;
	}

}
