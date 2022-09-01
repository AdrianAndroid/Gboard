package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: jfd  reason: default package */
/* loaded from: classes.dex */
public abstract class jfd implements jfn {
    protected abstract String a();

    @Override // defpackage.jfn
    public final String b() {
        return String.format(Locale.ROOT, "%s=%s", c(), a());
    }
}
