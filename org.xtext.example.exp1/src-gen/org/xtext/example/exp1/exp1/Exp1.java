/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.exp1.exp1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.exp1.exp1.Exp1#getExpressoes <em>Expressoes</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.exp1.exp1.Exp1Package#getExp1()
 * @model
 * @generated
 */
public interface Exp1 extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressoes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.exp1.exp1.Expressao}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressoes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressoes</em>' containment reference list.
   * @see org.xtext.example.exp1.exp1.Exp1Package#getExp1_Expressoes()
   * @model containment="true"
   * @generated
   */
  EList<Expressao> getExpressoes();

} // Exp1
