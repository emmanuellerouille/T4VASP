package org.kermeta.spem.processexecution.providers;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.kermeta.spem.processexecution.model.SPEMDeliveryProcess;
import org.kermeta.spem.processexecution.model.Tree;


public class ProcessExecutionViewContentProvider implements
		ITreeContentProvider {

	@Override
	public Object[] getChildren(Object parentElement) {
		
		if (parentElement instanceof Tree) {
			Tree myTree = (Tree) parentElement;
			return myTree.getSpemDeliveryProcess();
		}

		if (parentElement instanceof SPEMDeliveryProcess) {
			SPEMDeliveryProcess spemDeliveryProcess = (SPEMDeliveryProcess) parentElement;
			return spemDeliveryProcess.getTaskUses();
		}
		
		return null;
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return true;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

}
