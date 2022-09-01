package defpackage;

/* compiled from: PG */
/* renamed from: bul  reason: default package */
/* loaded from: classes.dex */
public final class bul {
    public String a;
    public String b;
    private int c;
    private int d;
    private String e;
    private long f;
    private int g;
    private byte h;

    public bul() {
    }

    public bul(bum bumVar) {
        this.a = bumVar.a;
        this.b = bumVar.b;
        this.c = bumVar.c;
        this.d = bumVar.d;
        this.e = bumVar.e;
        this.f = bumVar.f;
        this.g = bumVar.g;
        this.h = (byte) 15;
    }

    public final bum a() {
        String str;
        String str2;
        String str3;
        if (this.h != 15 || (str = this.a) == null || (str2 = this.b) == null || (str3 = this.e) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" text");
            }
            if (this.b == null) {
                sb.append(" htmlText");
            }
            if ((this.h & 1) == 0) {
                sb.append(" itemType");
            }
            if ((this.h & 2) == 0) {
                sb.append(" entityType");
            }
            if (this.e == null) {
                sb.append(" uri");
            }
            if ((this.h & 4) == 0) {
                sb.append(" groupId");
            }
            if ((this.h & 8) == 0) {
                sb.append(" viewType");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new bum(str, str2, this.c, this.d, str3, this.f, this.g);
    }

    public final void b(int i) {
        this.d = i;
        this.h = (byte) (this.h | 2);
    }

    public final void c(long j) {
        this.f = j;
        this.h = (byte) (this.h | 4);
    }

    public final void d(int i) {
        this.c = i;
        this.h = (byte) (this.h | 1);
    }

    public final void e(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public final void f(int i) {
        this.g = i;
        this.h = (byte) (this.h | 8);
    }
}
