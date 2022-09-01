package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: him  reason: default package */
/* loaded from: classes.dex */
public final class him extends lvp {
    public final String a;
    public ltp b;

    public him(String str) {
        super(str);
        if (str.length() <= 23) {
            this.a = str;
            return;
        }
        String replace = str.replace('$', '.');
        String substring = replace.substring(replace.lastIndexOf(46) + 1);
        this.a = Build.VERSION.SDK_INT < 26 ? substring.substring(0, Math.min(substring.length(), 23)) : substring;
    }

    public static int a(Level level) {
        int intValue = level.intValue();
        if (intValue >= 1100) {
            return 7;
        }
        if (intValue >= 1000) {
            return 6;
        }
        if (intValue >= 900) {
            return 5;
        }
        if (intValue >= 800) {
            return 4;
        }
        return intValue >= 700 ? 3 : 2;
    }

    @Override // defpackage.lun
    public final void b(lum lumVar) {
        this.b = lumVar.f();
        lvn.c(lumVar, this);
    }

    @Override // defpackage.lun
    public final boolean c(Level level) {
        return a(level) >= 4 || Log.isLoggable("all", a(level)) || Log.isLoggable(this.a, a(level));
    }
}
