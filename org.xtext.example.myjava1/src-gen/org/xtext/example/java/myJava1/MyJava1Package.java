/**
 */
package org.xtext.example.java.myJava1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.java.myJava1.MyJava1Factory
 * @model kind="package"
 * @generated
 */
public interface MyJava1Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myJava1";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/java/MyJava1";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myJava1";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyJava1Package eINSTANCE = org.xtext.example.java.myJava1.impl.MyJava1PackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.java.myJava1.impl.SmallClassImpl <em>Small Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.java.myJava1.impl.SmallClassImpl
   * @see org.xtext.example.java.myJava1.impl.MyJava1PackageImpl#getSmallClass()
   * @generated
   */
  int SMALL_CLASS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_CLASS__SUPER_CLASS = 1;

  /**
   * The number of structural features of the '<em>Small Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_CLASS_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.java.myJava1.SmallClass <em>Small Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Small Class</em>'.
   * @see org.xtext.example.java.myJava1.SmallClass
   * @generated
   */
  EClass getSmallClass();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.java.myJava1.SmallClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.java.myJava1.SmallClass#getName()
   * @see #getSmallClass()
   * @generated
   */
  EAttribute getSmallClass_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.java.myJava1.SmallClass#getSuperClass <em>Super Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Class</em>'.
   * @see org.xtext.example.java.myJava1.SmallClass#getSuperClass()
   * @see #getSmallClass()
   * @generated
   */
  EReference getSmallClass_SuperClass();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyJava1Factory getMyJava1Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.java.myJava1.impl.SmallClassImpl <em>Small Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.java.myJava1.impl.SmallClassImpl
     * @see org.xtext.example.java.myJava1.impl.MyJava1PackageImpl#getSmallClass()
     * @generated
     */
    EClass SMALL_CLASS = eINSTANCE.getSmallClass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMALL_CLASS__NAME = eINSTANCE.getSmallClass_Name();

    /**
     * The meta object literal for the '<em><b>Super Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMALL_CLASS__SUPER_CLASS = eINSTANCE.getSmallClass_SuperClass();

  }

} //MyJava1Package
