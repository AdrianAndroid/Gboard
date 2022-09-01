package defpackage;

/* compiled from: PG */
/* renamed from: cxy  reason: default package */
/* loaded from: classes.dex */
public final class cxy extends czf {
    public String a;
    public String b;
    public int c;
    private long d;
    private lfb e;
    private byte f;

    public cxy() {
        this.e = ldu.a;
    }

    public cxy(czg czgVar) {
        this.e = ldu.a;
        cxz cxzVar = (cxz) czgVar;
        this.a = cxzVar.a;
        this.b = cxzVar.b;
        this.d = cxzVar.c;
        this.e = cxzVar.d;
        this.c = cxzVar.e;
        this.f = (byte) 1;
    }

    @Override // defpackage.czf, defpackage.cyt
    /* renamed from: a */
    public final czg b() {
        String str;
        String str2;
        int i;
        if (this.f != 1 || (str = this.a) == null || (str2 = this.b) == null || (i = this.c) == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" baseUrl");
            }
            if (this.b == null) {
                sb.append(" contentFilterLevel");
            }
            if (this.f == 0) {
                sb.append(" cacheExpirationTimeInSeconds");
            }
            if (this.c == 0) {
                sb.append(" priority");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new cxz(str, str2, this.d, this.e, i);
    }

    @Override // defpackage.czf
    public final void c(long j) {
        this.d = j;
        this.f = (byte) 1;
    }

    @Override // defpackage.czf, defpackage.cyt
    public final /* bridge */ /* synthetic */ void g(String str) {
        this.e = lfb.g(str);
    }
}
