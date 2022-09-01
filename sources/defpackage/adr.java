package defpackage;

/* compiled from: PG */
/* renamed from: adr  reason: default package */
/* loaded from: classes.dex */
public final class adr {
    private static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public volatile int b = 0;
    public final bhc c;

    public adr(bhc bhcVar, int i, byte[] bArr, byte[] bArr2) {
        this.c = bhcVar;
        this.a = i;
    }

    public final int a(int i) {
        ajj e = e();
        int a = e.a(16);
        if (a != 0) {
            return e.b.getInt(e.b(a) + (i * 4));
        }
        return 0;
    }

    public final int b() {
        ajj e = e();
        int a = e.a(16);
        if (a != 0) {
            return e.c(a);
        }
        return 0;
    }

    public final int c() {
        ajj e = e();
        int a = e.a(4);
        if (a != 0) {
            return e.b.getInt(a + e.a);
        }
        return 0;
    }

    public final short d() {
        ajj e = e();
        int a = e.a(14);
        if (a != 0) {
            return e.b.getShort(a + e.a);
        }
        return (short) 0;
    }

    public final ajj e() {
        ThreadLocal threadLocal = d;
        ajj ajjVar = (ajj) threadLocal.get();
        if (ajjVar == null) {
            ajjVar = new ajj();
            threadLocal.set(ajjVar);
        }
        Object obj = this.c.d;
        int i = this.a;
        ajj ajjVar2 = (ajj) obj;
        int a = ajjVar2.a(6);
        if (a != 0) {
            int b = ajjVar2.b(a) + (i * 4);
            ajjVar.d(b + ajjVar2.b.getInt(b), ajjVar2.b);
        }
        return ajjVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(c()));
        sb.append(", codepoints:");
        int b = b();
        for (int i = 0; i < b; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
