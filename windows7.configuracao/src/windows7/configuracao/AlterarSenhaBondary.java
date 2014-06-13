package windows7.configuracao;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.DropMode;
import javax.swing.JTextPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;

@SuppressWarnings("serial")
public class AlterarSenhaBondary extends JFrame {

	private JPanel contentPane;
	private JTextField tfNomeUsuario;
	private JTextField tfSenhaAntiga;
	private JTextField tfSenhaNova;
	private JTextField tfRepeteSenhaNova;

	public AlterarSenhaBondary() {
		super("Alteração de Senha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 51, 0));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GRAY, Color.BLUE, Color.GREEN, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tfNomeUsuario = new JTextField();
		tfNomeUsuario.setText("Nome do Usuário");
		tfNomeUsuario.setBounds(111, 121, 108, 20);
		contentPane.add(tfNomeUsuario);
		tfNomeUsuario.setColumns(10);

		tfSenhaAntiga = new JTextField();
		tfSenhaAntiga.setText("Senha Antiga");
		tfSenhaAntiga.setBounds(111, 148, 108, 20);
		contentPane.add(tfSenhaAntiga);
		tfSenhaAntiga.setColumns(10);

		tfSenhaNova = new JTextField();
		tfSenhaNova.setText("Nova Senha");
		tfSenhaNova.setBounds(111, 179, 108, 20);
		contentPane.add(tfSenhaNova);
		tfSenhaNova.setColumns(10);

		tfRepeteSenhaNova = new JTextField();
		tfRepeteSenhaNova.setText("Repita Nova Senha");
		tfRepeteSenhaNova.setBounds(111, 209, 108, 20);
		contentPane.add(tfRepeteSenhaNova);
		tfRepeteSenhaNova.setColumns(10);

		JLabel lblNewLabel = new JLabel("Imagem");
		lblNewLabel.setIcon(new ImageIcon("F:\\Senac\\6ES2\\windows7.configuracao\\boneco.jpg"));
		lblNewLabel.setBounds(166, 47, 63, 63);
		contentPane.add(lblNewLabel);
		
		JButton btnAceitar = new JButton("Aceitar");
		btnAceitar.setBounds(247, 147, 89, 23);
		contentPane.add(btnAceitar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(247, 178, 89, 23);
		contentPane.add(btnCancelar);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarSenhaBondary frame = new AlterarSenhaBondary();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
