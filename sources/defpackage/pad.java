package defpackage;

import java.io.PrintStream;

/* compiled from: PG */
/* renamed from: pad  reason: default package */
/* loaded from: classes2.dex */
final class pad extends pac {
    private final PrintStream a;

    public pad(PrintStream printStream) {
        this.a = printStream;
    }

    @Override // defpackage.pac
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.pac
    public final void b(Object obj) {
        this.a.println(obj);
    }
}
