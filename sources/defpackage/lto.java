package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lto  reason: default package */
/* loaded from: classes.dex */
public final class lto extends ltp {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private int f = 0;

    public lto(String str, String str2, int i, String str3) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    @Override // defpackage.ltp
    public final int a() {
        return (char) this.d;
    }

    @Override // defpackage.ltp
    public final String b() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.ltp
    public final String c() {
        return this.e;
    }

    @Override // defpackage.ltp
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lto) {
            lto ltoVar = (lto) obj;
            if (this.b.equals(ltoVar.b) && this.c.equals(ltoVar.c) && this.d == ltoVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            int hashCode = ((((this.b.hashCode() + 4867) * 31) + this.c.hashCode()) * 31) + this.d;
            this.f = hashCode;
            return hashCode;
        }
        return i;
    }
}
