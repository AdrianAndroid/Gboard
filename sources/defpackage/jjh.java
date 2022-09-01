package defpackage;

import java.util.EnumSet;

/* compiled from: PG */
/* renamed from: jjh  reason: default package */
/* loaded from: classes.dex */
public final class jjh {
    public static final jjh a;
    public static final jjh b;
    public static final jjh c;
    private final boolean d;
    private final lmz e;

    static {
        jsy a2 = a();
        a2.e(EnumSet.noneOf(jjg.class));
        a2.d(false);
        a = a2.c();
        jsy a3 = a();
        a3.e(EnumSet.of(jjg.ANY));
        a3.d(true);
        b = a3.c();
        jsy a4 = a();
        a4.e(EnumSet.of(jjg.ANY));
        a4.d(false);
        c = a4.c();
    }

    public jjh() {
    }

    public jjh(boolean z, lmz lmzVar) {
        this.d = z;
        this.e = lmzVar;
    }

    public static jsy a() {
        jsy jsyVar = new jsy();
        jsyVar.d(false);
        return jsyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jjh) {
            jjh jjhVar = (jjh) obj;
            if (this.d == jjhVar.d && this.e.equals(jjhVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.d ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        boolean z = this.d;
        String valueOf = String.valueOf(this.e);
        return "DownloadConstraints{requireUnmeteredNetwork=" + z + ", requiredNetworkTypes=" + valueOf + "}";
    }
}
