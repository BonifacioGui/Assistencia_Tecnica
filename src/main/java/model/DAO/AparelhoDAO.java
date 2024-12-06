package model.DAO;

import model.Aparelho;
import util.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AparelhoDAO {
    private Connection conn;

    public AparelhoDAO() {
        this.conn = DatabaseConnection.getConnection();
    }

    public boolean adicionarAparelho(Aparelho aparelho) {
        String sql = "INSERT INTO Aparelho (nome, marca, tipo, ano) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, aparelho.getNome());
            stmt.setString(2, aparelho.getMarca());
            stmt.setString(3, aparelho.getTipo());
            stmt.setInt(4, aparelho.getAno());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Aparelho> listarAparelhos() {
        List<Aparelho> aparelhos = new ArrayList<>();
        String sql = "SELECT * FROM Aparelho";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Aparelho aparelho = new Aparelho(
                    rs.getString("nome"),
                    rs.getString("marca"),
                    rs.getString("tipo"),
                    rs.getInt("ano")
                );
                aparelho.setId(rs.getInt("id"));
                aparelhos.add(aparelho);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return aparelhos;
    }
}
