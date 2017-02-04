/**
 */
package com.babu.xtext.cct.myCCT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CCT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.babu.xtext.cct.myCCT.CCT#getFile <em>File</em>}</li>
 *   <li>{@link com.babu.xtext.cct.myCCT.CCT#getLoop <em>Loop</em>}</li>
 *   <li>{@link com.babu.xtext.cct.myCCT.CCT#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.babu.xtext.cct.myCCT.CCT#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.babu.xtext.cct.myCCT.MyCCTPackage#getCCT()
 * @model
 * @generated
 */
public interface CCT extends EObject
{
  /**
   * Returns the value of the '<em><b>File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' containment reference.
   * @see #setFile(File)
   * @see com.babu.xtext.cct.myCCT.MyCCTPackage#getCCT_File()
   * @model containment="true"
   * @generated
   */
  File getFile();

  /**
   * Sets the value of the '{@link com.babu.xtext.cct.myCCT.CCT#getFile <em>File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' containment reference.
   * @see #getFile()
   * @generated
   */
  void setFile(File value);

  /**
   * Returns the value of the '<em><b>Loop</b></em>' containment reference list.
   * The list contents are of type {@link com.babu.xtext.cct.myCCT.Loop}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loop</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop</em>' containment reference list.
   * @see com.babu.xtext.cct.myCCT.MyCCTPackage#getCCT_Loop()
   * @model containment="true"
   * @generated
   */
  EList<Loop> getLoop();

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
   * The list contents are of type {@link com.babu.xtext.cct.myCCT.Condition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference list.
   * @see com.babu.xtext.cct.myCCT.MyCCTPackage#getCCT_Condition()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getCondition();

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link com.babu.xtext.cct.myCCT.Value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see com.babu.xtext.cct.myCCT.MyCCTPackage#getCCT_Value()
   * @model containment="true"
   * @generated
   */
  EList<Value> getValue();

} // CCT
