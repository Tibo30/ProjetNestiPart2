package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ProfilePanel extends JPanel {
	
	
	public ProfilePanel() throws Exception {
		
		this.setBackground(new Color(213,167,113));
		FlowLayout flowLayout = (FlowLayout) this.getLayout();
		this.setLayout(null);

		Button btnProfilModifyProfile = new Button("Profil_Modify_Profile", 175, 359, 125, 35);
		this.add(btnProfilModifyProfile);

		Button btnProfilModidyPassWord = new Button("Profil_Modify_Password", 439, 371, 149, 35);
		this.add(btnProfilModidyPassWord);

		Button btnProfilSavePassword = new Button("Profil_Save_Password", 439, 347, 149, 35);
		this.add(btnProfilSavePassword);

		Button btnProfilSaveProfil = new Button("Profil_Save_Profil", 175, 347, 125, 35);
		this.add(btnProfilSaveProfil);

		Label lblProfilFirstname = new Label("FirstName", 175, 95, 160, 20);
		this.add(lblProfilFirstname);

		Label lblProfilLastname = new Label("LastName", 173, 147, 162, 20);
		this.add(lblProfilLastname);

		Label lblProfilUsername = new Label("UserName", 174, 201, 161, 20);
		this.add(lblProfilUsername);

		Label lblProfilPassword = new Label("Password", 439, 95, 138, 14);
		this.add(lblProfilPassword);

		Label lblProfilNewPassword = new Label("New password", 439, 142, 138, 22);
		this.add(lblProfilNewPassword);

		Label lblProfilConfirmPassword = new Label("Confirm password", 439, 198, 138, 14);
		this.add(lblProfilConfirmPassword);

		TextField tfProfilFirstname = new TextField("profilFirstname", 175, 116, 160, 20);
		this.add(tfProfilFirstname);

		TextField tfProfilLastname = new TextField("profilLastname", 175, 170, 160, 20);
		this.add(tfProfilLastname);

		TextField TfProfilUsername = new TextField("profilUsername", 175, 223, 160, 20);
		this.add(TfProfilUsername);

		PasswordField profilPassword = new PasswordField("Profil Password", 439, 113, 138, 20);
		this.add(profilPassword);

		PasswordField profilNewPassword = new PasswordField("Profil NewPassword", 439, 167, 138, 20);
		this.add(profilNewPassword);

		PasswordField profilConfirmPassword = new PasswordField("Profil Conform Password", 439, 220, 138, 20);
		this.add(profilConfirmPassword);
		
	}

}
