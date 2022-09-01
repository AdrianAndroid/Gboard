package defpackage;

/* compiled from: PG */
/* renamed from: amj  reason: default package */
/* loaded from: classes.dex */
public final class amj implements ana {
    @Override // defpackage.ana
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Throwable th = (Throwable) obj;
        if (ash.j(th)) {
            asa.b("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }
}
