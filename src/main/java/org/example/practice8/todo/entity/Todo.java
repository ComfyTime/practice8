package org.example.practice8.todo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.practice8.member.entity.Member;

@Getter
@Entity
@NoArgsConstructor
public class Todo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mamber_Id", nullable = false)
    private Member mamber;

    public Todo(String content, Member member) {
        this.content = content;
        this.mamber = member;
    }

    public void update(String content) {
        this.content = content;
    }
}
