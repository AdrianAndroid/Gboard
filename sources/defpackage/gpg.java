package defpackage;

/* compiled from: PG */
/* renamed from: gpg  reason: default package */
/* loaded from: classes.dex */
public final class gpg {
    public final String a = "en";
    public final String b = "unset";
    public final String c;
    public final String d;
    public final String e;
    public kkc f;

    public gpg() {
    }

    public gpg(String str, String str2, String str3, kkc kkcVar, byte[] bArr) {
        this.f = kkcVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final String toString() {
        return String.format("lang:%s client:%s:%d device:%s:%d v:%d space:%b maxParallel:%d timeout:%d", this.a, this.b, 0, null, 0, 0, false, 0, 0);
    }
}
