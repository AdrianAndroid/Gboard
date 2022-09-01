package defpackage;

/* compiled from: PG */
/* renamed from: ezq  reason: default package */
/* loaded from: classes.dex */
public final class ezq {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public ezq(ezp ezpVar) {
        this.a = ezpVar.a;
        this.b = ezpVar.b;
        this.c = ezpVar.c;
        this.d = ezpVar.d;
        this.e = ezpVar.e;
    }

    public static ezp a() {
        return new ezp();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        return "(" + str + ") from " + str2 + " to " + str3;
    }
}
