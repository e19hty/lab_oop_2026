import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Головний клас програми для Варіанта 10.
 */
public class Main extends JFrame {
    private static final long serialVersionUID = 1L;
    
    private JPanel contentPane;
    private JTextField txtVelocity; // Швидкість v
    private JTextField txtModulus;  // Модуль K
    private JTextField txtDensity;  // Густина ρ
    private JButton btnCalculate;
    
    // Об'єкт для математичних розрахунків
    private SoundSpeedCalculator calculator = new SoundSpeedCalculator();

    public Main() {
        setTitle("Лабораторна 12 - Швидкість звуку (В-10)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 250);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null); // Абсолютне позиціонування
        setContentPane(contentPane);

        // Елементи форми
        JLabel lblVelocity = new JLabel("Швидкість v (м/с):");
        lblVelocity.setBounds(30, 30, 140, 20);
        contentPane.add(lblVelocity);

        txtVelocity = new JTextField();
        txtVelocity.setBounds(180, 30, 150, 20);
        contentPane.add(txtVelocity);

        JLabel lblModulus = new JLabel("Модуль тиску K (Па):");
        lblModulus.setBounds(30, 60, 140, 20);
        contentPane.add(lblModulus);

        txtModulus = new JTextField();
        txtModulus.setBounds(180, 60, 150, 20);
        contentPane.add(txtModulus);

        JLabel lblDensity = new JLabel("Густина ρ (кг/м³):");
        lblDensity.setBounds(30, 90, 140, 20);
        contentPane.add(lblDensity);

        txtDensity = new JTextField();
        txtDensity.setBounds(180, 90, 150, 20);
        contentPane.add(txtDensity);

        btnCalculate = new JButton("Обчислити");
        btnCalculate.setBounds(180, 130, 150, 30);
        contentPane.add(btnCalculate);

        // Обробник натискання кнопки
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processCalculation();
            }
        });

        setVisible(true);
    }

    /**
     * Логіка розв'язання прямої та оберненої задачі.
     */
    private void processCalculation() {
        try {
            String vText = txtVelocity.getText().trim().replace(",", ".");
            String kText = txtModulus.getText().trim().replace(",", ".");
            String rhoText = txtDensity.getText().trim().replace(",", ".");

            // Обчислення швидкості v, якщо відомі K та ρ
            if (vText.isEmpty() && !kText.isEmpty() && !rhoText.isEmpty()) {
                double k = Double.parseDouble(kText);
                double rho = Double.parseDouble(rhoText);
                txtVelocity.setText(String.format("%.2f", calculator.calculateVelocity(k, rho)));
            } 
            // Обчислення модуля K, якщо відомі v та ρ
            else if (kText.isEmpty() && !vText.isEmpty() && !rhoText.isEmpty()) {
                double v = Double.parseDouble(vText);
                double rho = Double.parseDouble(rhoText);
                // Вивід у науковому форматі, оскільки Паскалі часто є великими числами
                txtModulus.setText(String.format("%E", calculator.calculateModulus(v, rho)));
            } 
            // Обчислення густини ρ, якщо відомі v та K
            else if (rhoText.isEmpty() && !vText.isEmpty() && !kText.isEmpty()) {
                double v = Double.parseDouble(vText);
                double k = Double.parseDouble(kText);
                txtDensity.setText(String.format("%.2f", calculator.calculateDensity(v, k)));
            } 
            else {
                JOptionPane.showMessageDialog(this, "Заповніть рівно два поля, щоб обчислити третє!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Помилка: введіть коректні числові значення!");
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, "Помилка: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    }
}

/**
 * Клас для інкапсуляції обчислювальної логіки (ООП).
 */
class SoundSpeedCalculator {
    
    // v = sqrt(K / ρ)
    public double calculateVelocity(double k, double rho) {
        if (rho <= 0) throw new ArithmeticException("Густина ρ повинна бути більшою за нуль");
        if (k < 0) throw new ArithmeticException("Модуль K не може бути від'ємним");
        return Math.sqrt(k / rho);
    }

    // K = v^2 * ρ
    public double calculateModulus(double v, double rho) {
        return Math.pow(v, 2) * rho;
    }

    // ρ = K / v^2
    public double calculateDensity(double v, double k) {
        if (v == 0) throw new ArithmeticException("Швидкість v не може дорівнювати нулю");
        return k / Math.pow(v, 2);
    }
}