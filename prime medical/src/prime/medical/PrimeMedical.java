/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prime.medical;

/**
 *
 * @author esteb
 */
public class PrimeMedical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        prime pr = new prime();
        pr.setVisible(true);

        Inicio ci = new Inicio();
        ci.setVisible(false);
        ci.setLocationRelativeTo(null);

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(110);
                pr.LoadingValue.setText(Integer.toString(i) + "%");
                pr.progresobar.setValue(i);

                if (i == 100) {

                    pr.setVisible(false);

                    ci.setVisible(true);

                }

            }
        } catch (Exception e) {

        }

    }

}
