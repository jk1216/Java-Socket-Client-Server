/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eclasocket.example;

import eclasocket.MessageBuilder;
import eclasocket.listener.EclaSocketListener;
import eclasocket.SocketTransfer;
import eclasocket.Transfer;

/**
 *
 * @author Milan
 */
public class EclaClient {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Transfer client = new SocketTransfer();
        client.setPort(8888).setAddress("localhost").startClient();
        client.addListener(new EclaSocketListener() {

            @Override
            public void onRecive(String response) {
                System.out.println(response);
                System.out.println(MessageBuilder.parseMessage(response));
            }

            @Override
            public void onConnected(boolean connect) {
                System.out.println(String.valueOf(connect));
            }
        });
        client.sendMessage("Hello to server");
        
        // create object
        Person person = new Person();
        person.name = "Milan";
        person.lastname = "MilanNz";
        person.status = 1;
        
        client.sendMessageObject(person);
    }
            
    
}
