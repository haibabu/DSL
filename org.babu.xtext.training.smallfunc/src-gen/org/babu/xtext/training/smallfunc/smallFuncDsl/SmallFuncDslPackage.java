/**
 */
package org.babu.xtext.training.smallfunc.smallFuncDsl;

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
 * @see org.babu.xtext.training.smallfunc.smallFuncDsl.SmallFuncDslFactory
 * @model kind="package"
 * @generated
 */
public interface SmallFuncDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "smallFuncDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.babu.org/xtext/training/smallfunc/SmallFuncDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "smallFuncDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SmallFuncDslPackage eINSTANCE = org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.impl.NameSpaceImpl <em>Name Space</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.NameSpaceImpl
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getNameSpace()
   * @generated
   */
  int NAME_SPACE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_SPACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_SPACE__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Small Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_SPACE__SMALL_FUNC = 2;

  /**
   * The number of structural features of the '<em>Name Space</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_SPACE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.ImportImpl
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncImpl <em>Small Func</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncImpl
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getSmallFunc()
   * @generated
   */
  int SMALL_FUNC = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_FUNC__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_FUNC__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Small Func</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_FUNC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.ParamImpl
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getParam()
   * @generated
   */
  int PARAM = 3;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__DATA_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__NAME = 1;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.AttributeImpl
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DATATYPE = 0;

  /**
   * The feature id for the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ARRAY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.DataTypeImpl
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 5;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.impl.smallClassTypeImpl <em>small Class Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.smallClassTypeImpl
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getsmallClassType()
   * @generated
   */
  int SMALL_CLASS_TYPE = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_CLASS_TYPE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>small Class Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_CLASS_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.NameSpace <em>Name Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Space</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.NameSpace
   * @generated
   */
  EClass getNameSpace();

  /**
   * Returns the meta object for the attribute '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.NameSpace#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.NameSpace#getName()
   * @see #getNameSpace()
   * @generated
   */
  EAttribute getNameSpace_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.NameSpace#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.NameSpace#getImports()
   * @see #getNameSpace()
   * @generated
   */
  EReference getNameSpace_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.NameSpace#getSmallFunc <em>Small Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Small Func</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.NameSpace#getSmallFunc()
   * @see #getNameSpace()
   * @generated
   */
  EReference getNameSpace_SmallFunc();

  /**
   * Returns the meta object for class '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.SmallFunc <em>Small Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Small Func</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.SmallFunc
   * @generated
   */
  EClass getSmallFunc();

  /**
   * Returns the meta object for the attribute '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.SmallFunc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.SmallFunc#getName()
   * @see #getSmallFunc()
   * @generated
   */
  EAttribute getSmallFunc_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.SmallFunc#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.SmallFunc#getParams()
   * @see #getSmallFunc()
   * @generated
   */
  EReference getSmallFunc_Params();

  /**
   * Returns the meta object for class '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for the containment reference '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.Param#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Type</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.Param#getDataType()
   * @see #getParam()
   * @generated
   */
  EReference getParam_DataType();

  /**
   * Returns the meta object for the attribute '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.Param#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.Param#getName()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Name();

  /**
   * Returns the meta object for class '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.Attribute#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.Attribute#getDatatype()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Datatype();

  /**
   * Returns the meta object for the attribute '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.Attribute#isArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Array</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.Attribute#isArray()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Array();

  /**
   * Returns the meta object for the attribute '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for class '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.smallClassType <em>small Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>small Class Type</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.smallClassType
   * @generated
   */
  EClass getsmallClassType();

  /**
   * Returns the meta object for the reference '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.smallClassType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.babu.xtext.training.smallfunc.smallFuncDsl.smallClassType#getType()
   * @see #getsmallClassType()
   * @generated
   */
  EReference getsmallClassType_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SmallFuncDslFactory getSmallFuncDslFactory();

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
     * The meta object literal for the '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.impl.NameSpaceImpl <em>Name Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.NameSpaceImpl
     * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getNameSpace()
     * @generated
     */
    EClass NAME_SPACE = eINSTANCE.getNameSpace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_SPACE__NAME = eINSTANCE.getNameSpace_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_SPACE__IMPORTS = eINSTANCE.getNameSpace_Imports();

    /**
     * The meta object literal for the '<em><b>Small Func</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_SPACE__SMALL_FUNC = eINSTANCE.getNameSpace_SmallFunc();

    /**
     * The meta object literal for the '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.ImportImpl
     * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncImpl <em>Small Func</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncImpl
     * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getSmallFunc()
     * @generated
     */
    EClass SMALL_FUNC = eINSTANCE.getSmallFunc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMALL_FUNC__NAME = eINSTANCE.getSmallFunc_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMALL_FUNC__PARAMS = eINSTANCE.getSmallFunc_Params();

    /**
     * The meta object literal for the '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.ParamImpl
     * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM__DATA_TYPE = eINSTANCE.getParam_DataType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

    /**
     * The meta object literal for the '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.AttributeImpl
     * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__DATATYPE = eINSTANCE.getAttribute_Datatype();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ARRAY = eINSTANCE.getAttribute_Array();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.DataTypeImpl
     * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link org.babu.xtext.training.smallfunc.smallFuncDsl.impl.smallClassTypeImpl <em>small Class Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.smallClassTypeImpl
     * @see org.babu.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getsmallClassType()
     * @generated
     */
    EClass SMALL_CLASS_TYPE = eINSTANCE.getsmallClassType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMALL_CLASS_TYPE__TYPE = eINSTANCE.getsmallClassType_Type();

  }

} //SmallFuncDslPackage
