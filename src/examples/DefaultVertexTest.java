package examples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * > Duvidas sobre como eh a implementacao de alguma classe ou metodo?
 * 
 * @link https://jgrapht.org/javadoc/ <- JavaDoc JGraphT
 * @link https://github.com/rcpoison/jgrapht <- GitHub JGraphT
 */
/** 
 * @author Patricia
 */
public class DefaultVertexTest {

	static DefaultVertex d1;
	static DefaultVertex d2;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		d1 = new DefaultVertex("oi", null);
		d2 = new DefaultVertex("oi", null);
		System.out.println("Starting Class Test");

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Closing Class Test");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Starting Method Test");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("Closing Method Test");
	}

	/**
	 * Test method for
	 * {@link DefaultVertex#DefaultVertex(java.lang.Object, java.util.Map)}.
	 */
	@Test
	public void testDefaultVertex() {
		assertEquals(d1.getId(), "oi");
	}

	/**
	 * Test method for {@link DefaultVertex#getId()}.
	 */
	@Test
	public void testGetId() {
		assertEquals(d2.getId(), "oi");
	}

	/**
	 * Test method for {@link DefaultVertex#getLabel()}.
	 */
	@Test
	public void testGetLabel() {
		try {
			d1.getLabel();
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}

	}

	/**
	 * Test method for {@link DefaultVertex#toString()}.
	 */
	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link DefaultVertex#equals(DefaultVertex)}.
	 */
	@Test
	public void testEqualsDefaultVertex() {
		assertTrue(d1.equals(d2));
	}

}
