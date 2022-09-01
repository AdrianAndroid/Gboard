package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: lwc  reason: default package */
/* loaded from: classes.dex */
public final class lwc extends lvp {
    public static final Set a;
    public static final luy b;
    public static final lwa c = new lwa();
    private final String d;
    private final Level e;
    private final Set f;
    private final luy g;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(ltk.a, luh.a)));
        a = unmodifiableSet;
        b = lvb.a(unmodifiableSet);
    }

    public lwc(String str, Level level, Set set, luy luyVar) {
        super(str);
        this.d = lvw.c(str);
        this.e = level;
        this.f = set;
        this.g = luyVar;
    }

    public static void a(lum lumVar, String str, Level level, Set set, luy luyVar) {
        String sb;
        lvi g = lvi.g(lvl.f(), lumVar.m());
        int intValue = lumVar.q().intValue();
        int intValue2 = level.intValue();
        if (intValue < intValue2 || lvn.b(lumVar, g, set)) {
            StringBuilder sb2 = new StringBuilder();
            if (intValue >= intValue2 || lumVar.n() == null) {
                lxb.e(lumVar, sb2);
                lvn.d(g, luyVar, sb2);
            } else {
                sb2.append("(REDACTED) ");
                sb2.append(lumVar.n().b);
            }
            sb = sb2.toString();
        } else {
            sb = lvn.a(lumVar);
        }
        Throwable th = (Throwable) lumVar.m().d(ltk.a);
        int b2 = lvw.b(lumVar.q());
        if (b2 == 2 || b2 == 3) {
            return;
        }
        if (b2 == 4) {
            Log.i(str, sb, th);
        } else if (b2 != 5) {
            Log.e(str, sb, th);
        } else {
            Log.w(str, sb, th);
        }
    }

    @Override // defpackage.lun
    public final void b(lum lumVar) {
        a(lumVar, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.lun
    public final boolean c(Level level) {
        int b2 = lvw.b(level);
        return Log.isLoggable(this.d, b2) || Log.isLoggable("all", b2);
    }
}
