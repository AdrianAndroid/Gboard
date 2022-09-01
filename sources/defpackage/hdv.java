package defpackage;

import java.text.BreakIterator;

/* compiled from: PG */
/* renamed from: hdv  reason: default package */
/* loaded from: classes.dex */
final class hdv implements lgb {
    private final ThreadLocal a = new hdu();

    @Override // defpackage.lgb
    /* renamed from: b */
    public final BreakIterator a() {
        return (BreakIterator) this.a.get();
    }
}
