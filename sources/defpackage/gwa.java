package defpackage;

/* compiled from: PG */
/* renamed from: gwa  reason: default package */
/* loaded from: classes.dex */
public final class gwa {
    private Object a;
    private volatile boolean b;

    public final Object a(lgb lgbVar) {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    this.a = lgbVar.a();
                    this.b = true;
                }
            }
        }
        return this.a;
    }
}
