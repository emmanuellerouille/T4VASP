/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.spem.executioncontext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.kermeta.spem.executioncontext.ExecutioncontextPackage#getState()
 * @model
 * @generated
 */
public enum State implements Enumerator {
	/**
	 * The '<em><b>Not started</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_STARTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_STARTED(0, "not_started", "not_started"),

	/**
	 * The '<em><b>On start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_START_VALUE
	 * @generated
	 * @ordered
	 */
	ON_START(1, "on_start", "on_start"),

	/**
	 * The '<em><b>End initialization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_INITIALIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	END_INITIALIZATION(2, "end_initialization", "end_initialization"), /**
	 * The '<em><b>On do</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_DO_VALUE
	 * @generated
	 * @ordered
	 */
	ON_DO(3, "on_do", "on_do"),

	/**
	 * The '<em><b>Done</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DONE_VALUE
	 * @generated
	 * @ordered
	 */
	DONE(4, "done", "done"),

	/**
	 * The '<em><b>On end</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_END_VALUE
	 * @generated
	 * @ordered
	 */
	ON_END(5, "on_end", "on_end"),

	/**
	 * The '<em><b>End finalization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_FINALIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	END_FINALIZATION(6, "end_finalization", "end_finalization"), /**
	 * The '<em><b>Finished</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISHED_VALUE
	 * @generated
	 * @ordered
	 */
	FINISHED(7, "finished", "finished");

	/**
	 * The '<em><b>Not started</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not started</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_STARTED
	 * @model name="not_started"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_STARTED_VALUE = 0;

	/**
	 * The '<em><b>On start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_START
	 * @model name="on_start"
	 * @generated
	 * @ordered
	 */
	public static final int ON_START_VALUE = 1;

	/**
	 * The '<em><b>End initialization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>End initialization</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #END_INITIALIZATION
	 * @model name="end_initialization"
	 * @generated
	 * @ordered
	 */
	public static final int END_INITIALIZATION_VALUE = 2;

	/**
	 * The '<em><b>On do</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On do</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_DO
	 * @model name="on_do"
	 * @generated
	 * @ordered
	 */
	public static final int ON_DO_VALUE = 3;

	/**
	 * The '<em><b>Done</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Done</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DONE
	 * @model name="done"
	 * @generated
	 * @ordered
	 */
	public static final int DONE_VALUE = 4;

	/**
	 * The '<em><b>On end</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On end</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_END
	 * @model name="on_end"
	 * @generated
	 * @ordered
	 */
	public static final int ON_END_VALUE = 5;

	/**
	 * The '<em><b>End finalization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>End finalization</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #END_FINALIZATION
	 * @model name="end_finalization"
	 * @generated
	 * @ordered
	 */
	public static final int END_FINALIZATION_VALUE = 6;

	/**
	 * The '<em><b>Finished</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Finished</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINISHED
	 * @model name="finished"
	 * @generated
	 * @ordered
	 */
	public static final int FINISHED_VALUE = 7;

	/**
	 * An array of all the '<em><b>State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final State[] VALUES_ARRAY =
		new State[] {
			NOT_STARTED,
			ON_START,
			END_INITIALIZATION,
			ON_DO,
			DONE,
			ON_END,
			END_FINALIZATION,
			FINISHED,
		};

	/**
	 * A public read-only list of all the '<em><b>State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<State> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static State get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			State result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static State getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			State result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static State get(int value) {
		switch (value) {
			case NOT_STARTED_VALUE: return NOT_STARTED;
			case ON_START_VALUE: return ON_START;
			case END_INITIALIZATION_VALUE: return END_INITIALIZATION;
			case ON_DO_VALUE: return ON_DO;
			case DONE_VALUE: return DONE;
			case ON_END_VALUE: return ON_END;
			case END_FINALIZATION_VALUE: return END_FINALIZATION;
			case FINISHED_VALUE: return FINISHED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private State(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //State
