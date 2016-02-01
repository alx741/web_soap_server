package ws;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public class ExamenWs {

  public String sayHello(String name) {
    if (name == null) {
      return "Hello";
    }

    return "Hello, " + name + "!";
  }
}
