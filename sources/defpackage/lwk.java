package defpackage;

/* compiled from: PG */
/* renamed from: lwk  reason: default package */
/* loaded from: classes.dex */
public final class lwk extends lvk {
    public static final lvk a = new lwk();

    private lwk() {
    }

    @Override // defpackage.lvk
    public final ltp a(Class cls, int i) {
        StackTraceElement a2 = lxf.a(cls, i + 1);
        return a2 != null ? new lua(a2) : ltp.a;
    }

    @Override // defpackage.lvk
    public final String b(Class cls) {
        StackTraceElement a2 = lxf.a(cls, 1);
        if (a2 == null) {
            throw new IllegalStateException("no caller found on the stack for: ".concat(String.valueOf(cls.getName())));
        }
        return a2.getClassName();
    }

    public final String toString() {
        return "Default stack-based caller finder";
    }
}
