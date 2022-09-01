package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: esw  reason: default package */
/* loaded from: classes.dex */
public final class esw implements etc {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/listing/DownloadableThemeBackupHelper");
    public final Context b;
    public final etd c;
    public final etf d;
    public final List e;
    public final ete f = new est();
    public final ete g = new esu(this);
    private final Executor h;

    public esw(Context context, Executor executor, etd etdVar, etf etfVar, List list) {
        this.b = context;
        this.h = executor;
        this.c = etdVar;
        this.d = etfVar;
        this.e = list;
    }

    @Override // defpackage.etc
    public final void a(eva evaVar) {
        this.c.b(this);
        this.h.execute(new elr(this, evaVar, 6));
    }
}
