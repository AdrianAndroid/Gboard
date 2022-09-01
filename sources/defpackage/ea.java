package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ea  reason: default package */
/* loaded from: classes.dex */
public final class ea implements gy {
    final /* synthetic */ eb a;
    private boolean b;

    public ea(eb ebVar) {
        this.a = ebVar;
    }

    @Override // defpackage.gy
    public final void a(gm gmVar, boolean z) {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a.d();
        this.a.b.onPanelClosed(108, gmVar);
        this.b = false;
    }

    @Override // defpackage.gy
    public final boolean b(gm gmVar) {
        this.a.b.onMenuOpened(108, gmVar);
        return true;
    }
}
