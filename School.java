/**
 * Title: School Class
 * Description: Defines a school class capable of storing all the attributes of the 
 * student discipline annual report for 2015-2016 school year.
 * @author Roni Mikhaylov
 * @version 1.0
 * @since 2022-09-26
 */



public class School{
    // Declares instance variables
    private String dbn = new String();
    private String location_name = new String();
    private String location_category = new String();
    private Integer admin_district;
    private Integer American_Indian_Alaskan_Native_REMOVALS;
    private Integer American_Indian_Alaskan_Native_PRINCIPAL;
    private Integer American_Indian_Alaskan_Native_SUPERINTENDENT;
    private Integer American_Indian_Alaskan_Native_EXPULSIONS;
    private Integer Asian_REMOVALS;
    private Integer Asian_PRINCIPAL;
    private Integer Asian_SUPERINTENDENT;
    private Integer Asian_EXPULSIONS;
    private Integer Black_REMOVALS;
    private Integer Black_PRINCIPAL;
    private Integer Black_SUPERINTENDENT;
    private Integer Black_EXPULSIONS;
    private Integer Hispanic_REMOVALS;
    private Integer Hispanic_PRINCIPAL;
    private Integer Hispanic_SUPERINTENDENT;
    private Integer Hispanic_EXPULSIONS;
    private Integer White_REMOVALS;
    private Integer White_PRINCIPAL;
    private Integer White_SUPERINTENDENT;
    private Integer White_EXPULSIONS;
    private Integer Multi_Racial_REMOVALS;
    private Integer Multi_Racial_PRINCIPAL;
    private Integer Multi_Racial_SUPERINTENDENT;
    private Integer Multi_Racial_EXPULSIONS;
    private Integer Unknown_REMOVALS;
    private Integer Unknown_PRINCIPAL;
    private Integer Unknown_SUPERINTENDENT;
    private Integer Unknown_EXPULSIONS;

    /**
     * Constructor for School class
     * 
     * @param columns - the array of columns from the csv file
     * @throws NumberFormatException
     * @throws ElementNotFoundException
     */
    
    
    public School(String[] columns) {
        dbn = columns[0];
        location_name = columns[1];
        location_category = columns[2];
        try{
            admin_district = Integer.parseInt(columns[3]);
        }catch(NumberFormatException e){
            // set the variable to null
            admin_district = null;
        }try{
            American_Indian_Alaskan_Native_REMOVALS = Integer.parseInt(columns[4]);
        }
        catch(NumberFormatException f){
            // set the variable to null
            American_Indian_Alaskan_Native_REMOVALS = null;

        try{
            American_Indian_Alaskan_Native_PRINCIPAL = Integer.parseInt(columns[5]);
        }
        catch(NumberFormatException g){
            // set the variable to null
            American_Indian_Alaskan_Native_PRINCIPAL = null;
        }

        try{
            American_Indian_Alaskan_Native_SUPERINTENDENT = Integer.parseInt(columns[6]);
        }
        catch(NumberFormatException h){
            // set the variable to null
            American_Indian_Alaskan_Native_SUPERINTENDENT = null;
        }

        try{
            American_Indian_Alaskan_Native_EXPULSIONS = Integer.parseInt(columns[7]);
        }
        catch(NumberFormatException i){
            // set the variable to null
            American_Indian_Alaskan_Native_EXPULSIONS = null;
        }

        try{
            Asian_REMOVALS = Integer.parseInt(columns[8]);
        }
        catch(NumberFormatException j){
            // set the variable to null
            Asian_REMOVALS = null;
        }

        try{
            Asian_PRINCIPAL = Integer.parseInt(columns[9]);
        }
        catch(NumberFormatException k){
            // set the variable to null
            Asian_PRINCIPAL = null;
        }

        try{
            Asian_SUPERINTENDENT = Integer.parseInt(columns[10]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Asian_SUPERINTENDENT = null;
        }

        try{
            Asian_EXPULSIONS = Integer.parseInt(columns[11]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Asian_EXPULSIONS = null;
        }

        try{
            Black_REMOVALS = Integer.parseInt(columns[12]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Black_REMOVALS = null;
        }

        try{
            Black_PRINCIPAL = Integer.parseInt(columns[13]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Black_PRINCIPAL = null;
        }

        try{
            Black_SUPERINTENDENT = Integer.parseInt(columns[14]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Black_SUPERINTENDENT = null;
        }

        try{
            Black_EXPULSIONS = Integer.parseInt(columns[15]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Black_EXPULSIONS = null;
        }

        try{
            Hispanic_REMOVALS = Integer.parseInt(columns[16]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Hispanic_REMOVALS = null;
        }

        try{
            Hispanic_PRINCIPAL = Integer.parseInt(columns[17]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Hispanic_PRINCIPAL = null;
        }

        try{
            Hispanic_SUPERINTENDENT = Integer.parseInt(columns[18]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Hispanic_SUPERINTENDENT = null;
        }

        try{
            Hispanic_EXPULSIONS = Integer.parseInt(columns[19]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Hispanic_EXPULSIONS = null;
        }

        try{
            White_REMOVALS = Integer.parseInt(columns[20]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            White_REMOVALS = null;
        }

        try{
            White_PRINCIPAL = Integer.parseInt(columns[21]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            White_PRINCIPAL = null;
        }

        try{
            White_SUPERINTENDENT = Integer.parseInt(columns[22]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            White_SUPERINTENDENT = null;
        }

        try{
            White_EXPULSIONS = Integer.parseInt(columns[23]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            White_EXPULSIONS = null;
        }

        try{
            Multi_Racial_REMOVALS = Integer.parseInt(columns[24]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Multi_Racial_REMOVALS = null;
        }

        try{
            Multi_Racial_PRINCIPAL = Integer.parseInt(columns[25]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Multi_Racial_PRINCIPAL = null;
        }

        try{
            Multi_Racial_SUPERINTENDENT = Integer.parseInt(columns[26]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Multi_Racial_SUPERINTENDENT = null;
        }

        try{
            Multi_Racial_EXPULSIONS = Integer.parseInt(columns[27]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Multi_Racial_EXPULSIONS = null;
        }

        try{
            Unknown_REMOVALS = Integer.parseInt(columns[28]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Unknown_REMOVALS = null;
        }

        try{
            Unknown_PRINCIPAL = Integer.parseInt(columns[29]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Unknown_PRINCIPAL = null;
        }

        try{
            Unknown_SUPERINTENDENT = Integer.parseInt(columns[30]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Unknown_SUPERINTENDENT = null;
        }

        try{
            Unknown_EXPULSIONS = Integer.parseInt(columns[31]);
        }
        catch(NumberFormatException e){
            // set the variable to null
            Unknown_EXPULSIONS = null;
        }   
    }   
    }
  
    // getters
    public String getDbn(){
        if (dbn == null){
            return null;
        }
        else{
            return dbn;
        }
        
    }

    public void setDbn(String dbn){
        this.dbn = dbn;
    }
    public String getLocation_name(){
        if (location_name == null){
            return null;
        }
        else{
            return location_name;
        }
    }
    
    public void setLocation_name(String name){
        location_name = name;
    }
    public String getLocation_category(){
        if (location_category == null){
            return null;
        }
        else{
            return location_category;
        }
    }
    public void setLocation_category(String category){
        location_category = category;
    }
    public Integer getAdmin_district(){
        if (admin_district == null){
            return null;
        }
        else{
            return admin_district;
        }

    }
    public void setAdmin_district(Integer district){
        admin_district = district;
    }
    public Integer getAmerican_Indian_Alaskan_Native_REMOVALS(){
        if (American_Indian_Alaskan_Native_REMOVALS == null){
            return null;
        }
        else{
            return American_Indian_Alaskan_Native_REMOVALS;
        }
    }
    public void setAmerican_Indian_Alaskan_Native_REMOVALS(Integer removals){
        American_Indian_Alaskan_Native_REMOVALS = removals;
    }
    public Integer getAmerican_Indian_Alaskan_Native_PRINCIPAL(){
        if (American_Indian_Alaskan_Native_PRINCIPAL == null){
            return null;
        }
        else{
            return American_Indian_Alaskan_Native_PRINCIPAL;
        }
    }
    public void setAmerican_Indian_Alaskan_Native_PRINCIPAL(Integer principal){
        American_Indian_Alaskan_Native_PRINCIPAL = principal;
    }
    public Integer getAmerican_Indian_Alaskan_Native_SUPERINTENDENT(){
        if (American_Indian_Alaskan_Native_SUPERINTENDENT == null){
            return null;
        }
        else{
            return American_Indian_Alaskan_Native_SUPERINTENDENT;
        }
        
    }
    public void setAmerican_Indian_Alaskan_Native_SUPERINTENDENT(Integer superintendent){
        American_Indian_Alaskan_Native_SUPERINTENDENT = superintendent;
    }
    public Integer getAmerican_Indian_Alaskan_Native_EXPULSIONS(){
        if (American_Indian_Alaskan_Native_EXPULSIONS == null){
            return null;
        }
        else{
            return American_Indian_Alaskan_Native_EXPULSIONS;
        }
    }
    public void setAmerican_Indian_Alaskan_Native_EXPULSIONS(Integer expulsions){
        American_Indian_Alaskan_Native_EXPULSIONS = expulsions;
    }
    public Integer getAsian_REMOVALS(){
        if (Asian_REMOVALS == null){
            return null;
        }
        else{
            return Asian_REMOVALS;
        }

        
    }
    public void setAsian_REMOVALS(Integer removals){
        Asian_REMOVALS = removals;
    }
    public Integer getAsian_PRINCIPAL(){
        if (Asian_PRINCIPAL == null){
            return null;
        }
        else{
            return Asian_PRINCIPAL;
        }
    }
    public void setAsian_PRINCIPAL(Integer principal){
        Asian_PRINCIPAL = principal;
    }
    public Integer getAsian_SUPERINTENDENT(){
        if (Asian_SUPERINTENDENT == null)
            return null;
        else
            return Asian_SUPERINTENDENT;

    }
    public void setAsian_SUPERINTENDENT(Integer superintendent){
        Asian_SUPERINTENDENT = superintendent;
    }
    public Integer getAsian_EXPULSIONS(){
        if (Asian_EXPULSIONS == null){
            return null;
        }
        else{
            return Asian_EXPULSIONS;
        }
    }
    public void setAsian_EXPULSIONS(Integer expulsions){
        Asian_EXPULSIONS = expulsions;
    }
    public Integer getBlack_REMOVALS(){
        if (Black_REMOVALS == null){
            return null;
        }
        else{
            return Black_REMOVALS;
        }

    }
    public void setBlack_REMOVALS(Integer removals){
        Black_REMOVALS = removals;
    }
    public Integer getBlack_PRINCIPAL(){
        if (Black_PRINCIPAL == null){
            return null;
        }
        else{
            return Black_PRINCIPAL;
        }
    }
    public void setBlack_PRINCIPAL(Integer principal){
        Black_PRINCIPAL = principal;
    }
    public Integer getBlack_SUPERINTENDENT(){
        if (Black_SUPERINTENDENT == null){
            return null;
        }
        else{
            return Black_SUPERINTENDENT;
        }
    }
    public void setBlack_SUPERINTENDENT(Integer superintendent){
        Black_SUPERINTENDENT = superintendent;
    }
    public Integer getBlack_EXPULSIONS(){
        if (Black_EXPULSIONS == null){
            return null;
        }
        else{
            return Black_EXPULSIONS;
        }
    }

    public void setBlack_EXPULSIONS(Integer expulsions){
        Black_EXPULSIONS = expulsions;
    }
    public Integer getHispanic_REMOVALS(){
        if (Hispanic_REMOVALS == null)
            return null;
        return Hispanic_REMOVALS;
    }
    public void setHispanic_REMOVALS(int removals){
        Hispanic_REMOVALS = removals;
    }
    public Integer getHispanic_PRINCIPAL(){
        if (Hispanic_PRINCIPAL == null)
            return null;
        return Hispanic_PRINCIPAL;
    }
    public void setHispanic_PRINCIPAL(Integer principal){
        Hispanic_PRINCIPAL = principal;
    }
    public Integer getHispanic_SUPERINTENDENT(){
        if (Hispanic_SUPERINTENDENT == null)
            return null;
        return Hispanic_SUPERINTENDENT;
    }
    public void setHispanic_SUPERINTENDENT(Integer superintendent){
        Hispanic_SUPERINTENDENT = superintendent;
    }
    public Integer getHispanic_EXPULSIONS(){
        if (Hispanic_EXPULSIONS == null)
            return null;
        return Hispanic_EXPULSIONS;
    }
    public void setHispanic_EXPULSIONS(Integer expulsions){
        Hispanic_EXPULSIONS = expulsions;
    }
    public Integer getWhite_REMOVALS(){
        if (White_REMOVALS == null)
            return null;
        return White_REMOVALS;
    }
    public void setWhite_REMOVALS(Integer removals){
        White_REMOVALS = removals;
    }
    public Integer getWhite_PRINCIPAL(){
        if (White_PRINCIPAL == null)
            return null;
        return White_PRINCIPAL;
    }

    public void setWhite_PRINCIPAL(Integer principal){
        White_PRINCIPAL = principal;
    }
    public Integer getWhite_SUPERINTENDENT(){

        if (White_SUPERINTENDENT == null)
            return null;

        return White_SUPERINTENDENT;
    }
    public void setWhite_SUPERINTENDENT(Integer superintendent){
        White_SUPERINTENDENT = superintendent;
    }
    public Integer getWhite_EXPULSIONS(){
        if (White_EXPULSIONS == null)
            return null;

        return White_EXPULSIONS;
    }
    public void setWhite_EXPULSIONS(Integer expulsions){
        White_EXPULSIONS = expulsions;
    }
    public Integer getUnknownRemovals(){
        if (Unknown_REMOVALS == null)
            return null;
        return Unknown_REMOVALS;
    }
    public void setUnknown_REMOVALS(Integer removals){
        Unknown_REMOVALS = removals;
    }
    public Integer getUnkown_PRINCIPAL(){
        if (Unknown_PRINCIPAL == null)
            return null;

        return Unknown_PRINCIPAL;
    }
    public void setUnknown_PRINCIPAL(Integer principal){
        Unknown_PRINCIPAL = principal;
    }
    public Integer getUnkown_SUPERINTENDENT(){
        if (Unknown_SUPERINTENDENT == null)
            return null;
        return Unknown_SUPERINTENDENT;
    }
    public void setUnknown_SUPERINTENDENT(Integer superintendent){
        Unknown_SUPERINTENDENT = superintendent;
    }
    public Integer getUnknown_EXPULSIONS(){
        if (Unknown_EXPULSIONS == null)
            return null;
        return Unknown_EXPULSIONS;
    }
    public void setOther_EXPULSIONS(Integer expulsions){
        Unknown_EXPULSIONS = expulsions;
    }
    public void setMultiRacial_REMOVALS(Integer removals){
        Multi_Racial_REMOVALS = removals;

    }
    public Integer getMultiRacial_REMOVALS(){
        if (Multi_Racial_REMOVALS == null)
            return null;
        return Multi_Racial_REMOVALS;
    }
    public void setMultiRacial_PRINCIPAL(Integer principal){
        Multi_Racial_PRINCIPAL = principal;
    }
    public Integer getMultiRacial_PRINCIPAL(){
        if (Multi_Racial_PRINCIPAL == null)
            return null;
        return Multi_Racial_PRINCIPAL;
    }
    public void setMultiRacial_SUPERINTENDENT(Integer superintendent){
        Multi_Racial_SUPERINTENDENT = superintendent;
    }
    public Integer getMultiRacial_SUPERINTENDENT(){
        if (Multi_Racial_SUPERINTENDENT == null)
            return null;
        return Multi_Racial_SUPERINTENDENT;
    }
    public void setMultiRacial_EXPULSIONS(Integer expulsions){
        Multi_Racial_EXPULSIONS = expulsions;
        
    }
    public Integer getMultiRacial_EXPULSIONS(){
        if (Multi_Racial_EXPULSIONS == null)
            return null;
        
        return Multi_Racial_EXPULSIONS;
    }
    
    // getter method that accepts an attribute name and returns the value of that attribute
    // by calling the appropriate getter method for that specefic attribute
    public Object get(String attribute) {
        if (attribute.equals("District Borough Number")) return getDbn();
        if (attribute.equals("School Name")) return getLocation_name();
        if (attribute.equals("School Category")) return getLocation_category();
        if (attribute.equals("Administrative District")) return getAdmin_district();
        if (attribute.equals("American Indian/Alaskan Native REMOVALS")) return getAmerican_Indian_Alaskan_Native_REMOVALS();
        if (attribute.equals("American Indian/Alaskan Native PRINCIPAL")) return getAmerican_Indian_Alaskan_Native_PRINCIPAL();
        if (attribute.equals("American Indian/Alaskan Native SUPERINTENDENT")) return getAmerican_Indian_Alaskan_Native_SUPERINTENDENT();
        if (attribute.equals("American Indian/Alaskan Native EXPULSIONS")) return getAmerican_Indian_Alaskan_Native_EXPULSIONS();
        if (attribute.equals("Asian REMOVALS")) return getAsian_REMOVALS();
        if (attribute.equals("Asian PRINCIPAL")) return getAsian_PRINCIPAL();
        if (attribute.equals("Asian SUPERINTENDENT")) return getAsian_SUPERINTENDENT();
        if (attribute.equals("Asian EXPULSIONS")) return getAsian_EXPULSIONS();
        if (attribute.equals("Black REMOVALS")) return getBlack_REMOVALS();
        if (attribute.equals("Black PRINCIPAL")) return getBlack_PRINCIPAL();
        if (attribute.equals("Black SUPERINTENDENT")) return getBlack_SUPERINTENDENT();
        if (attribute.equals("Black EXPULSIONS")) return getBlack_EXPULSIONS();
        if (attribute.equals("Hispanic REMOVALS")) return getHispanic_REMOVALS();
        if (attribute.equals("Hispanic PRINCIPAL")) return getHispanic_PRINCIPAL();
        if (attribute.equals("Hispanic SUPERINTENDENT")) return getHispanic_SUPERINTENDENT();
        if (attribute.equals("Hispanic EXPULSIONS")) return getHispanic_EXPULSIONS();
        if (attribute.equals("White REMOVALS")) return getWhite_REMOVALS();
        if (attribute.equals("White PRINCIPAL")) return getWhite_PRINCIPAL();
        if (attribute.equals("White SUPERINTENDENT")) return getWhite_SUPERINTENDENT();
        if (attribute.equals("White EXPULSIONS")) return getWhite_EXPULSIONS();
        if (attribute.equals("Unknown REMOVALS")) return getUnknownRemovals();
        if (attribute.equals("Unknown PRINCIPAL")) return getUnkown_PRINCIPAL();
        if (attribute.equals("Unknown SUPERINTENDENT")) return getUnkown_SUPERINTENDENT();
        if (attribute.equals("Unknown EXPULSIONS")) return getUnknown_EXPULSIONS();
        if (attribute.equals("Multi-Racial REMOVALS")) return getMultiRacial_REMOVALS();
        if (attribute.equals("Multi-Racial PRINCIPAL")) return getMultiRacial_PRINCIPAL();
        if (attribute.equals("Multi-Racial SUPERINTENDENT")) return getMultiRacial_SUPERINTENDENT();
        if (attribute.equals("Multi-Racial EXPULSIONS")) return getMultiRacial_EXPULSIONS();
        return null;
        


        
    }
    public String toString(){
        return "School District Borough Number: " + dbn + "\n"+
        "School Name: " + location_name + "\n"+
        "School Category: " + location_category + "\n"+
        "Administrative District: " + admin_district + "\n"+
        "American Indian/Alaskan Native REMOVALS: " + American_Indian_Alaskan_Native_REMOVALS + "\n"+
        "American Indian/Alaskan Native PRINCIPAL: " + American_Indian_Alaskan_Native_PRINCIPAL + "\n"+
        "American Indian/Alaskan Native SUPERINTENDENT: " + American_Indian_Alaskan_Native_SUPERINTENDENT + "\n"+
        "American Indian/Alaskan Native EXPULSIONS: " + American_Indian_Alaskan_Native_EXPULSIONS + "\n"+
        "Asian REMOVALS: " + Asian_REMOVALS + "\n"+
        "Asian PRINCIPAL: " + Asian_PRINCIPAL + "\n"+
        "Asian SUPERINTENDENT: " + Asian_SUPERINTENDENT + "\n"+
        "Asian EXPULSIONS: " + Asian_EXPULSIONS + "\n"+
        "Black REMOVALS: " + Black_REMOVALS + "\n"+
        "Black PRINCIPAL: " + Black_PRINCIPAL + "\n"+
        "Black SUPERINTENDENT: " + Black_SUPERINTENDENT + "\n"+
        "Black EXPULSIONS: " + Black_EXPULSIONS + "\n"+
        "Hispanic REMOVALS: " + Hispanic_REMOVALS + "\n"+
        "Hispanic PRINCIPAL: " + Hispanic_PRINCIPAL + "\n"+
        "Hispanic SUPERINTENDENT: " + Hispanic_SUPERINTENDENT + "\n"+
        "Hispanic EXPULSIONS: " + Hispanic_EXPULSIONS + "\n"+
        "White REMOVALS: " + White_REMOVALS + "\n"+
        "White PRINCIPAL: " + White_PRINCIPAL + "\n"+
        "White SUPERINTENDENT: " + White_SUPERINTENDENT + "\n"+
        "White EXPULSIONS: " + White_EXPULSIONS + "\n"+
        "Unknown REMOVALS: " + Unknown_REMOVALS + "\n"+
        "Unknown PRINCIPAL: " + Unknown_PRINCIPAL + "\n"+
        "Unknown SUPERINTENDENT: " + Unknown_SUPERINTENDENT + "\n"+
        "Unknown EXPULSIONS: " + Unknown_EXPULSIONS + "\n"+
        "Multi-Racial REMOVALS: " + Multi_Racial_REMOVALS + "\n"+
        "Multi-Racial PRINCIPAL: " + Multi_Racial_PRINCIPAL + "\n"+
        "Multi-Racial SUPERINTENDENT: " + Multi_Racial_SUPERINTENDENT + "\n"+
        "Multi-Racial EXPULSIONS: " + Multi_Racial_EXPULSIONS + "\n\n";




        
    }


   
    }









