/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.exp1.exp1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.exp1.exp1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Exp1FactoryImpl extends EFactoryImpl implements Exp1Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Exp1Factory init()
  {
    try
    {
      Exp1Factory theExp1Factory = (Exp1Factory)EPackage.Registry.INSTANCE.getEFactory(Exp1Package.eNS_URI);
      if (theExp1Factory != null)
      {
        return theExp1Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Exp1FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp1FactoryImpl()
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
      case Exp1Package.EXP1: return createExp1();
      case Exp1Package.EXPRESSAO: return createExpressao();
      case Exp1Package.DEC_VARIAVEL: return createDecVariavel();
      case Exp1Package.EXP_ARITMETICA: return createExpAritmetica();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp1 createExp1()
  {
    Exp1Impl exp1 = new Exp1Impl();
    return exp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expressao createExpressao()
  {
    ExpressaoImpl expressao = new ExpressaoImpl();
    return expressao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecVariavel createDecVariavel()
  {
    DecVariavelImpl decVariavel = new DecVariavelImpl();
    return decVariavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpAritmetica createExpAritmetica()
  {
    ExpAritmeticaImpl expAritmetica = new ExpAritmeticaImpl();
    return expAritmetica;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp1Package getExp1Package()
  {
    return (Exp1Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Exp1Package getPackage()
  {
    return Exp1Package.eINSTANCE;
  }

} //Exp1FactoryImpl
