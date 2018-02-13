/**
 */
package bookOrder;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bookOrder.BookOrderFactory
 * @model kind="package"
 * @generated
 */
public interface BookOrderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bookOrder";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/bookOrder";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bookOrder";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BookOrderPackage eINSTANCE = bookOrder.impl.BookOrderPackageImpl.init();

	/**
	 * The meta object id for the '{@link bookOrder.impl.UniverseImpl <em>Universe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookOrder.impl.UniverseImpl
	 * @see bookOrder.impl.BookOrderPackageImpl#getUniverse()
	 * @generated
	 */
	int UNIVERSE = 0;

	/**
	 * The feature id for the '<em><b>Neweclass2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE__NEWECLASS2 = 0;

	/**
	 * The number of structural features of the '<em>Universe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Universe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bookOrder.impl.BookOrderImpl <em>Book Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookOrder.impl.BookOrderImpl
	 * @see bookOrder.impl.BookOrderPackageImpl#getBookOrder()
	 * @generated
	 */
	int BOOK_ORDER = 1;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_ORDER__INFO = 0;

	/**
	 * The number of structural features of the '<em>Book Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_ORDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Book Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bookOrder.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bookOrder.impl.BookImpl
	 * @see bookOrder.impl.BookOrderPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 2;

	/**
	 * The feature id for the '<em><b>Bookorder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__BOOKORDER = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__TITLE = 1;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link bookOrder.Universe <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universe</em>'.
	 * @see bookOrder.Universe
	 * @generated
	 */
	EClass getUniverse();

	/**
	 * Returns the meta object for the containment reference list '{@link bookOrder.Universe#getNeweclass2 <em>Neweclass2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Neweclass2</em>'.
	 * @see bookOrder.Universe#getNeweclass2()
	 * @see #getUniverse()
	 * @generated
	 */
	EReference getUniverse_Neweclass2();

	/**
	 * Returns the meta object for class '{@link bookOrder.BookOrder <em>Book Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Order</em>'.
	 * @see bookOrder.BookOrder
	 * @generated
	 */
	EClass getBookOrder();

	/**
	 * Returns the meta object for the attribute '{@link bookOrder.BookOrder#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info</em>'.
	 * @see bookOrder.BookOrder#getInfo()
	 * @see #getBookOrder()
	 * @generated
	 */
	EAttribute getBookOrder_Info();

	/**
	 * Returns the meta object for class '{@link bookOrder.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see bookOrder.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the containment reference list '{@link bookOrder.Book#getBookorder <em>Bookorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bookorder</em>'.
	 * @see bookOrder.Book#getBookorder()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Bookorder();

	/**
	 * Returns the meta object for the attribute '{@link bookOrder.Book#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see bookOrder.Book#getTitle()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Title();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BookOrderFactory getBookOrderFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bookOrder.impl.UniverseImpl <em>Universe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookOrder.impl.UniverseImpl
		 * @see bookOrder.impl.BookOrderPackageImpl#getUniverse()
		 * @generated
		 */
		EClass UNIVERSE = eINSTANCE.getUniverse();

		/**
		 * The meta object literal for the '<em><b>Neweclass2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSE__NEWECLASS2 = eINSTANCE.getUniverse_Neweclass2();

		/**
		 * The meta object literal for the '{@link bookOrder.impl.BookOrderImpl <em>Book Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookOrder.impl.BookOrderImpl
		 * @see bookOrder.impl.BookOrderPackageImpl#getBookOrder()
		 * @generated
		 */
		EClass BOOK_ORDER = eINSTANCE.getBookOrder();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_ORDER__INFO = eINSTANCE.getBookOrder_Info();

		/**
		 * The meta object literal for the '{@link bookOrder.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bookOrder.impl.BookImpl
		 * @see bookOrder.impl.BookOrderPackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Bookorder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__BOOKORDER = eINSTANCE.getBook_Bookorder();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__TITLE = eINSTANCE.getBook_Title();

	}

} //BookOrderPackage
