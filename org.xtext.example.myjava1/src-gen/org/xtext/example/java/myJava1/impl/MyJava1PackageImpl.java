/**
 */
package org.xtext.example.java.myJava1.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.java.myJava1.MyJava1Factory;
import org.xtext.example.java.myJava1.MyJava1Package;
import org.xtext.example.java.myJava1.SmallClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyJava1PackageImpl extends EPackageImpl implements MyJava1Package
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smallClassEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.java.myJava1.MyJava1Package#eNS_URI
   * @see #init()
   * @generated
   */
  private MyJava1PackageImpl()
  {
    super(eNS_URI, MyJava1Factory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MyJava1Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyJava1Package init()
  {
    if (isInited) return (MyJava1Package)EPackage.Registry.INSTANCE.getEPackage(MyJava1Package.eNS_URI);

    // Obtain or create and register package
    MyJava1PackageImpl theMyJava1Package = (MyJava1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyJava1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyJava1PackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMyJava1Package.createPackageContents();

    // Initialize created meta-data
    theMyJava1Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyJava1Package.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyJava1Package.eNS_URI, theMyJava1Package);
    return theMyJava1Package;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSmallClass()
  {
    return smallClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSmallClass_Name()
  {
    return (EAttribute)smallClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmallClass_SuperClass()
  {
    return (EReference)smallClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyJava1Factory getMyJava1Factory()
  {
    return (MyJava1Factory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    smallClassEClass = createEClass(SMALL_CLASS);
    createEAttribute(smallClassEClass, SMALL_CLASS__NAME);
    createEReference(smallClassEClass, SMALL_CLASS__SUPER_CLASS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(smallClassEClass, SmallClass.class, "SmallClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSmallClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, SmallClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSmallClass_SuperClass(), this.getSmallClass(), null, "superClass", null, 0, 1, SmallClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MyJava1PackageImpl
