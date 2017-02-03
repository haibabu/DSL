/**
 */
package org.babu.xtext.training.smalljava.smalljavaDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Small Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.babu.xtext.training.smalljava.smalljavaDsl.SmallClass#getName <em>Name</em>}</li>
 *   <li>{@link org.babu.xtext.training.smalljava.smalljavaDsl.SmallClass#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link org.babu.xtext.training.smalljava.smalljavaDsl.SmallClass#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmalljavaDslPackage#getSmallClass()
 * @model
 * @generated
 */
public interface SmallClass extends EObject
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
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmalljavaDslPackage#getSmallClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.SmallClass#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Class</em>' reference.
   * @see #setSuperClass(SmallClass)
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmalljavaDslPackage#getSmallClass_SuperClass()
   * @model
   * @generated
   */
  SmallClass getSuperClass();

  /**
   * Sets the value of the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.SmallClass#getSuperClass <em>Super Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Class</em>' reference.
   * @see #getSuperClass()
   * @generated
   */
  void setSuperClass(SmallClass value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.babu.xtext.training.smalljava.smalljavaDsl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmalljavaDslPackage#getSmallClass_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // SmallClass
