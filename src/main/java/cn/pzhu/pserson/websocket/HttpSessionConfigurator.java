package cn.pzhu.pserson.websocket;

import javax.servlet.http.HttpSession;
import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;

/**
 * NAME   :  WebChat/com.amayadream.webchat.websocket
 * TODO   :
 */
public class HttpSessionConfigurator extends ServerEndpointConfig.Configurator  {
    @Override
    public void modifyHandshake(ServerEndpointConfig config, HandshakeRequest request, HandshakeResponse response){
        HttpSession httpSession = (HttpSession)request.getHttpSession();
        config.getUserProperties().put(HttpSession.class.getName(),httpSession);
    }
}
