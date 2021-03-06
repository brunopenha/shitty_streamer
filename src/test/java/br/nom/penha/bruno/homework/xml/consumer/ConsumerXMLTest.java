package br.nom.penha.bruno.homework.xml.consumer;

import static org.junit.Assert.*;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import org.junit.Test;

import br.nom.penha.bruno.homework.dao.HomeworkDaoImpl;
import br.nom.penha.bruno.homework.entity.LoadStatus;

public class ConsumerXMLTest {

	
	public void testConsumeXml() throws InterruptedException, ExecutionException, TimeoutException {
		
		String retorno = ConsumerXML.getInstance(HomeworkDaoImpl.getInstance()).consumeXml("http://localhost:8383/api/v1/readxml");
		
		assertNotNull(retorno);
	}

	@Test
	public void testExtractXML() {
		
		LoadStatus status = ConsumerXML.getInstance(HomeworkDaoImpl.getInstance()).extractXML(mockXMLsReturned());
		
		assertNotNull(status);
		assertEquals(Long.valueOf(100), status.getSize());
		assertTrue(status.isLoaded());
		assertFalse(status.isError());
		
		
	}

	
	private static String mockXMLsReturned() {
		
		return "¬í t7Ò<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>15562.124855</amount>\n" + 
				"    <timestamp>292430697</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>12899.335339</amount>\n" + 
				"    <timestamp>757265961</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>2624.367465</amount>\n" + 
				"    <timestamp>372586296</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>533.621511</amount>\n" + 
				"    <timestamp>53796923</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>2349.592602</amount>\n" + 
				"    <timestamp>748993975</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>19435.462433</amount>\n" + 
				"    <timestamp>957398531</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>10459.847516</amount>\n" + 
				"    <timestamp>659540058</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>4546.999740</amount>\n" + 
				"    <timestamp>182119887</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>15353.883279</amount>\n" + 
				"    <timestamp>191389809</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>13329.477049</amount>\n" + 
				"    <timestamp>275951720</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>17460.729419</amount>\n" + 
				"    <timestamp>1111726175</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>1307.384946</amount>\n" + 
				"    <timestamp>215052017</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>17229.471258</amount>\n" + 
				"    <timestamp>836183543</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>4410.062785</amount>\n" + 
				"    <timestamp>666905827</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>3920.691543</amount>\n" + 
				"    <timestamp>297811428</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>12688.774018</amount>\n" + 
				"    <timestamp>981339483</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>12655.597336</amount>\n" + 
				"    <timestamp>10219453</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>12124.057984</amount>\n" + 
				"    <timestamp>406654228</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>13432.250592</amount>\n" + 
				"    <timestamp>508310631</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>9916.690238</amount>\n" + 
				"    <timestamp>676390780</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>9396.914726</amount>\n" + 
				"    <timestamp>148357627</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>7971.316002</amount>\n" + 
				"    <timestamp>76034982</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>1201.520741</amount>\n" + 
				"    <timestamp>20664587</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>4464.021534</amount>\n" + 
				"    <timestamp>187572765</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>5201.762254</amount>\n" + 
				"    <timestamp>489717508</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>14884.131014</amount>\n" + 
				"    <timestamp>25720766</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>3006.472418</amount>\n" + 
				"    <timestamp>824272409</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>14583.971203</amount>\n" + 
				"    <timestamp>1035774086</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>1949.820631</amount>\n" + 
				"    <timestamp>681956249</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>165.281460</amount>\n" + 
				"    <timestamp>1178250107</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>478.855874</amount>\n" + 
				"    <timestamp>295262682</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>11574.561461</amount>\n" + 
				"    <timestamp>955669941</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>8639.504767</amount>\n" + 
				"    <timestamp>402129083</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>1234.567891</amount>\n" + 
				"    <timestamp>1234567890</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>11690.629760</amount>\n" + 
				"    <timestamp>534715035</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>16895.908976</amount>\n" + 
				"    <timestamp>211419612</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>5742.547412</amount>\n" + 
				"    <timestamp>1178231665</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>16574.963087</amount>\n" + 
				"    <timestamp>422218855</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>7084.447934</amount>\n" + 
				"    <timestamp>999843287</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>5585.784010</amount>\n" + 
				"    <timestamp>1040000424</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>14780.064291</amount>\n" + 
				"    <timestamp>28385767</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>9691.109148</amount>\n" + 
				"    <timestamp>549176044</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>15559.485973</amount>\n" + 
				"    <timestamp>37492832</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>15448.268220</amount>\n" + 
				"    <timestamp>1062368567</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>8850.506674</amount>\n" + 
				"    <timestamp>1016290294</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>5417.286224</amount>\n" + 
				"    <timestamp>754765466</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>15039.654707</amount>\n" + 
				"    <timestamp>407164972</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>12160.736304</amount>\n" + 
				"    <timestamp>249340340</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>11086.605117</amount>\n" + 
				"    <timestamp>553181329</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>12553.798306</amount>\n" + 
				"    <timestamp>1192284284</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>13615.188045</amount>\n" + 
				"    <timestamp>917669598</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>14750.656540</amount>\n" + 
				"    <timestamp>961685026</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>17089.475279</amount>\n" + 
				"    <timestamp>1034977989</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>13625.771932</amount>\n" + 
				"    <timestamp>668031143</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>995.658629</amount>\n" + 
				"    <timestamp>781920483</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>18268.478905</amount>\n" + 
				"    <timestamp>560979990</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>7320.055479</amount>\n" + 
				"    <timestamp>639208544</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>7319.088194</amount>\n" + 
				"    <timestamp>639590756</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>591.300800</amount>\n" + 
				"    <timestamp>587954800</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>17094.968401</amount>\n" + 
				"    <timestamp>261840103</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>14973.534173</amount>\n" + 
				"    <timestamp>782220769</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>969.970418</amount>\n" + 
				"    <timestamp>219984483</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>9644.778748</amount>\n" + 
				"    <timestamp>1123964284</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>2546.826148</amount>\n" + 
				"    <timestamp>286376338</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>17166.997199</amount>\n" + 
				"    <timestamp>273141954</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>18848.607700</amount>\n" + 
				"    <timestamp>488794795</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>4297.397051</amount>\n" + 
				"    <timestamp>196261183</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>18849.794039</amount>\n" + 
				"    <timestamp>1051922979</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>16241.388640</amount>\n" + 
				"    <timestamp>1226422408</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>3308.409479</amount>\n" + 
				"    <timestamp>1226130823</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>15970.708687</amount>\n" + 
				"    <timestamp>519214689</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>4886.158052</amount>\n" + 
				"    <timestamp>771837847</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>13818.051173</amount>\n" + 
				"    <timestamp>714433291</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>1821.827846</amount>\n" + 
				"    <timestamp>322324649</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>3698.473154</amount>\n" + 
				"    <timestamp>272758496</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>15051.992486</amount>\n" + 
				"    <timestamp>788421727</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>12969.155569</amount>\n" + 
				"    <timestamp>755070882</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>5132.864302</amount>\n" + 
				"    <timestamp>1141264288</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>7539.640928</amount>\n" + 
				"    <timestamp>769280893</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>2526.711349</amount>\n" + 
				"    <timestamp>165215346</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>1902.488094</amount>\n" + 
				"    <timestamp>1153935991</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>99.176422</amount>\n" + 
				"    <timestamp>944770017</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>8386.328346</amount>\n" + 
				"    <timestamp>293772851</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>13686.455861</amount>\n" + 
				"    <timestamp>227508796</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>971.852431</amount>\n" + 
				"    <timestamp>1126656658</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>17735.471165</amount>\n" + 
				"    <timestamp>372332678</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>15089.326914</amount>\n" + 
				"    <timestamp>413173529</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>3538.459731</amount>\n" + 
				"    <timestamp>904886356</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>19461.465927</amount>\n" + 
				"    <timestamp>1208986060</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>4817.518891</amount>\n" + 
				"    <timestamp>546281800</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>3513.319154</amount>\n" + 
				"    <timestamp>1234492762</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>2329.011773</amount>\n" + 
				"    <timestamp>1002398058</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>4660.782626</amount>\n" + 
				"    <timestamp>443623597</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>3509.690277</amount>\n" + 
				"    <timestamp>1003846965</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>13855.567233</amount>\n" + 
				"    <timestamp>426601868</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>4947.492309</amount>\n" + 
				"    <timestamp>953969720</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>3594.780799</amount>\n" + 
				"    <timestamp>436561376</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>7153.741673</amount>\n" + 
				"    <timestamp>89377447</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>569.672845</amount>\n" + 
				"    <timestamp>60822100</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>18334.675427</amount>\n" + 
				"    <timestamp>1048680564</timestamp>\n" + 
				"</data>\n" + 
				"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
				"<data>\n" + 
				"    <amount>5731.624791</amount>\n" + 
				"    <timestamp>632479307</timestamp>\n" + 
				"</data>\n" + 
				"";
		
		
	}
}
