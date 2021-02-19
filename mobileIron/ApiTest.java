/*
 * package mobileIron;
 


//problem : Dev has provided 1 API to create a order
//build the framework, test this api


class BaseClass{
	@BeforeSuite
	public void setup() {
		RestAssured.baseURL = "https://createorder/v1";
		RestAssured.port = 8080;
		//DB connection
		if(conn == null) {
			String dbUrl = "jdbc:mysql://localhost/url";
			Class.forName("jdbc.oracle.driver");
			Connection conn = ConnectionManager.connect(dbUrl, PropertyFile.getUserName, PropertyFile.password);
		}
	}

	@AfterSuite
	public void tearDown() {
		conn = null;
	}



	///createorder:8080/v1
	//order id & order name
	//--DB -- 
	//Json, csv - input
	//should be easy - 1000 order also at a time
	// smoke test for dev
	// atleast common case like order id can't be negative
	public class ApiTest extends BaseClass{

		@Test
		public void testFunctionalSmoke() {

			Order order = new Order();

			Response res = given().contentType(ContentType.JSON)
					       .body(order)
					        .when().post("/create");

			assertEquals("Status code incorrect", 201, res.getStatusCode());
			assertEquals(res.getBody("orderId"), order.getOrderId());
			assertEquals(res.getBody("OrderName"), order.getOrderName());

			orderIdFromDB = DbQueryServices.getOrderWithId(order.getOrderId());
			// getOrderWithId will be a static method in DbQueryServices for sql querying
			assertEquals(order.getOrderId(), orderIdFromDB);
			//verify in UI
		}

		@Test
		public void testFunctional() {
			//Reading payload from a input file

			String body = TestDataFile.getPayload(); // Json input
			//Similarly Data can also come from Test NG Data Provider, excel sheet, 

			Response res = given().contentType(ContentType.JSON)
				       .body(order)
				        .when().post("/create");

			assertEquals("Status code incorrect", 201, res.getStatusCode());
			//verify the payload
			//verify in DB
			//verify in UI		
		}

		@Test
		public void testPerformanceSequential() {

			for (int i = 0; i < 1000; i++) {
				Order order = new Order();
				Response res = given().body(order)
						.when().post("/create");

				res.then().time(lessThan(1000, Time.MilliSeconds));
				assertEquals("Status code incorrect", 201, res.getStatusCode());
			}
		}
		
		@Test (dataProvider = "getOrderId")
		public void testPerformanceConcurrent(Order order) {
				Order order = new Order();
				Response res = given().body(order)
						.when().post("/create");

				res.then().time(lessThan(1000, Time.MilliSeconds));
				assertEquals("Status code incorrect", 201, res.getStatusCode());
		}
		
		@DataProvider(name = "getOrderId", parallel= true)
		public Object[] getOrderId(){
			Object[] obj = new Object[1000];
			
			for (int i= 0;  i< obj.length; i++) {
				obj[i] = new Order();
			}
			
			return obj;
			//parallel should also be defined as keyword in TestNg file / maven sure fire plugin
		}

		@Test
		public void testFunctionalNegativeOrderId() {
			Order order = new Order();
			order.setOrderId(-100);
			Response res = given().body(order)
					.when().post("/create");

			assertEquals("Status code incorrect", 400, res.getStatusCode());
			//verify the payload
			//verify in DB
			//verify in UI
		}

		@Test
		public void testFunctionalNegative() {
			//Example :
			//Missing json fields 400
			//invalid order id 400
			//Already existing order id and POST = 409 conflict
		}
		
		@Test
		public void testSecurity() {
			Order order = new Order();
			order.setOrderId(-100);
			Response res = given().auth().basic(user1, pass).body(order)
					.when().post("/create");

			assertEquals("Status code incorrect", 401, res.getStatusCode());
			//verify the payload
			//verify in DB
			//verify in UI
		}
	}

	class Order{
		int orderId;
		String orderName;	

		public Order(String orderName) {
		
			this.orderId = Math.random()*1000;
			//verify if order id should be non existent (can be done using rest Assured GET call/DB query)
			this.orderName = orderName;
		}

		public Order(int num, String orderName) {
			this.orderId = num;
			this.orderName = orderName;
		}

		public Order() {
			this.orderId = Math.random()*1000;
			//
			this.orderName = generateRandomName(10); 
			//Need to create method for random string
		}

		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public String getOrderName() {
			return orderName;
		}
		public void setOrderName(String orderName) {
			this.orderName = orderName;
		}
	}
}

*/
