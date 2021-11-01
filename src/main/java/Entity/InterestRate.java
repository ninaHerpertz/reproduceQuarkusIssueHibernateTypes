package Entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@TypeDef(name = "json", typeClass = JsonType.class)
public class InterestRate extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Type(type = "json")
    private String properties;

    @Type(type = "json")
    private InterestProperties interestProperties;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public InterestProperties getInterestProperties() {
        return interestProperties;
    }

    public void setInterestProperties(InterestProperties interestProperties) {
        this.interestProperties = interestProperties;
    }
}
