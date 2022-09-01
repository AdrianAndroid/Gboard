package defpackage;

import android.content.Context;
import j$.util.Collection$EL;
import j$.util.Optional;
import java.io.File;

/* compiled from: PG */
/* renamed from: exa  reason: default package */
/* loaded from: classes.dex */
public final class exa {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/maintenance/PersonalizedModelFileCleaner");
    public static volatile exa b;
    public final Context c;
    public final mkr e;
    public final hhk f;
    public final hhk g;
    public final iye h = new ewz(this);
    public final jan d = jan.b;

    public exa(Context context, mkr mkrVar) {
        this.c = context.getApplicationContext();
        this.e = mkrVar;
        this.f = new ewy(this, context, 1);
        this.g = new ewy(this, context, 0);
    }

    public static llp a(File file, String str) {
        if (!file.exists() || !file.isDirectory()) {
            return llp.q();
        }
        return (llp) Collection$EL.stream((llp) Optional.ofNullable(file.listFiles()).map(eoe.c).orElse(llp.q())).filter(dzj.h).flatMap(new chd(str, 12)).collect(ljr.a);
    }

    public final void b() {
        kcu.U(kcu.O(new evl(this, 5), this.e), new cbx(9), this.e);
        kcu.U(kcu.O(new evl(this, 6), this.e), new cbx(10), this.e);
    }

    public final void c(String str) {
        kcu.U(kcu.O(new brs(this, str, 19), this.e), new cbx(11), this.e);
    }
}
