package defpackage;

/* compiled from: PG */
/* renamed from: jzl  reason: default package */
/* loaded from: classes.dex */
public class jzl extends Exception {
    public jzl() {
        super("Failed to schedule job: 16842755");
    }

    public jzl(Throwable th) {
        super("Failed to cancel all tasks", th);
    }
}
