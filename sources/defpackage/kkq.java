package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kkq  reason: default package */
/* loaded from: classes.dex */
public final class kkq implements kkv {
    private static boolean b;
    public final lgb a;
    private final lgb c;
    private final int d = Math.max(5, 10);

    public kkq(lgb lgbVar) {
        jgf jgfVar = jgf.j;
        this.c = lgbVar;
        this.a = jgfVar;
    }

    @Override // defpackage.kkv
    public final void a() {
        synchronized (kkq.class) {
            if (!b) {
                joq joqVar = new joq(this, 11);
                long j = this.d;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                mks mksVar = (mks) this.c.a();
                kki.a(mksVar.a(new kkp(joqVar, mksVar, j, timeUnit), j, timeUnit));
                b = true;
            }
        }
    }
}
