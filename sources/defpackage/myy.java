package defpackage;

/* compiled from: PG */
/* renamed from: myy  reason: default package */
/* loaded from: classes2.dex */
final class myy extends Exception {
    public final int a;

    public myy(int i, String str) {
        super(str);
        this.a = i;
    }

    public myy(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
