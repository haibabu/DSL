/**
 */
package com.babu.xtext.cct.myCCT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.babu.xtext.cct.myCCT.Loop#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.babu.xtext.cct.myCCT.MyCCTPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.babu.xtext.cct.myCCT.MyCCTPackage#getLoop_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.babu.xtext.cct.myCCT.Loop#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Loop
