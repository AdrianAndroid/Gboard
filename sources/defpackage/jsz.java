package defpackage;

/* compiled from: PG */
/* renamed from: jsz  reason: default package */
/* loaded from: classes.dex */
public abstract class jsz {
    public static jsy c() {
        jsy jsyVar = new jsy();
        jsyVar.b(false);
        return jsyVar;
    }

    public abstract jsx a();

    public abstract boolean b();

    public String toString() {
        String obj = a().toString();
        String str = true != b() ? "bg" : "fg";
        return "{" + obj + ", " + str + "}";
    }
}
