/**
 */
package org.babu.xtext.training.smalljava.smalljavaDsl;

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
 *   <li>{@link org.babu.xtext.training.smalljava.smalljavaDsl.NameSpace#getName <em>Name</em>}</li>
 *   <li>{@link org.babu.xtext.training.smalljava.smalljavaDsl.NameSpace#getImports <em>Imports</em>}</li>
 *   <li>{@link org.babu.xtext.training.smalljava.smalljavaDsl.NameSpace#getSmallClass <em>Small Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmalljavaDslPackage#getNameSpace()
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
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmalljavaDslPackage#getNameSpace_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.NameSpace#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.babu.xtext.training.smalljava.smalljavaDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmalljavaDslPackage#getNameSpace_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Small Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Small Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Small Class</em>' containment reference.
   * @see #setSmallClass(SmallClass)
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmalljavaDslPackage#getNameSpace_SmallClass()
   * @model containment="true"
   * @generated
   */
  SmallClass getSmallClass();

  /**
   * Sets the value of the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.NameSpace#getSmallClass <em>Small Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Small Class</em>' containment reference.
   * @see #getSmallClass()
   * @generated
   */
  void setSmallClass(SmallClass value);

} // NameSpace
