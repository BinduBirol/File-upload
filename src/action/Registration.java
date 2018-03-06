package action;
import java.sql.*;

import DTO.RegistrationDTO;
import jdbc.jdbcConncector;;

public class Registration {

	public String execute() throws SQLException{
		RegistrationDTO rdto= new RegistrationDTO();
		jdbcConncector con= new jdbcConncector();
		
		if(rdto.getName()!=null||rdto.getType()!=null||rdto.getEmail()!=null||rdto.getPhone()!=null||rdto.getPaperID()!=null){
			String sql= "INSERT INTO 'registration'" +
						"('NAME', 'TYPE', 'EMAIL', 'PHONE', 'ADDRESS', 'COUNTRY', 'PAPERID', " +
						"'MEMBERID', 'CATEGORY', 'ADDITIONAL_PAPERID', 'AFF-INS')" +
						" VALUES (?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement PST=con.CONNECTION().prepareStatement(sql);
			
			PST.setString(1, rdto.getName());
			PST.setString(2, rdto.getType());
			PST.setString(3, rdto.getEmail());
			PST.setString(4, rdto.getPhone());
			PST.setString(5, rdto.getAddress());
			PST.setString(6, rdto.getCountry());
			PST.setString(7, rdto.getPaperID());
			PST.setString(8, rdto.getMemberid());
			PST.setString(9, rdto.getCategory());
			PST.setString(10, rdto.getAdditional_paperid());
			PST.setString(11, rdto.getAff_ins());
//			PST.setString(12, rdto.getMyFile());
			
			PST.execute();
			System.out.println(rdto.getPaperID()+ " Registered!!");
			return "SUCCESS";
		}
		return "ERROR";
	}
	
}
