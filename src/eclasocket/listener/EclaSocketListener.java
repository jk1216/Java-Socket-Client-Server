/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eclasocket.listener;

/**
 *
 * @author Milan
 */
public interface EclaSocketListener {
    void onRecive(String response);
    void onConnected(boolean connect);
}
