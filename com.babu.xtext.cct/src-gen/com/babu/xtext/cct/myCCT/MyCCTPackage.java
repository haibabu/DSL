/**
 */
package com.babu.xtext.cct.myCCT;

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
 * @see com.babu.xtext.cct.myCCT.MyCCTFactory
 * @model kind="package"
 * @generated
 */
public interface MyCCTPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myCCT";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.babu.com/xtext/cct/MyCCT";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myCCT";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyCCTPackage eINSTANCE = com.babu.xtext.cct.myCCT.impl.MyCCTPackageImpl.init();

  /**
   * The meta object id for the '{@link com.babu.xtext.cct.myCCT.impl.CCTImpl <em>CCT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.babu.xtext.cct.myCCT.impl.CCTImpl
   * @see com.babu.xtext.cct.myCCT.impl.MyCCTPackageImpl#getCCT()
   * @generated
   */
  int CCT = 0;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CCT__FILE = 0;

  /**
   * The feature id for the '<em><b>Loop</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CCT__LOOP = 1;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CCT__CONDITION = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CCT__VALUE = 3;

  /**
   * The number of structural features of the '<em>CCT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CCT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.babu.xtext.cct.myCCT.impl.FileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.babu.xtext.cct.myCCT.impl.FileImpl
   * @see com.babu.xtext.cct.myCCT.impl.MyCCTPackageImpl#getFile()
   * @generated
   */
  int FILE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__NAME = 0;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.babu.xtext.cct.myCCT.impl.LoopImpl <em>Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.babu.xtext.cct.myCCT.impl.LoopImpl
   * @see com.babu.xtext.cct.myCCT.impl.MyCCTPackageImpl#getLoop()
   * @generated
   */
  int LOOP = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__NAME = 0;

  /**
   * The number of structural features of the '<em>Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.babu.xtext.cct.myCCT.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.babu.xtext.cct.myCCT.impl.ConditionImpl
   * @see com.babu.xtext.cct.myCCT.impl.MyCCTPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__NAME = 0;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.babu.xtext.cct.myCCT.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.babu.xtext.cct.myCCT.impl.ValueImpl
   * @see com.babu.xtext.cct.myCCT.impl.MyCCTPackageImpl#getValue()
   * @generated
   */
  int VALUE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__NAME = 0;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.babu.xtext.cct.myCCT.CCT <em>CCT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CCT</em>'.
   * @see com.babu.xtext.cct.myCCT.CCT
   * @generated
   */
  EClass getCCT();

  /**
   * Returns the meta object for the containment reference '{@link com.babu.xtext.cct.myCCT.CCT#getFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>File</em>'.
   * @see com.babu.xtext.cct.myCCT.CCT#getFile()
   * @see #getCCT()
   * @generated
   */
  EReference getCCT_File();

  /**
   * Returns the meta object for the containment reference list '{@link com.babu.xtext.cct.myCCT.CCT#getLoop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Loop</em>'.
   * @see com.babu.xtext.cct.myCCT.CCT#getLoop()
   * @see #getCCT()
   * @generated
   */
  EReference getCCT_Loop();

  /**
   * Returns the meta object for the containment reference list '{@link com.babu.xtext.cct.myCCT.CCT#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition</em>'.
   * @see com.babu.xtext.cct.myCCT.CCT#getCondition()
   * @see #getCCT()
   * @generated
   */
  EReference getCCT_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link com.babu.xtext.cct.myCCT.CCT#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see com.babu.xtext.cct.myCCT.CCT#getValue()
   * @see #getCCT()
   * @generated
   */
  EReference getCCT_Value();

  /**
   * Returns the meta object for class '{@link com.babu.xtext.cct.myCCT.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see com.babu.xtext.cct.myCCT.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for the attribute '{@link com.babu.xtext.cct.myCCT.File#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.babu.xtext.cct.myCCT.File#getName()
   * @see #getFile()
   * @generated
   */
  EAttribute getFile_Name();

  /**
   * Returns the meta object for class '{@link com.babu.xtext.cct.myCCT.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop</em>'.
   * @see com.babu.xtext.cct.myCCT.Loop
   * @generated
   */
  EClass getLoop();

  /**
   * Returns the meta object for the attribute '{@link com.babu.xtext.cct.myCCT.Loop#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.babu.xtext.cct.myCCT.Loop#getName()
   * @see #getLoop()
   * @generated
   */
  EAttribute getLoop_Name();

  /**
   * Returns the meta object for class '{@link com.babu.xtext.cct.myCCT.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see com.babu.xtext.cct.myCCT.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the attribute '{@link com.babu.xtext.cct.myCCT.Condition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.babu.xtext.cct.myCCT.Condition#getName()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Name();

  /**
   * Returns the meta object for class '{@link com.babu.xtext.cct.myCCT.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see com.babu.xtext.cct.myCCT.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for the attribute '{@link com.babu.xtext.cct.myCCT.Value#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.babu.xtext.cct.myCCT.Value#getName()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyCCTFactory getMyCCTFactory();

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
     * The meta object literal for the '{@link com.babu.xtext.cct.myCCT.impl.CCTImpl <em>CCT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.babu.xtext.cct.myCCT.impl.CCTImpl
     * @see com.babu.xtext.cct.myCCT.impl.MyCCTPackageImpl#getCCT()
     * @generated
     */
    EClass CCT = eINSTANCE.getCCT();

    /**
     * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CCT__FILE = eINSTANCE.getCCT_File();

    /**
     * The meta object literal for the '<em><b>Loop</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CCT__LOOP = eINSTANCE.getCCT_Loop();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CCT__CONDITION = eINSTANCE.getCCT_Condition();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CCT__VALUE = eINSTANCE.getCCT_Value();

    /**
     * The meta object literal for the '{@link com.babu.xtext.cct.myCCT.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.babu.xtext.cct.myCCT.impl.FileImpl
     * @see com.babu.xtext.cct.myCCT.impl.MyCCTPackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE__NAME = eINSTANCE.getFile_Name();

    /**
     * The meta object literal for the '{@link com.babu.xtext.cct.myCCT.impl.LoopImpl <em>Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.babu.xtext.cct.myCCT.impl.LoopImpl
     * @see com.babu.xtext.cct.myCCT.impl.MyCCTPackageImpl#getLoop()
     * @generated
     */
    EClass LOOP = eINSTANCE.getLoop();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOP__NAME = eINSTANCE.getLoop_Name();

    /**
     * The meta object literal for the '{@link com.babu.xtext.cct.myCCT.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.babu.xtext.cct.myCCT.impl.ConditionImpl
     * @see com.babu.xtext.cct.myCCT.impl.MyCCTPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

    /**
     * The meta object literal for the '{@link com.babu.xtext.cct.myCCT.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.babu.xtext.cct.myCCT.impl.ValueImpl
     * @see com.babu.xtext.cct.myCCT.impl.MyCCTPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__NAME = eINSTANCE.getValue_Name();

  }

} //MyCCTPackage
