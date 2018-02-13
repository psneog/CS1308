/**
 */
package bookOrder;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bookOrder.BookOrderPackage
 * @generated
 */
public interface BookOrderFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BookOrderFactory eINSTANCE = bookOrder.impl.BookOrderFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Universe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Universe</em>'.
	 * @generated
	 */
	Universe createUniverse();

	/**
	 * Returns a new object of class '<em>Book Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Book Order</em>'.
	 * @generated
	 */
	BookOrder createBookOrder();

	/**
	 * Returns a new object of class '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Book</em>'.
	 * @generated
	 */
	Book createBook();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BookOrderPackage getBookOrderPackage();

} //BookOrderFactory
