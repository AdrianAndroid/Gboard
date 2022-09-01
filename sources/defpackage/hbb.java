package defpackage;

/* compiled from: PG */
/* renamed from: hbb  reason: default package */
/* loaded from: classes.dex */
final class hbb extends hzr {
    @Override // defpackage.hzr
    public final void a(int i) {
        if (har.c != null) {
            synchronized (har.class) {
                har.c = null;
            }
        }
        e();
    }
}
