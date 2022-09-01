package defpackage;

/* compiled from: PG */
/* renamed from: lua  reason: default package */
/* loaded from: classes.dex */
public final class lua extends ltp {
    private final StackTraceElement b;

    public lua(StackTraceElement stackTraceElement) {
        this.b = stackTraceElement;
    }

    @Override // defpackage.ltp
    public final int a() {
        return Math.max(this.b.getLineNumber(), 0);
    }

    @Override // defpackage.ltp
    public final String b() {
        return this.b.getClassName();
    }

    @Override // defpackage.ltp
    public final String c() {
        return this.b.getFileName();
    }

    @Override // defpackage.ltp
    public final String d() {
        return this.b.getMethodName();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lua) && this.b.equals(((lua) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
