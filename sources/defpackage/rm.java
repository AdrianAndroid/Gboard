package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rm  reason: default package */
/* loaded from: classes2.dex */
public final class rm extends ri {
    final /* synthetic */ rn c;

    public rm(rn rnVar) {
        this.c = rnVar;
    }

    @Override // defpackage.ri
    protected final String c() {
        rj rjVar = (rj) this.c.a.get();
        if (rjVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + rjVar.a + "]";
    }
}
