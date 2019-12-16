package com.okta.springbootvue.Entity;

import javax.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "GroupTable")
@Getter
@Setter
@NoArgsConstructor
public class Group {
    @Id
    @SequenceGenerator(name="group_seq",sequenceName="group_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="group_seq")
    @Column(name="groupId",unique = true, nullable = false)
    private Long groupId;
    private String groupName;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
