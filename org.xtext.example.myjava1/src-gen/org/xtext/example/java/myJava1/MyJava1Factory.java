/**
 */
package org.xtext.example.java.myJava1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.java.myJava1.MyJava1Package
 * @generated
 */
public interface MyJava1Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyJava1Factory eINSTANCE = org.xtext.example.java.myJava1.impl.MyJava1FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Small Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Small Class</em>'.
   * @generated
   */
  SmallClass createSmallClass();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyJava1Package getMyJava1Package();

} //MyJava1Factory
