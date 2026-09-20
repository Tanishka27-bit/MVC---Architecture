import java.awt.event.*;

public class ControllerCalculator implements ActionListener {

    ViewsCalculator view;
    ModelsCalculator model;

    public ControllerCalculator(ViewsCalculator view , 
        ModelsCalculator model) {
        this.view = view;
        this.model = model;

        view.btnAdd.addActionListener(this);
        view.btnSub.addActionListener(this);
        view.btnMul.addActionListener(this);
        view.btnDiv.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(view.txtNum1.getText());
            double b = Double.parseDouble(view.txtNum2.getText());

            double result;

            if (e.getSource() == view.btnAdd)
                result = model.add(a, b);
            else if (e.getSource() == view.btnSub)
                result = model.subtract(a, b);
            else if (e.getSource() == view.btnMul)
                result = model.multiply(a, b);
            else if (e.getSource() == view.btnDiv)
                result = model.divide(a, b);
            else
                return;

            view.txtResult.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            view.txtResult.setText("Invalid Input");
        } catch (ArithmeticException ex) {
            view.txtResult.setText(ex.getMessage());
        }
    }
}