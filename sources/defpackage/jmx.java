package defpackage;

/* compiled from: PG */
/* renamed from: jmx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jmx implements jjd {
    private final /* synthetic */ int a;

    @Override // defpackage.jjd
    public final long a() {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? System.currentTimeMillis() : System.currentTimeMillis();
        }
        return System.currentTimeMillis();
    }
}
