/**
 */
package org.babu.xtext.training.smallfunc.smallFuncDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.babu.xtext.training.smallfunc.smallFuncDsl.NameSpace#getName <em>Name</em>}</li>
 *   <li>{@link org.babu.xtext.training.smallfunc.smallFuncDsl.NameSpace#getImports <em>Imports</em>}</li>
 *   <li>{@link org.babu.xtext.training.smallfunc.smallFuncDsl.NameSpace#getSmallFunc <em>Small Func</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.babu.xtext.training.smallfunc.smallFuncDsl.SmallFuncDslPackage#getNameSpace()
 * @model
 * @generated
 */
public interface NameSpace extends EObject
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
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.SmallFuncDslPackage#getNameSpace_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.NameSpace#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.babu.xtext.training.smallfunc.smallFuncDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.SmallFuncDslPackage#getNameSpace_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Small Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Small Func</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Small Func</em>' containment reference.
   * @see #setSmallFunc(SmallFunc)
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.SmallFuncDslPackage#getNameSpace_SmallFunc()
   * @model containment="true"
   * @generated
   */
  SmallFunc getSmallFunc();

  /**
   * Sets the value of the '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.NameSpace#getSmallFunc <em>Small Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Small Func</em>' containment reference.
   * @see #getSmallFunc()
   * @generated
   */
  void setSmallFunc(SmallFunc value);

} // NameSpace
