package com.corejsf;
 
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Date;
import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;


@Named("problemReport")
@SessionScoped

public class ProblemReport implements Serializable {
  @Inject

  private Project Project;
  public enum priorities {LOW, MEDIUM, HIGH, CRITICAL};
  public enum severity {LOW, MEDIUM, HIGH};
    
    private String title;
    private String Number;
    private Date dateofissue;
    private String originator;
    private String modulesaffected;
    private String description;
    private String recommendedsolution;
    private Date dateassigned;
    private Date datefixed;
    private boolean inScope;
    //private String heading;
    
    private priorities prioritiess = priorities.LOW;
    private severity severities = severity.LOW;
    
    public boolean getInScope() { return inScope;}
    public void setInScope(boolean newValue) {inScope = newValue;}
    
    public Project getProject() { return Project; }
    public void setProject(Project newValue) { Project = newValue;}
    
    public String gettitle() { return title; }   
    public void settitle(String newValue) { title = newValue; }
    
    public String getNumber() { return Number; }   
    
    public priorities getPriorities() { return prioritiess; }
    public void setpriorities(priorities newValue) { prioritiess = newValue; }
    
    public severity getSeverity() { return severities; }
    public void setseverity(severity newValue) {severities = newValue;}
    
    public void setNumber(String newValue) { Number = newValue; }
         
    public Date getdateofissue() { return dateofissue; }   
    public void setdateofissue(Date newValue) { dateofissue = newValue; }
    
    public String getoriginator() { return originator; }   
    public void setoriginator(String newValue) { originator = newValue; }
    
    public String getmodulesaffected() { return modulesaffected; }   
    public void setmodulesaffected(String newValue) { modulesaffected = newValue; }
    
    public String getdescription() { return description; }   
    public void setdescription(String newValue) { description = newValue; }
    
    public String getrecommendedsolution() { return recommendedsolution; }   
    public void setrecommendedsolution(String newValue) { recommendedsolution = newValue; }

    public Date getdateassigned() { return dateassigned; }   
    public void setdateassigned(Date newValue) { dateassigned = newValue; }
    
    public Date getdatefixed() { return datefixed; }   
    public void setdatefixed(Date newValue) { datefixed = newValue; }
    
    //------------------------------------------------------------------------
  
    public Map<String, priorities> getToppriorities() { return toppriorities; }
    public Map<String, severity> getTopseverities() { return topseverities;}     
    
    //-----------------------------------------------------------------------
  
    private static Map<String, priorities> toppriorities;
     static {
         toppriorities = new LinkedHashMap<String, priorities>();
         toppriorities.put("Low", priorities.LOW);
         toppriorities.put("Medium", priorities.MEDIUM);
         toppriorities.put("High", priorities.HIGH);
         toppriorities.put("Critical", priorities.CRITICAL);
     };
     
     //------------------------------------------------------------------------
     private static Map<String, severity> topseverities;
     static {
         topseverities = new LinkedHashMap<String, severity>();
         topseverities.put("Low", severity.LOW);
         topseverities.put("Medium", severity.MEDIUM);
         topseverities.put("High", severity.HIGH);
     };
     
     //------------------------------------------------------------------------
     
     String submit() {
        
     return "sucess";   
        
    }
    
     String getHeading() {         
         if(inScope == true) {    
             return "titleEnginer";
         } else {
             return "titleSoftware";
         }
         
         
     }
        
}
