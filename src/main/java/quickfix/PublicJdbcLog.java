package quickfix;

import javax.sql.DataSource;
import java.sql.SQLException;

public class PublicJdbcLog extends JdbcLog {
    public PublicJdbcLog(SessionSettings settings, SessionID sessionID, DataSource ds) throws SQLException, ClassNotFoundException, ConfigError, FieldConvertError {
        super(settings, sessionID, ds);
    }

    @Override
    protected void logIncoming(String message) {
        super.logIncoming(message);
    }

    @Override
    protected void logOutgoing(String message) {
        super.logOutgoing(message);
    }
}
