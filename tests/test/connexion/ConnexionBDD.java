package test.connexion;

/**
 * @author Wilfrid
 * 
 */
public class ConnexionBDD {

	/**
	 * Test de l'applicationContext
	 */
	/*
	 * @Test public final void testContext() { final ApplicationContext
	 * fileSystemContext = ContextFactory
	 * .getContext(ContextFactory.FILE_SYSTEM);
	 * 
	 * assertNotNull(fileSystemContext); }
	 */

	/*
	 * @Test public final void testDBConnexion(){ final BasicDataSource
	 * basicDataSource =
	 * (BasicDataSource)ContextFactory.getContext(ContextFactory
	 * .FILE_SYSTEM).getBean("dataSource"); assertNotNull(basicDataSource);
	 * assertEquals("jdbc:mysql://localhost:3306/street_belote_bdd",
	 * basicDataSource.getUrl());
	 * 
	 * final EntityManagerFactory emf = (EntityManagerFactory)
	 * ContextFactory.getContext
	 * (ContextFactory.FILE_SYSTEM).getBean("entityManagerFactory");
	 * assertNotNull(emf);
	 * 
	 * final Query query =
	 * emf.createEntityManager().createNativeQuery("select count(*) from joueur"
	 * ); assertEquals(BigInteger.valueOf(0), query.getSingleResult()); }
	 */
}
