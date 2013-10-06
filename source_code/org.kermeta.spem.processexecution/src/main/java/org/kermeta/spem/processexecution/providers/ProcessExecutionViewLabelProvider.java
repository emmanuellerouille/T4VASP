package org.kermeta.spem.processexecution.providers;


import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.kermeta.spem.processexecution.model.SPEMDeliveryProcess;
import org.kermeta.spem.processexecution.model.SPEMTaskUse;


public class ProcessExecutionViewLabelProvider implements ILabelProvider {

	@Override
	public Image getImage(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText(Object element) {
		if(element instanceof SPEMTaskUse){
			return ((SPEMTaskUse)element).getName();
		}
		if(element instanceof SPEMDeliveryProcess){
			return ((SPEMDeliveryProcess)element).getName();
		}
		return element == null ? "" : element.toString();
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

}
