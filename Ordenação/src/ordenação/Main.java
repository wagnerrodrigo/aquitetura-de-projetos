
package br.com.evaldo;

import br.com.evaldo.controller.ControllerPrincipal;
import br.com.evaldo.view.FramePrincipal;

/**
 *
 * @author Evaldo de Oliveira
 */
public class Main {

    public static void main(String[] args) {

        FramePrincipal framePrincipal = new FramePrincipal();
        new ControllerPrincipal(framePrincipal);
        framePrincipal.setVisible(true);

    }
}