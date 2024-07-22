package model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "Research")
@Entity
@Data
public class Research {

    private String title;
    private int year;
    private String description;
    private List<Member> listOfMembers;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Member> getListOfMembers() {
        return listOfMembers;
    }

    public void setListOfMembers(List<Member> listOfMembers) {
        this.listOfMembers = listOfMembers;
    }
}