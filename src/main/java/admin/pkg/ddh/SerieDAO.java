package admin.pkg.ddh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class SerieDAO {

	Connection connection;

	public SerieDAO(DataSource ds) { // on passe ici la connection de la servlet en parametre !
		try {
			this.connection = ds.getConnection();
			System.out.println("# # # New SerieDAO(ds)");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public SerieDAO() {
		System.out.println("# # # New SerieDAO");

	}

	public String sayHello() {
		return "HELLO, je suis un SerieDAO connecté à "+this.connection;
	}

	public String chercherNomParID(int id) throws SQLException {

		String myQuery = "SELECT nom,nomoriginal FROM serie WHERE id=?";

		try (PreparedStatement pstmt = connection.prepareStatement(myQuery);) {
			pstmt.setInt(1, id);

			try (ResultSet resultSet = pstmt.executeQuery()) {
				resultSet.next();
				String nom = resultSet.getString(1) + " " + resultSet.getString(2);
				return nom;
			}
		}

	}

	public List<Serie> afficherToutesSeries() throws SQLException {

		String myQuery = "SELECT * FROM serie";

		List<Serie> listeSerie = new ArrayList<Serie>();
		try (PreparedStatement pstmt = connection.prepareStatement(myQuery);) {
			//pstmt.setInt(1, id);

			try (ResultSet resultSet = pstmt.executeQuery()) {
				
				while(resultSet.next()) {
					Integer id = resultSet.getInt(1);
					String nom = resultSet.getString(2);
					String nomOriginal = resultSet.getString(3);
					Integer anneeParution = resultSet.getInt(4);
					String synopsis = resultSet.getString(5);
					Integer idStatut = resultSet.getInt(6);
					Integer idPaysOrigine = resultSet.getInt(7);
					
					listeSerie.add(new Serie(id,nom,nomOriginal,anneeParution,synopsis,idStatut,idPaysOrigine));
				}
				
			}
		}
		return listeSerie;
	}
	
	public void effacerSerie(String nomSerie) {
		
		String myQuery = "DELETE FROM SERIE WHERE nom = '"+nomSerie+"'";
				
	}
	
public void insererSerie(String nomSerie) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO ");
		sb.append("serie ");
		sb.append("");
		sb.append("VALUES ");
		sb.append("");
		
	
		String myQuery = sb.toString();
				
	}

}
