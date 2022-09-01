package defpackage;

import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* renamed from: lwf  reason: default package */
/* loaded from: classes.dex */
public final class lwf extends LogRecord {
    private static final Object[] b = new Object[0];
    public final lvi a;
    private final lum c;

    static {
        new lwe();
    }

    protected lwf(lum lumVar, lur lurVar) {
        super(lumVar.q(), null);
        this.c = lumVar;
        this.a = lvi.g(lurVar, lumVar.m());
        ltp f = lumVar.f();
        setSourceClassName(f.b());
        setSourceMethodName(f.d());
        setLoggerName(lumVar.p());
        setMillis(TimeUnit.NANOSECONDS.toMillis(lumVar.e()));
        super.setParameters(b);
    }

    public static void a(lum lumVar, StringBuilder sb) {
        Object[] R;
        sb.append("  original message: ");
        if (lumVar.n() == null) {
            sb.append(lup.b(lumVar.o()));
        } else {
            sb.append(lumVar.n().b);
            sb.append("\n  original arguments:");
            for (Object obj : lumVar.R()) {
                sb.append("\n    ");
                sb.append(lup.b(obj));
            }
        }
        lur m = lumVar.m();
        if (m.b() > 0) {
            sb.append("\n  metadata:");
            for (int i = 0; i < m.b(); i++) {
                sb.append("\n    ");
                sb.append(m.c(i).a);
                sb.append(": ");
                sb.append(lup.b(m.e(i)));
            }
        }
        sb.append("\n  level: ");
        sb.append(lup.b(lumVar.q()));
        sb.append("\n  timestamp (nanos): ");
        sb.append(lumVar.e());
        sb.append("\n  class: ");
        sb.append(lumVar.f().b());
        sb.append("\n  method: ");
        sb.append(lumVar.f().d());
        sb.append("\n  line number: ");
        sb.append(lumVar.f().a());
    }

    @Override // java.util.logging.LogRecord
    public final String getMessage() {
        String message = super.getMessage();
        if (message != null) {
            return message;
        }
        String a = lvn.a.a(this.c, this.a);
        super.setMessage(a);
        return a;
    }

    @Override // java.util.logging.LogRecord
    public final void setMessage(String str) {
        if (str == null) {
            str = "";
        }
        super.setMessage(str);
    }

    @Override // java.util.logging.LogRecord
    public final void setParameters(Object[] objArr) {
        getMessage();
        if (objArr == null) {
            objArr = b;
        }
        super.setParameters(objArr);
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundle(ResourceBundle resourceBundle) {
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundleName(String str) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {\n  message: ");
        sb.append(getMessage());
        sb.append("\n  arguments: ");
        sb.append(getParameters() != null ? Arrays.asList(getParameters()) : "<none>");
        sb.append('\n');
        a(this.c, sb);
        sb.append("\n}");
        return sb.toString();
    }

    public lwf(lum lumVar, lur lurVar, byte[] bArr) {
        this(lumVar, lurVar);
        setThrown((Throwable) this.a.b(ltk.a));
        getMessage();
    }

    public lwf(RuntimeException runtimeException, lum lumVar, lur lurVar) {
        this(lumVar, lurVar);
        setLevel(lumVar.q().intValue() < Level.WARNING.intValue() ? Level.WARNING : lumVar.q());
        setThrown(runtimeException);
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append('\n');
        a(lumVar, sb);
        setMessage(sb.toString());
    }
}
