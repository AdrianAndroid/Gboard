package defpackage;

/* compiled from: PG */
/* renamed from: jbh  reason: default package */
/* loaded from: classes.dex */
final class jbh extends Exception {
    public jbh(String str, String str2) {
        this(str, str2, null);
    }

    public jbh(String str, String str2, Throwable th) {
        super(str + ": " + str2, th);
    }
}
