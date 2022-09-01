package defpackage;

/* compiled from: PG */
/* renamed from: dfo  reason: default package */
/* loaded from: classes.dex */
public final class dfo implements hfh {
    public final lks a = lks.a(2);
    public final lks b = lks.a(3);
    public boolean c;

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null) {
            return false;
        }
        if (f.c == -10029) {
            long j = hfdVar.h;
            this.a.offer(Long.valueOf(j));
            this.c = ((Long) this.a.peek()).longValue() + 30000 > j;
            this.b.offer(true);
        } else if (hfdVar.p == 1 && hfdVar.a != iah.DOWN && f.d == iax.DECODE) {
            this.b.offer(false);
        }
        return false;
    }
}
