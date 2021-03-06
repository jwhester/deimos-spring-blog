package model;


import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name="posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 100)
    private String title;
    @Column(nullable = false, length = 1000)
    private String body;

    public Post(long id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String toString(){
        return "{ID: "+this.id+"}"
                +"{Title: "+this.title+"}"
                +"{Body:"+this.body+"}";
    }
}
