package com.pml_dispatch;

public class pickup_fragment_model {

   private String name;
   private int logo;
   private int expsion;
   private String Location;
   private String gender;
   private String time;
   private String terminal;

   public pickup_fragment_model(String name, int logo, int expsion, String location, String gender, String time, String terminal) {
      this.name = name;
      this.logo = logo;
      this.expsion = expsion;
      this.Location = location;
      this.gender = gender;
      this.time = time;
      this.terminal = terminal;
   }
   public pickup_fragment_model(String name){
      this.name=name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getLogo() {
      return logo;
   }

   public void setLogo(int logo) {
      this.logo = logo;
   }

   public int getExpsion() {
      return expsion;
   }

   public void setExpsion(int expsion) {
      this.expsion = expsion;
   }

   public String getLocation() {
      return Location;
   }

   public void setLocation(String location) {
      Location = location;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   public String getTime() {
      return time;
   }

   public void setTime(String time) {
      this.time = time;
   }

   public String getTerminal() {
      return terminal;
   }

   public void setTerminal(String terminal) {
      this.terminal = terminal;
   }
}
