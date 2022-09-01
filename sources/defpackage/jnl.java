package defpackage;

import android.util.Log;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: jnl  reason: default package */
/* loaded from: classes.dex */
public final class jnl extends jns {
    private final String b = "brella";

    private jnl(String str) {
        super(str);
    }

    public static jns a(String str) {
        return new jnl(str);
    }

    public static jns b(String str, String str2) {
        return new jnl(str2);
    }

    @Override // defpackage.jns
    public final jns c(String str) {
        return new jnl(str);
    }

    @Override // defpackage.jns
    public final void d(Level level, String str, Throwable th, String str2, Object... objArr) {
        int i;
        if (level.equals(Level.SEVERE)) {
            i = 6;
        } else {
            if (!level.equals(Level.WARNING)) {
                if (level.equals(Level.INFO)) {
                    i = 4;
                } else if (level.equals(Level.FINE)) {
                    i = 3;
                }
            }
            i = 5;
        }
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        if (th != null) {
            str2 = str2 + "\n" + Log.getStackTraceString(th);
        }
        Log.println(i, this.b + "." + str, str2);
    }
}
