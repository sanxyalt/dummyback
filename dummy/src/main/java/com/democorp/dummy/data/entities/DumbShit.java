package com.democorp.dummy.data.entities;

import com.democorp.dummy.data.entities.enums.DumbShitStatus;
import com.democorp.dummy.utils.DumbUtils;
import jakarta.persistence.*;

@Entity
@Table(name = "DUMB_SHIT")
public class DumbShit extends BasicShiet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    @Column(name = "SHIT_NAME", nullable = false, length = 150)
    private String shitName;
    @Enumerated(EnumType.STRING)
    @Column(name = "SHIT_STATUS", nullable = false, length = 100)
    private DumbShitStatus shitStatus;
    @Basic
    @Column(name = "DUMB_RANK", nullable = false)
    private Integer dumbRank;
    @Transient
    private String dumbTitle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShitName() {
        return shitName;
    }

    public void setShitName(String shitName) {
        this.shitName = shitName;
    }

    public DumbShitStatus getShitStatus() {
        return shitStatus;
    }

    public void setShitStatus(DumbShitStatus shitStatus) {
        this.shitStatus = shitStatus;
    }

    public Integer getDumbRank() {
        return dumbRank;
    }

    public void setDumbRank(Integer dumbRank) {
        this.dumbRank = dumbRank;
    }

    public String getDumbTitle() {
        return DumbUtils.determineTitleFromRank(dumbRank);
    }
}
