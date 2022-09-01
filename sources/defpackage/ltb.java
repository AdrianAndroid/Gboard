package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: ltb  reason: default package */
/* loaded from: classes.dex */
public abstract class ltb {
    public final lun a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ltb(lun lunVar) {
        this.a = lunVar;
    }

    public static void f(String str, lum lumVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(lumVar.e()))));
        sb.append(": logging error [");
        ltp f = lumVar.f();
        if (f != ltp.a) {
            sb.append(f.b());
            sb.append('.');
            sb.append(f.d());
            sb.append(':');
            sb.append(f.a());
        }
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract ltv a(Level level);

    public final ltv b() {
        return a(Level.INFO);
    }

    public final ltv c() {
        return a(Level.SEVERE);
    }

    public final ltv d() {
        return a(Level.WARNING);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String e() {
        return this.a.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean g(Level level) {
        return this.a.c(level);
    }
}
