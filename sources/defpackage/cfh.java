package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* renamed from: cfh  reason: default package */
/* loaded from: classes.dex */
public final class cfh implements jty {
    public static final lug a = lug.i("SuperDelight");
    private final Context b;
    private final jan c;
    private final idk d;
    private final kcq e;

    public cfh(Context context, jan janVar, mkr mkrVar, idk idkVar) {
        this.b = context.getApplicationContext();
        this.c = janVar;
        this.d = idkVar;
        this.e = kcq.g(mkrVar);
    }

    @Override // defpackage.jty
    public final jtv a(juc jucVar) {
        if (cei.g(jucVar) == null || !cei.h(jucVar)) {
            return null;
        }
        return jtv.b(jucVar);
    }

    @Override // defpackage.jrs
    public final mko b(jsr jsrVar) {
        return this.e.d(jsrVar);
    }

    @Override // defpackage.jty
    public final mko c(juc jucVar, jtw jtwVar, File file) {
        return this.e.e(jucVar.o(), new cfg(this.b, this.c, jucVar, file, this.d));
    }

    @Override // defpackage.jsj
    public final String d() {
        return "SuperDelightResourceLmFetcher";
    }
}
