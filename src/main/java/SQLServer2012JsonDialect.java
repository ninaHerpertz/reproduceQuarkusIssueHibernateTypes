import com.vladmihalcea.hibernate.type.json.JsonNodeBinaryType;
import org.hibernate.dialect.SQLServer2012Dialect;

import java.sql.Types;

public class SQLServer2012JsonDialect extends SQLServer2012Dialect {
    public SQLServer2012JsonDialect(){
        super();
        this.registerHibernateType(Types.OTHER, JsonNodeBinaryType.class.getName());

    }
}