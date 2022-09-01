package defpackage;

/* compiled from: PG */
/* renamed from: hfg  reason: default package */
/* loaded from: classes.dex */
public final class hfg {
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public hfg() {
    }

    public hfg(hff hffVar, int i, int... iArr) {
        this.b = hffVar;
        this.a = i;
        int length = iArr.length >> 1;
        this.c = new int[length];
        this.d = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = length - i2;
            int i4 = i3 + i3;
            ((int[]) this.c)[i2] = iArr[i4 - 2];
            ((int[]) this.d)[i2] = iArr[i4 - 1];
        }
    }

    public hfg(byte[] bArr) {
        ldu lduVar = ldu.a;
        this.d = lduVar;
        this.b = lduVar;
    }

    public hfg(byte[] bArr, byte[] bArr2) {
        this.c = ldu.a;
    }

    public final cye a() {
        if (this.d == null || this.c == null || this.b == null || this.a == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" baseUrl");
            }
            if (this.c == null) {
                sb.append(" query");
            }
            if (this.b == null) {
                sb.append(" limit");
            }
            if (this.a == 0) {
                sb.append(" priority");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        Object obj = this.d;
        Object obj2 = this.c;
        return new cye((String) obj, (String) obj2, (Integer) this.b, this.a);
    }

    public final void b(Integer num) {
        if (num != null) {
            this.b = num;
            return;
        }
        throw new NullPointerException("Null limit");
    }

    public final void c(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null query");
    }

    public final cmc d() {
        int i;
        Object obj = this.c;
        if (obj == null || (i = this.a) == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" query");
            }
            if (this.a == 0) {
                sb.append(" priority");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new cmc((String) obj, (lfb) this.d, (lfb) this.b, i);
    }

    public final void e() {
        this.d = lfb.g("categories");
    }

    public final void f(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null query");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [leq, java.lang.Object] */
    public final cip g() {
        int i;
        Object obj;
        ?? r0 = this.b;
        if (r0 == 0 || (i = this.a) == 0 || (obj = this.d) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" cacheQueryFn");
            }
            if (this.a == 0) {
                sb.append(" supportedDecoderCandidateType");
            }
            if (this.d == null) {
                sb.append(" supplierType");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new cip(r0, i, (lfb) this.c, (ckc) obj);
    }

    public final void h(leq leqVar) {
        if (leqVar != null) {
            this.b = leqVar;
            return;
        }
        throw new NullPointerException("Null cacheQueryFn");
    }

    public final void i(mbr mbrVar) {
        this.c = lfb.g(mbrVar);
    }

    public final void j(ckc ckcVar) {
        if (ckcVar != null) {
            this.d = ckcVar;
            return;
        }
        throw new NullPointerException("Null supplierType");
    }
}
