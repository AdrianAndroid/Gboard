package defpackage;

/* compiled from: PG */
/* renamed from: ipp  reason: default package */
/* loaded from: classes.dex */
public final class ipp {
    public ipl a;
    public String b;
    public byte c;
    public int d;
    private lls e;
    private llw f;
    private boolean g;
    private ipe h;

    public final ipq a() {
        ipl iplVar;
        ipe ipeVar;
        lls llsVar = this.e;
        if (llsVar != null) {
            this.f = llsVar.l();
        } else if (this.f == null) {
            this.f = lrq.b;
        }
        if (this.c != 3 || (iplVar = this.a) == null || (ipeVar = this.h) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" tableDef");
            }
            if ((this.c & 1) == 0) {
                sb.append(" indexQueryableFields");
            }
            if ((this.c & 2) == 0) {
                sb.append(" dropDataIfUpdated");
            }
            if (this.h == null) {
                sb.append(" dataPolicy");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new ipq(iplVar, this.f, this.g, this.b, this.d, ipeVar);
    }

    public final void b(String str, ngf ngfVar) {
        if (this.e == null) {
            this.e = llw.h();
        }
        this.e.a(str, ngfVar);
    }

    public final void c(ipe ipeVar) {
        if (ipeVar != null) {
            this.h = ipeVar;
            return;
        }
        throw new NullPointerException("Null dataPolicy");
    }

    public final void d(boolean z) {
        this.g = z;
        this.c = (byte) (this.c | 1);
    }
}
