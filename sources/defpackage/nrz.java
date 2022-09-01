package defpackage;

/* compiled from: PG */
/* renamed from: nrz  reason: default package */
/* loaded from: classes2.dex */
public final class nrz {
    public final Object a;
    private final String b;

    public nrz(String str, Object obj) {
        this.b = str;
        this.a = obj;
    }

    public static nrz a(String str) {
        return new nrz(str, null);
    }

    public final String toString() {
        return this.b;
    }
}
