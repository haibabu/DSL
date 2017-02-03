/**
 */
package org.babu.xtext.training.smalljava.smalljavaDsl;

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
 * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmalljavaDslFactory
 * @model kind="package"
 * @generated
 */
public interface SmalljavaDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "smalljavaDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.babu.org/xtext/training/smalljava/SmalljavaDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "smalljavaDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SmalljavaDslPackage eINSTANCE = org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmalljavaDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.impl.NameSpaceImpl <em>Name Space</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.NameSpaceImpl
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmalljavaDslPackageImpl#getNameSpace()
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
   * The feature id for the '<em><b>Small Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_SPACE__SMALL_CLASS = 2;

  /**
   * The number of structural features of the '<em>Name Space</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_SPACE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.ImportImpl
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmalljavaDslPackageImpl#getImport()
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
   * The meta object id for the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmallClassImpl <em>Small Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmallClassImpl
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmalljavaDslPackageImpl#getSmallClass()
   * @generated
   */
  int SMALL_CLASS = 2;

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
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_CLASS__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Small Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_CLASS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.AttributeImpl
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmalljavaDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 3;

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
   * The meta object id for the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.DataTypeImpl
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmalljavaDslPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 4;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.impl.smallClassTypeImpl <em>small Class Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.smallClassTypeImpl
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmalljavaDslPackageImpl#getsmallClassType()
   * @generated
   */
  int SMALL_CLASS_TYPE = 5;

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
   * Returns the meta object for class '{@link org.babu.xtext.training.smalljava.smalljavaDsl.NameSpace <em>Name Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Space</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.NameSpace
   * @generated
   */
  EClass getNameSpace();

  /**
   * Returns the meta object for the attribute '{@link org.babu.xtext.training.smalljava.smalljavaDsl.NameSpace#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.NameSpace#getName()
   * @see #getNameSpace()
   * @generated
   */
  EAttribute getNameSpace_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.babu.xtext.training.smalljava.smalljavaDsl.NameSpace#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.NameSpace#getImports()
   * @see #getNameSpace()
   * @generated
   */
  EReference getNameSpace_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.babu.xtext.training.smalljava.smalljavaDsl.NameSpace#getSmallClass <em>Small Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Small Class</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.NameSpace#getSmallClass()
   * @see #getNameSpace()
   * @generated
   */
  EReference getNameSpace_SmallClass();

  /**
   * Returns the meta object for class '{@link org.babu.xtext.training.smalljava.smalljavaDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.babu.xtext.training.smalljava.smalljavaDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.babu.xtext.training.smalljava.smalljavaDsl.SmallClass <em>Small Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Small Class</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmallClass
   * @generated
   */
  EClass getSmallClass();

  /**
   * Returns the meta object for the attribute '{@link org.babu.xtext.training.smalljava.smalljavaDsl.SmallClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmallClass#getName()
   * @see #getSmallClass()
   * @generated
   */
  EAttribute getSmallClass_Name();

  /**
   * Returns the meta object for the reference '{@link org.babu.xtext.training.smalljava.smalljavaDsl.SmallClass#getSuperClass <em>Super Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Class</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmallClass#getSuperClass()
   * @see #getSmallClass()
   * @generated
   */
  EReference getSmallClass_SuperClass();

  /**
   * Returns the meta object for the containment reference list '{@link org.babu.xtext.training.smalljava.smalljavaDsl.SmallClass#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.SmallClass#getAttributes()
   * @see #getSmallClass()
   * @generated
   */
  EReference getSmallClass_Attributes();

  /**
   * Returns the meta object for class '{@link org.babu.xtext.training.smalljava.smalljavaDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference '{@link org.babu.xtext.training.smalljava.smalljavaDsl.Attribute#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.Attribute#getDatatype()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Datatype();

  /**
   * Returns the meta object for the attribute '{@link org.babu.xtext.training.smalljava.smalljavaDsl.Attribute#isArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Array</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.Attribute#isArray()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Array();

  /**
   * Returns the meta object for the attribute '{@link org.babu.xtext.training.smalljava.smalljavaDsl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for class '{@link org.babu.xtext.training.smalljava.smalljavaDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link org.babu.xtext.training.smalljava.smalljavaDsl.smallClassType <em>small Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>small Class Type</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.smallClassType
   * @generated
   */
  EClass getsmallClassType();

  /**
   * Returns the meta object for the reference '{@link org.babu.xtext.training.smalljava.smalljavaDsl.smallClassType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.babu.xtext.training.smalljava.smalljavaDsl.smallClassType#getType()
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
  SmalljavaDslFactory getSmalljavaDslFactory();

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
     * The meta object literal for the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.impl.NameSpaceImpl <em>Name Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.NameSpaceImpl
     * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmalljavaDslPackageImpl#getNameSpace()
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
     * The meta object literal for the '<em><b>Small Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_SPACE__SMALL_CLASS = eINSTANCE.getNameSpace_SmallClass();

    /**
     * The meta object literal for the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.ImportImpl
     * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmalljavaDslPackageImpl#getImport()
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
     * The meta object literal for the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmallClassImpl <em>Small Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmallClassImpl
     * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmalljavaDslPackageImpl#getSmallClass()
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

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMALL_CLASS__ATTRIBUTES = eINSTANCE.getSmallClass_Attributes();

    /**
     * The meta object literal for the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.AttributeImpl
     * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmalljavaDslPackageImpl#getAttribute()
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
     * The meta object literal for the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.DataTypeImpl
     * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmalljavaDslPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link org.babu.xtext.training.smalljava.smalljavaDsl.impl.smallClassTypeImpl <em>small Class Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.smallClassTypeImpl
     * @see org.babu.xtext.training.smalljava.smalljavaDsl.impl.SmalljavaDslPackageImpl#getsmallClassType()
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

} //SmalljavaDslPackage
