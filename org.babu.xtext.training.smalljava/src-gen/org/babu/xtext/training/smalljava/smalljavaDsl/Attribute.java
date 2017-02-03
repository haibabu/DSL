/**
 */
package org.babu.xtext.training.smalljava.smalljavaDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.babu.xtext.training.smalljava.smalljavaDsl.Attribute#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.babu.xtext.training.smalljava.smalljavaDsl.Attribute#isArray <em>Array</em>}</li>
 *   <li>{@link org.babu.xtext.training.smalljava.smalljavaDsl.Attribute#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmalljavaDslPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datatype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype</em>' containment reference.
   * @see #setDatatype(DataType)
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmalljavaDslPackage#getAttribute_Datatype()
   * @model containment="true"
   * @generated
   */
  DataType getDatatype();

  /**
   * Sets the value of the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.Attribute#getDatatype <em>Datatype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype</em>' containment reference.
   * @see #getDatatype()
   * @generated
   */
  void setDatatype(DataType value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' attribute.
   * @see #setArray(boolean)
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmalljavaDslPackage#getAttribute_Array()
   * @model
   * @generated
   */
  boolean isArray();

  /**
   * Sets the value of the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.Attribute#isArray <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' attribute.
   * @see #isArray()
   * @generated
   */
  void setArray(boolean value);

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
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmalljavaDslPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Attribute
