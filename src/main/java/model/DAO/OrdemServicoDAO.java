package model.DAO;

import model.OrdemServico;
import util.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrdemServicoDAO {
    private Connection conn;

    public OrdemServicoDAO() {
        this.conn = DatabaseConnection.getConnection();
    }

    public boolean adicionarOrdem(OrdemServico ordem) {
        String sql = "INSERT INTO OrdemServico (data, aparelho_id, descricao_problema, tipo_servico, status) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDate(1, new java.sql.Date(ordem.getData().getTime()));
            stmt.setInt(2, ordem.getAparelho().getId());
            stmt.setString(3, ordem.getDescricaoProblema());
            stmt.setString(4, ordem.getTipoServico());
            stmt.setString(5, ordem.getStatus());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<OrdemServico> listarOrdens() {
        List<OrdemServico> ordens = new ArrayList<>();
        String sql = "SELECT * FROM OrdemServico";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                OrdemServico ordem = new OrdemServico(
                    rs.getDate("data"),
                    null, // Aparelho precisa ser buscado com outro DAO
                    rs.getString("descricao_problema"),
                    rs.getString("tipo_servico")
                );
                ordem.setId(rs.getInt("id"));
                ordem.setStatus(rs.getString("status"));
                ordens.add(ordem);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ordens;
    }
}

