package com.laliga.liga_zone.player;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "player_stats")
public class Player {

    @Id
    @Column(name = "player", nullable = false, length = 100)
    private String name;  // Changed from 'player' to 'name' to match repository

    @Column(name = "nation", length = 50)
    private String nation;

    @Column(name = "pos", length = 20)
    private String pos;

    @Column(name = "squad", length = 50)  // Changed from 'team' to 'squad' to match CSV
    private String squad;

    @Column(name = "age")
    private Integer age;

    @Column(name = "born")
    private Integer born;

    @Column(name = "mp")
    private Integer mp = 0;

    @Column(name = "starts")
    private Integer starts = 0;

    @Column(name = "min")
    private Integer min = 0;

    @Column(name = "90s", precision = 5, scale = 1)
    private BigDecimal nineties = BigDecimal.ZERO;

    @Column(name = "gls")
    private Integer gls = 0;

    @Column(name = "ast")
    private Integer ast = 0;

    @Column(name = "g+a")
    private Integer gPlusA = 0;

    @Column(name = "g-pk")
    private Integer gMinusPk = 0;

    @Column(name = "pk")
    private Integer pk = 0;

    @Column(name = "pkatt")
    private Integer pkatt = 0;

    @Column(name = "crdy")
    private Integer crdy = 0;

    @Column(name = "crdr")
    private Integer crdr = 0;

    @Column(name = "xg", precision = 5, scale = 2)
    private BigDecimal xg = BigDecimal.ZERO;

    @Column(name = "npxg", precision = 5, scale = 2)
    private BigDecimal npxg = BigDecimal.ZERO;

    @Column(name = "xag", precision = 5, scale = 2)
    private BigDecimal xag = BigDecimal.ZERO;

    @Column(name = "npxg+xag", precision = 5, scale = 2)
    private BigDecimal npxgPlusXag = BigDecimal.ZERO;

    @Column(name = "prgc")
    private Integer prgc = 0;

    @Column(name = "prgp")
    private Integer prgp = 0;

    @Column(name = "prgr")
    private Integer prgr = 0;

    @Column(name = "gls.1", precision = 5, scale = 2)
    private BigDecimal glsPer90 = BigDecimal.ZERO;

    @Column(name = "ast.1", precision = 5, scale = 2)
    private BigDecimal astPer90 = BigDecimal.ZERO;

    @Column(name = "g+a.1", precision = 5, scale = 2)
    private BigDecimal gPlusAPer90 = BigDecimal.ZERO;

    @Column(name = "g-pk.1", precision = 5, scale = 2)
    private BigDecimal gMinusPkPer90 = BigDecimal.ZERO;

    @Column(name = "g+a-pk", precision = 5, scale = 2)
    private BigDecimal gPlusAMinusPk = BigDecimal.ZERO;

    @Column(name = "xg.1", precision = 5, scale = 2)
    private BigDecimal xgPer90 = BigDecimal.ZERO;

    @Column(name = "xag.1", precision = 5, scale = 2)
    private BigDecimal xagPer90 = BigDecimal.ZERO;

    @Column(name = "xg+xag", precision = 5, scale = 2)
    private BigDecimal xgPlusXag = BigDecimal.ZERO;

    @Column(name = "npxg.1", precision = 5, scale = 2)
    private BigDecimal npxgPer90 = BigDecimal.ZERO;

    @Column(name = "npxg+xag.1", precision = 5, scale = 2)
    private BigDecimal npxgPlusXagPer90 = BigDecimal.ZERO;

    // Default constructor
    public Player() {}

    // Constructor
    public Player(String name, String nation, String pos, String squad, Integer age, Integer born, Integer mp, Integer starts, Integer min, BigDecimal nineties, Integer gls, Integer ast, Integer gPlusA, Integer gMinusPk, Integer pk, Integer pkatt, Integer crdy, Integer crdr, BigDecimal xg, BigDecimal npxg, BigDecimal xag, BigDecimal npxgPlusXag, Integer prgc, Integer prgp, Integer prgr, BigDecimal glsPer90, BigDecimal astPer90, BigDecimal gPlusAPer90, BigDecimal gMinusPkPer90, BigDecimal gPlusAMinusPk, BigDecimal xgPer90, BigDecimal xagPer90, BigDecimal xgPlusXag, BigDecimal npxgPer90, BigDecimal npxgPlusXagPer90) {
        this.name = name;
        this.nation = nation;
        this.pos = pos;
        this.squad = squad;
        this.age = age;
        this.born = born;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.nineties = nineties;
        this.gls = gls;
        this.ast = ast;
        this.gPlusA = gPlusA;
        this.gMinusPk = gMinusPk;
        this.pk = pk;
        this.pkatt = pkatt;
        this.crdy = crdy;
        this.crdr = crdr;
        this.xg = xg;
        this.npxg = npxg;
        this.xag = xag;
        this.npxgPlusXag = npxgPlusXag;
        this.prgc = prgc;
        this.prgp = prgp;
        this.prgr = prgr;
        this.glsPer90 = glsPer90;
        this.astPer90 = astPer90;
        this.gPlusAPer90 = gPlusAPer90;
        this.gMinusPkPer90 = gMinusPkPer90;
        this.gPlusAMinusPk = gPlusAMinusPk;
        this.xgPer90 = xgPer90;
        this.xagPer90 = xagPer90;
        this.xgPlusXag = xgPlusXag;
        this.npxgPer90 = npxgPer90;
        this.npxgPlusXagPer90 = npxgPlusXagPer90;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getNation() { return nation; }
    public void setNation(String nation) { this.nation = nation; }

    public String getPos() { return pos; }
    public void setPos(String pos) { this.pos = pos; }

    public String getSquad() { return squad; }
    public void setSquad(String squad) { this.squad = squad; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public Integer getBorn() { return born; }
    public void setBorn(Integer born) { this.born = born; }

    public Integer getMp() { return mp; }
    public void setMp(Integer mp) { this.mp = mp; }

    public Integer getStarts() { return starts; }
    public void setStarts(Integer starts) { this.starts = starts; }

    public Integer getMin() { return min; }
    public void setMin(Integer min) { this.min = min; }

    public BigDecimal getNineties() { return nineties; }
    public void setNineties(BigDecimal nineties) { this.nineties = nineties; }

    public Integer getGls() { return gls; }
    public void setGls(Integer gls) { this.gls = gls; }

    public Integer getAst() { return ast; }
    public void setAst(Integer ast) { this.ast = ast; }

    public Integer getgPlusA() { return gPlusA; }
    public void setgPlusA(Integer gPlusA) { this.gPlusA = gPlusA; }

    public Integer getgMinusPk() { return gMinusPk; }
    public void setgMinusPk(Integer gMinusPk) { this.gMinusPk = gMinusPk; }

    public Integer getPk() { return pk; }
    public void setPk(Integer pk) { this.pk = pk; }

    public Integer getPkatt() { return pkatt; }
    public void setPkatt(Integer pkatt) { this.pkatt = pkatt; }

    public Integer getCrdy() { return crdy; }
    public void setCrdy(Integer crdy) { this.crdy = crdy; }

    public Integer getCrdr() { return crdr; }
    public void setCrdr(Integer crdr) { this.crdr = crdr; }

    public BigDecimal getXg() { return xg; }
    public void setXg(BigDecimal xg) { this.xg = xg; }

    public BigDecimal getNpxg() { return npxg; }
    public void setNpxg(BigDecimal npxg) { this.npxg = npxg; }

    public BigDecimal getXag() { return xag; }
    public void setXag(BigDecimal xag) { this.xag = xag; }

    public BigDecimal getNpxgPlusXag() { return npxgPlusXag; }
    public void setNpxgPlusXag(BigDecimal npxgPlusXag) { this.npxgPlusXag = npxgPlusXag; }

    public Integer getPrgc() { return prgc; }
    public void setPrgc(Integer prgc) { this.prgc = prgc; }

    public Integer getPrgp() { return prgp; }
    public void setPrgp(Integer prgp) { this.prgp = prgp; }

    public Integer getPrgr() { return prgr; }
    public void setPrgr(Integer prgr) { this.prgr = prgr; }

    public BigDecimal getGlsPer90() { return glsPer90; }
    public void setGlsPer90(BigDecimal glsPer90) { this.glsPer90 = glsPer90; }

    public BigDecimal getAstPer90() { return astPer90; }
    public void setAstPer90(BigDecimal astPer90) { this.astPer90 = astPer90; }

    public BigDecimal getgPlusAPer90() { return gPlusAPer90; }
    public void setgPlusAPer90(BigDecimal gPlusAPer90) { this.gPlusAPer90 = gPlusAPer90; }

    public BigDecimal getgMinusPkPer90() { return gMinusPkPer90; }
    public void setgMinusPkPer90(BigDecimal gMinusPkPer90) { this.gMinusPkPer90 = gMinusPkPer90; }

    public BigDecimal getgPlusAMinusPk() { return gPlusAMinusPk; }
    public void setgPlusAMinusPk(BigDecimal gPlusAMinusPk) { this.gPlusAMinusPk = gPlusAMinusPk; }

    public BigDecimal getXgPer90() { return xgPer90; }
    public void setXgPer90(BigDecimal xgPer90) { this.xgPer90 = xgPer90; }

    public BigDecimal getXagPer90() { return xagPer90; }
    public void setXagPer90(BigDecimal xagPer90) { this.xagPer90 = xagPer90; }

    public BigDecimal getXgPlusXag() { return xgPlusXag; }
    public void setXgPlusXag(BigDecimal xgPlusXag) { this.xgPlusXag = xgPlusXag; }

    public BigDecimal getNpxgPer90() { return npxgPer90; }
    public void setNpxgPer90(BigDecimal npxgPer90) { this.npxgPer90 = npxgPer90; }

    public BigDecimal getNpxgPlusXagPer90() { return npxgPlusXagPer90; }
    public void setNpxgPlusXagPer90(BigDecimal npxgPlusXagPer90) { this.npxgPlusXagPer90 = npxgPlusXagPer90; }
}