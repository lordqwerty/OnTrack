package bjoernercomplete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import bjoernercomplete.diagram.providers.BjoernerCompleteElementTypes;

/**
 * @generated
 */
public class SignalPlacedAtItemSemanticEditPolicy extends
		BjoernerCompleteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SignalPlacedAtItemSemanticEditPolicy() {
		super(BjoernerCompleteElementTypes.SignalPlacedAt_4007);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
