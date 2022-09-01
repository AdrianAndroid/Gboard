package defpackage;

/* compiled from: PG */
/* renamed from: fu  reason: default package */
/* loaded from: classes.dex */
final class fu extends aan {
    final /* synthetic */ fv a;
    private boolean b = false;
    private int c = 0;

    public fu(fv fvVar) {
        this.a = fvVar;
    }

    @Override // defpackage.aan, defpackage.aam
    public final void a() {
        int i = this.c + 1;
        this.c = i;
        if (i == this.a.a.size()) {
            aam aamVar = this.a.b;
            if (aamVar != null) {
                aamVar.a();
            }
            this.c = 0;
            this.b = false;
            this.a.c = false;
        }
    }

    @Override // defpackage.aan, defpackage.aam
    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        aam aamVar = this.a.b;
        if (aamVar == null) {
            return;
        }
        aamVar.b();
    }
}
