/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcconnect;

/**
 *
 * @author HP
 */
public class employee implements java.io.Serializable{
		private int id;
		private String name, departement;
		public int getId() {
		return id;
		}
		public String getName() {
			return name;
		}
		public String getDepartement() {
			return departement;
		}
		public void setID(int id) {
			this.id=id;
		}
		public void setName(String name) {
			this.name=name;
		}
		public void setDepartement(String departement) {
			this.departement=departement;
		}
		
}
