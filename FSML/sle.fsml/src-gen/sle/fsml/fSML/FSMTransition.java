/**
 */
package sle.fsml.fSML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sle.fsml.fSML.FSMTransition#getInput <em>Input</em>}</li>
 *   <li>{@link sle.fsml.fSML.FSMTransition#getAction <em>Action</em>}</li>
 *   <li>{@link sle.fsml.fSML.FSMTransition#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see sle.fsml.fSML.FSMLPackage#getFSMTransition()
 * @model
 * @generated
 */
public interface FSMTransition extends EObject
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' attribute.
   * @see #setInput(String)
   * @see sle.fsml.fSML.FSMLPackage#getFSMTransition_Input()
   * @model
   * @generated
   */
  String getInput();

  /**
   * Sets the value of the '{@link sle.fsml.fSML.FSMTransition#getInput <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' attribute.
   * @see #getInput()
   * @generated
   */
  void setInput(String value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' attribute.
   * @see #setAction(String)
   * @see sle.fsml.fSML.FSMLPackage#getFSMTransition_Action()
   * @model
   * @generated
   */
  String getAction();

  /**
   * Sets the value of the '{@link sle.fsml.fSML.FSMTransition#getAction <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' attribute.
   * @see #getAction()
   * @generated
   */
  void setAction(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(FSMState)
   * @see sle.fsml.fSML.FSMLPackage#getFSMTransition_Target()
   * @model
   * @generated
   */
  FSMState getTarget();

  /**
   * Sets the value of the '{@link sle.fsml.fSML.FSMTransition#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(FSMState value);

} // FSMTransition
