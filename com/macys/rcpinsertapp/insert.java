package com.macys.rcpinsertapp;

/*
import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.TextMessage;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.tibco.tibjms.TibjmsQueue;
*/
public class insert {

	/*public static void main(String[] args) {

		Display display = new Display();
		Shell shell = new Shell(display);


		// the layout manager handle the layout
		// of the widgets in the container
		GridLayout gridLayout = new GridLayout(2, false);
		shell.setLayout(gridLayout);

		Composite parentComposite = new Composite(shell, SWT.NONE);

		parentComposite.setLayout(gridLayout);

		// Shell can be used as container
		// Label label = new Label(parentComposite, SWT.BORDER);
		// label.setSize(800, 200);
		// Image macysImage = new Image(display,
		// "C:\\Users\\m688117\\Desktop\\Macys.jpg");
		// label.setImage(macysImage);
		// label.setToolTipText("This is the Macys Image");

		GridLayout layout = new GridLayout(2, false);
		Composite baseComposite = new Composite(parentComposite, SWT.NONE);
		baseComposite.setLayout(layout);

		GridData gridDataOne = new GridData(SWT.FILL, SWT.FILL, true, true, 2,1);
		Label headerURL = new Label(baseComposite, SWT.NONE);
		headerURL.setLayoutData(gridDataOne);
		headerURL.setSize(40, 300);
		headerURL.setText("For Pricing Pubsub");

		// create new layout data
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		Label serverURLLabel = new Label(baseComposite, SWT.NONE);
		serverURLLabel.setLayoutData(gridData);
		serverURLLabel.setSize(40, 300);
		serverURLLabel.setText("Enter the tibco url");


		final Text serverURLTextBox = new Text(baseComposite, SWT.NONE);
		serverURLTextBox.setLayoutData(gridData);
		serverURLTextBox.setSize(40, 200);
		// serverURLTextBox.setText("tcp://tibanc14.federated.fds:7225");
		// serverURLTextBox.setText("tcp://tibenp16.federated.fds:7272");

		//serverURLTextBox.setText("tcp://tibanc36.federated.fds:7225"); //
		// Cell5/trunk perf product pubsub/colorway pricing
		//serverURLTextBox.setText("tcp://tibanc37.federated.fds:7222"); //
		// cell2/FDS product pubsub/colorway pricing
		// serverURLTextBox.setText("tcp://tibenp08.federated.fds:7245"); // QA
		// product pubsub
		serverURLTextBox.setText("tcp://tibenp27.federated.fds:7272");// staging
		// Env
		// serverURLTextBox.setText("tcp://tibenp26.federated.fds:7242"); //End
		// to End Product pubsub
		// serverURLTextBox.setText("tcp://tibenp08.federated.fds:7242"); //End
		// to End Colorway Pricing
		// serverURLTextBox.setText("tcp://tibe08.federated.fds:7258"); //Prod
		// Congruent Pricing
		// serverURLTextBox.setText("tcp://tibe08.federated.fds:7252"); // Prod
		// Nebula service
		// serverURLTextBox.setText("tcp://tibenp07.federated.fds:7252"); //
		// Prod backup Nebula service
		// serverURLTextBox.setText("tcp://tibe29.federated.fds:7252"); // Perf
		// Nebula service

		Label userNameLabel = new Label(baseComposite, SWT.NONE);
		userNameLabel.setLayoutData(gridData);
		userNameLabel.setSize(60, 200);
		userNameLabel.setText("Enter the username");

		final Text userNameTextBox = new Text(baseComposite, SWT.NONE);
		userNameTextBox.setLayoutData(gridData);
		userNameTextBox.setText("strsuser");

		Label qNameLabel = new Label(baseComposite, SWT.NONE);
		qNameLabel.setLayoutData(gridData);
		qNameLabel.setSize(600, 200);
		qNameLabel.setText("Enter the queue name");

		final Text qNameTextBox = new Text(baseComposite, SWT.NONE);
		qNameTextBox.setLayoutData(gridData);
		// qNameTextBox.setText("M.COM.STRS.PRODUCT.PDF.BLM.SUB"); //prod pubsub
		// bcom
		// qNameTextBox.setText("M.COM.STRS.PRODUCT.PDF.MCY.SUB"); //prod pubsub
		// mcom
		// qNameTextBox.setText("M.COM.STRS.PRICE.PRICEEVENTS.RECEIVER"); //
		// colorway pricing
		qNameTextBox.setText("M.COM.STRS.PRICE.PRICECHANGE.RECEIVER"); // congruent
		// pricing
		// qNameTextBox.setText("M.COM.STRS.ORDER.MSG.STARS.SUB"); //affinity
		// messages to affinity_pid_color
		Label divisionLabel = new Label(baseComposite, SWT.NONE);
		divisionLabel.setLayoutData(gridData);
		divisionLabel.setSize(600, 200);
		divisionLabel.setText("Enter the division");

		final Text divisionTextBox = new Text(baseComposite, SWT.NONE);
		divisionTextBox.setLayoutData(gridData);
		divisionTextBox.setText("12");

		Label typeLabel = new Label(baseComposite, SWT.NONE);
		typeLabel.setLayoutData(gridData);
		typeLabel.setSize(600, 200);
		typeLabel.setText("Enter Insert/Update/Delete");

		final Text typeTextBox = new Text(baseComposite, SWT.NONE);
		typeTextBox.setLayoutData(gridData);
		typeTextBox.setText("CPC-I");

		Label messageTypeLabel = new Label(baseComposite, SWT.NONE);
		messageTypeLabel.setLayoutData(gridData);
		messageTypeLabel.setSize(600, 200);
		messageTypeLabel.setText("Enter the message type");

		final Text messageType = new Text(baseComposite, SWT.NONE);
		messageType.setLayoutData(gridData);
		messageType.setText("POS");

		Label xmlMessageLabel = new Label(baseComposite, SWT.NONE);
		xmlMessageLabel.setLayoutData(gridData);
		xmlMessageLabel.setSize(600, 200);
		xmlMessageLabel.setText("Enter the xml message");

		final Text xmlMessageTextBox = new Text(baseComposite, SWT.MULTI);
		xmlMessageTextBox.setLayoutData(gridData);
		xmlMessageTextBox.setTextLimit(200000);

		Button submitButton = new Button(baseComposite, SWT.NONE);
		submitButton.setText(" Submit ");
		submitButton.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				String serverURL = serverURLTextBox.getText();
				String userName = userNameTextBox.getText();
				String qName = qNameTextBox.getText();
				String division = divisionTextBox.getText();
				String type = typeTextBox.getText();
				String msgType = messageType.getText();
				String xmlMessage = xmlMessageTextBox.getText();
				System.out.println(serverURL);
				System.out.println(userName);
				System.out.println(qName);
				System.out.println(division);
				System.out.println(type);
				System.out.println(msgType);
				System.out.println(xmlMessage);
				sendMessageToTibcoQueue(serverURL, userName, userName, qName,
						xmlMessage, division, type, msgType);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	protected static void sendMessageToTibcoQueue(String serverURL,
			String userName, String userName2, String qName, String xmlMessage,
			String division, String type, String messageType) {
		try {
			QueueConnectionFactory factory = new com.tibco.tibjms.TibjmsQueueConnectionFactory(
					serverURL);
			QueueConnection connection = factory.createQueueConnection(
					userName, userName);
			QueueSession session = connection.createQueueSession(false,
					javax.jms.Session.AUTO_ACKNOWLEDGE);
			TibjmsQueue queue = (TibjmsQueue) session.createQueue(qName);
			QueueSender sender = session.createSender(queue);
			TextMessage msg = session.createTextMessage();
			// JMSDeliveryMode PERSISTENT
			msg.setJMSDeliveryMode(DeliveryMode.PERSISTENT);
			// JMSPriority 4
			msg.setJMSPriority(4);
			msg.setStringProperty("CorrelationID", "replay-mcom-bcom-colorway-121");
			msg.setStringProperty("Div", division);
			msg.setObjectProperty("Type", type);
			msg.setStringProperty("MessageType", messageType);
			msg.setStringProperty("DivDept", division + "|" + 912);
			msg.setText(xmlMessage);
			sender.send(msg);
			sender.close();
			session.close();
			connection.close();
		} catch (JMSException e) {
			e.printStackTrace();
			System.out.println("?This is a problem");
		}
		System.out.println("Message sent successfully");
	}*/
}
