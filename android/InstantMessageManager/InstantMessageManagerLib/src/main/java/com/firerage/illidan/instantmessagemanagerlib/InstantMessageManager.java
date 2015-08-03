package com.firerage.illidan.instantmessagemanagerlib;

import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;

import java.io.IOException;
import android.os.AsyncTask;

/**
 * Created by Illidan on 15/7/14.
 */
public class InstantMessageManager {

    public static final String HOST = "";
    public static final int PORT = 5222;
    public static final String SERVICE = "";

    public void connect() throws IOException, XMPPException, SmackException {

        new NetworkOperation().execute();

    }

    private class NetworkOperation extends AsyncTask<String, Void, String>  {
        @Override
        protected String doInBackground(String... urls) {

            XMPPTCPConnectionConfiguration.Builder builder = XMPPTCPConnectionConfiguration.builder();
            builder.setSecurityMode(ConnectionConfiguration.SecurityMode.disabled);
            builder.setUsernameAndPassword("name@" + SERVICE, "psd");
            builder.setServiceName(SERVICE);
            builder.setHost(HOST);
            builder.setDebuggerEnabled(true);
            builder.setPort(PORT);

            //this is also error
            //SASLPlainMechanism saslPlainMechanism = new SASLPlainMechanism();
            //SASLAuthentication.registerSASLMechanism(saslPlainMechanism);
            AbstractXMPPConnection connection = new XMPPTCPConnection(builder.build());
            //saslPlainMechanism.instanceForAuthentication(connection);

            try {
                connection.connect().login();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (XMPPException e) {
                e.printStackTrace();
            } catch (SmackException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(String result) {

        }
    }

}
