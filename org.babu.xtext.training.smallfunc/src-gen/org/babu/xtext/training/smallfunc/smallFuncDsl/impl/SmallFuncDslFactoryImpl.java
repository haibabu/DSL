/**
 */
package org.babu.xtext.training.smallfunc.smallFuncDsl.impl;

import org.babu.xtext.training.smallfunc.smallFuncDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmallFuncDslFactoryImpl extends EFactoryImpl implements SmallFuncDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SmallFuncDslFactory init()
  {
    try
    {
      SmallFuncDslFactory theSmallFuncDslFactory = (SmallFuncDslFactory)EPackage.Registry.INSTANCE.getEFactory(SmallFuncDslPackage.eNS_URI);
      if (theSmallFuncDslFactory != null)
      {
        return theSmallFuncDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SmallFuncDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallFuncDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SmallFuncDslPackage.NAME_SPACE: return createNameSpace();
      case SmallFuncDslPackage.IMPORT: return createImport();
      case SmallFuncDslPackage.SMALL_FUNC: return createSmallFunc();
      case SmallFuncDslPackage.PARAM: return createParam();
      case SmallFuncDslPackage.ATTRIBUTE: return createAttribute();
      case SmallFuncDslPackage.DATA_TYPE: return createDataType();
      case SmallFuncDslPackage.SMALL_CLASS_TYPE: return createsmallClassType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameSpace createNameSpace()
  {
    NameSpaceImpl nameSpace = new NameSpaceImpl();
    return nameSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallFunc createSmallFunc()
  {
    SmallFuncImpl smallFunc = new SmallFuncImpl();
    return smallFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public smallClassType createsmallClassType()
  {
    smallClassTypeImpl smallClassType = new smallClassTypeImpl();
    return smallClassType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallFuncDslPackage getSmallFuncDslPackage()
  {
    return (SmallFuncDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SmallFuncDslPackage getPackage()
  {
    return SmallFuncDslPackage.eINSTANCE;
  }

} //SmallFuncDslFactoryImpl
