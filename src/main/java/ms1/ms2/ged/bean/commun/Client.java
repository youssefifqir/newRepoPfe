package ms1.ms2.ged.bean.commun;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Client {
    @Id
   private Long id;
   private  String fullName;
   private String email;

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   private int age;
   private LocalDateTime dateRegistration;
   private BigDecimal nombreEnfant;
   @ManyToOne
   private ClientCategory clientCategory;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFullName() {
      return fullName;
   }

   public void setFullName(String fullName) {
      this.fullName = fullName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public LocalDateTime getDateRegistration() {
      return dateRegistration;
   }

   public void setDateRegistration(LocalDateTime dateRegistration) {
      this.dateRegistration = dateRegistration;
   }

   public BigDecimal getNombreEnfant() {
      return nombreEnfant;
   }

   public void setNombreEnfant(BigDecimal nombreEnfant) {
      this.nombreEnfant = nombreEnfant;
   }

   public ClientCategory getClientCategory() {
      return clientCategory;
   }

   public void setClientCategory(ClientCategory clientCategory) {
      this.clientCategory = clientCategory;
   }
}
